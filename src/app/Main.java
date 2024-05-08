package app;

public class Main  {

    private static final double CONV_ML = 1.60934;        //  1 Miles = 1.60934 Km.

    public static void main(String[] args) {
            System.out.println("Convert Miles to kilometrs App");

            double ml = 10;
            double kilometer = 16;

            double miles = convMlToKm(ml);
            System.out.println("Result is " + miles + " kilometrs.");

            double km = convKmToMl(kilometer);
            System.out.println("Result is " + km + " miles.");
        }

        private static double convMlToKm(double ml) {
            return  ml * CONV_ML;
        }
        private static double convKmToMl(double km) {
            return km / CONV_ML;
        }


    }
