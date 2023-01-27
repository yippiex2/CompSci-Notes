/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Roboto;


public class RobotCmds {
    String name;
    int age;
    String[] mood = {"Happy","Sad","Angry","Disgusted"};
    String greeting;


        public RobotCmds (String n, int a, String g, String[] m) {
            this.name = n;
            this.age = a;
            this.mood = m;
            this.greeting = g;
        } 
  
        public RobotCmds(){ 
            this.name = "John";
            this.age = 500;
            this.greeting = ("Hello fam, how are you today?");
            
        } 
        //constructor for a robot with predetermined information 
        public void setName(String newName) {
            this.name = newName;
        } 
        //sets the robot name to newName 
        public String getName(){
            return this.name;
        } 
        //returns the robot name 
        public void setAge(int a) { 
            this.age = a;
        } 
        //sets the robot age to newAge 
        public int getAge() { 
            return this.age;
        } 
        //returns the robot age 
        public String greetUser(){
            return this.greeting;
        }
        //returns a greeting to the user 
        public String getCurrentMood() {
            int idx = (int)(Math.random()*this.mood.length);
            String a = mood[idx];
            //returns a random mood, this should change periodically 
            return a; 
        }         

}
