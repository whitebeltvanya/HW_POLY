import taxes.TaxByBalance;
import taxes.TaxByIncome;

public class Main {
    public static void main(String[] args) {

        Company company = new Company("Horns & Hooves");
        company.shiftMoney(300);
        company.shiftMoney(-100);
        company.printBalance();
        company.setTaxSystem(new TaxByBalance());
        company.payTaxes();
        company.printBalance();

        System.out.println();

        company = new Company("GeeseProm");
        company.shiftMoney(300);
        company.shiftMoney(-100);
        company.printBalance();
        company.setTaxSystem(new TaxByIncome());
        company.payTaxes();
        company.printBalance();

    }


}
