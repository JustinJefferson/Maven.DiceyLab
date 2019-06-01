import org.junit.Test;
import org.junit.Assert;

public class BinsTest {

    @Test
    public void binTest0() {

        Bins holder = new Bins(1,6);
        for(int i = 0; i < 7; i++ ) {
            holder.incrementBin(4);
        }

        Integer expected = 7;
        Integer actual = holder.getBin(4);

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void binTest1() {

        Bins holder = new Bins(3,18);
        for(int i = 0; i < 10; i++ ) {
            holder.incrementBin(14);
        }

        Integer expected = 10;
        Integer actual = holder.getBin(14);

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void binTest2() {

        Bins holder = new Bins(2,12);
        for(int i = 0; i < 3; i++ ) {
            holder.incrementBin(2);
        }

        Integer expected = 3;
        Integer actual = holder.getBin(2);

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void binTest3() {

        Bins holder = new Bins(2,12);
        for(int i = 0; i < 3; i++ ) {
            holder.incrementBin(12);
        }

        Integer expected = 3;
        Integer actual = holder.getBin(12);

        Assert.assertEquals(expected, actual);

    }
}
