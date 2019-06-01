
public class Bins {

    private Integer[] container;
    private Integer minValue;
    private Integer maxValue;

    public Bins(Integer min, Integer max) {

        minValue = min;
        maxValue = max;
        container = new Integer[max - min + 1];

        for(int i = 0; i < container.length; i++) {
            container[i] = 0;
        }

    }

    public void incrementBin(Integer bin) {
        // System.out.println(bin);
        container[bin - minValue] += 1;

    }

    public Integer getBin(Integer bin) {
        return container[bin - minValue];
    }

    public Integer[] getContainer() {
        return container;
    }

    public Integer getMinValue() {
        return minValue;
    }

    public Integer getMaxValue() {
        return maxValue;
    }


}
