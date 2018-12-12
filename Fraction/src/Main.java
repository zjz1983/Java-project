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
        Fraction(int numerator, int denominator) {
            this.numerator = numerator;
            this.denominator = denominator;
        }
        double toDouble(Fraction x) {
            return (double)numerator /(double)denominator;
        }
        Fraction plus(Fraction r) {
            int new_denominator = this.denominator * r.denominator;
            int new_numerator = this.numerator * r.denominator + this.denominator * r.numerator;
            Fraction x = new Fraction(new_numerator, new_denominator);
            return x;
        }
        Fraction multiply(Fraction r) {
            int new_numerator = this.numerator * r.numerator;
            int new_denominator = this.denominator * r.denominator;
            Fraction x = new Fraction(new_numerator, new_denominator);
            return x;
        }
        void print() {/* 输出“分子/分母”，并回车换行。当分子>分母，不要提出整数，即31/30是正确的。运算后应该约分。*/
            int i = 1;
            int j = 1;
            while (i <= numerator) {
                if ((numerator %i == 0) && (denominator %i == 0)) {
                    j = i;
                }
                i++;
            }
            if (numerator / j == 1 && denominator /j == 1) {
                System.out.println("1");
            } else
                System.out.println((numerator /j) + "/" + (denominator /j));
        }
    }
}