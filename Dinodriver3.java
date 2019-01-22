
/**
 * Write a description of class Dinodriver3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Scanner; 
import java.util.ArrayList; 
public class Dinodriver3
{
    public static void main(String[] args)
    {  ArrayList<Dinosaur> myPop = new ArrayList<Dinosaur>(); 
       System.out.println("How many Dinos in original pop?");
       Scanner scan = new Scanner(System.in); 
       double rando = Math.random(); 
       int s = scan.nextInt(); 
       for(int i =0; i<s; i++)
       {
           double num = Math.random(); 
           if(num < .33)
           {myPop.add(new TRex()); 
           }
           else if(num > .67)
           { myPop.add(new Bronta()); 
            } 
           else 
           { myPop.add(new Sammysaurous()); 
            }
          
        }
       int deadCount = 0; 
       int l = 0; 
       for (Dinosaur d : q)   
        { if (d.getisAlive())
            l++; 
          else
          { q.remove(d); 
            }
        }
       
       for(Dinosaur d : myPop)
          { rando = (int)(Math.random()* 50); 
              for(int j = 0; j < 50; j++)
               { d.ageUp();
                } 
            if(d.getisAlive() == false) 
            { deadCount++; 
            }
              System.out.println(d); 
            }
    }
    public static int livingDinosaur(ArrayList<Dinosaur> p)
     { int living = 0; 
         for(Dinosaur d : p)
         if(d.getisAlive())
         living++; 
      
         
        
       return living; 
         
        }
    public static Dinosaur getDefender(ArrayList<Dinosaur> p, Dinosaur attacker)
    { 
        Dinosaur def = attacker; 
       do 
        { int rand = (int)(Math.random()*p.size());
            def = p.get(rand);  
        }
        while(def==attacker || !def.getisAlive());
        return def; 
        
    }
}
