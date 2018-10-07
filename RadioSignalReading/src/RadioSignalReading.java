import java.util.Scanner;
public class RadioSignalReading {
    public static void main(String[] args){
        Scanner signal=new Scanner(System.in);
        int number=signal.nextInt();
        String[]Readability= {"unreadable","barely readable, occasional words distinguishable",
                "readable with considerable difficulty","readable with practically no difficulty","perfectly readable"};
        String[]Strength= {"Faint signals, barely perceptible","Very weak signals","Weak signals","Fair signals",
                "Fairly good signals", "Good signals","Moderately strong signals","Strong signals","Extremely strong signals"};
        int R=number/10-1;
        int S=number%10-1;
        System.out.println(Strength[S]+", "+Readability[R]+".");
    }
}