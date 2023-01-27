/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Roboto;


/**
 *
 * @author student
 */
public class SuperRobot { 
//constructor for an empty robot 
String name;
int age;
String[] greeting = {"Hello user, welcome to the matrix. How are you?", "Hey, how you doin?", "Heyyy", "I am not real. Hru?", "try not to call chucky at 3 am challenge. How are you feeling today?"};
String[] mood = {"Happy","Sad","Angry","Disgusted","Ambatukamu"};

public SuperRobot (String name, int age) {
    this.name = name;
    this.age = age;

} 
//constructor for a robot with predetermined information 

public String[] greetUser() {
    return this.greeting;
} 

//returns a greeting to the user 

public void greetUser(String input) {
    System.out.println(input + "\nsaid by " + this.name);  
} 
//returns a greeting to the user based on the string add “said by” + robots name

public void greetUser(int index) {
    int idx = (int)(Math.random()*this.greeting.length);
    String greetDefault = greeting[idx];
    
    System.out.println(greetDefault);
} 
//returns a greeting to the user from at least 5 different predetermined responses from the SuperRobot, you can make these up


public String getCurrentMood() {
    int idx = (int)(Math.random()*this.mood.length);
    String moodRand = mood[idx];
    return moodRand;
} 
//returns a random mood, this should change periodically  
public void getCurrentMood(int moodIndex) {
    if(moodIndex == 1 ){
        
    }
} 
//returns a specific mood corresponding to the moodIndex, this should  change periodically 
}