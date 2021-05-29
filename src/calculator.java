import java.util.Scanner;

class calculator {
   static int firstNum1 = 0;
   static int secondNum2 = 0;
   static boolean isRiman = false;
    static int res = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

String[] numarr = line.split(" ");
        if (numarr.length !=3) {
            throw new IllegalArgumentException ("Enter in formart: 'a + b' or 'a - b' or 'a * b' or 'a / b'");
        }
        try {
firstNum1 = Integer.valueOf(numarr[0]);
secondNum2 = Integer.valueOf(numarr[2]);
        } catch (Exception error) {
firstNum1 = converte(numarr[0]);
secondNum2 = converte(numarr[2]);
isRiman = true;
        }
        String operation = numarr[1];
        if (operation.equals("-")) {
             res = firstNum1 - secondNum2 ;
        }
        else
        if (operation.equals("+")) {
            res = firstNum1 + secondNum2 ;
        }
        else
        if (operation.equals("/")) {
            res = firstNum1 / secondNum2 ;
                    }
        else
        if (operation.equals("*")) {
            res = firstNum1 * secondNum2 ;
        }
        else {
            throw new IllegalArgumentException("char is unknown. Enter in format: '+' or '-' or '*' or '/'");
        }
       if (isRiman == true) {
           System.out.println("result = " + converte(res ));

       }
       else {
           System.out.println("result = " +res);
       }



    }

    private static int converte(String rimanNumber) {
        rimanNumber.toUpperCase();
        if (rimanNumber.equals("I")) {
            return 1;
        } else if (rimanNumber.equals("II")) {
            return 2;
        } else if (rimanNumber.equals("III")) {
            return 3;
        } else if (rimanNumber.equals("IV")) {
            return 4;
        } else if (rimanNumber.equals("V")) {
            return 5;
        } else if (rimanNumber.equals("VI")) {
            return 6;
        } else if (rimanNumber.equals("VII")) {
            return 7;
        } else if (rimanNumber.equals("VIII")) {
            return 8;
        } else if (rimanNumber.equals("IX")) {
            return 9;
        } else if (rimanNumber.equals("X")) {
            return 10;
        } else {
            throw new IllegalArgumentException(
                    "Cant calculate with number less than 0 and more than 10 or different spellings of numbers");
        }

    }
    private static String converte(int decision) {
        if (decision <= 0) {
            throw new IllegalArgumentException("Riman numerals cannot be less than zero");
        }
        StringBuilder riman = new StringBuilder();
        int[] values = { 100, 90, 50, 40, 10, 9, 5, 4, 1 };
        String[] rimanLiterals = { "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
        for (int i = 0; i < values.length; i++) {
            while (decision >= values[i]) {
                decision -= values[i];
                riman.append(rimanLiterals[i]);
            }

        }
        return riman.toString();
    }

}

