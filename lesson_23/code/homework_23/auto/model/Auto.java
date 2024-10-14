package homework_23.auto.model;

//Задача 2. Семья планирует поехать в отпуск в Италию из Германии и покрыть порядка 3000 км. Имеется информация о 5 автомобилях на жидком топливе (бензин или дизтопливо):
//марка автомобиля: Audi, BMW, Opel, VW, Mercedes.
//тип расходуемого топлива: d, b, d, d, b
//стоимость 1 литра топлива: d - 1.6, b - 1.8
//расход на 100 км пути: 6.6, 6.8, 6.9, 6.5, 6.3
//стоимость недельной аренды автомобиля: 45, 49, 45, 39, 49 Какой автомобиль ей следует выбрать, исходя из минимальной стоимости?
public class Auto {

    private String mark;
    private Double fuelCost;
    private Double fuelConsum;
    private int rentalCost;

    public Auto(String mark, Double fuelCost, Double fuelConsum, int rentalCost) {
        this.mark = mark;
        this.fuelCost = fuelCost;
        this.fuelConsum = fuelConsum;
        this.rentalCost = rentalCost;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public Double getFuelCost() {
        return fuelCost;
    }

    public void setFuelCost(Double fuelCost) {
        this.fuelCost = fuelCost;
    }

    public Double getFuelConsum() {
        return fuelConsum;
    }

    public void setFuelConsum(Double fuelConsum) {
        this.fuelConsum = fuelConsum;
    }

    public int getRentalCost() {
        return rentalCost;
    }

    public void setRentalCost(int rentalCost) {
        this.rentalCost = rentalCost;
    }

    @Override
    public String toString() {
        return "Auto{" +
                " mark='" + mark + '\'' +
                ", fuelCost=" + fuelCost +
                ", fuelConsum=" + fuelConsum +
                ", rentalCost=" + rentalCost +
                '}';
    }

    // Расчет общей стоимости поездки
    public double totalPrice (int distance){
        double totalPrice = (distance/100) * fuelConsum * fuelCost + rentalCost;
        return totalPrice;
    }
}
