public class notepad{
	void sub(int num1,int num2){
		System.out.println("NUM 1: "+num1+"   NUM2:"+num2);
		System.out.println("Subtstaion is :-"+(num1-num2));
	}
	void mul(int num1,int num2){
		System.out.println("NUM 1: "+num1+"  NUM2: "+num2);
		System.out.println("Multiplication is:-"+(num1*num2));
	}
	public static void main(String[] args){
		//System.out.println("Hello World");
		notepad no=new notepad();
		no.sub(30,20);
		no.mul(5,2);
	}
}