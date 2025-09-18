public class Player {

    private int id;
    private String name;
    private Integer strength;

    public Player(int id, String name, Integer strength) {
        this.id = id;
        this.name = name;
        this.strength = strength;

    }

    public String getName() {
        return name;
    }

    public Integer getStrength() {
        return strength;
    }
}
