package taxes;

public class TaxByBalance extends TaxSystem {

    public TaxByBalance() {
        taxRate = 15;
        taxSystemName = "УСН Доходы-минус-Расходы";
    }

    @Override
    public int calcTaxFor(int debit, int credit) {
        int taxAmount = (debit - credit) * taxRate / 100;
        return Math.max(taxAmount, 0);
    }
}
