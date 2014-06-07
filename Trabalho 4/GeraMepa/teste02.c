int x, y, z;

void main(){
	x = 10;
	y = 20;
	z = 30;

	if(x <= 100){
		x = 2;	
	} else {
		x = y;
	}

	while(z >= 20){
		z = z - 1;
	}

	WriteLong(x,y,z);
}

