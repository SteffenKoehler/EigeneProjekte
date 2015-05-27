#include <string>
#include <iostream>
#include <iomanip>
#include "Bisektion.h"

using namespace std;

void plotfunktion(const double x1, const double x2)
//For interactive CRT terminal use. Produce a crude graph of the function fx over the prompted
//interval x1 ,x2. Query for another plot until the user signals satisfaction.
{
	const int ISCR=60, JSCR=21; //Number of horizontal and vertical positions in
	const char BLANK=' ', ZERO='-', YY='|', XX='-', FF='*'; //display.
	int jz,j,i;
	double ysml,ybig,x,dyj,dx,dy;
	double y[ISCR];
	string scr[JSCR];
		//cout << endl << "Enter x1 x2 (x1=x2 to stop):" << endl;
		//Query for another plot, quit if x1=x2.
		//cin >> x1 >> x2;
		scr [0] =YY; //Fill top left corner with character '1'.
		for (i=1;i<(ISCR-1) ;i++) //Fill rest of top with character ’-'.
			scr[0] += XX;
		scr [0] += YY; //End top with character ’1’.
		for (j=1;j<(JSCR-1);j++) {
			scr [j]=YY; //Fill left side with character '1’.
			for (i=1;i<(ISCR-1);i++) //Fill interior with blanks.
				scr[j] += BLANK;
			scr [j] += YY; //Fill right side with character ’1’.
		}
		scr[JSCR-1]=scr[0] ; //Bottom is same as top.
		dx=(x2-x1)/(ISCR-1);
		x=x1;
		ysml=ybig=0.0; //Limits will include 0.
		for (i=0;i<ISCR;i++) { //Evaluate the function at equal intervals.
			y[i]=fx(x);
			//Find the largest and smallest values
			if (y[i] < ysml) ysml=y[i]; 
			if (y[i] > ybig) ybig=y[i];
			x += dx;
		}
		if (ybig == ysml) ybig=ysml+1.0; //Be sure to separate top and bottom.
		dyj=(JSCR-1)/(ybig-ysml) ;
		jz=int(-ysml*dyj); //Note which row corresponds to 0.
		for (i=0;i<ISCR;i++) { //Place an indicator at function height and
			scr [jz] [i] =ZERO; //at 0.
			j=int ( (y [i] -ysml) *dyj);
			scr [j] [i] =FF;
		}
		cout << fixed << setprecision(3);
		//cout << setw(11) << ybig << " " << scr[JSCR-1] << endl;
		for (j=JSCR-2;j>=1;j--) //Display.
			cout << " " << scr[j] << endl;
		//cout<<setw(11) << ysml << " " << scr[0] << endl;
		cout<<x1<<setw(29)<<x1+(x2-x1)/2.0<<setw(29)<<x2;
}
