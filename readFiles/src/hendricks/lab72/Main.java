package hendricks.lab72;
import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException{
        File coursegrades = new File("/javarepo/createFiles/src/create.txt");
        BufferedReader reader = new BufferedReader(new FileReader(coursegrades));
        String name = reader.readLine();
        String course = reader.readLine();
        String grades = reader.readLine();
    }
}
