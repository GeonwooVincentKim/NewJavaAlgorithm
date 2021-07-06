package Thread;

import static java.lang.System.out;

public class ThreadExample {
    public static void main(String[] args) {
        SmartPhoneGame game = new SmartPhoneGame();
        out.println(game);

        Player1 p1 = new Player1();
        out.println(p1);

        p1.setSmartPhoneGame(game);
        p1.start();

        Player2 p2 = new Player2();
        out.println(p2);

        p2.setSmartPhoneGame(game);
        p2.start();
    }
}

class SmartPhoneGame {
    private int level;

    public int getLevel() {
        return this.level;
    }

    // public void setLevel(int level) {
    // this.level = level;
    // }

    public void increaseLevel() {
        while (true) {
            this.level++;

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {

            } catch (Exception e) {
                out.println(e.getMessage());
                out.println("-------------------------");
                e.printStackTrace();
            }

            out.println(Thread.currentThread().getName() + " Level : " + this.level);

            if (this.level % 10 == 0)
                break;
        }
    }
}

class Player1 extends Thread {
    private SmartPhoneGame game;

    public SmartPhoneGame getGame() {
        return game;
    }

    public void setGame(SmartPhoneGame game) {
        this.game = game;
    }

    public void setSmartPhoneGame(SmartPhoneGame game) {
        this.setName("Player1");
        this.setGame(game);
    }

    @Override
    public void run() {
        game.increaseLevel();
    }
}

class Player2 extends Thread {
    private SmartPhoneGame game;

    public SmartPhoneGame getGame() {
        return game;
    }

    public void setGame(SmartPhoneGame game) {
        this.game = game;
    }

    public void setSmartPhoneGame(SmartPhoneGame game) {
        this.setName("Player2");
        this.setGame(game);
    }

    @Override
    public void run() {
        game.increaseLevel();
    }
}