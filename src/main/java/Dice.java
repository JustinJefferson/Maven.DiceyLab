public class Dice {

    private Integer numOfDice;

    public Dice(Integer numOfDice) {
        this.numOfDice = numOfDice;
    }

    public Integer tossAndSum() {

        int sum = 0;

        for(int i = 0; i < numOfDice; i++) {
            sum +=  Math.random() * 6 + 1;
        }

        return sum;

    }

    public Integer getNumOfDice() {
        return numOfDice;
    }
}
