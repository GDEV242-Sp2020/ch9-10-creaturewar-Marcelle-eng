/**
 *  A type of Creature which inherits from the Demon super class
 *  Balrogs attack twice each round. 
 * 
 * @author Marcelle tamegnon
 * @version 04/16/2020
 */
public class Balrog extends Demon {
    
     /**
     * Constructor for objects of class Balrog 
     */
    public Balrog() {
     super();   
    }
    
    
    /**
     * Method that creates the Balrog 
     * @param   hitpoints   
     * @param   stren     
     */
    public Balrog(int hitpoints, int strength) {
     super(hitpoints, strength);   
    }
    
     /**
     * Method t
     * hat calculates the damage from the Balrog
     * return damageDone   the damage that the creature has done
     */ public int damage()
    {
        // put your code here
        int damageDone = super.damage();
        damageDone += super.damage();
        
        return damageDone;
    }
}