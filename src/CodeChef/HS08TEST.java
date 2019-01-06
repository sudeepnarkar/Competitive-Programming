package CodeChef;

import java.util.Scanner;

/**
 * Created by sudeep on 11/3/17.
 */
public class HS08TEST {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double amt_withdraw = sc.nextInt();
        double bal = sc.nextDouble();
        double charges = 0.5;

        double rem_balance = withdrawCash(amt_withdraw, bal , charges);
        System.out.printf("%.2f",rem_balance);

    }

    static double withdrawCash(double amt_withdraw, double bal, double charges) {

        double rem_balance = 0;
        if(amt_withdraw%5==0 ) {
            if (amt_withdraw > 0 && amt_withdraw <= 2000)
                if (bal >= 0 && bal <= 2000) {
                    if (bal - amt_withdraw > 0.5) {
                        rem_balance = (bal - amt_withdraw);
                        rem_balance -= charges;
                    } else
                        rem_balance = bal;
                }
        }
        else
            rem_balance=bal;
        return rem_balance;
    }
}

