package module11;

public class Main {
    public static void main(String[] args) {
        System.out.println(GooglePage.class.getProtectionDomain().
                getCodeSource().getLocation().getPath());
    }
}
