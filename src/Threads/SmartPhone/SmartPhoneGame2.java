package Threads.SmartPhone;

import static java.lang.System.out;

public class SmartPhoneGame2 {
    private int level;

    public SmartPhoneGame2() {
    }

    public SmartPhoneGame2(int level) {
        this.setLevel(level);
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void increaseLevel() {
        while (true) {
            this.level++;

            try {
                Thread.sleep(3000);
            } catch (Exception e) {
                out.println(Thread.currentThread().getName() + " Level : " + this.level);

                if (this.level % 10 == 0)
                    break;
            }
        }
    }
}