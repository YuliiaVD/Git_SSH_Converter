package app;

public class Main {

    private static final double KONV_D = 1.60934;

    public static void main(String[] args) {
        System.out.println("My Metric Conversions app. ");

        double mile = 10;
        double kilometre = konvMlsToKm(mile);

        System.out.println("Result is " + kilometre + " kilometre.");

    }

    private static double konvMlsToKm(double mile) {
        return mile * KONV_D;
    }
}
