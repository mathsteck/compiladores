int n, k;
int f1, f2, f3;

void main(){
	ReadLong(n);

	f1 = 0; f2 = 1; k = 1;

	while(k <= n){
		f3 = f1 + f2; f1 = f2; f2 = f3;
		k = k + 1;
	}

	WriteLong(n, f1);
}
