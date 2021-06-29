package Class.Interface;

import static java.lang.System.out;

public class PlayerExample {
    public static void main(String[] args) {
        // Player p1 = new BaseBallPlayer();
        // Player p2 = new FootBallPlayer();

        Player p1 = new Player() {
            @Override
            public void play() {
                out.println("야구선수가 야구를 합니다.");
            }
        };

        Player p2 = new Player() {
            @Override
            public void play() {
                out.println("축구선수가 축구를 합니다.");
            }
        };

        playGame(p1);
        playGame(p2);
    }

    public static void playGame(Player p) {
        p.play();
    }
}
