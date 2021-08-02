package Stream.StreamVariousType;

import static java.lang.System.out;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

import Stream.StreamVariousType.FileAttribute.FileAttributes;
import Stream.StreamVariousType.StreamAttribute.StreamController;

public class StreamCalculator {
    public static Scanner readFile(FileAttributes fileAttribute, String fileName) {
        return fileAttribute.readFile(fileName);
    }

    public static void writeFile(FileAttributes fileAttribute, String fileName, String result) {
        fileAttribute.writeFile(fileName, result);
    }

    // randomRange 에서 getData 의 사용자 입력 값인 getValue 의 값을 가지고 와서 범위를 n1 ~ n2 로 설정한다.
    public static int randomRange(int n1, int n2) {
        return (int) (Math.random() * (n2 - n1 + 1)) + n1;
    }

    /* 중복을 포함한 배열을 가지고 있는 getRandomArray */
    // 1. randomRange 의 범위 값, getData 의 getValue 값들을 각각 넘겨 받고, getValue 의 값만큼
    // randomArray 의 길이를 지정받은 후, randomRange 의 범위만큼 getRandomArray 함수의
    // getRandomArray 배열 안에 값을 순차적으로 지정해준다.
    public static int[] getRandomArray(int[] randomArray) {
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = randomRange(11, 99);
            out.print(randomArray[i] + " | ");
        }

        return randomArray;
    }

    // countArray 의 length 만큼 값을 비교하면서,
    // 만약 countArray 의 현재 index 의 수와 같은 숫자가 다른 index 에도 있다면
    // isContainsValue 를 true 를 return 하여 반복되는 숫자가 있다고 출력한다.
    public static boolean isContains(int[] countArray, int temp) {
        boolean isContainsValue = false;

        for (int i = 0; i < countArray.length; i++) {
            if (countArray[i] == temp) {
                isContainsValue = true;
                return isContainsValue;
            }
        }

        return isContainsValue;
    }

    // 3. 배열 내 빈도수를 세는 getCountArray 가 randomArray 배열을 넘겨 받아 getCountArray 에 저장한다.
    public static int[] getCountArray(int[] temp) {
        int[] countArray = new int[temp.length];
        out.println(countArray);

        for (int i = 0; i < temp.length; i++) {
            if (!isContains(countArray, temp[i])) {
                countArray[i] = Integer.valueOf(temp[i]);
                out.print(countArray[i] + " ");
            }
        }

        return countArray;
    }

    // 2. getRandomArray 의 randomArray 배열을 넘겨받아서 loopResult 에 저장하여 랜덤 값을 출력한다.
    public static String printRandomArray(int[] randomArray) {
        String loopResult = "";

        for (int i = 0; i < randomArray.length; i++) {
            loopResult += randomArray[i] + " ";
        }

        return loopResult;
    }

    // 4. countArray 배열을 넘겨받은 후, countArray 배열의 빈도수를 찾음과 동시에 특정 숫자의 빈도 수와
    // 전체 배열을 각각의 기준에 따라 정렬한다.
    public static int[] getSortCountArray(int[] randomArray, int[] countArray) {
        int[] getSortCountArray = new int[countArray.length];
        // int[] getSortCountArray = getCountArray(countArray);
        int currentValue = 0; // 현재 값
        int currentCount = 0; // 현재 값의 빈도 수
        int nextValue = 0; // 다음 값
        int nextCount = 0; // 다음 값의 빈도 수
        // int getSwapRandomArrayValue = 0; // Swapping 을 한 RandomArray 의 값들을 하나씩 가져온다.
        // int getSwapCountArrayValue = 0; // Swapping 을 한 CountArray 의 값들을 하나씩 가져온다.

        out.println();

        for (int i = 0; i < countArray.length; i++) {
            for (int j = i + 1; j < countArray.length; j++) {
                currentValue = countArray[i];
                nextValue = countArray[j];

                currentCount = arrayFrequency(randomArray, currentValue);
                nextCount = arrayFrequency(randomArray, nextValue);

                if (currentCount < nextCount) {
                    swapArray(randomArray, i, j);
                    swapArray(countArray, i, j);
                    // getSortCountArray = countArray; // 얕은 복사
                    getSortCountArray[i] = countArray[i]; // 깊은 복사
                } else if (currentCount == nextCount && currentValue < nextValue) {
                    swapArray(randomArray, i, j);
                    swapArray(countArray, i, j);
                    // getSortCountArray = countArray; // 얕은 복사
                    getSortCountArray[i] = countArray[i]; // 깊은 복사
                }
            }
        }

        return getSortCountArray;
    }

    // 5. getRandomArray 에서의 특정 숫자의 빈도수와 getCountArray 에서의 특정 숫자의 빈도수를 확인하여
    // 각각 수가 출현할 때마다 count 의 수를 1씩 늘려준다.
    public static int arrayFrequency(int[] randomArray, int number) {
        int count = 0;

        for (int i = 0; i < randomArray.length; i++) {
            if (randomArray[i] == number) {
                count++;
            }
        }

        return count;
    }

    // 6. countArray 의 빈도수, 그리고 숫자의 크기의 값들을 가져와 내림차순으로 정렬한다.
    // public static void swapArray(int[] arr, int i, int j) {
    public static int swapArray(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        return temp;
    }

    // 6. countArray 의 빈도수, 그리고 숫자의 크기의 값들을 가져와 내림차순으로 정렬한다.
    public static void bubbleArraySort(int[] getArray, int currentValue, int nextValue) {
        int tempValue = getArray[currentValue];
        getArray[currentValue] = getArray[nextValue];
        getArray[nextValue] = tempValue;
    }

    // 7. sortCountArray 의 Array 값들을 불러온다.
    public static String getResult(int[] randomArray) {
        int printT = 5;
        String result;
        int[] countArray = getCountArray(randomArray);
        int[] sortCountArray = getSortCountArray(randomArray, countArray);

        // printArray 의 값을 가져와 모든 값들을 출력 및 파일로 만들 result String 변수에 저장한다.
        // result = printArray(randomArray, countArray, printT) + " ";
        // result = printArray(printT, sortCountArray) + " ";
        // result = printArray(printT, sortCountArray, countArray) + " ";
        result = printArray(printT, sortCountArray, randomArray, countArray) + " ";
        return result;
    }

    // 8. 전체 배열들을 출력한디.
    public static String printArray(int printValue, int[] sortCountArray, int[] randomArray, int[] countArray) {
        String printResult = "";

        // 랜덤 배열 최빈도 수 내림차순 출력
        for (int i = 0; i < printValue; i++) {
            printResult += "#" + (i + 1) + " " + sortCountArray[i] + " (" + arrayFrequency(randomArray, countArray[i])
                    + ")" + "\n";
        }

        return printResult;
    }

    public static String getData(int fileLineLength) {
        String result = " " + fileLineLength;
        return result;
    }

    public static void getResult(FileAttributes fileAttributes, int getFileLines, String outputFileName) {
        String result = getData(getFileLines);
        writeFile(fileAttributes, outputFileName, result);
    }

    public static void main(String[] args) {
        StreamController<?> streamController = new StreamController<>();
        out.println(streamController);

        File file = null;
        Scanner fileReader = null;
        FileWriter fileWriter = null;

        String inputFileName = "input.txt";
        String outputFileName = "output.txt";

        FileAttributes fileAttributes = new FileAttributes(file, fileReader, fileWriter);
        out.println(fileAttributes);
        Scanner sc = new Scanner(System.in);
        out.print("원하시는 메뉴의 숫자를 입력해주세요 : ");

        int userMenuInput = sc.nextInt();
        if (userMenuInput == 1) {
            fileReader = readFile(fileAttributes, inputFileName);
            int getFileLines = Integer.parseInt(fileReader.nextLine());
            getResult(fileAttributes, getFileLines, outputFileName);
        } else if (userMenuInput == 2) {
            fileReader = new Scanner(System.in);
            out.print("원하시는 숫자의 길이를 입력해주세요 : ");
            int getFileLines = fileReader.nextInt();
            getResult(fileAttributes, getFileLines, outputFileName);
        } else {
            System.exit(0);
        }

        sc.close();
    }

}
