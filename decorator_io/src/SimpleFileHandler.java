import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class SimpleFileHandler implements FileHandler {
    String fileFolder = "saved files/";
    private StringBuilder stb = new StringBuilder();
    @Override
    public void writeFile(String fileName, String[] options) {
        String str = "File Handling in Java " +
                "done with: " +
                "FileWriter and FileReader";

        if(options != null && options.length > 0) {
            str = options[0] + "\n" + str;
        }

        try {
            FileWriter fw = new FileWriter(fileName);
            fw.write(str);
            fw.close();
        } catch (IOException e) {
            System.err.println("File writer error");
        }
    }

    @Override
    public void readFile(String fileName) {
        int ch;
        try (FileReader fr = new FileReader(fileFolder + fileName)) {
            System.out.println("Opening file: " + fileName + "...");
            stb = new StringBuilder();
            while ((ch = fr.read())!=-1) {
                stb.append((char)ch);
            }
            System.out.println();
        } catch (FileNotFoundException fnf) {
            System.err.println("File not found!");
        } catch (IOException ioe) {
            System.err.println("IO error");
        }
    }

    @Override
    public void displayFile() {
        System.out.println(stb.toString());
    }

    public StringBuilder getStb() {
        return stb;
    }
}
