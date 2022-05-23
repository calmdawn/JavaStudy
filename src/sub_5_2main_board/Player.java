package sub_5_2main_board;

public class Player {
    public static final int BEGINNER_LEVEL = 1;
    public static final int ADVANCED_LEVEL = 2;
    public static final int SUPER_LEVEL = 3;
    PlayerLevel currentLevel;

    public Player() {
        currentLevel = new BeginnerLevel();
    }

    public void play(int time) {
        currentLevel.showLevelMessage();
        currentLevel.run();
        for (int i = 0; i < time; i++) {
            currentLevel.jump();
        }
        currentLevel.turn();
    }

    public void upgradeLevel(PlayerLevel level) {
        if (level instanceof AdvancedLevel) {
            currentLevel = (AdvancedLevel)level;
        } else if (level instanceof SuperLevel) {
            currentLevel = (SuperLevel)level;
        }
    }
}
