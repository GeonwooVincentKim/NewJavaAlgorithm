package Threads;

import static java.lang.System.out;

import Threads.Player.PlayerDetail.PlayerNo1;
import Threads.Player.PlayerDetail.PlayerNo2;
import Threads.SmartPhone.SmartPhoneGame2;

public class ThreadSynchronized {
    public static void main(String[] args) {
        SmartPhoneGame2 game = new SmartPhoneGame2();
        out.println(game);

        PlayerNo1 p1 = new PlayerNo1();
        out.println(p1);

        p1.setSmartPhoneGame2(game);
        p1.start();

        PlayerNo2 p2 = new PlayerNo2();
        out.println(p2);

        p2.setSmartPhoneGame2(game);
        p2.start();
    }
}