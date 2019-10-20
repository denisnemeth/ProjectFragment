package sk.itsovy.project;

public class Bank {

    private String name;

    public Bank() {
    }

    public Bank(String name) {
        this.name = name;
    }

    public double convert(double amount, String code) {
        System.out.println();
        double convAmount=0;
        if (amount>0) {
            switch(code) {
                case "TRY": convAmount=amount*6.4447; break;
                case "HUF": convAmount=amount*330.62; break;
                case "CHF": convAmount=amount*1.0996; break;
                case "HRK": convAmount=amount*7.4418; break;
                case "GBP": convAmount=amount*0.8644; break;
                default:
                    System.out.println("Invalid currency!"); convAmount=-1; break;
            }
            convAmount*=100;
            convAmount=(convAmount-(convAmount%1))/100;

        } else {
            System.out.println("Invalid amount!");
            convAmount=-1;
        }
        return convAmount;
    }

    public static double loan(double value, double interest, int months) {
        System.out.println();
        double monthlyInstallment=0;
        if (value>0 && interest>0 && months>0) {
            monthlyInstallment = (value*(1+(interest/100)))/months;
        } else {
            monthlyInstallment=-1;
            System.out.println("Invalid input!");
        }
        return monthlyInstallment;
    }
}
