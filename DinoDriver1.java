
/**
 * Write a description of class DinoDriver1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DinoDriver1
{
    public static void main(String[] args) 
    { Dinosaur d1 = new TRex();  
        Dinosaur d2 = new Sammysaurous();
        Dinosaur d3 = new Bronta();
        d1.sethealth(100);
        d2.sethealth(100); 
        
        for(int i = 0; i<10; i++)
        { if(d1.attack(d2) ) 
            { d1.setwins(d1.getwins()+1);
            }
            System.out.println(d1.toString()+" *** "+d2.toString());
             
     } 
     System.out.println("" + d1.getwins() + "out of 1000 attacks");
   }
}
