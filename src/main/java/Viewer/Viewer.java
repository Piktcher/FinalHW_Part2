package Viewer;

import Controller.Controller;
import Model.Goods;

import java.util.Scanner;

import static java.lang.System.exit;

public class Viewer {
    public Viewer() {}

    Controller controller = new Controller();
    Scanner in = new Scanner(System.in);
    public void start() {
        System.out.println("Добро пожаловать на розыгрыш товаров магазина игрушек!");
        System.out.println("Розыгрыш проводится отдельно для каждого товара. Товары добавляют сотрудники магазина.\n");
        boolean firstContest = true;
        while (true) {
            Goods prize = controller.addPrize();
            System.out.println("В этом раунде разыгрывается " + prize + "\n");
            System.out.println("Теперь необходимо добавить участников розыгрыша!\n");
            if (firstContest) {
                controller.createContestantsGroup();
                firstContest = false;
            } else {
                System.out.println("Участники будут те же или разыгрываем с новой группой? Напишите 1, если те же, 2, если новая группа");
                String groupchoice = in.next();
                if (groupchoice.equals("1")) {
                    System.out.println("\nСписок участников текущего розыгрыша:");
                    controller.printContestants();
                } else {
                    controller.createContestantsGroup();
                }
            }

            System.out.println("Начинаем розыгрыш...\n" + "Рассчитываем победителя...\n");
            controller.calculateWinner(controller.returnDB());

            System.out.println("Проводим еще один розыгрыш? Напишите 'да' или 'нет'");
            String action = in.next();
            if (action.equals("да")) {
                continue;
            } else {exit(0);}
        }
    }
}
