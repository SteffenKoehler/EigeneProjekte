//header file für matrizen
#include<valarray>

using namespace std;




//*********************************************************************

class matrix {
   private:
	   int ROWS;
	   int COLS;
       valarray< valarray<double> > _m;
   public:
      // Konstruktor
      matrix(int m, int n) : ROWS(m), COLS(n), _m(m) { for (int l=0; l < m; ++l)  _m[l].resize(n); }

      // Zugriff mit eckigen Klammern
      valarray<double> &operator [](int i)  { return  _m[i]; }
	  // Zugriff mit runden Klammern
	  double &operator()(int i, int j) {return _m[i][j];}

      // Abfragen
      int nrows()  { return  _m.size(); }      //gibt die Anzahl der Zeilen zurück
      int ncols()  { return  _m[0].size(); }   //gibt die Anzahl der Spalten zurück
	  valarray<valarray<double> >& get_s() {return _m;}  //gibt die gesamte Matrix als valarray zurück
};


