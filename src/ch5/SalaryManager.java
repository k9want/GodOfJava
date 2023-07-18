package ch5;

public class SalaryManager {
    public static void main(String[] args) {
        SalaryManager salaryManager = new SalaryManager();
        System.out.println("실제 한달 급여 : " + salaryManager.getMonthlySalary(20000000));
    }

    public double getMonthlySalary(int yearlySalary) {
        double monthSalary = yearlySalary / 12.0;
        double nationTax = calculateNationalPension(monthSalary);
        double workTax = calculateTax(monthSalary);
        double healthTax = calculateHealthInsurance(monthSalary);

        System.out.println("근로 소득세 " + workTax);
        System.out.println("국민 연금 " + nationTax);
        System.out.println("건강 보험료 " + healthTax);

        double taxTotal = nationTax + workTax + healthTax;
        monthSalary -= taxTotal;
        return monthSalary;
    }

    public double calculateTax(double monthSalary){
        double workTax = monthSalary * (12.5/100);
        return workTax;
    }

    public double calculateNationalPension(double monthSalary) {
        double nationTax = monthSalary * (8.1/100);
        return nationTax;
    }

    public double calculateHealthInsurance(double monthSalary) {
        double healthTax = monthSalary * (13.5/100);
        return healthTax;
    }

}
