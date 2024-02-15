package ru.gb.iamstudent.model.staffers;

import lombok.Data;


/**
 * Класс сотрудника
 */
@Data
public class Staffer {

    private int id;
    private int phoneNumber;
    private String name;
    private int experience;

    /**
     * Конструктор сотрудника
     * @param phoneNumber Номер телефона
     * @param name Имя сотрудника
     * @param experience Стаж работы
     * Табельный номер сотрудника устанавливается при добавлении сотрудника в справочник
     */
    public Staffer(int phoneNumber, String name, int experience) {
        id = -1;
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.experience = experience;
    }

    /**
     * Переопределение метода
     * @return Строковая информация о сотруднике
     */
    @Override
    public String toString() {
        return "Сотрудник: " +
                "Табельный номер: " + id +
                ", Номер телефона: " + phoneNumber +
                ", Имя: '" + name + '\'' +
                ", Стаж: " + experience +
                "\n";
    }
}
