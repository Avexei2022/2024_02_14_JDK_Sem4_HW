package ru.gb.iamstudent.presenter;

import ru.gb.iamstudent.model.staff_department.HROfficerEmulator;
import ru.gb.iamstudent.view.View;


/**
 * Класс презентера в паттерне MVP
 */
public class Presenter {
    private final View view;
    private final HROfficerEmulator hrOfficerEmulator;

    /**
     * Конструктор презентера
     * @param view
     */
    public Presenter(View view) {
        this.view = view;
        this.hrOfficerEmulator = new HROfficerEmulator();
    }


    /**
     * Метод получения текущего справочника сотрудников
     */
    public void getCurrentStafferList() {
        String info = hrOfficerEmulator.getCurrentStafferList();
        view.printAnswer(info);
    }


    /**
     * Метод добавления нового сотрудника в справочник
     * @param name Имя сотрудника
     * @param phone Телефон сотрудника
     * @param experience Стаж сотрудника
     */
    public void addNewStaffer(String name, String phone, String experience) {
        String info = hrOfficerEmulator.addNewStaffer(name, phone, experience);
        view.printAnswer(info);
    }


    /**
     * Метод поиска сотрудников по стажу
     * @param experience Стаж сотрудника
     */
    public void findStafferByExperience(String experience) {
        String info = hrOfficerEmulator.findStafferByExperience(experience);
        view.printAnswer(info);
    }

    /**
     * Метод поиска телефона сотрудника по имени сотрудника
     * @param name Имя сотрудника
     */
    public void findPhoneByName(String name) {
        String info = hrOfficerEmulator.findPhoneByName(name);
        view.printAnswer(info);
    }

    /**
     * Метод поиска сотрудника по табельному номеру
     * @param number Табельный номер
     */
    public void findStafferByNumber(String number) {
        String info = hrOfficerEmulator.findStafferByNumber(number);
        view.printAnswer(info);
    }
}
