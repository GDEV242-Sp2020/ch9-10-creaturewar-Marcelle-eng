import java.util.ArrayList;


/**
 * this class implement the war between army 1 and army2 and keeps
 * tag of the death until there is one army standing
 * 
 * @author Marcelle Tamegnon
 * @version (a version number or a date)
 */
public class WarBattle
{
    // instance variables - replace the example below with your own
    private ArrayList<Creature> army1;
    private ArrayList<Creature> army2;
    private Creatures creation = new Creatures();
    private Creature theCreature1;
    private Creature theCreature2;
    

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
    
    /**
     * accessor method for creature1
     * no parameter
     * return theCreature1
     */
    public Creature getOneCurrent() 
    {
         return theCreature1;
    }
    
    /**
     * accessor method for creature2
     * no parameter
     * return theCreature2
     */
    public Creature getTwoCurrent()
    {
        return theCreature2;
    }
    
    /**
     * set the battle between created armies.
     * takes no parameters
     * state the winner army
     */
    public void Battle()
    {
        System.out.println("--------------------------");
        System.out.println("NOW THE WAR BEGINS!!!!!");
        while (army1.size() != 0 && army2.size() != 0) {
           theCreature1 = army1.get(0);
           theCreature2 = army2.get(0);
            
            theCreature2.takeDamage(theCreature1.damage());
            System.out.println(theCreature1.getClass().getSimpleName()+ " attacks " +theCreature2.getClass().getSimpleName());
            
            if (army2.size() > 1 && !theCreature2.isAlive()) {
                army2.remove(theCreature2);
                theCreature2 = army2.get(0);
            
            }
            System.out.println("One side has " +army1.size()+ " creatures remaining");
           
           theCreature1.takeDamage(theCreature2.damage());
            System.out.println(theCreature2.getClass().getSimpleName()+ " attacks " +theCreature1.getClass().getSimpleName());
            
            if (!theCreature1.isAlive()) {
                army1.remove(theCreature1);
            }
            
            System.out.println("The other side has " +army2.size()+ " creatures remaining");
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