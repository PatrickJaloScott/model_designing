public abstract class FileEncryptor implements FileHandler {
    protected FileHandler handlerToEncrypt;

    public FileEncryptor(FileHandler handlerToEncrypt) {
        this.handlerToEncrypt = handlerToEncrypt;
    }

    @Override
    public void writeFile(String fileName, String[] options) {
        handlerToEncrypt.writeFile(fileName, options);
    }

    @Override
    public void readFile(String fileName) {
        handlerToEncrypt.readFile(fileName);
    }
}
