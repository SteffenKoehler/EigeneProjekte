#include "Vektor.h"

class Vektor2D :
	public Vektor
{
protected:
	float element1;
	float element2;

public:
	Vektor2D();
	Vektor2D(float a, float b);
	virtual ~Vektor2D();
	void addiere(Vektor2D v);
};

