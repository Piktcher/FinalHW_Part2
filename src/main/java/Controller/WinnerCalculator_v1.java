package Controller;

import Model.PlayerDB;

import java.util.ArrayList;
import java.util.List;

public class WinnerCalculator_v1 implements WinnerCalculator{
    @Override
    public void calculateWinner(PlayerDB database) {
        List<Double> contestantsPoints = new ArrayList<>(database.getPlayerDB().size());
        for (int i = 0; i < database.getPlayerDB().size(); i++) {
            double namePoints = ((double) database.getPlayerDB().get(i).getName().length() * 0.2);
            double surnamePoints = ((double) database.getPlayerDB().get(i).getSurname().length() * 0.2);
            double patronymicPoints = ((double) database.getPlayerDB().get(i).getPatronymics().length() * 0.2);
            double agePoints = ((double) database.getPlayerDB().get(i).getAge() * 0.4);
            contestantsPoints.add((namePoints + surnamePoints + patronymicPoints + agePoints));
        }
        int maxValueIndex = 0;
        double maxValue = 0;
        for (int i = 1; i < contestantsPoints.size(); i++) {
            if (contestantsPoints.get(i) > maxValue) {
                maxValueIndex = i;
            }
        }
        System.out.println("Победителем розыгрыша стал " + database.getPlayerDB().get(maxValueIndex) + "!\n" + "Поздравляем!");
    }
}
