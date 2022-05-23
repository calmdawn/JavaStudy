package sub_4_3main_board;

public class Player {
    public static final int BEGINNER_LEVEL = 1;
    public static final int ADVANCED_LEVEL = 2;
    public static final int SUPER_LEVEL = 3;
    Level currentLevel;
    public Player() {
        currentLevel = new BeginnerLevel();
    }

    public void play(int time) {
        currentLevel.run();
        for(int i =0; i<time; i++) {
            currentLevel.jump();
        }
        currentLevel.turn();
    }
    public void upgradeLevel(int level) {
        if(level == ADVANCED_LEVEL){
            currentLevel = new AdvancedLevel();
        }else if(level == SUPER_LEVEL){
            currentLevel = new SuperLevel();
        }
    }
}
