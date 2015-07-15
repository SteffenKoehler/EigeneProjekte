#include "Matrix.h"
#include <iostream>

using namespace std;


Matrix::Matrix()
	: m_Zeilen(2)
	, m_Spalten(1)
{
	cout << "Standardkonstruktor von Matrix wurde aufgerufen" << endl;

}


Matrix::~Matrix()
{
}


// Gibt alle Elemente der Matrix hintereinander aus
void Matrix::ausgabe()
{
	for (int i = 0; i < m_Zeilen*m_Spalten; i++)
	{
		cout << m_Element[i] << endl;
	}
	cout << endl;
}
