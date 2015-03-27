#include "Vektor2D.h"



Vektor2D::Vektor2D()
{
}

Vektor2D::Vektor2D(float a, float b)
{
	element1 = a;
	element2 = b;
}


Vektor2D::~Vektor2D()
{
}

//Addiert den Vektor2D zum aktuellen Vektor
void Vektor2D::addiere(Vektor2D v)
{
	m_Element[1] = m_Element[1] + element1;
	m_Element[2] = m_Element[2] + element2;
}
