#include<iostream>

int& max(int a, int b) {
	if (a > b)
		return a;
	else
		return b;
}

int& foo(int test, int falsch) {
	int neu = test + falsch;
	return neu;
}
int main() {
	int x = 11, y = 22;
	int z = max(x, y);

	int neu = foo(100, 42);
	std::cout << z;
}