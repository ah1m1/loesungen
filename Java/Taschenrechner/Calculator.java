public class Calculator {

    public static void calc(String op) {
    
        //1 + 2 + 5 - 5
        String[] operationen = op.split(" ");
        
        int ergebnis = Integer.parseInt(operationen[0]);
        for(int i = 1; i < operationen.length; i++) {
        
            switch(operationen[i]) {
                case "+": 
                    ergebnis = ergebnis + Integer.parseInt(operationen[i + 1]);
                    break;
                case "-":
                    ergebnis = ergebnis - Integer.parseInt(operationen[i + 1]);
                    break;
                case "*":
                    ergebnis = ergebnis * Integer.parseInt(operationen[i + 1]);
                    break;
                case "/":
                    ergebnis = ergebnis / Integer.parseInt(operationen[i + 1]);
                    break;

            }
            i = i + 1;
        }
        
        System.out.println("Das Ergebnis ist " + ergebnis);
    }
    
}