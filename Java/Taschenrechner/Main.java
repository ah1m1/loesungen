import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        while(true) {
            System.out.print("Eingabe: ");
            Scanner sc = new Scanner(System.in);
            String op = sc.nextLine();
            Calculator.calc(op);
        }
    }
}