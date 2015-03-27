
#include "Vektor2D.h"
#include "Matrix.h"
#include <iostream>


int main(){
	Matrix m;
	Vektor2D a(3,1);
	Vektor2D b(1, 2);
	Vektor2D c;
	m.ausgabe();

	c.addiere(a);
	b.addiere(c);
	std::cout << "Betrag: " << b.betrag();


}