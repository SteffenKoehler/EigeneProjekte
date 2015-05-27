#include <cmath>
#include <iostream>
#include "NewtonRaphson.h"


using namespace std;




double rtnewt (const double x1, const double x2, const double xacc) {
/*Using the Newton—Raphson method, find the root of a function known to lie in the interval
[x1,x2]. The root rtnewt will be refined until its accuracy is known within ixacc. funcd
is a user-supplied routine that returns both the function value and the first derivative of the
function at the point x.*/
	const int JMAX=20; //Set to maximum number of iterations.
	int j;
	double df,dx,f,rtn;
	rtn=0.5* (x1+x2); //Initial guess.
	for (j=0;j<JMAX;j++) {
		funcd(rtn,f,df);
		dx=f/df;
		rtn -= dx;
		if ((x1-rtn)*(rtn-x2) < 0.0)
			cout<<"Jumped out of brackets in rtnewt";
		if (fabs(dx) < xacc) {
			cout<<"Anzahl der Iterationen: "<<j<<'\n';
			return rtn; //Convergence.
		}
	}
	cout<<"Maximum number of iterations exceeded in rtnewt";
	return 0.0;  //Never get here.

}