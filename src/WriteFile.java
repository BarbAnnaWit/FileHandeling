import java.io.FileWriter; // This class will write something to the file
import java.io.IOException;
public class WriteFile {


        public static void main(String[] args) {
            try {
                FileWriter myWriter = new FileWriter("Next week orders.txt");
                myWriter.write("Ink,pens,notebooks,printer paper."); // method to write on the file
                myWriter.close(); // this method to close the file and finish writing
                System.out.println("Successfully wrote to the file.");
            }
            catch (IOException e){
                System.out.println("You have An error .");
                e.printStackTrace();
            }
        }
    }


