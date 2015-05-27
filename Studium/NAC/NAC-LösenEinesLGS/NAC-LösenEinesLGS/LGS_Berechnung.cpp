#include <iostream>
#include "matrix.h"

using namespace std;

void lrbksb(matrix &a, valarray<int> &indx, valarray<double> &b);
void lrdcmp(matrix &a, valarray<int> &indx, double &d);
void inverse(matrix &a, valarray<int> &indx, matrix &i_a);

int main(){

	int n = 5;
	matrix a(n, n), i_a(n, n);
	double d;
	valarray<int> index(n);
	valarray<double> b(n);

	//Matrix mit Werten füllen
	a(0, 0) = 1; a(0, 1) = 1; a(0, 2) = 0; a(0, 3) = -1; a(0, 4) = 0;
	a(1, 0) = 0; a(1, 1) = 1; a(1, 2) = 4; a(1, 3) = 2; a(1, 4) = 6;
	a(2, 0) = -4; a(2, 1) = 0; a(2, 2) = 2; a(2, 3) = 5; a(2, 4) = -7;
	a(3, 0) = 2; a(3, 1) = 1; a(3, 2) = 3; a(3, 3) = 0; a(3, 4) = -2;
	a(4, 0) = 5; a(4, 1) = 3; a(4, 2) = 4; a(4, 3) = -4; a(4, 4) = 1;


	//Vektor b füllen
	b[0] = 1; b[1] = 42; b[2] = -21; b[3] = -8; b[4] = 4;

	lrdcmp(a, index, d); //einmalige Berechnung
	lrbksb(a, index, b);

	cout << "Lösungsvektor x:   \n";
	for (int i = 0; i < n; i++)
	{
		printf("x(%d)=%5.4f   ", i, b[i]);
		cout << "\n" << "\n";
	}


	//inverse Matrix berechnen
	inverse(a, index, i_a);

	//inverse Matrix ausgeben
	cout << "Inverse Matrix von a: \n";
		for (int i = 0; i < n; i++)
		{
			for (int j = 0; j < n ; j++)
			{
				printf("%5.4f   ", i_a(i,j));
			}
			printf("\n");
		}
}


void inverse(matrix &a, valarray<int> &indx, matrix &i_a){


	for (int i = 0; i < a.nrows(); i++){
		valarray<double> b(a.nrows());
		b[i] = 1;
		lrbksb(a, indx, b);

		for (int j = 0; j < a.nrows(); j++)
		{
			i_a[j][i] = b[j];
		}
	}

	
}