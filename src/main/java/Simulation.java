public class Simulation {

    private Bins bins;
    private Dice dice;
    private Integer tosses;

    public Simulation(Integer numOfDice, Integer numOfTosses){

        dice = new Dice(numOfDice);
        bins = new Bins(numOfDice, numOfDice * 6);
        tosses = numOfTosses;

    }

    public void runSimulation(){

        for(int i = 0; i < tosses; i++) {
            bins.incrementBin(dice.tossAndSum());
        }

    }

    public void printResults(){

        String name = "dice";
        if(dice.getNumOfDice().equals(1)) name  = "die";

        System.out.println("***");
        System.out.println("Simulation of " + dice.getNumOfDice() + " " + name + " tossed for " + tosses + " times.");
        System.out.println("***");
        System.out.println();

        Integer[] results = bins.getContainer();
        Integer diceNum = dice.getNumOfDice();

        for(Integer totalSum : results) {

            double percentage = totalSum / tosses;

            System.out.printf("%3d : %7d : %3.2f ", diceNum, totalSum, percentage);

            for(int i = 10000; i <= totalSum; i += 10000) {
                System.out.print("*");
            }

            System.out.println();
            diceNum++;

        }

        System.out.println();

    }



}
