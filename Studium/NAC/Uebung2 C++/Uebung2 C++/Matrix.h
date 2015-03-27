#ifndef Matrix_H
#define Matrix_H

class Matrix
{
public:
	Matrix();
	virtual ~Matrix();

protected:
	int m_Zeilen;
	int m_Spalten;
	float m_Element[2];
public:
	// Gibt alle Elemente der Matrix hintereinander aus
	void ausgabe();
};

#endif
