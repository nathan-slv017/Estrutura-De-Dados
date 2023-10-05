import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int myNumber = scanner.nextInt();
        System.out.println("Seu numero é " + myNumber);

        if(myNumber % 2 != 0){
            System.out.println("Weird");
        } else if(myNumber % 2 == 0 && myNumber >= 2 && myNumber <=5){
            System.out.println("Not Weird");
        } else if (myNumber % 2 == 0 && myNumber >= 6 && myNumber <=20) {
            System.out.println("Weird");
        } else if(myNumber % 2 == 0 && myNumber > 20){
            System.out.println("Not Weird");
        }
    }
}
