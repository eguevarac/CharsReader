
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Almacena todos los métodos referentes a la lectura y/o escritura de ficheros
 */
public class FilesRW {

    public static ArrayList<String> readFile(String fileURL) {

        String line;
        ArrayList<String> data = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(fileURL))) {

            while ((line = br.readLine()) != null) {
                data.add(line);
            }

        } catch (FileNotFoundException e) {

            System.out.println("NO SE HA ENCONTRADO EL FICHERO");

        } catch (IOException e) {

            System.out.println("ERROR DURANTE LA LECTURA DEL FICHERO");

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("INFORMACIÓN MAL GUARDADA EN EL FICHERO");
        }

        return data;
    }
}
