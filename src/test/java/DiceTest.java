import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.Assert;


public class DiceTest {

    /*

    Example Test

    @Test
    public void TestIfs()
    {
        WriteIFs writeIFs1 = new WriteIFs();
        writeIFs1.playerDied(true);
        assertEquals("Game Over!", writeIFs1.ss);
    }

     */

    @Test
    public void diceTest0() {

        Dice two = new Dice(2);
        Integer expected = 2;
        Integer actual = two.getNumOfDice();
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void diceTest1() {

        Dice two = new Dice(8);
        Integer expected = 8;
        Integer actual = two.getNumOfDice();
        Assert.assertEquals(expected, actual);

    }

    /*
    @Test
    public void diceTest2() {


    }

     */


}
