package taxes;

public class TaxByIncome extends TaxSystem {

    public TaxByIncome() {
        taxRate = 6;
        taxSystemName = "УСН - доходы";
    }

    @Override
    public int calcTaxFor(int debit, int credit) {
        return debit * taxRate / 100;
    }

}

