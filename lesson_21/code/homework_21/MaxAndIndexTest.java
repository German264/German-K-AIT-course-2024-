package homework_21;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MaxAndIndexTest {

    MaxAndIndex maxAndIndex;
    int[] array = {10, -10, 20, -15, 45, 66};

    @BeforeEach
    void setUp() {
        maxAndIndex = new MaxAndIndex(array);
    }

    @Test
    void maxAndIndex() {
        // expected
        int expectedIndex = 5; // Ожидаемый индекс максимального элемента (значение 66)

        // actual
        int[] result = maxAndIndex.findMaxAndIndex(); // Вызов метода для получения массива (макс.значение, index)
        int actualIndex = result[1]; // Получаем индекс максимального элемента из результата

        // Проверка, соответствует ли фактический индекс ожидаемому
        assertEquals(expectedIndex, actualIndex);
    }
}