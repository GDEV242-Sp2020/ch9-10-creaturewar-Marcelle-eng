//import java.util.Random;
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
    //private Random random = new Random();
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
        int numberIndex = Randomizer.nextInt(army.size());
        String creation = army.get(numberIndex);
        switch (creation) {
            case "human":       madeCreature = new Human((Randomizer.nextInt((30 - 10) + 1) + 10), (Randomizer.nextInt((18 - 5) + 1) + 5));
                                break;
                                
            case "elf":         madeCreature = new Elf(Randomizer.nextInt((25 - 8) + 1) + 8,Randomizer.nextInt((18 - 5) + 1) + 5);
                                break;                    
                             
            case "cyberDemon":  madeCreature = new CyberDemon(Randomizer.nextInt((100 - 25) + 1) + 25, Randomizer.nextInt((40 - 20) + 1) + 20);
                                break;
                                
           case "balrog":      madeCreature = new Balrog(Randomizer.nextInt((100 - 25) + 1) + 25, Randomizer.nextInt((40 - 20) + 1) + 20);
                                break;
            
            default:             madeCreature = null;
                                break;
        }
        return madeCreature;
    }
}