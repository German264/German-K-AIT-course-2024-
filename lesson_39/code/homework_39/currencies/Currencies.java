package homework_39.currencies;

public enum Currencies {

    USD(1.06),       // Доллар США
    GBP(0.87),       // Британский фунт
    JPY(158.56),     // Японская йена
    CHF(0.98),       // Швейцарский франк
    AUD(1.68),       // Австралийский доллар
    CAD(1.45),       // Канадский доллар
    CNY(7.47),       // Китайский юань
    RUB(104.38);     // Российский рубль


    private final double rateToEuro;

    Currencies(double rateToEuro) {
        this.rateToEuro = rateToEuro;
    }

    public double getRateToEuro() {
        return rateToEuro;
    }

    @Override
    public String toString() {
        return this.name() + ": " + rateToEuro;
    }
}
