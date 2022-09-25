package Rupi1;

public class Main{
	public static void main(String [] args) {
	//Box box1=new Box("red");
    //System.out.println(box1.color);
    //Box box2=new Box("pink");
    //System.out.println(box2.color+" "+box2.Size);
	Box box3=new Box(); //it will work 
	Box box4=new Box2();//it will also work
	//Box2 box5=new Box(); //it wil not work 
	Box box6=new Box2("red",24);
	System.out.println(box6.color);
    System.out.println(box6.BoxArea(7));


}
}