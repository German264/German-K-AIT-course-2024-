package classwork_41.citizens.dao;

import classwork_41.citizens.model.Person;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CitizensImpl implements Citizens{

    // статические переменные класса
    private static Comparator<Person> lastNameComparator;
    private static Comparator<Person> ageComparator;

    static {
        lastNameComparator = (p1, p2) -> {
            int res = p1.getLastName().compareTo(p2.getLastName()); // по фамилии
            return res != 0 ? res : Integer.compare(p1.getId(), p2.getId()); // по id
        };
        ageComparator = (p1, p2) -> {
            int res = Integer.compare(p1.getAge(), p2.getAge()); // по возрасту
            return res != 0 ? res : Integer.compare(p1.getId(), p2.getId()); // по id
        };
    }

    // fields
    private List<Person> idList;
    private List<Person> lastNameList;
    private List<Person> ageList;

    public CitizensImpl() {
        idList = new ArrayList<>();
        lastNameList = new ArrayList<>();
        ageList = new ArrayList<>();
    }

    public CitizensImpl(List<Person> citizens) {
        this();
        citizens.forEach(p -> add(p));
    }

    // O - ???
    @Override
    public boolean add(Person person) {
        // что проверяем?
        // Проверка, что метод не пытаются вызвать с пустым значением. Если в метод добавления случайно передали null, попытка использовать это значение (например, вызвать методы или получить доступ к полям объекта) приведет к исключению NullPointerException.
        if (person == null) {
            return false;
        }
        // что делает этот код?
        int index = Collections.binarySearch(idList, person); // что делаем?
        //Проверяем на дубль методом binarySearch - если такой человек в списке уже есть, то не добавляем. Это для того, чтобы каждый смог проголосовать только один раз.
        if (index >= 0) { // что делаем, если index >= 0?
            //Такой человек нашелся, не добавляем, отдаем false
            return false;
        }

        //Далее выполняется добавление объекта person в несколько отсортированных списков idList, ageList и lastNameList таким образом, чтобы каждый из этих списков оставался отсортированным после добавления элемента. Метод binarySearch возвращает индекс, по которому нужно вставить элемент для сохранения порядка.

        index = -index - 1; // что делаем с index? зачем?
        //Если элемент не найден, метод binarySearch возвращает отрицательное значение, равное -(вставочный индекс + 1). Чтобы вычислить фактический индекс для вставки, выполняется выражение -index - 1. Это позволяет определить, куда вставить элемент в отсортированный список так, чтобы порядок сохранился.

        idList.add(index, person); // что делаем?
        //После вычисления index, метод add вставляет person в idList по этому индексу, таким образом, сохраняется порядок сортировки idList.

        // что делается в методе далее?
        //Далее аналогичные операции выполняются для ageList и lastNameList, но с использованием соответствующих компараторов:
        //ageList сортируется с использованием ageComparator.
        //lastNameList сортируется с использованием lastNameComparator.
        //Для каждого списка:
        //Выполняется binarySearch, чтобы найти или определить место вставки.
        //index корректируется для вставки в случае, если элемент не найден.
        //Затем person вставляется по определенному индексу.
        //return true; — В конце метод возвращает true, указывая, что добавление person прошло успешно.
        index = Collections.binarySearch(ageList, person, ageComparator);
        index = index >= 0 ? index : - index - 1;
        ageList.add(index, person);
        index = Collections.binarySearch(lastNameList, person, lastNameComparator);
        index = index >= 0 ? index : -index - 1;
        lastNameList.add(index, person);
        return true;
    }

    // O - ???
    // O(N)
    @Override
    public boolean remove(int id) {
        Person victim = find(id);
        if (victim == null) {
            return false;
        }
        idList.remove(victim);
        ageList.remove(victim);
        lastNameList.remove(victim);
        return true;
    }

    // O - ???
    // O(logN)
    @Override
    public Person find(int id) {
        Person pattern = new Person(id, "", "", LocalDate.now());
        int index = Collections.binarySearch(idList, pattern);
        return index < 0 ? null : idList.get(index);
    }

    // O - ???
    // O(logN)
    @Override
    public Iterable<Person> find(int minAge, int maxAge) {
        LocalDate now = LocalDate.now();
        Person pattern = new Person(Integer.MIN_VALUE, "", "", now.minusYears(minAge));
        int from = -Collections.binarySearch(ageList, pattern, ageComparator) - 1;
        pattern = new Person(Integer.MAX_VALUE, "", "", now.minusYears(maxAge));
        int to = -Collections.binarySearch(ageList, pattern, ageComparator) - 1;
        return ageList.subList(from, to);
    }

    // O - ???
    // O(logN)
    @Override
    public Iterable<Person> find(String lastName) {
        LocalDate now = LocalDate.now();
        Person pattern = new Person(Integer.MIN_VALUE, "", lastName, now);
        int from = -Collections.binarySearch(lastNameList, pattern, lastNameComparator) - 1;
        pattern = new Person(Integer.MAX_VALUE, "", lastName, now);
        int to = -Collections.binarySearch(lastNameList, pattern, lastNameComparator) - 1;
        return lastNameList.subList(from, to);
    }

    // O - ???
    // O(1)
    @Override
    public Iterable<Person> getAllPersonSortedById() {
        return idList;
    }

    // O - ???
    // O(1)
    @Override
    public Iterable<Person> getAllPersonSortedByLastName() {
        return lastNameList;
    }

    // O - ???
    // O(1)
    @Override
    public Iterable<Person> getAllPersonSortedByAge() {
        return ageList;
    }

    // O - ???
    // O(1)
    @Override
    public int size() {
        return idList.size();
    }
}
