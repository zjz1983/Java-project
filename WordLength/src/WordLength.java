import java.util.Scanner;
public class WordLength {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a= in.nextLine();
        String count[] = a.split(" ");  //以空格为界限将长字符串分割为短字符串，并存到字符数组里
        for (int i=0; i < count.length; i++){
            if (i<count.length-1){
                if(count[i].length()!=0)
                    System.out.print(count[i].length()+" ");
            }
            else {
                if(count[i].length()!=1) //“.”末尾句号
                    System.out.print(count[i].length()-1);
            }
        }
    }
}