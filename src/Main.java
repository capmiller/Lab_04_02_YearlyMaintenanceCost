public class Main {
    public static void main(String[] args) {
        double winterCosts = 420.23;
        double springCosts = 302.12;
        double summerCosts = 501.63;
        double fallCosts = 202.85;
        double totalCosts = 0;

        totalCosts = winterCosts + springCosts + summerCosts + fallCosts;
        System.out.println("The total yearly maintenance cost, which is the sum of the Winter cost of $" + winterCosts + ", the Spring cost of $" + springCosts + ", the Summer cost of $" + summerCosts + ", and the Fall cost of $" + fallCosts + " is $" + totalCosts);


    }
}