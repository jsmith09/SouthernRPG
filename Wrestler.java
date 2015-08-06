import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Wrestler extends Role{

   public int Intensity = 0;
   public String IntensityOutcome;
   
   
  public Wrestler(){
       this("", "", 0, "", 0, "", "", 0);
  }
   
   public Wrestler(String fname, String lname, int health, String Ex, 
                   int att, String gen, String intenOutcome, int inten){
   
           super(fname, lname, health, Ex, att, gen);
           setIntensity(intenOutcome, inten);
   }
   
   public void setIntensity(String intenOutcome, int inten){
   
         Intensity = inten;
         IntensityOutcome = intenOutcome;
         int attack = getAttack();
      if(inten == 3){
         setAttack(attack*=2);
         intenOutcome = ("Wrestling crowd is getting hyped, time to bring out the chair!!!\n(Attack is increased)");
         
         }
      else if (inten == 6){
   
            setAttack(attack*3);
            intenOutcome = ("It time to take it home, Do the Crab Smasher for the finish!!!\n(Attack is increased)");

      }
   
      else{
      intenOutcome +="The wrestling crowd is building behind you!!!";
      }
      
      JOptionPane.showMessageDialog(null,intenOutcome);
       
}

   public int getIntensity(){
   
        return this.Intensity;
   
   }
   
   public ArrayList getMoves(){
   
   ArrayList wmoves = new ArrayList();
   return wmoves;
   
   }
   
}

   