import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class fileReader {

    public static void main(String[] args){
        try {
            Scanner input = new Scanner(new File("input.txt"));
            while(input.hasNext()){
                System.out.println(input.next());
            }
            input.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }
}
