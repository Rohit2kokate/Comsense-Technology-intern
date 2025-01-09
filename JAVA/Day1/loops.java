import java.util.*;

public class loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]=new int[n];
        for (int index = 0; index < arr.length; index++) {
            arr[index]=sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            //for loop
            System.out.println(arr[i]);
        }
        int a,i=0;
        do{
            //do while loop
            System.out.println("Enter a number: ");
            arr[i]=sc.nextInt();
            i++;
            System.out.println("You entered: "+a);
            System.out.println("Do you want to continue? 0 to exit");
            a=sc.nextInt();
        }while(a!=0);
    }
}
