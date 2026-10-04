public class Undergraduate extends Student {
    private final double gpa;

    @Override
    public double calculateMonthlyStipend() {
        double stipend = 500.0;

        if (gpa > 3.5) {
            stipend += 150.0;
        }

        return stipend;
}
