import java.util.Random;

public class PasswordMaker {
    private String name;
    private StringBuilder password;
    private static PasswordMaker instance = null;
    private static int counter = 0;

    // Implementati o versiune de Singleton in care variabila instance este initializata intr-un bloc static:

    static {
        instance = new PasswordMaker("Initialized from the static initializer");
    }


    private PasswordMaker(String name) {
        this.name = name;
    }

    public static PasswordMaker getInstance() {
        counter++;
        if (instance == null) {
            return new PasswordMaker("placeholder");
        } else {
            return instance;
        }
    }

    public static int getCounter() {
        return counter;
    }

    public String getPassword() {
        final int MAGIC_NUMBER;
        final String magicString;

        password = new StringBuilder();
        Random random = new Random();
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

        // probably should hide the password creating logic into a private method but whatever

        // MAGIC NUMBER PART:
        StringBuilder MagicNumberArray = new StringBuilder();
        MAGIC_NUMBER = random.nextInt(5, 10);
        for(int i = 0; i < MAGIC_NUMBER; i++) {
            MagicNumberArray.append(chars.charAt(random.nextInt(chars.length())));
        }

        password.append(MagicNumberArray);

        // MAGIC STRING PART:

        StringBuilder MagicStringArray = new StringBuilder();

        for (int i = 0; i < 20; i++) {
            MagicStringArray.append(chars.charAt(random.nextInt(chars.length())));
        }

        magicString = MagicStringArray.toString();

        StringBuilder finalMagicString = new StringBuilder();

        for(int i = 0; i < 10; i++) {
            int index = random.nextInt(magicString.length());
            finalMagicString.append(magicString.charAt(index));
        }

        password.append(finalMagicString);

        // NAME PART:

        password.append(this.name.length());

        // un numar intreg generat aleator din intervalul [0,50]:

        password.append(String.valueOf(random.nextInt(0, 50)));


        return this.password.toString();
    }
}
