package Class.Interface;

import static java.lang.System.out;

public class FootBallPlayer implements Player {
    @Override
    public void play() {
        out.println("축구선수가 축구를 합니다.");
    }
}
