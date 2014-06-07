int x, y;

void p(int t){
	int z;

	if(t > 1){
		p(t-1);	
	} else {
		y = 1;
	}
	z = y;
	y = z * t;
}

void main(){
	ReadLong(x);
	p(x);
	WriteLong(x,y);
}
