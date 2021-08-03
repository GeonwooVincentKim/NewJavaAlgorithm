package Thread;

import static java.lang.System.out;

import Thread.SmartPhone.SmartPhoneGame2;

public class ThreadSynchronized {
    public static void main(String[] args) {
        SmartPhoneGame2 game = new SmartPhoneGame2();
        out.println(game);

        Player1 p1 = new Player1() {
            private SmartPhoneGame2 game;

            public void setSmartPhoneGame(SmartPhoneGame2 game) {
                this.setName("Player");
                this.game = game;
            }

            @Override
            public void run() {
                game.increaseLevel();
            }
        };

        out.println(p1);
    }
}