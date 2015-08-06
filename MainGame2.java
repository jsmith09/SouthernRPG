//***********************************************************************************************
// * Assignment 4                                                                               *
// * Jesse Smith                                                                                *
// * Program that runs the Role and Battleprocess programs                                      *
//***********************************************************************************************

import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class MainGame2{
public static void main(String[]args){

   // Created reference variables for inputs of First Name, Last Name, Health, Expertise and Gender
   int inputHealth = 0;
   String inputFname;
   String inputLname;
   String inputExpertise;
   String inputGender;
   int inputAttack = 0;
   String inputChoice; 
   String inputSkill;
   
   JOptionPane.showMessageDialog(null, "Welcome to Backwoodz, a Modern Fantasy RPG in the American South!!!");
   
   // Create team with a role object array
   Role[] team = new Role [2];
   
   for(int teammate = 0; teammate < team.length; teammate++){
   
   if (teammate == 0){
   
      JOptionPane.showMessageDialog(null,"Select your character");
   }
   
   else{
   
      JOptionPane.showMessageDialog(null,"Select your partner");
   } 
   
   team[teammate]=new Role();
   
   // Asking for first name of character
   inputFname = JOptionPane.showInputDialog(null, "Choose a first name");
         
         // First Name cannot be over 15 or less than 1 characters in length or warning message comes up
         while (inputFname.length()> 15 || inputFname.length() < 1 ){
                   if (inputFname.length()> 15){
                        inputFname = JOptionPane.showInputDialog(null, "Pick a shorter name", "Character Name", 
                        JOptionPane.WARNING_MESSAGE);
                    }
                   
                  else{
                        inputFname = JOptionPane.showInputDialog(null, "You must create a first name", "Character Name", 
                        JOptionPane.WARNING_MESSAGE);
                        
                      }
                  
                
          }
               
   // Set First Name for Character                  
   team[teammate].setfirstName(inputFname);
   
   // Asking for last name of character
   inputLname = JOptionPane.showInputDialog(null, "Choose a last name?");
   
    // Last Name cannot be over 15 characters or less than 1 character in length or warning message comes up
        while (inputLname.length()> 15||inputLname.length() < 1 ){
                   if (inputLname.length()> 15){
                        inputLname = JOptionPane.showInputDialog(null, "Pick a shorter name", "Character Name", 
                        JOptionPane.WARNING_MESSAGE);
                    }
                   
                  else{
                        inputLname = JOptionPane.showInputDialog(null, "You must pick a last name", "Character Name", 
                        JOptionPane.WARNING_MESSAGE);
                      }
                        
          }
          
   // Set last name for character 
   team[teammate].setlastName(inputLname);
   
   // Create a array for selection of Expertise
   String[] Expert = {"All-State Football Player", "Indie-Wrestler"};
   
   // Selecting the Expertise of character
   inputExpertise = (String) JOptionPane.showInputDialog(null,"Who are you?", "Class", JOptionPane.INFORMATION_MESSAGE, null,Expert, Expert[0]);
   
   
   // Set the Expertise of character 
   team[teammate].setExpertise(inputExpertise);
   
  
  // Created a array for selection of gender
  String[] gen = {"Male", "Female"};
   
   // Selecting a gender for character 
   inputGender = (String) JOptionPane.showInputDialog(null,"What's your gender", "Gender", JOptionPane.INFORMATION_MESSAGE, null,
   gen, gen[0]);
   
   // Set gender of character 
   team[teammate].setGender(inputGender);
   
   // Selection of Expertise of character sets the health of the character and outputs a message
   if(inputExpertise == "All-State Football Player"){
      
         if (inputGender == "Female"){
         
             inputHealth = 100;
             inputAttack = 10;
             JOptionPane.showMessageDialog(null,"Rude Person: Honey, no one gonna pick up a girl football player", 
             "BackWoodz", JOptionPane.INFORMATION_MESSAGE);
             
             }
             
        else{
             inputAttack = 10;
             inputHealth = 100;
             JOptionPane.showMessageDialog(null, " A person stating the obvious:\n You blew out your knees, I guess no Heisman for you", 
             "BackWoodz", JOptionPane.INFORMATION_MESSAGE);
             
            }
      }
      
      else{
      
           if (inputGender == "Female"){
             inputAttack = 10;
             inputHealth = 100;
             JOptionPane.showMessageDialog(null, "Promotor: Welcome to Lousiana Championship Wrestling\n Our next show is in the Gaver Middle School gym\n The pay is $50.Better be ready to be eye candy", 
               "BackWoodz", JOptionPane.INFORMATION_MESSAGE);
             
             }
             
        else{
             inputAttack = 5;
             inputHealth = 100;
             JOptionPane.showMessageDialog(null, "Promotor: Look I put a hundred dollars into you moving to Lousiana Championship Wrestling\nn You better be worth the $50 dollars each night", 
             "BackWoodz", JOptionPane.INFORMATION_MESSAGE);
             
            }
      }
   
   // Sets health of character
   team[teammate].setHitPoints(inputHealth);
   team[teammate].setAttack(inputAttack);
   }
   // Display the information of the character object
   JOptionPane.showMessageDialog(null, team[0]);
   JOptionPane.showMessageDialog(null, team[1]);
   
   // Game Narrative
   JOptionPane.showMessageDialog(null, "You have just been hired to work the sewers.");
   
   JOptionPane.showMessageDialog(null, 
   "On your first day, the Supervisor said to remeber to use appropriate measures to seal the problem.");
   
   JOptionPane.showMessageDialog(null, 
   "In your orientation, you completely tuned out and forget what the appropriate measure was.");
   
    ImageIcon pic1 = new ImageIcon("I:/CIS106-4/Project/sewer.jpg");
    JOptionPane.showMessageDialog(null, "Your partner and you go alone into the sewers and hear a weird sound", 
    "sewers", JOptionPane.OK_OPTION, pic1);
   
    ImageIcon pic2 = new ImageIcon("I:/CIS106-4/Project/zombie.jpg");
    JOptionPane.showMessageDialog(null, "You approach the sound and see a rotting zombie coming toward you", 
    "sewers", JOptionPane.OK_OPTION, pic2);
   
   //Created an array for a string of choices
   String[] Choice1 = {"Attack", "Pull out a Banana"};
   
   //Player selects a choice 
   inputChoice = (String) JOptionPane.showInputDialog(null,"What do going to do?", "Choose", JOptionPane.INFORMATION_MESSAGE, null,Choice1, Choice1[0]);

   // Outcomes of  player's choice
   if (inputChoice == "Attack"){
   
   //Shows a message
   JOptionPane.showMessageDialog(null, "You are confronted by a Zombie");
   
   // Creates an array for battleprocess class
   Battleprocess2[] zombie = new Battleprocess2[2];
   
   // Two players fight a zombie
   for(int zom = 0; zom < zombie.length; zom++){
       
       zombie[zom] = new Battleprocess2();
       zombie[zom].setHitPoints(inputHealth);
       zombie[zom].setAttack(inputAttack);
       zombie[zom].setVillianEnergy(100);
       zombie[zom].setVillianPower(10);
       zombie[zom].battle();
       JOptionPane.showMessageDialog(null, zombie[zom]);
    }
    
    }
    
     else{
     
     // Game narrative
     JOptionPane.showMessageDialog(null, "He grabs you as you see the hunger in thier eyes");
     JOptionPane.showMessageDialog(null, "You now feel really stupid for pulling out a banana");
     JOptionPane.showMessageDialog(null, 
     "As you prepare for your stupdity to kill you,\n the zombie begins to peel the banana and eat it");
     JOptionPane.showMessageDialog(null, 
     "The zombie begin to smile, as cute as rotting corpses can. The job give you 50 dollars for the day. ");     
     
     }
     

   }
   }
      
   
   