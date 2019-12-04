/*
    Class for Arithmetic functions 
    java developers team 
    28/11/2019 
 */
package calculaotrapp1.JavaCode;

/**
 *
 * @author Muhammmad Hossam
 */
public class Triangometric {

    // to get sin of an angle 
    public static double sin(String x) {
        double a = check(x);
        x = String.format("%.2g%n", Math.sin(Math.toRadians(a)));
        double m = Double.parseDouble(x);
        return m;
    }

    // to get sin of an angle 
    public static double cos(String x) {
        double a = check(x);
        x = String.format("%.2g%n", Math.cos(Math.toRadians(a)));
        double m = Double.parseDouble(x);
        return m;
    }

    // to get sin of an angle 
    public static double tan(String x) {
        double a = check(x);
        x = String.format("%.2g%n", Math.tan(Math.toRadians(a)));
        double m = Double.parseDouble(x);
        return m;
    }

    // to get sinh of an angle 
    public static double sinh(String x) {
        double a = check(x);
        return Math.sinh(a);
    }

    // to get cosh of an angle 
    public static double cosh(String x) {
        double a = check(x);
        return Math.cosh(a);
    }

    // to get tanh of an angle 
    public static double tanh(String x) {
        double a = check(x);
        return Math.tanh(a);
    }

    // to get arcsin of an angle 
    public static double arcsin(String x) {
        double a = check(x);
        a = Math.toDegrees(Math.asin(a));
        return a;
    }

    // to get arccos of an angle 
    public static double arccos(String x) {
        double a = check(x);
        a = Math.toDegrees(Math.acos(a));
        return a;
    }

    // to get arctan of an angle 
    public static double arctan(String x) {
        double a = check(x);
        a = Math.toDegrees(Math.atan(a));
        return a;
    }

    // to get sec of an angle 
    public static double sec(String a) {
        return 1 / (sin(a));
    }

    // to get cosec of an angle 
    public static double cosec(String a) {
        return 1 / (cos(a));
    }

    // to get cotan of an angle 
    public static double cotan(String a) {
        return 1 / (tan(a));
    }

    // to check if given number is double or not  
    private static double check(String x) {
        double angle;
        try {
            angle = Double.parseDouble(x);
        } catch (NumberFormatException ex) {
            System.out.println("enter number please");
            angle = 0.0;
        }
        return angle;
    }

    public static void main(String[] args) {
        System.out.println(cotan("30.0"));
        System.out.println(arcsin("c"));
    }
}
