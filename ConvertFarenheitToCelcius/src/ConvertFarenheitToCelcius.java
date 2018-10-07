import java.util.Scanner;
public class ConvertFarenheitToCelcius{
    public static void main(String[] args){
        double Farenheit, Celcius;
        System.out.println("Please input Farenheit: ");
        Scanner input=new Scanner(System.in);
        Farenheit=input.nextDouble();
        Celcius=(Farenheit-32)*5/9.0;
        int output=(int)Celcius;
        System.out.println(Farenheit+"F="+output+"C");
    }
}