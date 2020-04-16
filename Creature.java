import java.util.Random;
/**
 * Abstract class Creature - 
 * The creature is the main class from which all other battling creatures derive.
 * It is the creature's job to maintain current health values in response to 
 * requests to takeDamage. It also must report if
 * the creature is alive or dead. The creature is also responsible for calculating
 * damage delivered based on the creature's strength (1 to str) 
 * 
 * @author Marcelle Tamegnon
 * @version 04/16/2020
 * 
 */
public abstract class Creature
{
   private int hp;
   private int hitPoints;
   private int strength;
   Random randomGenerator = new Random();
   
   /** Constructor
    * set hitpoints and strength to 10 for all creatures
    */
   public Creature(){
      hitPoints = 10;
      strength = 10;
   }
   
   /** Constructor
    * create a human creatures set max hiptppoint and strength
    * min hitpoints and strength
    * @ parameters int hitpoint and strength
    */
   public Creature(int hp, int str) {
      this.hp = hp;
      this.strength = strength;
    }
    
   
   /**
     * Allows a creature to determine how much damage it is causing in this round of battle
     * @return a value between 1 and str to be used to cause damage to another creature
     */
    public int damage(){
       return randomGenerator.nextInt(strength)+1;
    }
    
      
    /**
     * Is this creature still capable of fighting?
     * @return true when current hit point level is greater than zero
     */
    public boolean isAlive()
   {
       boolean alive = true;
       if (hp <= 0) {
           alive = false;
        }
       return alive;
   }
   
   /**
     * Is this creature deceased?
     * @return true when current hit point level is less than or equal to zero
     */
    public boolean isDead() {
        //implement this
        return false; //change this
    }
   
  
    
   /**
     * takeDamage receives a value for the amount of damage to subtract from 
     * the current total of hit points
     * @param damage value to remove from hit point count
     */
    public void takeDamage(int attackDamage)
   {
       hp = hp - attackDamage;
   }
      
    
    
   
   
   // public int getHP() {
     // return hitPoints;  
   // }
   
   // public int getStrength() {
     // return strength;  
   
   
   // public void BattleWound(int gash) {
     // hitPoints = hitPoints -  gash;  
   // }
}
    

