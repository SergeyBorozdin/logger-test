import bl.FileReader;
import bl.Reader;

public class App {

    public static void main(String[] args) {
        Reader reader = new FileReader();
        String message = reader.reader();
        System.out.println(message);
    }
}
