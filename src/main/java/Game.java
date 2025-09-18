import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Game {

    HashMap<String, Integer> players = new HashMap<>();

    public void register(Player player) {
        players.put(player.getName(), player.getStrength());
    }

    public int round(String playerName1, String playerName2) {
        Boolean playerRegistered1 = findByName(playerName1);
        Boolean playerRegistered2 = findByName(playerName2);

        if (!playerRegistered1) {
            throw new NotRegisteredException(playerName1);
        }

        if (!playerRegistered2) {
            throw new NotRegisteredException(playerName2);
        }

        if (players.get(playerName1) > players.get(playerName2)) {
            return 1;
        } else if (players.get(playerName1) < players.get(playerName2)) {
            return 2;
        } else {
            return 0;
        }
    }

    private Boolean findByName(String playerName) {
        for (String key : players.keySet()) {
            if (key.equals(playerName)) {
                return true;
            }
        }
        return false;
    }
}
