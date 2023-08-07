import java.util.Scanner;

public class CatWalking02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int minutesOut= Integer.parseInt(scanner.nextLine());
        int countsOut = Integer.parseInt(scanner.nextLine());
        int calories = Integer.parseInt(scanner.nextLine());

        int howManyTimesCatGetOut = minutesOut * countsOut;
        int burnCalories = howManyTimesCatGetOut * 5;
        int caloriesForDay = calories / 2;
        if (burnCalories >= caloriesForDay){
            System.out.printf("Yes, the walk for your cat is enough. Burned calories per day: %d.", burnCalories);
        } else {
            System.out.printf("No, the walk for your cat is not enough. Burned calories per day: %d.",burnCalories);
        }
    }
}
