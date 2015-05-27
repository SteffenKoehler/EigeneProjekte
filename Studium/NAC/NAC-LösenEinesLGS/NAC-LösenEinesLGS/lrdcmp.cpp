#include <cmath>
#include <valarray>
#include <iostream>
#include "matrix.h"
using namespace std;

void lrdcmp(matrix &a, valarray<int> &indx, double &d)
/*Given a matrix a[0. .n—l] [0. .n—i], this routine replaces it by the LR decomposition of a
rowwise permutation of itself. a is input. On output, it is arranged as in equation (2.3.14)
above; indx [0. .n-l] is an output vector that records the row permutation effected by the
partial pivoting; d is output as +-l depending on whether the number of row interchanges
was even or odd, respectively. This routine is used in combination with lrbksb to solve linear
equations or invert a matrix.*/
{
	const double TINY=1.0e-20; //A small number.
	int i,imax,j,k;
	double big,dum,sum,temp;
	int n=a.nrows();
	valarray<double> vv(n); //vv stores the implicit scaling of each row.
	d=1.0; //No row interchanges yet.
	for (i=0;i<n;i++) { //Loop over rows to get the implicit scaling information
		big=0.0; 
		for (j=0;j<n;j++)
			if ((temp=fabs(a[i][j])) > big) big=temp;
		if (big == 0.0) cout<<"Singular matrix in routine lrdcmp";
		//No nonzero largest element.
		vv[i]=1.0/big; //Save the scaling.
	}
	for (j=0;j<n;j++) { //This is the loop over columns of Crout's method.
		for (i=0;i<j ;i++) { //This is equation (2.3.12) except for i = j.
			sum=a[i][j];
			for (k=0;k<i;k++) sum -= a[i][k] *a[k][j];
			a[i][j]=sum;
		}
		big=0.0; //Initialize for the search for largest pivot element.
		for (i=j ;i<n;i++) { //This is i = j of equation (2.3.12) and i = j + 1...
			sum=a[i][j]; //N — 1 of equation (2.3.13).
			for (k=0;k<j ;k++) sum -= a[i][k] *a[k][j];
			a[i][j]=sum;
			if ((dum=vv[i] *fabs(sum)) >= big) {
			//Is the figure of merit for the pivot better than the best so far?
				big=dum;
				imax=i;
			}
		}
		if (j != imax) { //Do we need to interchange rows?
			for (k=0;k<n;k++) { //Yes, do so...
				dum=a[imax][k] ;
				a[imax][k] =a[j][k] ;
				a[j][k]=dum;
			}
			d = -d; //...and change the parity of d.
			vv[imax] =vv[j]; //Also interchange the scale factor.
		}
		indx[j] =imax;
		if (a[j][j] == 0.0) a[j][j]=TINY;
		/*If the pivot element is zero the matrix is singular (at least to the precision of the
		algorithm). For some applications on singular matrices, it is desirable to substitute
		TINY for zero.*/
		if (j != n-1) { //Now, finally, divide by the pivot element.
			dum=1.0/(a[j][j] );
			for (i=j+1;i<n;i++) a[i][j] *= dum;
		}
	} //Go back for the next column in the reduction.
}

