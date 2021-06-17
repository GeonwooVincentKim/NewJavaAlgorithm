package Array;

public class LottoTesting {
    public static void main(String[] args) {
        int lottoNum = 6;
        int lottoArray[] = extracted2(lottoNum);
        // 로또 번호를 담을 배열을 생성한다

        int erasedDuplicateArray[] = extracted3(lottoArray);

        for (int i = 0; i < erasedDuplicateArray.length; i++) {
            System.out.println(erasedDuplicateArray[i]);
        }
    }

    private static int[] extracted3(int[] lottoArray) {
        int[] nonDuplicateArray = new int[lottoArray.length];

        for (int i = 0; i < lottoArray.length; i++) { // 배열에 로또 번호를 담기 위해 for문을 사용한다.
            nonDuplicateArray[i] = (int) (Math.random() * 45) + 1; // 배열[i] 번째에 로또번호(난수)를 담는다.
            System.out.println("로또번호 생성" + i); // 처음 중복 for문으로 들어갈 때 i는 ++된 1 이된다.

            for (int j = 0; j < i; j++) { // 위 for문에서 담은 로또 번호가
                                          // 중복되는지 확인하는 for문이다.
                i = extracted(nonDuplicateArray, i, j);
            }
        }

        return nonDuplicateArray;
    }

    private static int[] extracted2(int lottoNum) {
        int[] lottoArray = new int[lottoNum];
        for (int i = 0; i < lottoNum; i++) {
            lottoArray[i] = (int) (Math.random() * 45) + 1;
        }

        return lottoArray;
    }

    private static int extracted(int[] lottoArray, int i, int j) {
        if (lottoArray[j] == lottoArray[i]) { // 초기엔 배열[0]와 배열[1]의 값을 비교한다

            System.out.println(j + "중복발견" + lottoArray[j] + "번호가 중복되어 생성됨");
            System.out.println(i + "중복발견" + lottoArray[i] + "번호가 중복되어 생성됨");
            i--; // 만약 중복되는 값이 있으면 다시 로또 번호를 생성하기 위해
            // break; // i를 --를 해주고 break를 통해 이전 단계로 간다.
        }
        return i;
    }
}