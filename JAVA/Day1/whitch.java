import java.util.Scanner;
public class whitch {
    public static void main(String[] args) {
        int day ;
        System.out.println("do you want to know the day of the week?");
        Scanner sc = new Scanner(System.in);
        day = sc.nextInt();
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            default:
                break;
        }
    }
}
