
/**
 * Write a description of class Sammysaurous here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Sammysaurous extends Dinosaur 
{  public Sammysaurous()
    { super("Sammysaurous");
    }
    public boolean attack(Dinosaur def) 
    {
      double prob = 0.0;
        if(def.gettype().equals("TRex"))
        { if(Math.random() < 0.55) 
            {
                //if this dinosaur died then set win count of the other dinosaur to winCount++ and set this health to 0
                this.update(def, true);
                this.sethealth(0);
                return true; 
            } 
        }
        else { 
            if(Math.random() < 0.9) 
            { 
                this.update(def, false);
                def.sethealth(0);
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
  

