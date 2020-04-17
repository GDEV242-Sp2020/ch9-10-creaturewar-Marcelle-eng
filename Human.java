
/**
 * Write a description of class Human here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Human extends Creature
{
    // private static final int MAX_HUMAN_HP = 30;
    // private static final int MIN_HUMAN_HP = 10;
    // private static final int MAX_HUMAN_STR = 18;
    // private static final int MIN_HUMAN_STR = 5;
    public Human()
    {
        // note how the class uses the static randomizer class to generate the values. This localizes the need to know 
        // max and min values to this class only max-min is range of values
        // range + min ensures that the values don't start at one.
        super();
           
          
    }
    
    /**
     * Method that creates the Elf creature
     * @param   hitpoints   hitpoints for the Elf must be between 3-20
     * @param   stren       strength for the Elf must be between 10-15
     */
    public Human(int hitpoints, int stren) {
        super(hitpoints, stren);
    }
    
    public int damage()
    {
        // put your code here
        int damageDone;
        damageDone = super.damage();
        return damageDone;
    }
    
    
}
