import java.util.Scanner;

public class LoopTest {
    public static void main(String[] args) {
        int increment = 1;
        while (increment <= 100) {
            System.out.print("Calling... " + increment);
            increment = increment + 1;
        }
        int inc = 1;
        do {
            System.out.print("Number is...."+inc);
            inc = inc+1;
        }while (inc <= 100);
        int in1 = 1;
        do {
            System.out.print("Do While Test 1 : "+in1);
            in1 = in1+1;
        }while (in1 <= 10);
        int in2 = 1;
        while (in2 <= 10){
            System.out.print("Do While Test 2 : "+in2);
            in2 = in2+1;
        }
        System.out.println("Enter a valid int : ");
        Scanner scanner = new Scanner(System.in);
        int j = scanner.nextInt();

        for (int i=1; i<=j; i++){
            System.out.print("Looping to "+j);

        }


    }

}
