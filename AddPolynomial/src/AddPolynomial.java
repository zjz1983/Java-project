import java.util.Scanner;
public class AddPolynomial {
    public static void main(String[] args) {
        int[]a=new int[101];
        int[]b=new int [101];
        Scanner scan=new Scanner(System.in);
        int next;//保存输入值
        boolean flag1=false;//前面都有数
        boolean flag2=false;//前面都有数
        // save 2 polynomials in 2 arrays
        while((next=scan.nextInt())!=0) {
            a[next]+=scan.nextInt();
        }
        a[0]+=scan.nextInt();

        while((next=scan.nextInt())!=0) {
            b[next]+=scan.nextInt();
        }
        b[0]+=scan.nextInt();
        //输出最高幂次项（大于2）+x6和x6    要考虑：1.系数是负数  2.系数是正负1时，不输出1
        int i=100;
        for(;i>=2;--i) {
            if(a[i]+b[i]!=0) {
                System.out.print((a[i]+b[i]>0?"":"-")+(Math.abs(a[i]+b[i])==1?"":Math.abs(a[i]+b[i]))+"x"+i);
                flag1=true;
                flag2=true;
                break;
            }
        }
        --i;
        //系数不为零时和x平方及以上，要考虑：1.正负  2.正负一  x6+1x2和x6+x2
        for(;i>=2;--i) {
            if(a[i]+b[i]!=0) {
                System.out.print((a[i]+b[i]>0?"+":"-")+(Math.abs(a[i]+b[i])==1?"":Math.abs(a[i]+b[i]))+"x"+i);
            }
        }
        //若有最高次项（大于1次），则一次方的项的输出，x2+1x和x2+x
        if(flag1) {
            if(a[1]+b[1]!=0) {
                System.out.print((a[1]+b[1]>0?"+":"-")+(Math.abs(a[1]+b[1])==1?"":Math.abs(a[1]+b[1]))+"x");
                flag2=true;
            }
        }
        //若没有最高次项，一次方项的输出，+x和x
        else {
            if(a[1]+b[1]!=0) {
                System.out.print((a[1]+b[1]>0?"":"-")+(Math.abs(a[1]+b[1])==1?"":Math.abs(a[1]+b[1]))+"x");
                flag1=true;
                flag2=true;
            }
        }
        //若最高次项为一次x+8，和8的区别
        if(flag1) {
            if(a[0]+b[0]!=0) {
                System.out.print((a[0]+b[0]>0?"+":"-")+Math.abs(a[0]+b[0]));
                flag2=true;
            }
        }else {
            if(a[0]+b[0]!=0) {
                System.out.print((a[0]+b[0]>0?"":"-")+Math.abs(a[0]+b[0]));
                flag2=true;
            }
        }
        //两个多项式都为0
        if(!flag2) {
            System.out.print(0);
        }
        scan.close();
    }
}