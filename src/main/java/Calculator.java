public class Calculator {

    public double addition(double number1, double number2) {

        double add = number1 + number2;
        return add;
    }

    public double subtraction(double number1, double number2) {
        double sub = number1 - number2;
        return sub;
    }

    public double multiplication(double number1, double number2) {
        double mul = number1*number2;
        return mul;
    }

    public double division(double number1, double number2) throws Exception {
        if(number2==0){
            throw new Exception("Can't be divided by zero!");
        }
        return  number1/number2;
    }


}
