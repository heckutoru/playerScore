package es.ulpgc.bowling;

public class Player {

    private final PlayerScore playerS;

    private final String name;
    public Player(String name) {
        this.name = name;
        playerS = new PlayerScore(name);
    }

    public String getPlayerName() {
        return name;
    }

}
