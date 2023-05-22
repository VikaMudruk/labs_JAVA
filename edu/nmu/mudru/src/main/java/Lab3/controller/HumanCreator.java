package main.java.Lab3.controller;

import main.java.Lab3.model.Human;
import main.java.Lab3.model.Sex;

import java.util.List;
import java.util.Random;

public class HumanCreator {

    private final List<String> POSSIBLE_FIRST_NAMES = List.of("William", "Denis", "Karina", "Nazar", "Oleg",
            "Anton", "Danil", "Vlad", "Max", "Samuel", "Daria", "Anastasiya", "Marina");
    private final List<String> POSSIBLE_LAST_NAMES = List.of("Petrov", "Kopeykin", "Jackson", "Evans", "Smith", "Sirko",
            "Sosura", "Shevchenko", "Adams");
        private final List<String> POSSIBLE_PATRONYMICS = List.of("Yuryevich", "Victorovich", "Aleksandrovich",
                "Vladimirovich", "Mycolaevich", "Anatolyevich");

    public Human createRandomHuman(){
        Random random = new Random();
        return new Human(POSSIBLE_FIRST_NAMES.get(random.nextInt(POSSIBLE_FIRST_NAMES.size())),
                POSSIBLE_LAST_NAMES.get(random.nextInt(POSSIBLE_LAST_NAMES.size())),
                POSSIBLE_PATRONYMICS.get(random.nextInt(POSSIBLE_PATRONYMICS.size())),
                Sex.values()[random.nextInt(Sex.values().length)]);
    }

}
