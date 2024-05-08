package app;

public class Main  {

    private static final double CONV_ML = 1.60934;        //  1 Miles = 1.60934 Km.


        public static void main(String[] args) {
            System.out.println("Convert Miles to kilometrs App");

            double ml = 15;
            double miles = convMlToKm(ml);
            System.out.println("Result is " + miles + " miles.");
        }

        private static double convMlToKm(double ml) {
            return  ml * CONV_ML;
        }


    }
