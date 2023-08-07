import java.util.Scanner;

public class Birthday1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double rent = Double.parseDouble(scanner.nextLine());



        double priceForCake = rent * 0.20;
        double priceForDrink = priceForCake - (priceForCake * 0.45);
        double priceForActor = rent / 3;
        double priceAll = rent + priceForCake + priceForDrink + priceForActor;
        System.out.println(priceAll);
    }
}