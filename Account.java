
/**
 * Write a description of class Account here.
 *
 * @author Georgia
 * @version 2/11
 */
public class Account
{
    
    private int ammount;
    private int money;
    private int total;
    private int expenses;
    
    private int weapon;
    private int weaponammount;
    private int total_weapons;
    private int weapon_price;
    
    private int health;
    private int healthammount;
    private int total_health;
    private int health_price;
    
    private int superstrength;
    private int strengthammount;
    private int total_strength;
    private int strength_price;

    /**
     * Enter the ammount of money you have available  to spend
     */
    public Account(int ammount)
    {
                money = ammount;
    }
    
    public void Weapon(int weaponinput)
    {
        weapon = 20;
        weaponammount = weaponinput;
        total_weapons = weaponinput + total_weapons;
        weapon_price = weaponinput*weapon;
        expenses = weapon_price + expenses;
        
    }
    
    public void Health(int healthinput)
    {
        health = 15;
        healthammount = healthinput;
        total_health = healthinput + total_health;
        health_price = healthinput*health;
        expenses = health_price + expenses;
    }
    
    public void strength(int strengthinput)
    {
        superstrength = 10;
        strengthammount = strengthinput;
        total_strength = strengthinput + total_strength;
        strength_price = strengthinput*superstrength;
        expenses = strength_price + expenses;
    }
    
    public void Checkout()
    {
         total = money - expenses;
         System.out.println(" ");
         System.out.println(" ");
         System.out.println("$ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $");
         System.out.println("You are checking out");
         System.out.println("You spent $" + expenses + " out of the $" +money+ " you had");
         System.out.println("You purchases " + total_weapons + " weapons");
         System.out.println("You purchases " + total_health + " health");
         System.out.println("You purchases " + total_strength + " super strength");
         System.out.println("$ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $");
         System.out.println(" ");
         System.out.println(" ");
             
             
    }
    
    

    
}
    


