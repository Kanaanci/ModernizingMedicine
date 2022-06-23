import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

final public class Processes {
    /*Read input file*/
    public static ArrayList getInputs(String filePath) {
        ArrayList<Character> inputs = new ArrayList<>();

        try {
            Scanner scan = new Scanner(new File(filePath));

            while (scan.hasNextLine()) {
                inputs.add(scan.next().charAt(0));
            }
            scan.close();
        } catch (
                FileNotFoundException e) {
            e.printStackTrace();
        }

        return inputs;
    }
}