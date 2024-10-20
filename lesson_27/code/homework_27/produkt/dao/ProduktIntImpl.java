package homework_27.produkt.dao;

import homework_27.produkt.model.Food;
import homework_27.produkt.model.Produkt;

public class ProduktIntImpl implements ProduktInt{

    private Produkt[] produkts;
    private int size; // текущее кол-во продовольственных продуктов

    public ProduktIntImpl(int capacity) {
        this.produkts = new Produkt[capacity];
        this.size = 0;
    }


    @Override
    public boolean addProdukt(Produkt produkt) {
        // negative cases
        if (produkt == null) {
            return false;
        }
        if (size == produkts.length) {
            return false;
        }
        if (!(findProdukt(produkt.getBarCode()) == null)) {
            return false;
        }
        // positive case
        produkts[size] = produkt; // ставим продукт в конец массива, первое свободное место
        size++;
        return true;
    }

    @Override
    public Produkt findProdukt(long barCode) {
        for (int i = 0; i < size; i++) {
            if (produkts[i].getBarCode() == barCode) {
                return produkts[i]; // Возвращаем найденный продукт
            }
        }
        return null; // Возвращаем null, если продукт не найден
    }

    @Override
    public Produkt findByExpDate(String expDate) {
        for (int i = 0; i < size; i++) {
            if(produkts[i] instanceof Food){
                Food food = (Food) produkts[i];
                if(((Food) produkts[i]).getExpDate() != null){
                    return produkts[i];
                }
            }
        }
        return null;
    }

    @Override
    public void printFood() {
        for (int i = 0; i < size; i++) {
            System.out.println(produkts[i]);
        }
    }

    @Override
    public double allCostProdukt() {
        double totalCost = 0;
        for (int i = 0; i < size; i++) {
            totalCost += produkts[i].getPrice(); // Суммируем цены всех продуктов
        }
        return totalCost;
    }

    @Override
    public double averageCostProdukt() {
        if (size == 0) {
            return 0;                              // Если продуктов нет, возвращаем 0
        }
        double totalCost = allCostProdukt();      // Используем предыдущий метод для получения общей стоимости
        return totalCost / size;                  // Возвращаем среднюю стоимость
    }

    @Override
    public Produkt removeProdukt(long barCode) {
            for (int i = 0; i < size; i++) {
                if (produkts[i].getBarCode() == barCode) {
                    Produkt victim = produkts[i];
                    produkts[i] = produkts[size - 1];// last book put instead victim
                    produkts[size - 1] = null;// затираем последний элемент массива
                    size--;
                    return victim;
                }
            }
        return null;
    }

    @Override
    public int size() {
        return size;
    }
}
