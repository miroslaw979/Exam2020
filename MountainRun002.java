import java.util.Scanner;

public class MountainRun002 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double recordInSeconds = Double.parseDouble(scanner.nextLine());
        double meters = Double.parseDouble(scanner.nextLine());
        double timeInSeconds = Double.parseDouble(scanner.nextLine());

        double timeToClimb = meters * timeInSeconds;
        double plusTime = Math.floor(meters / 50) * 30;
        double allTime =timeToClimb + plusTime;

        if (allTime < recordInSeconds){
            System.out.printf(" Yes! The new record is %.2f seconds.",allTime);
        } else {
            double diff = Math.abs(recordInSeconds - allTime);
            System.out.printf("No! He was %.2f seconds slower.",diff);
        }
    }
}
