package Model;

import java.util.ArrayList;
import java.util.List;

public class PlayerDB {

    protected List<Player> playerDB;
    public PlayerDB() {
        this.playerDB = new ArrayList<>();
    }
    public void addPlayer(Player player) {
        playerDB.add(player);
    }
    public void printDB() {
        System.out.println(playerDB);
    }

    public List<Player> getPlayerDB() {
        return playerDB;
    }
}
