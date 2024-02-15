package ru.gb.iamstudent.model.staffers;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;


@Data
public class StafferList<E extends Staffer> {

    protected int id = 1;
    protected List<E> stafferList;

    public StafferList() {
        stafferList = new ArrayList<>();
    }

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
