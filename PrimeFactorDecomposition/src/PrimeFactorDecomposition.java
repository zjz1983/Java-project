import java.util.Scanner;
public class PrimeFactorDecomposition {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        System.out.print(n+"=");
        for (int i=2; i<= n; i++ ){
            if(isPrime(i)){
                while(n%i==0){
                    if (n==i){
                        System.out.print(i);
                    }
                    else {
                        System.out.print(i + "x");
                    }
                    n = n / i;
                }
            }
        }
    }

    public static boolean isPrime(int num){// 返回true是质数，false不是质数
        int i;
        boolean flag = true;// 默认是质数
        if (num < 2){// 负数，0，1不是质数
            flag = false;
        }
        else if (num == 2){// 2是质数
            flag = true;
        }
        else {
            for (i = 2; i <= Math.sqrt(num); i++){// 计算开方
                if ((num % i) == 0){// 如果找到能够整除num，不是素数
                    flag = false;
                    break;
                }
            }
        }
        return flag;
    }
}