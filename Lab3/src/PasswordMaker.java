import java.util.Random;

public class PasswordMaker {
    private String name;
    private StringBuilder password;

    public PasswordMaker(String name) {
        this.name = name;

    }

    public String getPassword() {
        final int MAGIC_NUMBER;
        final String magicString;

        password = new StringBuilder();
        Random random = new Random();
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";


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
