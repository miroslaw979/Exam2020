import java.util.Scanner;

public class MaidenParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double mominskoparti = Double.parseDouble(scanner.nextLine());
        int countLove = Integer.parseInt(scanner.nextLine());
        int vosRose = Integer.parseInt(scanner.nextLine());
        int klucodurzatel = Integer.parseInt(scanner.nextLine());
        int karikaturi = Integer.parseInt(scanner.nextLine());
        int kusmeti = Integer.parseInt(scanner.nextLine());
     double cena = 0;
        double razhodi = 0;
        double sum = countLove * 0.60 + vosRose * 7.20 +klucodurzatel * 3.60 + karikaturi * 18.20 + kusmeti * 22;
        int broiArtikuli = countLove + vosRose +karikaturi +klucodurzatel + kusmeti;

        if (broiArtikuli >= 25) {
            cena = sum * 0.65;
            razhodi = cena * 0.10;
        } else if (broiArtikuli < 25) {
            cena = sum;
            razhodi = cena * 0.10;
        }
        double pechalba = cena - razhodi;
            if (pechalba > mominskoparti) {
               double ostavshtiPari = pechalba - mominskoparti;
               System.out.printf("Yes! %.2f lv left.", ostavshtiPari);
            } else if (mominskoparti > pechalba) {
                double diff = mominskoparti - pechalba;
                System.out.printf("Not enough money! %.2f lv needed.", diff);


        }


    }
}
