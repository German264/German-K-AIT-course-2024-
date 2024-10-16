package homework_26.detail.dao;

import homework_26.detail.model.Detail;

public class StockImpl implements Stock{

private Detail[] details;
private int size;

    // capacity - возможное кол-во деталей на складе
    public StockImpl(int capacity) {
        this.details = new Detail[capacity];
        this.size = size;
    }

    @Override
    public boolean addDetail(Detail detail) {
        return false;
    }

    @Override
    public Detail removeDetail(int barCode) {
        return null;
    }

    @Override
    public Detail findDetail(int barCode) {
        return null;
    }

    @Override
    public Detail updateDetail(Detail detail) {
        return null;
    }

    @Override
    public double totalWeight() {
        return 0;
    }

    @Override
    public double averageWeight() {
        return 0;
    }
}
