#include <iostream>
#include "Bisektion.h"
#include "NewtonRaphson.h"

using namespace std;


int main(){

	//BISEKTION

	//double nullstelle;
	//double x1, x2, xacc;
	//int stop;
	//cout << "Intervall angeben, in dem die Nullstelle gesucht wird" << endl;
	//cin >> x1 >> x2;
	//xacc = (x2 - x1) / 1000; //geforderte Genauigkeit

	//nullstelle = bisection(x1, x2, xacc);
	//cout << "Gefundene Nullstelle:  " << nullstelle << " \n" << " \n";

	//plotfunktion(x1, x2);

	//cin >> stop;




	// NEWTON

	double nullstelle;
	double x1, x2, xacc, flinks, frechts, df, dx;
	int stop, n = 100;


	cout << "intervall angeben, in dem die NST gesucht werden soll";
	cin >> x1 >> x2;
	xacc = (x2 - x1) / 10000;
	dx = (x2 - x1) / n;

	nullstelle = rtnewt(x1, x2, xacc);

	cout << "\n" << "gefundene NST: " << nullstelle << "\n" << "\n";

	plotfunktion(x1, x2);

	cin >> stop;

}


//Funktion deren Nullstelle bestimmt werden soll: 
double fx(double x){
	double y;
	y = 3.0 * sin(2 * PI * x);
	return y;
}

void funcd(double x, double &y1, double &y2){
	y1 = exp(x) - pow(x, 2.0);
	y2 = x * exp(x) - (2 * x);
}


