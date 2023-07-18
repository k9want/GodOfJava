package ch6;

public class InterestManager {
    public static void main(String[] args) {
        InterestManager im = new InterestManager();
//        for (int i=1; i<=365; i++) {
//            System.out.println(im.calculateAmount(i, 1000000));
//        }
        for (int i=10; i<=370; i+=10) {
            System.out.println(im.calculateAmount(i, 1000000));
        }
    }

    public double getInterestRate(int day) {
        double interest;
        //90 0.5
        //91 ~ 180 1
        //181 ~ 364 2
        //365 5.6
        if (day < 90) {
            interest = 0.5;
        } else if (day >= 91 && day <= 180) {
            interest = 1;
        } else if (day >= 181 && day <= 364) {
            interest = 2;
        } else if (day == 365) {
            interest = 5.6;
        } else {
            interest = 5.6;
        }
        return interest;
    }

    public double calculateAmount(int day, long amount) {
        double result = amount + (amount * (getInterestRate(day)));
        return result;
    }
}
