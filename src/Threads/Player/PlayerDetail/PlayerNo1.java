package Threads.Player.PlayerDetail;

import Threads.SmartPhone.SmartPhoneGame2;

public class PlayerNo1 extends Thread {
    private SmartPhoneGame2 game;

    public SmartPhoneGame2 getGame() {
        return game;
    }

    public void setGame(SmartPhoneGame2 game) {
        this.game = game;
    }

    public void setSmartPhoneGame2(SmartPhoneGame2 game) {
        this.setName("PlayerNo1");
        this.setGame(game);
    }

    @Override
    public void run() {
        game.increaseLevel();
    }
}
