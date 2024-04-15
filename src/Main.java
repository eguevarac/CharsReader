import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        final int MIN_ASCII = 33;
        final int MAX_ASCII = 122;
        ArrayList<MyThread> threads = new ArrayList<>();
        ArrayList<String> results = new ArrayList<>();
        results.add("Lletra (ASC) Vegades Temps(s)");
        results.add("===============================");


        System.out.println("Muy buenas!");
        System.out.println("Introduce la URL del fichero que quieres leer");
        String fileURL = SpellBook.readString();
        ArrayList<String> txtLines = FilesRW.readFile("src/resources/files/usersList.txt");

        for (int i = MIN_ASCII; i <= MAX_ASCII; i++) {
            MyThread myThread = new MyThread(i, txtLines, results);
            threads.add(myThread);
        }

        for (MyThread thread :
                threads) {
            thread.start();
        }

        for (MyThread thread :
                threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        for (String result : results) {
            System.out.println(result);
        }
    }
}