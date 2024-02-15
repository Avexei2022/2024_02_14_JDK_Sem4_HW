package ru.gb.iamstudent.model.staffers;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс справочника наследников сотрудника
 * @param <E>
 */
@Data
public class StafferList<E extends Staffer> {

    protected int id = 1;
    protected List<E> stafferList;


    /**
     * Конструктор справочника
     */
    public StafferList() {
        stafferList = new ArrayList<>();
    }

    /**
     * Метод добавления сотрудника в справочник
     * @param e Сотрудник и его наследники
     * @return результат добавления сотрудника в справочник
     */
    public boolean addStafferToList(E e) {
        if (e == null) {
            return false;
        }
        if (!stafferList.contains(e)) {
            stafferList.add(e);
            e.setId(id++);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "\nСправочник сотрудников: \n" + stafferList;
    }
}
