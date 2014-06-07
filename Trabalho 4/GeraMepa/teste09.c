int a, b;
int res;

void GCD(int a, int b){
	int c;

	while(b != 0){
		c = a;
		a = b;
		b = c % b;
		WriteLong(c);
		WriteLong(a);
		WriteLong(b);
		WriteLine();
	}
	res = a;
}

void main(){
	a = 25733;
	b = 48611;
	GCD(a,b);
	WriteLong(res);
	WriteLine();
	WriteLine();

	a = 7485671; b = 7480189;
	GCD(a,b);
	WriteLong(res);
	WriteLine();
	GCD(10,5);
	WriteLong(res);
	WriteLine();
}
