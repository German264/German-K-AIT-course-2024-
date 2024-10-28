package classwork_33;

Эти методы применяются для работы с перечислениями (Enum) в Java. Рассмотрим каждый из них:

1. .values()
   Метод .values() возвращает массив всех возможных значений перечисления в том порядке, в котором они объявлены. Это полезно для перебора всех значений Enum.

enum Day {
MONDAY, TUESDAY, WEDNESDAY
}

// Пример использования
for (Day day : Day.values()) {
System.out.println(day);
}
Вывод:

MONDAY
TUESDAY
WEDNESDAY

2.  .toString()
   Метод .toString() возвращает строковое представление конкретного значения Enum, как оно указано в объявлении.

Day day = Day.MONDAY;
System.out.println(day.toString()); // Выведет "MONDAY"

Метод .toString() может быть переопределён для изменения строкового представления конкретного значения.

3. .ordinal()
   Метод .ordinal() возвращает порядковый номер значения Enum. Он начинается с 0 и указывает, в каком порядке это значение объявлено в Enum.

System.out.println(Day.MONDAY.ordinal());   // Выведет 0
System.out.println(Day.TUESDAY.ordinal());  // Выведет 1
System.out.println(Day.WEDNESDAY.ordinal()); // Выведет 2

4. .valueOf(String name)
   Метод .valueOf(String name) принимает строку, соответствующую имени одного из значений Enum, и возвращает это значение. Если переданная строка не соответствует ни одному из значений, выбрасывается исключение IllegalArgumentException.

Day day = Day.valueOf("TUESDAY");
System.out.println(day); // Выведет "TUESDAY"

Важно: Имя строки должно точно совпадать с именем элемента Enum (регистр имеет значение).






