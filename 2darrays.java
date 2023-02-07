//name: nathan
//date started: jan 27 2023 / date completed:
//2d arrays
package pkg2darraysassignment;

import java.util.Scanner;



public class Main {
    private static String Display(int rc[][], int rows, int columns) {

        String dumb ="";
        int output = 0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                dumb = dumb + rc[i][j]+ " ";
            }
            dumb = dumb + "\n";
        }
        return dumb;
}
    
    public static void main(String[] args) {
        //variables
        int rows = 0;
        int columns = 0;
        //Scanners
        
        //user inputs for rows and columns
        
        //rows
        do{
            do{
                try{
                    Scanner scan = new Scanner(System.in);
                    
                    System.out.println("How many rows you want.");

                    rows = scan.nextInt();

                    if(rows<0){
                        System.out.println("you can't have negative rows");
                    }
                    
                    }catch(Exception e){
                        System.out.println("input a valid integer C:");
                    }  
            }while(rows<=0);

            //columns
            do{
                try{
                Scanner scan = new Scanner(System.in);
                
                System.out.println("HOW MANY COLUMNS.");
                columns = scan.nextInt();

                if(columns<0){
                    System.out.println("You can't have negative columns");
                }
                
                
                }catch(Exception e){
                    System.out.println("input a valid integer");
                }
            }while(columns<=0);
            
            

                //gets random numbers from 1-9
                int rdmInt = 0;

                //array
                int[][] rc = new int[rows][columns];
                

            for(int i=0;i<rows;i++){
                for(int j=0;j<columns;j++){
                    //random integers for rows and columns
                    rdmInt = getRandomInteger(0,9);

                    rc[i][j] = rdmInt;
                }
            }


                
                //need to loop
                int choice = 0;
                do{
                    try{
                        Scanner scan = new Scanner(System.in);
                    //options list
                        System.out.println("Select an option:"
                            + "\n1. View your list"
                            + "\n2. Change a value at a specific coordinate"
                            + "\n3. Calculate average of whole list"
                            + "\n4. Calculate average of a row"
                            + "\n-1 to exit");
                        
                        //scanner for choice
                        choice = scan.nextInt();
                        
                        //print array
                        if(choice==1){
                            String dumb = Display(rc, rows, columns);
                            System.out.println(dumb);
                        }
                        
                        //change coords
                        //var to store
                        int newcoord = 0;
                        int newPointR = 0;
                        int newPointC = 0;
                        int newInt = 0;
                        if(choice==2){
                            
                            System.out.println("Which point would you like to change?"
                                    + "\n Enter row number");
                            newPointR = scan.nextInt();
                            
                            System.out.println("Enter column number");
                            newPointC = scan.nextInt();
                            
                            System.out.println("What would you like to replace this integer with?");
                            newInt = scan.nextInt(); 
                            
                            rc[newPointR-1][newPointC-1] = newInt;
                            
                            }
                        
                        
                        //average of list
                        
                        if(choice==3){
                            int average = 0;
                            for(int i = 0; i<rc.length;i++){
                                for(int j=0;j<rc.length;j++){
                                    average = average + rc[i][j];
                                }
                            }
                            System.out.println("The average of your list is: "+average);
                        }
                        
                        //average of row
                        if(choice==4){
                            int Avg=0;
                            int averageRow = 0;
                            System.out.println("Which row would you like to get the average of?");
                                int rowAvg = scan.nextInt();
                                
                                
                            
                            if(!(rowAvg<rc.length&&rowAvg>rc.length)){
                                for(int i =0;i<rc.length;i++)
                                     Avg = Avg + rc[rowAvg][0];
                                    System.out.println("The average of this row is: " + Avg);
                            }
                            if(rowAvg>rc.length || rowAvg<rc.length){
                                System.out.println("enter integer less than or equal to the amount of rows you have");
                            }
                        }
                        if(choice==-1){
                            System.out.println("byebye");
                            String dumb = Display(rc, rows, columns);
                            System.out.println(dumb);
                            System.exit(0);
                        }
                        
                    }catch(Exception e){
                        System.out.println("please input a valid integer");
                    }
                }while(choice >= 0 || choice <= 5);
            
            
    }while(rows <=0 || columns <=0);
        }      

    //max and min of rand
    public static int getRandomInteger(int maximum, int minimum){ 
        return ((int) (Math.random()*(maximum - minimum))) + minimum;
    }
}

