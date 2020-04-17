/**
 * This is the Demon subtype class. Demons have a 5% chance to do magical damage.
 * 
 * @author Marcelle Tamegnon
 * @version 04/16/2020
 */
public class Demon extends Creature
{
     /**
     * Constructor for objects of class Demon
     */
    public Demon()
    {
      super();
    }

    /**
     * Method that creates the Demon
     * @param   hp   
     * @param   str    
     */
    public Demon(int hp, int str) {
      super(hp, str);  
    }

    /**
     * Method that calculates the damage from demons
     * return damageDone   the damage that the creature has done
     */
    public int damage() {
      int percent = Randomizer.nextInt(20);
      int damageInherited = super.damage();
      if (percent == 3) {
            
            System.out.println("WHAT A HIT!");
            return damageInherited + 50;
        }
        return  damageInherited;
    } 
  
}
