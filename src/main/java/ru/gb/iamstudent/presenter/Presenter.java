package ru.gb.iamstudent.presenter;

import ru.gb.iamstudent.model.staff_department.HROfficerEmulator;
import ru.gb.iamstudent.view.View;

public class Presenter {
    private final View view;
    private final HROfficerEmulator hrOfficerEmulator;

    public Presenter(View view) {
        this.view = view;
        this.hrOfficerEmulator = new HROfficerEmulator();
    }


    public void getCurrentStafferList() {
        String info = hrOfficerEmulator.getCurrentStafferList();
        view.printAnswer(info);
    }

    public void addNewStaffer(String name, String phone, String experience) {
        String info = hrOfficerEmulator.addNewStaffer(name, phone, experience);
        view.printAnswer(info);
    }

    public void findStafferByExperience(String experience) {
        String info = hrOfficerEmulator.findStafferByExperience(experience);
        view.printAnswer(info);
    }

    public void findPhoneByName(String name) {
        String info = hrOfficerEmulator.findPhoneByName(name);
        view.printAnswer(info);
    }

    public void findStafferByNumber(String number) {
        String info = hrOfficerEmulator.findStafferByNumber(number);
        view.printAnswer(info);
    }
}
