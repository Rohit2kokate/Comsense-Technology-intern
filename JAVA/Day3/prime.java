public class prime{
	public static void main(String args[]){
		int n=9;
		boolean b=true;
		for(int i=2;i<n-1;i++){
			if(n%i==0){
				b=false;
				break;				
			}
		}
		if(b==true){
			System.out.println("Prime number");	
		}
		else{
			System.out.println("Not Prime Number");
		}
	}
}