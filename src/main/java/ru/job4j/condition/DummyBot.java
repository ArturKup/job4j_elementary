package ru.job4j.condition;

public class DummyBot {
    public static String answer(String question) {
        String rsl = "Это ставит меня в тупик. Задайте другой вопрос.";
        if ("Привет, Бот.".equals(question)) {
            System.out.println("Привет, умник.");
            rsl = question;
        } else if ("Пока.".equals(question)) {
            System.out.println("До скорой встречи.");
            rsl = question;
        }
        return rsl;
    }

    public static void main(String[] args) {
        String rsl = answer("Привет, Бот.");
        System.out.println(rsl);
        rsl = answer("Пока.");
        System.out.println(rsl);
    }
}
