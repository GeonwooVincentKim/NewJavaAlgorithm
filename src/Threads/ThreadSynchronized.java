package Threads;

import static java.lang.System.out;

import Threads.Player.Player;
import Threads.SmartPhone.SmartPhoneGame2;

public class ThreadSynchronized {
    public static void main(String[] args) {
        SmartPhoneGame2 game = new SmartPhoneGame2();
        out.println(game);

        Player p1 = new Player() {
            private SmartPhoneGame2 game;
            private Thread thread;

            // public void setSmartPhoneGame1(SmartPhoneGame2 game) {
            // this.setName("Player");
            // this.game = game;
            // }

            // @Override
            // public void run() {
            // game.increaseLevel();
            // }

            @Override
            public void setSmartPhoneGame2(SmartPhoneGame2 game) {
                this.setName("Player");
                this.game = game;
            }

            public void run() {
                thread.run();
                game.increaseLevel();
            }
        };

        out.println(p1);
        p1.setSmartPhoneGame2(game);
        // p1.setSmartPhoneGame(game);
    }
}