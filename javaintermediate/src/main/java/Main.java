import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    private static final String PATH_TO_FILE ="C:\\Users\\RENT\\IdeaProjects\\hello\\src\\plik.txt";

    public static void main(String[] args) throws InterruptedException, IOException {

        System.out.println("zaczynam czytac");
        String line = null;
        int nr_linii = 0;
        try(BufferedReader reader = new BufferedReader(new FileReader("plik.txt"))){

            while ((line = reader.readLine())!= null){
                System.out.println(++nr_linii + ": " + line);

            }
        }
        catch (IOException ex){
            ex.printStackTrace();
        }

    }
}
