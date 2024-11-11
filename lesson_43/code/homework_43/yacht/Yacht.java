package homework_43.yacht;

public class Yacht {

    private String manufacturer; // Производитель
    private String country; // Страна (флаг)
    private int yearOfManufacture; // Год выпуска
    private double length; // Длина
    private String material; // Материал корпуса
    private double price; // Стоимость

    // Конструктор
    public Yacht(String manufacturer, String country, int yearOfManufacture, double length, String material, double price) {
        this.manufacturer = manufacturer;
        this.country = country;
        this.yearOfManufacture = yearOfManufacture;
        this.length = length;
        this.material = material;
        this.price = price;
    }

    // Геттеры
    public String getManufacturer() {
        return manufacturer;
    }

    public String getCountry() {
        return country;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public double getLength() {
        return length;
    }

    public String getMaterial() {
        return material;
    }

    public double getPrice() {
        return price;
    }

    // Метод для отображения информации о яхте
    @Override
    public String toString() {
        return "Yacht{" +
                "manufacturer='" + manufacturer + '\'' +
                ", country='" + country + '\'' +
                ", yearOfManufacture=" + yearOfManufacture +
                ", length=" + length +
                ", material='" + material + '\'' +
                ", price=" + price +
                '}';
    }
}
