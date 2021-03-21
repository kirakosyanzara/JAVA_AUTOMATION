

import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {
    Calculator calc = new Calculator();

    @Test
    public void additionTest() {
        double actualAddition = calc.addition(5, 5);
        double expectedAddition = 10;
        Assert.assertEquals(actualAddition, expectedAddition);
    }

    @Test
    public void subtractionTest() {
        double actualSubtraction = calc.subtraction(10, 5);
        double expectedSubtraction = 5;
        Assert.assertEquals(actualSubtraction, expectedSubtraction);
    }

    @Test
    public void multiplicationTest() {
        double actualMultiplication = calc.multiplication(0, 3);
        double expectedMultiplication = 0;
        boolean secondnumber=false;
        if (actualMultiplication==0){
            secondnumber=true;
        }
        Assert.assertTrue(secondnumber);
    }

    @Test(expectedExceptionsMessageRegExp = "Can't be divided by zero!")
    public void divisionTest() throws Exception {
        calc.division(10, 0);
    }


}

