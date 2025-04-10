import org.junit.jupiter.api.*;

public class IntCalculatorTest {

    private NewIntCalculator calculator;
    @BeforeEach
    public void setup(){
        calculator = new NewIntCalculator().init();
    }

    @Test
    public void testAddPositive() {
        int result = (int) calculator.add(5).add(5).result();

        Assertions.assertEquals(10, result);
    }

    @Test
    public void testAddNegatives() {
        int result = (int) calculator.add(-5).add(-5).result();

        Assertions.assertEquals(-10, result);
    }

    @Test
    public void testSubtractPositives() {
        calculator.add(20);

        int result = (int) calculator.substract(5).result();

        Assertions.assertEquals(15, result);
    }

    @Test
    public void testSubtractNegatives() {
        calculator.substract(10);

        int result = (int) calculator.substract(-10).result();

        Assertions.assertEquals(0, result);
    }

    @Test
    public void testMultiplyPositives() {
        calculator.add(10);

        int result = (int) calculator.multiply(5).result();

        Assertions.assertEquals(50, result);
    }

    @Test
    public void testMultiplyNegatives() {
        calculator.add(-10);

        int result = (int) calculator.multiply(-2).result();

        Assertions.assertEquals(20, result);
    }

    @Test
    public void testMultiplyBy0() {
        calculator.add(10);

        int result = (int) calculator.multiply(0).result();

        Assertions.assertEquals(0, result);
    }

    @Test
    public void testDividePositives() {
        calculator.add(100);

        int result = (int) calculator.divide(20).result();

        Assertions.assertEquals(5, result);
    }

    @Test
    public void testDivideNegatives() {
        calculator.add(-100);

        int result = (int) calculator.divide(-20).result();
        Assertions.assertEquals(5, result);

        calculator.multiply(0);
        calculator.add(-100);
        int result2 = (int) calculator.divide(20).result();
        Assertions.assertEquals(-5, result2);

    }

    @Test
    public void testDivideBy0() {
        calculator.add(10);

        //int result = (int) calculator.divide(0).result();

        Assertions.assertThrows(ArithmeticException.class, () -> {
            calculator.divide(0).result();
        });
    }
}
