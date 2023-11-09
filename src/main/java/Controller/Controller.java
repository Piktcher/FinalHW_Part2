package Controller;

import Model.Goods;
import Model.Player;
import Model.PlayerDB;

import java.util.Scanner;

public class Controller {

    public Controller() {}

    PlayerDB database = new PlayerDB();
    WinnerCalculator calculator = new WinnerCalculator_v1();
    Scanner in = new Scanner(System.in);

    public void printContestants() {
        database.printDB();
    }
    public Goods addPrize() {
        System.out.println("Введите название товара для розыгрыша");
        return new Goods(in.next());
    }
    public PlayerDB returnDB() {
        return database;
    }
    public void calculateWinner(PlayerDB database) {
        calculator.calculateWinner(database);
    }
    public void createContestantsGroup () {
        System.out.println("Сколько будет участников?");
        int counter = Integer.parseInt(in.next());
        for (int i = 0; i < counter; i++) {
            System.out.println("Введите фамилию участника " + (i + 1));
            String surname = in.next();
            System.out.println("Введите имя участника " + (i + 1));
            String name = in.next();
            System.out.println("Введите отчество участника " + (i + 1));
            String patronymic = in.next();
            System.out.println("Введите возраст участника " + (i + 1));
            int age = Integer.parseInt(in.next());
            Player player = new Player(name, surname, patronymic, age);
            database.addPlayer(player);
        }
            System.out.println("\nСписок участников текущего розыгрыша:");
            database.printDB();
    }
}
