package sub_5_2main_board;

public abstract class PlayerLevel {

    public abstract void jump();

    public abstract void run();

    public abstract void turn();

    public abstract void showLevelMessage();

    public final void go(int time) {
        showLevelMessage();
        run();
        for (int i = 0; i < time; i++) {
            jump();
        }
        turn();
    }
}
