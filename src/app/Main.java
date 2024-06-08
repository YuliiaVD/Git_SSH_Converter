package app;

public class Main {

    private static final double KONV_D = 1.60934;

    public static void main(String[] args) {
        System.out.println("My Metric Conversions app. ");

        double mile = 10;
        double km = 15;
        double kilometre = konvMlsToKm(mile);
        double miles = konvKmtoMiles(km);

        System.out.println("Result is: " + kilometre + " kilometre and " + miles + " mile. ");

    }

    private static double konvMlsToKm(double mile) {
        return mile * KONV_D;
    }

    private static double konvKmtoMiles(double km) {
        return km / KONV_D;
    }
}
