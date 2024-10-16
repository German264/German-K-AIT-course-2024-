package homework_26.detail.test;

import homework_26.detail.dao.Stock;
import homework_26.detail.dao.StockImpl;
import homework_26.detail.model.Detail;
import homework_26.detail.model.Gear;
import homework_26.detail.model.Lever;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StockImplTest {

    Stock stock;
    Detail[] details;

    @BeforeEach
    void setUp() {
        stock = new StockImpl(5);
        details = new Detail[4];

        details[0] = new Gear(01, 20.7, "метал", "V1", 14.6, 70, 7);
        details[1] = new Gear(02, 18.5, "метал", "V2", 12.4, 50, 4);
        details[2] = new Lever(03, 12.5, "метал", "V3", 7.4, 90);
        details[3] = new Lever(04, 2.5, "метал", "V4", 6.5, 70);
    }

    @Test
    void addDetail() {
    }

    @Test
    void removeDetail() {
    }

    @Test
    void findDetail() {
    }

    @Test
    void updateDetail() {
    }

    @Test
    void totalWeight() {
    }

    @Test
    void averageWeight() {
    }
}