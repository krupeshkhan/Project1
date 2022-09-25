package Rupi1;

public class Box2 extends Box {
	int Size;
	Box2(){}
	Box2(String color,int Size){
		super(color);
		this.Size=Size;
	}
	@Override
	int BoxArea(int Size) {
		if(Size>=10) {
			return Size*Size;
		}
		return -1;
	}
}
