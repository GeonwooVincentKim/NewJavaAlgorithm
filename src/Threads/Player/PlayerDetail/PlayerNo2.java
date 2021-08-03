package Threads.Player.PlayerDetail;

import Threads.SmartPhone.SmartPhoneGame2;

public class PlayerNo2 extends Thread {
    private SmartPhoneGame2 game;

    public void setSmartPhoneGame2(SmartPhoneGame2 game) {
        this.setName("Player2");
        this.game = game;
    }

    @Override
    public void run() {
        game.increaseLevel();
    }
}
