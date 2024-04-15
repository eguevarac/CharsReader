import java.util.Scanner;

public class SpellBook {

    //Solicita un int y lo devuelve
    public static int readInt() {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        boolean correctData;

        do {
            try {
                num = sc.nextInt();
                correctData = true;
            } catch (Exception e) {

                correctData = false;
                System.out.println("no has introducido un entero.");
                System.out.println("por favor, vuelve a intentarlo");
                sc.next();
            }
        } while (!correctData);
        return num;
    }

    //Solicita un float y lo devuelve
    public static float readFloat() {
        Scanner sc = new Scanner(System.in);
        float num = 0;
        boolean correctData;

        do {
            try {
                num = sc.nextFloat();
                correctData = true;
            } catch (Exception e) {

                correctData = false;
                System.out.println("no has introducido un flotante.");
                System.out.println("por favor, vuelve a intentarlo");
                sc.next();
            }
        } while (!correctData);
        return num;
    }

    //Solicita un string y lo devuelve
    public static String readString() {
        Scanner sc = new Scanner(System.in);

        return sc.next();
    }


    //solicita un char y lo devuelve
    public static char readChar() {
        Scanner sc = new Scanner(System.in);
        String wordToWorkWith = sc.next();
        char letter;

        while (wordToWorkWith.length() > 1) {
            System.out.println("Has introducido más de un carácter.");
            System.out.println("Vuelve a introducirlo.");
            wordToWorkWith = sc.next();
        }
        letter = wordToWorkWith.charAt(0);
        return letter;

    }

}
