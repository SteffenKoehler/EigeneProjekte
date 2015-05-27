#include <cmath>
#include <iostream>
#include "Bisektion.h"

using namespace std;

double bisection(double x1, double x2, double xacc) {
	const int JMAX=40; //maximal erlaubt Anzahl von Bisektionen
	double dx,f,fmid,xmid,rtb;

	f=fx(x1);
	fmid=fx(x2);
	if(f*fmid >= 0.0) {
		cout<<"Zwischen den angebenen Werten liegt keine Nullstelle";
		return 0.0;
	}

	rtb=(f < 0.0) ? (dx=x2-x1, x1) : (dx=x1-x2, x2); //rtb = x1 oder x2 und dx wird so gewählt, dass in Richtung f > 0 gesucht wird

	for(int i=0;i<JMAX;i++) {
		xmid=rtb+(dx=dx*0.5);
		fmid=fx(xmid);
		if(fmid <= 0.0) rtb = xmid;
		if(abs(dx) < xacc || fmid == 0.0) return rtb;
	}
	cout<<"Fehler - Nullstelle wurde nicht gefunden"<<'\n';  //wenn alles klappt, wird dieser Programmteil nicht aufgerufen
	return 0.0;
}
