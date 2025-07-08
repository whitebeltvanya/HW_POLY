import taxes.TaxSystem;

public class Company {
    protected String title;
    protected int debit;
    protected int credit;
    protected TaxSystem taxSystem;

    public Company(String title) {
        this.title = title;
    }

    public void setTaxSystem(TaxSystem taxSystem) {

        this.taxSystem = taxSystem;
    }

    public void shiftMoney(int amount) {
        if (amount > 0) {
            debit += amount;
        } else if (amount < 0)
            credit += Math.abs(amount);
    }

    public void payTaxes() {
        if (taxSystem == null) {
            System.out.println("Не указана система налогооблажения!");
            return;
        }

        int taxAmount = taxSystem.calcTaxFor(debit, credit);
        System.out.printf("""
                        Компания %s уплатила налог в размере: %d руб.
                        По системе налогообложения: %s (%d%%).
                        """,
                title, taxAmount, taxSystem.getTaxSystemName(), taxSystem.getTaxRate());

        if (taxAmount != 0) {
            credit = 0;
            debit = 0;
        }
    }

    public void printBalance() {
        System.out.printf("Компания %s : Доходы: %d руб., Расходы: %d руб.\n", title, debit, credit);
    }
}

