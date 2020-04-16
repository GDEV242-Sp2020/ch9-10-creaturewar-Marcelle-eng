import java.util.Random;
import java.util.ArrayList;

/**
 * Write a description of class CreatureCreation here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Creatures
{
    // instance variables - replace the example below with your own
    private Random random = new Random();
    private ArrayList<String> army = new ArrayList<String>();

    /**
     * Constructor for objects of class CreatureCreation
     */
    public Creatures()
    {
        // initialise instance variables
        army.add("cyberDemon");
        army.add("human");
        army.add("balrog");
        army.add("elf");
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public Creature makeCreature()
    {
        Creature madeCreature;
        int numberIndex = random.nextInt(army.size());
        String creation = army.get(numberIndex);
        switch (creation) {
            case "human":       madeCreature = new Human();
                                break;
                             
            case "cyberDemon":  madeCreature = new CyberDemon(random.nextInt((28 - 5) + 1) + 5, random.nextInt((13 - 5) + 1) + 5);
                                break;
                                
            case "elf":         madeCreature = new Elf(random.nextInt((20 - 3) + 1) + 5, random.nextInt((15 - 10) + 1) + 5);
                                break;
                                
            case "balrog":      madeCreature = new Balrog(random.nextInt((25 - 10) + 1) + 10, random.nextInt((10 - 5) + 1) + 5);
                                break;
            
            default:             madeCreature = null;
                                break;
        }
        return madeCreature;
    }
}