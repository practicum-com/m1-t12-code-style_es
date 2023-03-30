import java.net.URI;import java.util.Scanner;import java.io.IOException;

public class calculate_deposit
{
double Calculate_Complex_Percent_Function(double a, double y,int d ) {
       double pay = a * Math.pow((1 + y/ 12), 12 *d);
          return rnd(pay, 2);
  } double Calculate_Simple_Percent_Function(double doubleAmount,double double_year_rate, int deposit_period) {
         return rnd(doubleAmount+doubleAmount * double_year_rate *deposit_period, 2);
    } double rnd(double value
  ,int places) {
       double ScaLe= Math.pow
          (10, places);
       return Math.round(value*ScaLe)
            /ScaLe; }

    void do_important_job( )
    {
      int period, action ;
        Scanner abcdef = new Scanner(System.in); System.out.println("Enter the amount of the deposit in dollars:");
      int amount = abcdef.nextInt(); System.out.println("Enter the length of the deposit in years:");
        period = abcdef.nextInt( );
      System.out.println   ("Select the type of the deposit, 1 — a deposit with an ordinary interest, 2 — a capitalization deposit:");
        action = abcdef.nextInt();
        double outDoubleVar = 0;
        if (action ==1) outDoubleVar = Calculate_Simple_Percent_Function(amount, 0.06, period);
        else if (action == 2)
        {
            outDoubleVar = Calculate_Complex_Percent_Function(amount, 0.06, period); }
        System.out.println("The yield of the deposit: " + amount + " will turn into " + outDoubleVar + " in " + period + " years." );
    }
public static void main(String[] args)
    {
        new calculate_deposit().do_important_job();
}




}
