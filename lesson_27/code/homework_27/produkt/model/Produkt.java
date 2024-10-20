package homework_27.produkt.model;

import java.util.Objects;

public class Produkt {

    private double price;
    private String name;
    private long barCode;

    public Produkt(double price, String name, long barCode) {
        this.price = price;
        this.name = name;
        this.barCode = barCode;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBarCode() {
        return barCode;
    }

    public void setBarCode(long barCode) {
        this.barCode = barCode;
    }

    @Override
    public String toString() {
        return "Produkt{" +
                "price=" + price +
                ", name='" + name + '\'' +
                ", barCode=" + barCode +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Produkt produkt)) return false;
        return Double.compare(price, produkt.price) == 0 && barCode == produkt.barCode && Objects.equals(name, produkt.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, name, barCode);
    }
}
