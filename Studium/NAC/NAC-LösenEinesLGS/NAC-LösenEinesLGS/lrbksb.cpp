#include <cmath>
#include <valarray>
#include <iostream>
#include "matrix.h"
using namespace std;

void lrbksb(matrix &a, valarray<int> &indx, valarray<double> &b)
/*Solves the set of n linear equations A X = B. Here a[O. .n-1] [0..n-1] is input, not
as the matrix A but rather as its LU decomposition, determined by the routine lrdcmp.
indx [0. .n-1] is input as the permutation vector returned by ludcmp. b[O..n-1] is in—
put as the right-hand side vector B, and returns with the solution vector X. a and indx are
not modified by this routine and can be left in place for successive calls with different right—
hand sides b. This routine takes into account the possibility that b will begin with many zero
elements, so it is efficient for use in matrix inversion.*/
{
	int i,ii=0,ip,j;
	double sum;
	int n=a.nrows();
	for (i=0;i<n;i++) {		//When ii is set to a positive value, it will become the
		ip=indx [i];		//index of the first nonvanishing element of b. We now
		sum=b[ip];			//do the forward substitution, equation (2.3.6). The
		b[ip] =b[i];		//only new wrinkle is to unscramble the permutation
		if (ii != 0)		//as we go.
			for (j=ii-1;j<i;j++) sum -= a[i][j]*b[j];
		else if (sum != 0.0) //A nonzero element was encountered, so from now on we
			ii=i+1;			 //will have to do the sums in the loop above.
		b[i]=sum;
	}
	for (i=n-1;i>=0;i--) {	//Now we do the backsubstitution, equation (2.3.7).
		sum=b [i] ;
		for (j=i+1;j<n;j++) sum -= a[i][j]*b[j];
		b[i] =sum/a[i][i] ; //Store a component of the solution vector X. All done!
	} 
}
