import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("Podaj stałe koszty działalności:");
            double fixedCosts = scanner.nextDouble();

            System.out.println("Podaj koszt produkcji 1 sztuki:");
            double productionCost = scanner.nextDouble();

            System.out.println("Podaj ilość sztuk do sprzedania:");
            int quantity = scanner.nextInt();

            System.out.println("Podaj marżę w %:");
            double marginPercentage = scanner.nextDouble();

            double margin = (fixedCosts+(productionCost*quantity))/quantity+marginPercentage*0.01;
            double totalProfit = ((margin - productionCost) * quantity) - fixedCosts;


            System.out.printf("Cena jednego pączka powinna wynosic: %.2f zł\n", margin);
            System.out.printf("Całkowity zysk ze sprzedaży wynosi: %.2f zł\n", totalProfit);

            int quantity10 = quantity * 10;
            double totalProfit10 = ((margin - productionCost) * quantity10) - fixedCosts;
            System.out.printf("Całkowity zysk ze sprzedaży %d sztuk pączków wynosi: %.2f zł\n", quantity10, totalProfit10);

            int quantity100 = quantity * 100;
            double totalProfit100 = ((margin - productionCost) * quantity100) - fixedCosts;
            System.out.printf("Całkowity zysk ze sprzedaży %d sztuk pączków wynosi: %.2f zł\n", quantity100, totalProfit100);


            System.out.println("Czy chcesz obliczyć jeszcze raz? (T/N)");
        } while (scanner.next().equalsIgnoreCase("T"));

    }
}