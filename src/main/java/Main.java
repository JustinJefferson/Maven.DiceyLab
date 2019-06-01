public class Main {

    public static void main(String[] args) {
        Simulation simulation = new Simulation(2, 1000000);
        simulation.runSimulation();
        simulation.printResults();

        Simulation simulation2 = new Simulation(4, 1000000);
        simulation2.runSimulation();
        simulation2.printResults();

        Simulation simulation3 = new Simulation(5, 10000000);
        simulation3.runSimulation();
        simulation3.printResults();
    }
}
