package Class.Interface;

import static java.lang.System.out;

public class BaseBallPlayer implements Player {
    @Override
    public void play() {
        out.println("야구선수가 야구를 합니다.");
    }
}
