// An example for access modifier
class A{
	private int data=40;
	private void msg(){System.out.println("Hello java");}
	void outMsg() {msg();};
}

public class ModifierApp{
	public static void main(String args[]){
		A objA=new A();//call the default no-arg constructor
		System.out.println(objA.data);//Compile time error!
		obj.msg();//Compile time error!
		objA.outMsg();
   }
}
