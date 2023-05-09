package petridish;

import java.util.Scanner;

public class PetriDish {

    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        new PetriDish().run();
    }

    /**
     * This methods demonstrates how the BacteriaColony's behavior can be
     * swapped out at run time. To be more dynamic, we could have prompted the
     * user for the parameters of the different growth strategies (e.g. the
     * growth rate, max population), but they have been hard coded for
     * simplicity.
     */
    public void run() {
        BacteriaColony colony = new BacteriaColony(100);

        int choice = 0;
        while (choice != 5) {
            printMenu();
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    colony.setGrowthStrategy(new ExponentialGrowth(.2));
                    break;
                case 2:
                    colony.setGrowthStrategy(new LogisticGrowth(.2, 20000));
                    break;
                case 3:
                    colony.setGrowthStrategy(new LinearGrowth(20));
                    break;
                case 4:
                    colony.setGrowthStrategy(new NoGrowth());
                    break;
                case 5:
                    System.out.println("Goodbye");
                    System.exit(0);
            }

            // Tell the BacteriaColony to grow 10 times using its current strategy
            for (int time = 0; time < 10; time++) {
                colony.grow();
                System.out.println("Time " + time + ", Population " + colony.getPopulation());
            }

        }

    }

    private void printMenu() {
        System.out.println("1. Exponential Growth");
        System.out.println("2. Logistic Growth");
        System.out.println("3. Linear Growth");
        System.out.println("4. No Growth\n");
        System.out.println("5. Exit Program");
        System.out.print("Choose your growth strategy: ");
    }

}
