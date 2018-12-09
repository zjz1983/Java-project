import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Fraction a = new Fraction(in.nextInt(), in.nextInt());
        Fraction b = new Fraction(in.nextInt(),in.nextInt());
        a.print();
        b.print();
        a.plus(b).print();
        a.multiply(b).plus(new Fraction(5,6)).print();
        a.print();
        b.print();
        in.close();
    }
    static class Fraction {
        private final int numerator;
        private final int denominator;
        public Fraction(int numerator, int denominator) {
            this.numerator = numerator;
            this.denominator = denominator;
        }

        public double toDouble(Fraction x) {
            double result = (double)numerator / (double)denominator;
            return result;
        }

        Fraction plus(Fraction r) {
            int product = this.denominator * r.denominator;
            int new_numerator = this.numerator * r.denominator + this.denominator * r.numerator;
            int new_denominator = product;
            Fraction x = new Fraction(new_numerator, new_denominator);
            return x;
        }

        Fraction multiply(Fraction r) {
            int new_numerator = this.numerator * r.numerator;
            int new_denominator = this.denominator * r.denominator;
            Fraction x = new Fraction(new_numerator, new_denominator);
            return x;
        }

        /* 将自己以“分子/分母”的形式输出到标准输出，并带有回车换行。如果分数是1/1，应该输出1。 当分子大于分母时，不需要提出整数部分，即31/30是一个正确的输出。 注意，在创建和做完运算后应该化简分数为最简形式。如2/4应该被化简为1/2。 */
        void print() {
            if (numerator == 1) {
                if (denominator == 1)
                    System.out.println("1");
                else
                    System.out.println("1" + "/" + denominator);
            } else {
                //求分子分母最大公约数
                int k = 1;
                int gcd = 1;
                while (k <= numerator) {
                    if ((numerator % k == 0) && (denominator % k == 0)) {
                        gcd = k;
                    }
                    k++;
                }
                if (numerator / gcd == 1 && denominator / gcd == 1) {
                    System.out.println("1");
                } else
                    System.out.println((numerator / gcd) + "/" + (denominator / gcd));
            }
        }
    }
}