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
