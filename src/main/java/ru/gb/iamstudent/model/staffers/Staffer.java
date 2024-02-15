package ru.gb.iamstudent.model.staffers;

import lombok.Data;

@Data
public class Staffer {

    private int id;
    private int phoneNumber;
    private String name;
    private int experience;

    public Staffer(int phoneNumber, String name, int experience) {
        id = -1;
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.experience = experience;
    }

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
