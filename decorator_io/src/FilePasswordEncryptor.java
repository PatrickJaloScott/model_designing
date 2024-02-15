import java.util.Scanner;

public class FilePasswordEncryptor extends FileEncryptor {
    private Scanner input = new Scanner(System.in);
    public FilePasswordEncryptor(FileHandler handlerToEncrypt) {
        super(handlerToEncrypt);
    }

    @Override
    public void writeFile(String fileName, String[] options) {
        options[0] = getPassword();
        super.writeFile(fileName, options);
    }

    @Override
    public void displayFile() {
        handlerToEncrypt.displayFile();
    }

    @Override
    public StringBuilder getStb() {
        return handlerToEncrypt.getStb();
    }

    @Override
    public void readFile(String fileName) {
        String passwordAttempt = getPassword();
        super.readFile(fileName);
        String truePassword = getStb().toString().split("\\R")[0];
        if(passwordAttempt.equals(truePassword)) {
            displayFile();
        } else {
            System.out.println("Incorrect password!");
        }
    }

    public String getPassword() {
        System.out.print("Enter password: ");
        return input.next();
    }
}