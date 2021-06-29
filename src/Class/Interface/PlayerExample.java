package Class.Interface;

import static java.lang.System.out;

public class PlayerExample {
    public static void main(String[] args) {
        Player p1 = new BaseBallPlayer();
        Player p2 = new FootBallPlayer();

        Player p11 = new Player() {
            @Override
            public void play() {
                out.println("야구선수가 야구를 합니다.");
            }
        };

        Player p22 = new Player() {
            @Override
            public void play() {
                out.println("축구선수가 축구를 합니다.");
            }
        };

        out.println("-----------------------------------");
        out.println("직접 구현된 클래스 가져오기");
        out.println();

        playGame(p1);
        playGame(p2);

        out.println("-----------------------------------");
        out.println("익명 객체를 사용하여 가져오기");
        out.println();

        playGame(p11);
        playGame(p22);
    }

    public static void playGame(Player p) {
        p.play();
    }
}
