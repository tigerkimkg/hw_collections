import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GameTest {

    @Test
    public void whenFirstPlayerWin() {
        Player player1 = new Player(1, "Tor444", 500);
        Player player2 = new Player(2, "Ironman111", 400);

        Game game = new Game();

        game.register(player1);
        game.register(player2);

        int expected = 1;
        int actual = game.round(player1.getName(), player2.getName());

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void whenSecondPlayerWin() {
        Player player1 = new Player(1, "Tor444", 500);
        Player player2 = new Player(2, "Ironman111", 600);

        Game game = new Game();

        game.register(player1);
        game.register(player2);

        int expected = 2;
        int actual = game.round(player1.getName(), player2.getName());

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void whenNoOneWin() {
        Player player1 = new Player(1, "Tor444", 500);
        Player player2 = new Player(2, "Ironman111", 500);

        Game game = new Game();

        game.register(player1);
        game.register(player2);

        int expected = 0;
        int actual = game.round(player1.getName(), player2.getName());

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void whenFirstPlayerNotRegistered() {
//        Player player1 = new Player(1, "Tor444", 500);
        Player player2 = new Player(2, "Ironman111", 500);

        Game game = new Game();

//        game.register(player1);
        game.register(player2);

        Assertions.assertThrows(NotRegisteredException.class, () -> game.round("Tor444", player2.getName()));
    }

    @Test
    public void whenSecondPlayerNotRegistered() {
        Player player1 = new Player(1, "Tor444", 500);
//        Player player2 = new Player(2, "Ironman111", 500);

        Game game = new Game();

        game.register(player1);
//        game.register(player2);

        Assertions.assertThrows(NotRegisteredException.class, () -> game.round(player1.getName(), "Ironman111"));
    }
}
