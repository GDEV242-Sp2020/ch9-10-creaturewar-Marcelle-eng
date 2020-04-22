import java.util.Random;
/**
 * Write a description of class Elf here.
 *
 * @author Marcelle Tamegnon
 * @version 04/16/2020
 */
public class Elf extends Creature
{
    private Random random = new Random();
    /**
     * Constructor for objects of class Elf
     */
    public Elf()
    {
        super();
    }
    
    /**
     * Method that creates the Elf creature
     * @param   hitpoints   
     * @param   stren       
     */
    public Elf(int hitpoints, int stren) {
        super(hitpoints, stren);
    }
    
    /**
     * Method that calculates the damage for the Elf
     * return  damageDone   the damage that has been done by the Elf
     */
    public int magicalDamage()
    {
        int percent,damageInherited;
        percent = random.nextInt(10) + 1;  //10% chance statement that unables a different damage outcome
        damageInherited = super.damage();
        if (percent == 3) 
        {
            System.out.println("WHAT A HIT!");
            return damageInherited * 2;
        }
        return  damageInherited;
    }
}