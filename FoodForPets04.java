import java.util.Scanner;

public class FoodForPets04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        double sumFood = Double.parseDouble(scanner.nextLine());

        double DogFood = 0;
        double catFood = 0;
        double biscuit = 0;

        for (int i = 1; i <= days ; i++) {
            int foodForDog = Integer.parseInt(scanner.nextLine());
            int foodForCat = Integer.parseInt(scanner.nextLine());
            DogFood = DogFood + foodForDog;
            catFood = catFood + foodForCat;

            if (i % 3 == 0){
                double currentBiscuit = (foodForCat + foodForDog) * 0.1;
                biscuit = biscuit + currentBiscuit;
            }

        }
        double allFood = DogFood + catFood;
        double eatenFood = (allFood /sumFood) * 100;
        double eatenDog = (DogFood / allFood) * 100;
        double eatenCat = (catFood / allFood) * 100;

        System.out.printf("Total eaten biscuits: %dgr.%n",Math.round(biscuit));
        System.out.printf("%.2f%% of the food has been eaten.%n",eatenFood);
        System.out.printf("%.2f%% eaten from the dog.%n",eatenDog);
        System.out.printf("%.2f%% eaten from the cat.",eatenCat);
    }
}
