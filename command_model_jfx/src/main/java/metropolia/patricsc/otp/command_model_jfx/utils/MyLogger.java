package metropolia.patricsc.otp.command_model_jfx.utils;

public class MyLogger {
    public static void logInfo(String msg) {
        System.out.println(msg);
    }
    public static void logWarning(String war) {
        System.out.println("WARNING: " + war);
    }
    public static void logError(String err) {
        System.err.println(err);
    }
}
