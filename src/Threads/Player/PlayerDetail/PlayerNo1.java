package Threads.Player.PlayerDetail;

import Threads.SmartPhone.SmartPhoneGame2;

public class PlayerNo1 extends Thread {
    private SmartPhoneGame2 game;

    public void setSmartPhoneGame1(SmartPhoneGame2 game) {
        this.setName("Player1");
        this.game = game;
    }

    @Override
    public void run() {
        game.increaseLevel();
    }
}
