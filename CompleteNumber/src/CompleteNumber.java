import java.util.Scanner;
public class CompleteNumber {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int m=in.nextInt();
        int n=in.nextInt();
        int count=0;
        for(int i=m; i<=n; i++){
            if (isCompleteNumber(i)){
                if(count!=0) {
                    System.out.print(" ");
                }
                System.out.print(i);
                count++;
            }
        }
        if (count==0){
            System.out.println();
        }
    }
    private static boolean isCompleteNumber(int num){
        int sum=0;
        boolean flag =false;
        for(int i=1; i<num; i++){
            if (num%i==0){
                sum=sum+i;
            }
        }
        if(sum==num){
            flag=true;
        }
        return flag;
    }
}
