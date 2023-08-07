import java.util.Scanner;

public class EnergyBooster03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeFruite = scanner.nextLine();
        String size = scanner.nextLine();
        int countOrders = Integer.parseInt(scanner.nextLine());

        double price = 0;


        switch (typeFruite){
            case "Watermelon":
                price = 56 * 2;
                if (size.equals("big")){
                    price = 28.70 * 5;
                }
                break;
            case  "Mango":
                price = 36.66 * 2;
                if (size.equals("big")){
                    price = 19.60 * 5;
                }
                break;
            case "Pineapple":
                price = 42.10 * 2;
                if (size.equals("big")){
                    price = 24.80 * 5;
                }
                break;
            case "Raspberry":
                price = 20 * 2;
                if (size.equals("big")){
                    price = 15.20 * 5;
                }
        }
        double sum = price * countOrders;

        if (sum > 1000){
            sum = sum /2;
        } else if (sum <= 1000 && sum >=400) {
            sum = sum - (sum * 0.15);
        } else if (sum <400) {
            sum = sum;
        }
        System.out.printf("%.2f lv.",sum);
    }
}
