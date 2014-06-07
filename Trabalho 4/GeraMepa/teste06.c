int x, y;

void p(){
	int z;

	z = x; x = x - 1;
	if(z > 1){
		p();
	}
	else {
		y = 1;
	} 

	y = y * z;
}

void main(){
	ReadLong(x);
	p();
	WriteLong(x, y);
}
