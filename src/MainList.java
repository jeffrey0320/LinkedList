import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MainList {
    public static void main(String[] args) throws FileNotFoundException {
        LinkedList list = new LinkedList();


    }
    public static void readFiles(LinkedList list) throws FileNotFoundException {
        String line;
        File myFile = new File("Records.txt");
        Scanner readIn = new Scanner(myFile);

        while(readIn.hasNext()){

            int wordCount = 0;
            line = readIn.nextLine();
            String[] words = line.split(" ");
            wordCount = wordCount + words.length;

            if(wordCount == 2){
                list.head = new Node(words[0].charAt(0),Integer.parseInt(words[1]));
            }else{
                list.head = new Node(words[0].charAt(0),Integer.parseInt(words[1]),
                        Double.parseDouble(words[2]));
            }
        }
    }
}
