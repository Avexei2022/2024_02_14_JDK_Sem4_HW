package ru.gb.iamstudent.view;


import ru.gb.iamstudent.presenter.Presenter;

public class ConsoleUI implements View{

    private final Presenter presenter;

    public ConsoleUI() {
        presenter = new Presenter(this);
    }

    @Override
    public void printAnswer(String text) {
        System.out.println(text);
    }

    public void run () {
        getCurrentStafferList();
        addNewStaffer();
        getCurrentStafferList();
        findStafferByExperience();
        findPhoneByName();
        findStafferByNumber();
    }

    private void getCurrentStafferList() {
        presenter.getCurrentStafferList();
    }

    private void addNewStaffer() {
        presenter.addNewStaffer("Olga Olgova","1234567", "9");
    }

    private void findStafferByExperience() {
        presenter.findStafferByExperience("14");
    }

    private void findPhoneByName() {
        presenter.findPhoneByName("Olga Olgova");
    }

    private void findStafferByNumber() {
        presenter.findStafferByNumber("2");
    }
}
