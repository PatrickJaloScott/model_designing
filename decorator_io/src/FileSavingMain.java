public class FileSavingMain {
    public static void main(String[] args) {
        SimpleFileHandler fileHandler = new SimpleFileHandler();
        String fileName = "output.txt";
        fileHandler.writeFile(fileName, null);
        fileHandler.readFile(fileName);
        fileHandler.displayFile();

        FilePasswordEncryptor encryptor = new FilePasswordEncryptor(fileHandler);
        String secretFileName = "hidden file.encrypted";
        encryptor.writeFile(secretFileName, new String[]{""});
        encryptor.readFile(secretFileName);
    }
}