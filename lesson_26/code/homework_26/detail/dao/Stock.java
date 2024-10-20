package homework_26.detail.dao;

//добавить деталь на складе
//найти деталь по barCode
//обновить данные о детали
//удалить деталь
//общая масса всех деталей на складе
//средняя масса деталей на складе


import homework_26.detail.model.Detail;

public interface Stock {

    boolean addDetail(Detail detail);

    Detail removeDetail(int barCode);

    Detail findDetail(int barCode);

    Detail updateDetail(Detail detail);

    double totalWeight();

    double averageWeight();
}
