import java.util.Scanner;
public class method2{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();// 第一个表示n
        int m = in.nextInt();// 第二个表示m
        int count = 0;// 素数的个数
        int sum1 = 0;// 前n个素数的和
        int sum2 = 0;// 前m个素数的和
        int last = 0;// 第n个素数
        for (int i = 2;; i++) {
            if (isPrime(i) && count<n) {
                sum1 += i;
                sum2 += i;
                count++;
                last = i;
            }
            else if (isPrime(i) && count <= m) {
                sum2+= i;
                count++;
            }
            else {
            }
            if (count == m) {
                break;
            }
        }
        System.out.println(sum2-sum1 + last);// 一个整数，表示第n个素数到第m个素数之间所有的素数的和，包括第n个素数和第m个素数。
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