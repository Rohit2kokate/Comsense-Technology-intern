public class area{
	void rectangle(int length,int breath){
		System.out.println("Length:"+length+"     Breath"+breath);
		System.out.println("Area is "+(length*breath));
		
	}
	void swaps(int length,int breath){
		System.out.println("Before Swapping the number is Number1:"+length+"     Number2:"+breath);
		int number3;
		number3=length;
		length=breath;
		breath=number3;
		System.out.println("After Swapping the number is Number1:"+length+"     Number2:"+breath);

	}
	void withoutthird(int a,int b){
		
		System.out.println("Before swapping Without third variable num1 :"+a+"    num2  "+b);
		a=a-b;
		b=a+b;
		a=b-a;
		System.out.println("Afer Swapping Without third variable num1 : "+a+"     num2: "+b);
	}
	public static void main(String args[]){
		area a=new area();
		a.rectangle(10,20);
		a.swaps(100,200);
		a.withoutthird(10,20);
	}
}