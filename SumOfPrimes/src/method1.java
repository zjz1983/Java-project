import java.util.Scanner;
public class method1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] primes = new int[200];
        primes[0]=2;
        int count = 1;
        int n, m;
        n=in.nextInt();
        m=in.nextInt();
        if(n>0&&n<=200&&m>0&&m<=200){  //确定前200个素数
            MAIN_LOOP:
            for(int x=3; count<200; x++){
                for(int i=2; i<x ;i++) {
                    if(x%i==0){
                        continue MAIN_LOOP;
                    }
                }
                primes[count++]=x;//前200个素数存入数组
            }
            int sum=0;
            for (int i=n-1; i<m; i++){ //指定的从第n个素数加到第m个素数，这里2为第一个素数
                sum+=primes[i];
                System.out.println(primes[i]);
            }
            System.out.println(sum);
        }
    }
}
