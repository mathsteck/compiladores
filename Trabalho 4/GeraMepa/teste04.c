int x, y;

void p(int t, int k){
	int z;
	z = 10 - t;
	t = 5 - k;
	WriteLong(z,t,k);
}

void main(){
	x = 10;
	y = 5;
	p(x,y);
}
