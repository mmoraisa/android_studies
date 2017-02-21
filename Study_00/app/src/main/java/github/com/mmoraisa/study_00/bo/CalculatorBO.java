package github.com.mmoraisa.study_00.bo;

/**
 * Created by logonrm on 21/02/2017.
 */

public abstract class CalculatorBO {

    public static double sum(double a, double b){
        return a + b;
    }

    public static double subtract(double a, double b){
        return a - b;
    }

    public static double multiply(double a, double b){
        return a * b;
    }

    public static double divide(double a, double b){
        return a / b;
    }

}
