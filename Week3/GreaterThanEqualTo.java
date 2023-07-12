package Week3;

public class GreaterThanEqualTo {
    public static void main(String[] args) {
        double recommendedWaterAmount = 8;
        double daysInChallenge = 30;
        double yourWaterIntake = 235.5;
        double totalRecommendedAmount = recommendedWaterAmount * daysInChallenge;
System.out.println(totalRecommendedAmount);

boolean isChallengeComplete = yourWaterIntake >= totalRecommendedAmount;
System.out.println(isChallengeComplete);

    }
}
