
import java.util.ArrayList;
import java.util.Random;
/**
 * Create all creatures and store them in an arrayList
 * 
 * @author Marcelle Tamegnon 
 * @version 04/16/2020
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
     * switch statement that makes the creatures
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
            case "human":       madeCreature = new Human((random.nextInt((30 - 10) + 1) + 10), (random.nextInt((18 - 5) + 1) + 5));
                                break;
                                
            case "elf":         madeCreature = new Elf(random.nextInt((25 - 8) + 1) + 8,random.nextInt((18 - 5) + 1) + 5);
                                break;                    
                             
            case "cyberDemon":  madeCreature = new CyberDemon(random.nextInt((100 - 25) + 1) + 25, random.nextInt((40 - 20) + 1) + 20);
                                break;
                                
           case "balrog":      madeCreature = new Balrog(random.nextInt((100 - 25) + 1) + 25, random.nextInt((40 - 20) + 1) + 20);
                                break;
            
            default:             madeCreature = null;
                                break;
        }
        return madeCreature;
    }
}