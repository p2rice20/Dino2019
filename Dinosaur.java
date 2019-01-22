
/**
 * Abstract class Dinosaur - write a description of the class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class Dinosaur
{
    // instance variables - replace the example below with your own
    private String type;
    private int age;
    private String gender; 
    private int wins; 
    private int battleCount; 
    private int health; 
    private boolean isAlive = true; 
    //this.isAlive = true; 

    public Dinosaur(String t) 
    {  this.type =t; 
        this.age = 0; 
        this.wins = 0; 
        this.health = 10; 
        if(Math.random()<0.5)
        {this.gender = "M"; }
        else 
        {this.gender = "F"; }
    } 

    /*************************** Setters *************************************
     */

    public void setwins(int sw)
    { this.wins = sw; 
    } 

    public void setbattleCount(int bc)
    { this.battleCount = bc; 
    }

    public void sethealth(int h)
    { this.health = h; 
    }

    public void setisAlive(boolean a) 
    { this.isAlive = a; 
    } 

    /************************** Getters ************************************* 
     */
    public int getage()
    {
        return this.age; 
    } 

    public int getwins()
    { 
        return this.wins;
    } 

    public int gethealth()
    { 
        return this.health;   
    } 

    public String gettype()
    {  
        return this.type; 
    }

    public int getbattleCount()
    {
        return this.battleCount;  
    } 

    public String getgender()
    { return this.gender;
    }
    
    public void setAge(int age)
    {
     this.age = age;   
    }

    public boolean getisAlive()
    {
        return this.isAlive; 
    } 

    /**
     * Attack is abstract because attack is a behavior of each dinosaur. However,
     * we want to be able to define win/loss ratios for each dinosaur. Abstract 
     * methods are used for the future, to help other/future programmers.
     */  
    public abstract boolean attack(Dinosaur def); 

    public void checkHealth()
    { if (this.health <= 0)
        {
            this.health = 0; 
            if(this.isAlive = true) 
            {System.out.println("\t" + toString()+ " just died");
            }
            this.isAlive = false; 

        }
        else if(this.health > 100)
        { this.health = 100; 
        }
    } 

    public void ageUp()
    {  this.age ++;
        if(this.age > 25) 
        { this.health = this.health - (int)(Math.random() * 8); 
        }
        else if( this.age < 10) 
            { this.health += 10; 
            } 
            else
            { this.health += 3; 
            } 
        this.checkHealth(); 
    }

    public String toString()
    { return this.type + " " + this.health + " " + this.age + " " + this.gender + 
        " " + this.wins + " " +  this.battleCount;  
    }

    public void update(Dinosaur def, boolean winner)
    { this.battleCount++; 
        def.setbattleCount(def.getbattleCount() + 1); 
        if(winner == true) 
        { this.wins++; //attacker win increases
            def.sethealth(def.health-20); //decreases the health of the defender
            def.checkHealth();
        }
        else 
        { def.setwins(def.getwins()+1); // defenders win increases
            this.health -= 20; //decreases the health of the attacker
            this.checkHealth(); //checks the health 
        } 
        this.checkHealth(); 
        //{ int mentalHealth = (1 + this.battleCount());
        //  double r = Math.random();
        //  string mentalHealthindex = (int) (r * mentalHealth);
        //  System.out.println(mentalHealthindex); 
    }

}


