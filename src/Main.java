import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String[] products = {"Хлеб", "Масло", "Печенье", "Молоко", "Кефир"};
        int[] prices = {28, 132, 80, 62, 58};
        int[] counts = new int[products.length];
        int sumProducts = 0;

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < products.length; i++) {
            System.out.println(i + 1 + ". " + products[i] + " " + prices[i] + " руб/шт");
        }
        while (true) {
            System.out.println("Выберите товар и количество или введите end:");
            String input = scanner.nextLine();
            if ("end".equals(input)) {
                break;
            }
            String[] parts = input.split(" ");
            int productNumber = Integer.parseInt(parts[0]) - 1;
            int productCount = Integer.parseInt(parts[1]);
            counts[productNumber] += productCount;
            sumProducts += prices[productNumber] * productCount;
        }

        System.out.println("Ваша корзина:");
        for (int i = 0; i < products.length; i++) {
            if (counts[i] > 0) {
                System.out.println(products[i] + " " + counts[i] + " шт " + prices[i] + " руб/шт" + " " + prices[i] * counts[i] + " руб в сумме");
            }
        }
        System.out.println("Итого: " + sumProducts + " руб");
    }
}
