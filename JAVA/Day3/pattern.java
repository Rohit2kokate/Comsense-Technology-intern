package JAVA.Day3;

public class pattern {
    public static void pattern1(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
         
            
    }
    public static void patr2(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();     
        }
        
    }
    public static void patr3(int n){
        for(int i=1;i<=n;i++){
            for(int j=n;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();               
        }
    }
    public static void patr4(int n){
        
        for(int i=1;i<=n;i++){
            char ch='A';
            for(int j=1;j<=i;j++){
                System.out.print(ch);
                ch++;
            }  
            System.out.println(); 
        }
    }
    public static void patr5(int n){
        int a=1;
        for(int i=1;i<=n;i++){
           
            for(int j=1;j<=i;j++){
                System.out.print(a);
                a++;
            }  
            System.out.println(); 
        }
    }
    public static void patr6(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(j%2!=0){
                    System.out.print("1");
                }else{System.out.print("0");}
            }
            System.out.println(); 
        }
    }
    public static void patr7(int n){
        for(int i=1;i<=n;i++){
            for(int s=n-1;s>=i;s--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=2;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void patr8PascalTi(int n){
       
        for (int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            int a=1;
            for(int j=0;j<=i;j++){
                System.out.print(a+" ");
                a=a*(i-j)/(j+1);
            }
            System.out.println();
   
        }

    }
    public static void patr9(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");

            }
            System.out.println();
               
        }
        for(int i=1;i<=n;i++){
            for(int j=n-1;j>=i;j--){
                System.out.print("*");

            }
            System.out.println();
               
        }
        
        
    }
    public static void patr10(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }

            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        patr8PascalTi(5);
    }
}
