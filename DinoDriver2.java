
/**
 * Write a description of class DinoDriver2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DinoDriver2
  {public static void main (String[] args) 
    {
        Dinosaur[] pop = new Dinosaur[100]; //this is an array of dinosaurs
        
        for(int i = 0; i<33; i++)
        { pop[i] = new TRex(); 
        }
        for(int i = 33; i<66; i++)
        { pop[i] = new Sammysaurous(); 
        }
        for(int i = 66; i<pop.length; i++)
        { pop[i] = new Bronta(); 
        }
        System.out.println(pop[5]); 
         int deadCount = 0;
         //for(int i = 0; i<pop.length; i++)
         //{Dinosaur d = pop[i];
             //if(d.isAlive()== false) //never initialized the is.alive
          //   deadCount++;
          //  }
           // Traverse the population array and age up each dino to a random age
           // between 0-35
        double rand = (Math.random() *36); 
    for(Dinosaur d : pop) //for each loop
    { 
      rand = (int)(Math.random()* 36); 
      d.setAge((int)rand); 
          //for(int j = 0; j<36; j++)
         // {  d.setHealth(); 
         //   }
       if(d.getisAlive()==false)
      {
        deadCount++;
      }
      System.out.println(d);
    }
        
       // int[] nums = new int [10];
       // System.out.println(nums[0]);
       // for(int i =0; i<nums.length; i++ )
       // { nums[i] = 10 + i;
      //  }
       // for(int i = 0; i<nums.length; i++)
       // { System.out.println(nums[i]);
      //  }
      //  for(int answer : nums) 
      //  {System.out.prinln(answer);}
      
      int winCount = 0;
      int battleCount =0; 
      for (Dinosaur d : pop) 
      {
          
          {if(d.getisAlive() && livingDinosaur(pop)>1)
            { 
                Dinosaur defend = DinoDriver2.getDefender(pop, d);
                 battleCount++;
                  if(d.attack(defend))
                  {
                      winCount++;
                    }
                }
            }
        }
        System.out.println("Total battles: "+battleCount + "  Total wins:"
        +winCount);
   } 
   public static int livingDinosaur(Dinosaur[] p)
     { int living = 0; 
         for(Dinosaur d : p)
         if(d.getisAlive())
         living++; 
      
         
        
       return living; 
         
        }
        
    public static Dinosaur getDefender(Dinosaur[] p, Dinosaur attacker)
    { 
        Dinosaur def = attacker; 
       do 
        { int rand = (int)(Math.random()*p.length);
            def = p[rand];  
        }
        while(def==attacker || !def.getisAlive());
        return def; 
        
   }
}