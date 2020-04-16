/**
 * This is the Balrog class. Just like a regular demon, except Balrogs attack twice each round. 
 * 
 * @author Marcelle tamegnon
 * @version 04/16/2020
 */
public class Balrog extends Demon {
    
    public Balrog() {
     super();   
    }
    
    public Balrog(int hitpoints, int strength) {
     super(hitpoints, strength);   
    }
    
      public int damage()
    {
        // put your code here
        int damageDone = super.damage();
        damageDone += super.damage();
        
        return damageDone;
    }
}