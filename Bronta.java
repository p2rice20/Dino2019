
/**
 * Write a description of class Bronta here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Bronta extends Dinosaur
{

    /**
     * Constructor for objects of class Bronta
     */
    public Bronta()
    {
        super("Bronta");
    }
public boolean attack(Dinosaur def) 
    {
      double prob = 0.0;
        if(def.gettype().equals("TRex"))
        { if(Math.random() < 0.55) 
            {
                this.update(def, true);
                return true; 
            } 
        }
        else { 
            if(Math.random() < 0.9) 
            { 
                this.update(def, false);
                return false; 
            } 
            
        } 
     if(def.gettype().equals("Sammysaurous")) 
            { if(Math.random() < 0.55)
                { prob = 0.5; 
                }
               else 
              prob = 0.9;
                if(Math.random() < prob)
                { return true; 
                }
               else 
                {return false; 
                }
            }
               return false;
        } 
}