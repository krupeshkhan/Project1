package Rupi1;

public class Box {
	String color;
	Box(){}
	Box(String color){
		this.color=color;
	}
	int BoxArea(int Size) {
		if(Size>=5) {
			return Size*Size;
		}
		return -1;
	}
}
