import java.util.Scanner;

public class Hw39 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type a length of ur wall");
        double length = scanner.nextDouble();
        System.out.println("Type a width of ur wall");
        double width = scanner.nextDouble();
        System.out.println("Type a price of the tile");
        double tilePrice = scanner.nextDouble();
        double totalCost = calculateCost(length, width, tilePrice);
        System.out.println("Total price is " + (int) totalCost + " " + "euro");
    }

    public static double calculateCost(double length, double width, double priceOfTiles) {
        double areaOfTiles = 0.3 * 0.2;
        double areaOfWall = length * width;
        double totalTiles = areaOfWall / areaOfTiles;
        int wholeTiles = (int) totalTiles;
        double costOfTiles = priceOfTiles * wholeTiles;
        double workHours = areaOfWall;
        double costOfWork = workHours * 27;
        double totalCostOfTheWork = costOfWork + costOfTiles;
        return totalCostOfTheWork;
    }
}

