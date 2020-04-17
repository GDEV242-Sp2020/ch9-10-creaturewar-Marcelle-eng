import java.util.Random;

/**
 * Write a description of class Randomizer here.
 * 
 * @author 
 * @version 
 */
public class Randomizer
{
    // instance variables - replace the example below with your own
    private static Random rand;

    /**
     * Constructor for objects of class Randomizer
     */
    public Randomizer()
    {
        rand = new Random();
    }

    /**
     * static method that creates a new random object and genarates 
     * a random number given a cetain range
     * @param int y   
     * @return    a random number in the rage of y
     */
    public static int nextInt(int y)
    {
        if (rand == null) {
            rand = new Random();
        }
        
        return rand.nextInt(y);
    }
}
