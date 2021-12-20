import java.util.Scanner;

public class Main
{
    public static void main()
    {
        while (true) {
            System.out.print("Menge Reiskörner >> ");
            Scanner sc = new Scanner(System.in);
            String in = sc.nextLine();
            Rice r = new Rice(Long.parseLong(in), 0.0256);
            
            System.out.print("Gewicht >> ");
            String gW = sc.nextLine();
            
            System.out.println("Geschätzt:      " + gW);
            System.out.println("Echtes Gewicht: " + String.format("%.6f", r.getWeight()));
            
            System.out.println(r.getAmount() + " Reiskörner (" + r.getWeight() + "g) (" + x + ")");
        }
    }
}
