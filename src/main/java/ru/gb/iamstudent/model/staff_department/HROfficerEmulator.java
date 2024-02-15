package ru.gb.iamstudent.model.staff_department;

import ru.gb.iamstudent.model.staffers.Staffer;
import ru.gb.iamstudent.model.staffers.StafferList;

import java.util.List;


/**
 * Класс Отдела кадров, держателя справочника сотрудников.
 */
public class HROfficerEmulator {
    StafferList<Staffer> stafferList;

    public HROfficerEmulator() {
        createStafferList();
    }

    /**
     * Метод формирует первоначальный справочник сотрудников
     */
    private void createStafferList() {
        stafferList = new StafferList<>();
        stafferList.addStafferToList(new Staffer(1111111, "Ivan Ivanov", 11));
        stafferList.addStafferToList(new Staffer(2222222, "Petr Petrov", 11));
        stafferList.addStafferToList(new Staffer(3333333, "Oleg Olegov", 13));
        stafferList.addStafferToList(new Staffer(4444444, "Semen Semenov", 14));
        stafferList.addStafferToList(new Staffer(5555555, "Masha Masheva", 13));
        stafferList.addStafferToList(new Staffer(6666666, "Olga Olgova", 16));
        stafferList.addStafferToList(new Staffer(7777777, "Ira Irova", 14));
        stafferList.addStafferToList(new Staffer(8888888, "Mark Markov", 18));
        stafferList.addStafferToList(new Staffer(9999999, "Fedor Fedorov", 14));
    }

    /**
     * Метод получения текущего справочника сотрудников
     * @return справочник сотрудников
     */
    public String getCurrentStafferList() {
        return stafferList.toString();
    }

    /**
     * Метод добавления нового сотрудника в справочник
     * @param name Имя сотрудника
     * @param s_phoneNumber Телефон сотрудника
     * @param s_experience Стаж работы
     * @return Сообщение с результатом
     */
    public String addNewStaffer(String name, String s_phoneNumber, String s_experience) {
        int phoneNumber;
        int experience;
        try {
            phoneNumber = Integer.parseInt(s_phoneNumber);
            experience = Integer.parseInt(s_experience);
        } catch (NumberFormatException e) {
            return "Проверьте корректность указанных в анкете номера телефона и стажа работы.";
        }
        if (stafferList.addStafferToList(new Staffer(phoneNumber, name, experience))) {
            return "\nНовый сотрудник успешно добавлен в справочник.";
        } else
            return "\nТакой сотрудник уже существует в справочнике";
    }

    /**
     * Метод поиска сотрудника по стажу работы
     * @param s_experience стаж работы
     * @return Результат поиска
     */
    public String findStafferByExperience(String s_experience) {
        int experience;
        try {
            experience = Integer.parseInt(s_experience);
        } catch (NumberFormatException e) {
            return "Указанный стаж работы нечитаем.";
        }
        List<Staffer> resultList = stafferList.getStafferList().stream()
                .filter(staffer -> staffer.getExperience() == experience).toList();
        if (resultList.isEmpty()) {
            return String.format("\nСотрудники со стажем работы %s лет не найдены.", s_experience);
        } else {
            return String.format("\nСписок сотрудников со стажем работы %s лет:\n", s_experience)
                    + resultList;
        }
    }

    /**
     * Метод поиска телефона сотрудника по имени сотрудника
     * @param name Имя сотрудника
     * @return Результат поиска
     */
    public String findPhoneByName(String name) {
        List<Integer> resultList = stafferList.getStafferList().stream()
                .filter(staffer -> staffer.getName().equals(name))
                .map(Staffer::getPhoneNumber).toList();
        if (resultList.isEmpty()) {
            return String.format("\nСотрудники с именем %s не найдены.", name);
        } else {
            return String.format("\nТелефоны сотрудников с именем %s:\n", name)
                    + resultList;
        }
    }

    /**
     * Метод поиска сотрудника по табельному номеру
     * @param s_id Табельный номер
     * @return Результат поиска
     */
    public String findStafferByNumber(String s_id) {
        int id;
        try {
            id = Integer.parseInt(s_id);
        } catch (NumberFormatException e) {
            return "Табельный номер нечитаем.";
        }
        List<Staffer> resultList = stafferList.getStafferList().stream()
                .filter(staffer -> staffer.getId() == id).toList();
        if (resultList.isEmpty()) {
            return String.format("\nСотрудник с табельным номером %s не найден.", s_id);
        } else {
            return String.format("\nСотрудник с табельным номером %s:\n", s_id)
                    + resultList;
        }
    }
}
