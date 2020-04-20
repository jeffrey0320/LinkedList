import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MainList {
    public static void main(String[] args) throws FileNotFoundException {
        LinkedList list = new LinkedList();

        readFiles(list);

        printList(list);

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
                list.append(words[0].charAt(0),Integer.parseInt(words[1]));
            }else{
                list.append(words[0].charAt(0),Integer.parseInt(words[1]),Double.parseDouble(words[2]));
            }
        }
    }

    public static void printList(LinkedList list)
    {
        Node currNode = list.head;

        System.out.println("LinkedList: ");

        // Traverse through the LinkedList
        while (currNode != null) {
            // Print the data at current node
            if(currNode.getType() == 'S'){
                System.out.println(currNode.getType() + " " + currNode.getQuantity() + " items");
            }else if(currNode.getType() == 'R'){
                System.out.print(currNode.getType());
                System.out.printf(" $%.2f\n",currNode.getPrice());
            }else{
                System.out.println(currNode.getType() + " " + currNode.getQuantity() + '%');
            }

            // Go to next node
            currNode = currNode.next;
        }
    }
}
