public class Lab6 {
    public static void Lab6Func() {
        // 5.4.1
        IntCalculator calculator = new IntCalculator(10);
        int result = calculator.add(5).substract(3).multiply(2).result();
        System.out.println("IntCalculator (5.4.1): " + result);

        // 5.4.2
        NewIntCalculator newIntCalculator = new NewIntCalculator();
        newIntCalculator.init();

        DoubleCalculator doubleCalculator = new DoubleCalculator();

        newIntCalculator.init().add(10).add(5).substract(3).multiply(2);

        doubleCalculator.init().add(10).add(5).substract(3.3).multiply(2.2);

        System.out.println("NewIntCalculator (5.4.2 a): " + (int)newIntCalculator.result());

        System.out.println("DoubleCalculator (5.4.2 b): " + (double)doubleCalculator.result());
    }

}
