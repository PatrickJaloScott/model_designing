public interface FileHandler {
    void readFile(String fileName);
    void writeFile(String fileName, String[] options);
    void displayFile();
    StringBuilder getStb();
}
