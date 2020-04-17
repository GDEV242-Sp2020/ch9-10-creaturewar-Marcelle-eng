
/**
 * Write a description of class Human here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Human extends Creature
{
    
    /**
     * Constructor for objects of class Human
     */
    public Human()
    {
      super();
           }
    
    /**
     * Method that creates the Human 
     * @param   hitpoints   
     * @param   stren       
     */
    public Human(int hitpoints, int stren) {
        super(hitpoints, stren);
    }
    
    /**
     * Method that calculates the damage for the humans
     * return  damageDone   the damage that has been done by the humans
     */
     public int damage()
    {
        
        int damageDone;
        damageDone = super.damage();
        return damageDone;
    }
    
    
}
