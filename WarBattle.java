import java.util.ArrayList;
import java.util.Random;

/**
 * Write a description of class WarBattle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WarBattle
{
    // instance variables - replace the example below with your own
    private ArrayList<Creature> army1;
    private ArrayList<Creature> army2;
    private Random random = new Random();
    private Creatures creation = new Creatures();
    private Creature currentCreature1;
    private Creature currentCreature2;
    

    /**
     * Constructor for objects of class WarBattle
     * @param    creatureNumber    installes how many creature are being created
     */
    public WarBattle(int creatureNumber)
    {
        army1 = new ArrayList<Creature>();
        army2 = new ArrayList<Creature>();
        
        for (int i = 0; i < creatureNumber; i++) {
            
            army1.add(creation.makeCreature());
            army2.add(creation.makeCreature());
        }
    }
    
    public Creature getOneCurrent() 
    {
         return currentCreature1;
    }
    
    public Creature getTwoCurrent()
    {
        return currentCreature2;
    }
    
    public void Battle()
    {
        System.out.println("--------------------------");
        System.out.println("LET THE WAR BEGIN!!!!!");
        while (army1.size() != 0 && army2.size() != 0) {
            currentCreature1 = army1.get(0);
            currentCreature2 = army2.get(0);
            
            currentCreature2.takeDamage(currentCreature1.damage());
            System.out.println(currentCreature1.getClass().getSimpleName()+ " attacks " +currentCreature2.getClass().getSimpleName());
            
            if (army2.size() > 1 && !currentCreature2.fallenCreature()) {
                army2.remove(currentCreature2);
                currentCreature2 = army2.get(0);
            
            }
            System.out.println("Side one has " +army1.size()+ " creatures remaining");
           
            currentCreature1.takeDamage(currentCreature2.damage());
            System.out.println(currentCreature2.getClass().getSimpleName()+ " attacks " +currentCreature1.getClass().getSimpleName());
            
            if (!currentCreature1.fallenCreature()) {
                army1.remove(currentCreature1);
            }
            
            System.out.println("Side two has " +army2.size()+ " creatures remaining");
            System.out.println(army1.size());
            System.out.println(army1.size());
        }
        
        if (army1.size() == 0) {
            System.out.println("army1 has been defeated. army2 wins!!");
        }
        else if (army2.size() == 0) {
            System.out.println("army2 has been defeated. army1 wins!!");
        }
    }
}