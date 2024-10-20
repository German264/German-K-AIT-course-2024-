package homework_27.produkt.dao;

import homework_27.produkt.model.Produkt;

public interface ProduktInt {

// CRUD methods

    public boolean addProdukt(Produkt produkt);

    public Produkt findProdukt (long barCode);

    // find by ExpDate (all foods)
    public Produkt findByExpDate(String expDate);

    // void printFoods()
    public void printFood();

    double allCostProdukt();

    double averageCostProdukt();

    public Produkt removeProdukt(long barCode);

    // boolean updateProdukt()
    public int size();
}
