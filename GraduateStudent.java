public class GraduateStudent extends Student {

    private final double taHours;
    private final double yearlyResearchGrant;

    @Override
    public double calculateMonthlyStipend() {
        double stipend = 1200.0;

        stipend += taHours * 25.0;
        stipend += yearlyResearchGrant / 12.0;

        return stipend;
    }
}