import java.util.Scanner;
public class GPS{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.nextLine();
        String s2, s4="";
        while (!s1.equals("END")) {
            int w1 = s1.indexOf(',');
            int w2 = s1.indexOf(',',w1+1);
            boolean judge = false;
            if( w2 != -1) {
                if(s1.charAt(w2+1)=='A'){
                    judge = true;
                }
            }
            if ( s1.startsWith("$GPRMC") && judge) {
                s2 = s1;
                //提取数字作运算比较
                int q1 = s1.lastIndexOf('*');
                String s3 = s1.substring(q1+1);
                int result1 = Integer.parseInt(s3, 16);
                //计算异或值
                int result2  = s1.charAt(1);
                int n = s1.indexOf('*');
                for( int i = 2; i <n; i ++ ) {
                    result2  = result2  ^ s1.charAt(i);
                }
                if((result2 %65536)== result1) {
                    s4 = s2;
                }
            }
            s1 = in.nextLine();
        }
        String hr = s4.substring(7,9);
        String mm = s4.substring(9,11);
        String ss = s4.substring(11,13);
        int hour = (Integer.parseInt(hr)+8)%24;
        if ( hour < 10 ) {
            System.out.print("0");
        }
        System.out.println(hour+":"+mm+":"+ss);
    }
}