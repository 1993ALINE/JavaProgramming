import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {

        System.out.print("Enter year : ");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();

        if (year % 4 == 0){
            System.out.print("It is a leapyear!");
        }else if(year % 100 == 0){
            System.out.print("It is a leapyear!");
        }else {
            System.out.print("Not leap year!");
        }
    }
}
