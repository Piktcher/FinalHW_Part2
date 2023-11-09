package Controller;

import Model.PlayerDB;

public interface WinnerCalculator {
    default void calculateWinner(PlayerDB database) {}
}
