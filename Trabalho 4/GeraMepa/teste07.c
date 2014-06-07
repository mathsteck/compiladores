int x, y;

void p(){
	int z;

	z = x; x = x - 1;
	if(z > 1){
		p();
	} else {
		y = 1;
	}

	y = y * z;
}

void q(){
	int s, t;

	s = x; t = x - 1; x = t;
	if(s == 0){
		y = 1;
	} else { 
		if (((s/2)*2) == s) {
			q();
		} else {
			p();
		}
	}

	y = y * s;
}

void main(){
	ReadLong(x);
	q();
	WriteLong(y);
}
