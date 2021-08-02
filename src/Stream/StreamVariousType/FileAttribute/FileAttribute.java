package Stream.StreamVariousType.FileAttribute;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import static java.lang.System.out;

public class FileAttribute implements Files {
    private File file;
    private Scanner fileReader;
    private FileWriter fileWriter;

    private String fileName;
    private String result;

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public Scanner getFileReader() {
        return fileReader;
    }

    public void setFileReader(Scanner fileReader) {
        this.fileReader = fileReader;
    }

    public FileWriter getFileWriter() {
        return fileWriter;
    }

    public void setFileWriter(FileWriter fileWriter) {
        this.fileWriter = fileWriter;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    // Read File
    @Override
    public Scanner readFile(String fileName) {
        file = new File(fileName);

        try {
            fileReader = new Scanner(file);
        } catch (FileNotFoundException e) {
            // If the file that the compiler looking for was not found,
            // Then goes to this section
            out.println();
            out.println("----------------------");
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public void writeFile(String fileName, String result) {
        try {
            fileWriter = new FileWriter(fileName);
            fileWriter.write(result);
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            // If the file has no Input and Output,
            // Then goes to this section
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
