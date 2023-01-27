//Name: Nathan Eung
//Date Started: January 9 - Date Completed:
//Rbobot
package Roboto;

import java.util.Scanner;

public class Robot {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        //creates an instance of the robot without any predetermined  information 
        RobotCmds newRobot = new RobotCmds();
        
        //setting attributes of the robot 
        newRobot.setName("Mr. Robot"); 
        newRobot.setAge(13); 
        //recall its information and output to the screen 
        System.out.println(newRobot.greetUser()); //greet user should  //say something like  
        //“Hello, I am a robot” 
        System.out.println("My name is " + newRobot.getName()); 
        System.out.println("I am feeling " + newRobot.getCurrentMood());
        System.out.println(newRobot.getAge());
    }
}


