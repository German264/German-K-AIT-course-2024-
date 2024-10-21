package homework_27.produkt.test;

import homework_27.produkt.dao.ProduktIntImpl;
import homework_27.produkt.model.MeatFood;
import homework_27.produkt.model.MilkFood;
import homework_27.produkt.model.Produkt;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProduktIntImplTest {

    Produkt[] prod;
    ProduktIntImpl food;
    int size = 0;

    @BeforeEach
    void setUp() {
        //create object
        food = new ProduktIntImpl(5);
        prod = new Produkt[5];

        prod[0] = new MeatFood(15, "мясо", 123, "08.11.24", "говядина");
        prod[1] = new MilkFood(1.1, "молоко коровье", 456, "12.11.24", "обезжиренное", 0.5);
        prod[2] = new MilkFood(1.3, "молоко козье", 387, "14.11.2024", "жирное", 4.8);
        prod[3] = new Produkt(4.5, "шампунь", 789);

        // TODO поместить объекты prod[] в объект food с помощью метода addProdukt
        for (int i = 0; i < 4; i++) {
            food.addProdukt(prod[i]);
        }
    }

    @Test
    void addProduktTest() {
        // - не добавлять null
        assertFalse(food.addProdukt(null));
        //  - не добавлять дубликат
        assertFalse(food.addProdukt(prod[2]));
        // добавляем еще один новый продукт
        MeatFood newMeatFood = new MeatFood(7,"мясо", 402, "20.10.2024", "свинина");
        assertTrue(food.addProdukt(newMeatFood));
        assertEquals(5, food.size());
        // добавляем еще один сверх capacity
        Produkt oneMoreProdukt = new Produkt(6.3, "мыло", 987);
        assertFalse(food.addProdukt(oneMoreProdukt));
    }

    @Test
    void findProduktTest() {
        Produkt findProdukt = food.findProdukt(123);
        assertEquals( prod[0], food.findProdukt(123)); // find existed produkt
        assertNull(food.findProdukt(975)); // find absent produkt
    }

    @Test
    void findByExpDateTest() {
        Produkt foundProdukt = food.findByExpDate("12.11.24");
        assertEquals(prod[1], food.findByExpDate("12.11.24")); // поиск продукта с существующей датой истечения срока

        Produkt nonFoodProdukt = prod[3];
        assertNull(food.findByExpDate("неизвестная дата")); // поиск продукта без даты истечения срока
    }

    @Test
    void printFoodTest() {
        System.out.println("=========================");
        food.printFood();
    }

    @Test
    void allCostProduktTest() {
        double expectedTotalCost = prod[0].getPrice() + prod[1].getPrice() + prod[2].getPrice() + prod[3].getPrice(); // Считаем ожидаемую общую стоимость
        assertEquals(expectedTotalCost, food.allCostProdukt()); // Сравниваем с общей стоимостью
    }

    @Test
    void averageCostProduktTest() {
        double expectedTotalCost = prod[0].getPrice() + prod[1].getPrice() + prod[2].getPrice()+ prod[3].getPrice(); // Считаем ожидаемую общую стоимость
        double expectedAverageCost = expectedTotalCost / size; // Ожидаемая средняя стоимость
        assertEquals(expectedAverageCost, food.averageCostProdukt()); // Сравниваем с средней стоимостью
    }


    @Test
    void removeProduktTest() {
        // remove existed book
        assertEquals(prod[0], food.removeProdukt(123));
        // check size
        assertEquals( 3, food.size());
        // remove absent book
        assertNull(food.removeProdukt(975));
    }

    @Test
    void sizeTest() {
        assertEquals(4, food.size());
    }
}