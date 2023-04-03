import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {
        File myObj = new File("Next week orders.txt");
        if (myObj.delete()) {
            System.out.println("File " + myObj.getName() + " is deleted");
        } else{
            System.out.println("Filed to delete the file.");
        }

    }
}