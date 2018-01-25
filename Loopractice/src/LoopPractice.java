public class LoopPractice {
    public static void main(String[] args) {
        int roll = 1;
        while (roll <= 100){
            System.out.print("Student's roll is : "+roll);
            roll = roll+1;
        }
        for(int i=1; i<=100; i++){
            System.out.print("Value of i is : "+i+"\n");

        }
        int j = 1;
        do {
            System.out.print("j = " + j + "\n");
            j = j+1;
        }while (j<=10);

    }
}
