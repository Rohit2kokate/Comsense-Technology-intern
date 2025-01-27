import java.util.*;
public class armstrong{
	public static void main(String args[]){
		int i=153,j=i;
		int a=i;
		int count=0;
		while(i!=0){
			count++;
			i=i/10;
		}
		//System.out.println(count);
		int sum=0;
		while(j!=0){
			int digit=j%10;
			sum+=Math.pow(digit,count);
			j=j/10;
		}
		if(sum==a){
			System.out.println("Armstrong number");}
		else{
			System.out.println("Not Armstrong number");}
		
	}
}