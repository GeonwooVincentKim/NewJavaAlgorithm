package Threads.SmartPhone;

import static java.lang.System.out;

public class SmartPhoneGame2 {
    private int level;

    public int getLevel() {
        return this.level;
    }

    public void increaseLevel() {
        while (true) {
            this.level++;

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                out.println("프로그램이 중단됩니다.");
                out.println("=====================");
                e.printStackTrace();
            } catch (Exception e) {
                out.println(e.getMessage());
                out.println("----------------");
                e.printStackTrace();
            }
            out.println(Thread.currentThread().getName() + " Level : " + this.level);

            if (this.level % 10 == 0)
                break;
        }
    }
}