public class Lab3 {
    public static void Lab3Func() {
        PasswordMaker pass = PasswordMaker.getInstance();
        System.out.println(pass.getPassword());

        PasswordMaker[] passwords = new PasswordMaker[10];

        for (int i = 0; i < 10; i ++) {
            passwords[i] = PasswordMaker.getInstance();
        }

        System.out.println("Amount of instances: " + PasswordMaker.getCounter());
    }
}
