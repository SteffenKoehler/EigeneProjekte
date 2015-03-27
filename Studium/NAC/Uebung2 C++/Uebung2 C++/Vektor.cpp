#include "Vektor.h"
#include <math.h>


Vektor::Vektor()
{
}


Vektor::~Vektor()
{
}

//Gibt den Betrag des Vektors zurück
double Vektor::betrag()
{
	double betrag = 0;
	for (int i = 0; i < m_Zeilen*m_Spalten; i++)
	{
		betrag += pow(m_Element[i],2);
	};
	
	return betrag = sqrt(betrag);
}
