import java.util.Scanner;

public class FitnessCard003 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double money = Double.parseDouble(scanner.nextLine());
        char pol = scanner.nextLine().charAt(0);
        int years = Integer.parseInt(scanner.nextLine());
        String typeSport = scanner.nextLine();

        double price = 0;
        if (pol == 'm'){
            if (typeSport.equals("Gym")){
                price = 42;
            } else if (typeSport.equals("Boxing")) {
                price = 41;
            } else if (typeSport.equals("Yoga")) {
                price = 45;
            } else if (typeSport.equals("Zumba")) {
                price = 34;
            } else if (typeSport.equals("Dance")) {
                price = 51;
            } else if (typeSport.equals("Pilates")) {
                price = 39;
            }
        } else if (pol == 'f') {
            if (typeSport.equals("Gym")){
                price = 35;
            } else if (typeSport.equals("Boxing")) {
                price = 37;
            } else if (typeSport.equals("Yoga")) {
                price = 42;
            } else if (typeSport.equals("Zumba")) {
                price = 31;
            } else if (typeSport.equals("Dance")) {
                price = 53;
            } else if (typeSport.equals("Pilates")) {
                price = 37;
            }
        }
        if (years <= 19){
            price = price * 0.80;
        }

        if (money>= price){
            System.out.printf("You purchased a 1 month pass for %s.",typeSport);
        } else {
            double diff = Math.abs(money - price);
            System.out.printf("You don't have enough money! You need $%.2f more.",diff);
        }


    }
}
