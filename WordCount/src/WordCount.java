import java.util.Scanner;
import java.io.File;

public class WordCount {
    public static void main (String [] args)throws Exception{
        File file=new File("Personal Info.txt");
        Scanner scanner=new Scanner(file);
        int words=0;
        while(scanner.hasNextLine()){
            String line=scanner.nextLine();
            //If you want to count character number including white space, use ("") instead of (" ").
            words+=line.split(" ").length;
        }
        System.out.println("The file contains: "+words+" words.");
    }
}