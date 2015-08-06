//***********************************************************************************************
// * Assignment 4                                                                               *
// * Jesse Smith                                                                                *
// * Battle process for player character and creature                                           *
//***********************************************************************************************


// import Random
import java.util.Random;
import javax.swing.JOptionPane;


public class Battleprocess2 extends Wrestler{

   //Create refrence variables for class

   private int enemyHealth;
   private int enemyAttack;
   
   public Battleprocess2(){
   
   this("", "", 0, "", 0, "", "", 0, 0, 0);
   
   }
   
   public Battleprocess2(String fname, String lname, int health, String Ex, 
                   int att, String gen, String intenOutcome, int inten, int enemyEnergy, int enemyPower){      
   
      super(fname, lname, health, Ex, att, gen, intenOutcome, inten);
 
      setVillianEnergy(enemyEnergy);
      setVillianPower(enemyPower);
  
    }
  
  //set Creature's health
  public void setVillianEnergy(int enemyEnergy){
  
    this.enemyHealth = enemyEnergy;
   
  }
  
  //set Creature's attack power
  public void setVillianPower(int enemyPower){
  
  this.enemyAttack = enemyPower;
  
  }
  
  public int getVillianEnergy(){
  
   return enemyHealth;
   
  }
  
  public int getVillianPower(){
  
  return enemyAttack;
  
  }
    
  // Creates a loop until either Player or Creature health is lower than 0
  //Player and Creature rolls a dice if they hit 
  public String battle(){
  
  int inputIntensity = 0;
  String Skill = getExpertise();
  int heroHealth = getHitPoints();
  int heroAttack = getAttack();
  
  while(heroHealth >= 0 || enemyHealth >= 0){
   Random dice = new Random();
   int villianRoll = dice.nextInt(100)+1;
   int playerRoll = dice.nextInt(100)+1;
   String outcome;
   outcome="";
  
   
   if (playerRoll > 30){
         switch(Skill){
         case "Indie-Wrestler":
         outcome ="Zombie was successfully grabbed\n";
         
         inputIntensity+=1;
         setIntensity("",inputIntensity);
         getIntensity();
         enemyHealth-=heroAttack;
         
         break;
      
         case "All-State Football Player": 
          
          outcome = "Ball was thrown successfully at the zombie\n";
          break;
          
          default:
          break;    
         }
     }
   
   
   else{
   
      outcome="You: missed the zombie\n";
   }
   if (heroHealth <= 0 || enemyHealth <= 0){
      break;
   }
   
   else{
   }
   
   if (villianRoll > 20){
     
   heroHealth -= enemyAttack;
   outcome+="Zombie bit you";
   
   }
   
   else{
   
   outcome+="Zombie missed";
   
   }
   
   String result;
   Role Role1 = new Role();
   result= ""+getfirstName()+":"+heroHealth+"\n";
   result+= "Zombie:"+enemyHealth+"";
   JOptionPane.showMessageDialog(null, result);
   System.out.println(heroAttack);
   JOptionPane.showMessageDialog(null,outcome);
  }
   String afterBattle;
   afterBattle = "After the battle...";
   JOptionPane.showMessageDialog(null,afterBattle);
   return ".";
  
   
 }
public String toString(){
  
  String result;
  
  if (enemyHealth < getHitPoints()){
  
  result = "You won";
      
  }
  else{
  
   result = "You lost";
  }
  return result;
  }
 }




      
      
 
 
   
  
  
