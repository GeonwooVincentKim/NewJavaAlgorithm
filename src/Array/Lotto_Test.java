package Array;

import static java.lang.System.out;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Lotto_Test {
    public static void main(String[] args) {
        // out.println();
        Scanner sc = new Scanner(System.in);

        out.print("랜덤 수를 출력할 데이터의 개수를 입력하세요 : ");

        int setDataLength = 0;

        try {
            setDataLength = sc.nextInt();
        } catch (InputMismatchException e) {
            // e.printStackTrace();
            out.println("입력을 잘못하셨습니다 : ");
        } catch (Exception e) {
            e.printStackTrace();
        }

        int[] randomArray = new int[setDataLength];

        for (int i = 0; i < setDataLength; i++) {
            randomArray[i] = (int) (Math.random() * 45) + 1;
            out.print(randomArray[i] + " ");
        }

        out.println();

        for (int i = 0; i < randomArray.length; i++) {

        }

        sc.close();
    }
}
