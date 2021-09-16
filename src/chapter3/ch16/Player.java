package chapter3.ch16;

public class Player {

    private PlayerLevel level;

    public Player() {
        this.level = new BeginnerLevel();
        level.showLevelMessage();
    }

    public PlayerLevel getLevel() {
        return level;
    }

    public void upgradeLevel(PlayerLevel playerLevel) {
        this.level = playerLevel;
        playerLevel.showLevelMessage();
    }

    public void play(int count) {
        this.level.go(count);
    }
}
