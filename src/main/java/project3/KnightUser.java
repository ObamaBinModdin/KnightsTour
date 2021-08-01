/**
 * Project: Project3                  
 * Completion time: 16 hours
 * 
 * Honor Code: “I pledge that I have neither given nor received help from anyone
 * other than the instructor or the TAs for all program components included here.”
 */
package project3;

import java.util.Scanner;

/**
 *
 * @author oscar
 */
public class KnightUser 
{
    public static void main(String[] args) 
    {
        new KnightUser().run();
    }//main method.
    
    public void run()
    {
        Scanner keyboard=new Scanner(System.in);
        int row,column, posRow, posColumn;
              
        System.out.println("A Knight's Tour");
        System.out.println("----------------------------");
        
        try
        {
            System.out.println("Enter a row size: ");  
            row=keyboard.nextInt();
        }catch(IllegalArgumentException e)
        {
            System.out.println("ERROR: ONLY POSITIVE WHOLE NUMBERS");
            throw e;
        }
        
        try
        {
            System.out.println("Enter a column size: ");  
            column=keyboard.nextInt();
        }catch(IllegalArgumentException e)
        {
            System.out.println("ERROR: ONLY POSITIVE WHOLE NUMBERS");
            throw e;
        }
        
        try
        {
            System.out.println("Enter an x position within "+row+"x"+column+": ");  
            posRow=keyboard.nextInt();
            
            if(posRow!=0)
            {
                posRow=posRow-1;
            }
            
            if(posRow>=row)
            {
                throw new ArrayIndexOutOfBoundsException();
            }
        }catch(IllegalArgumentException e)
        {
            System.out.println("ERROR: ONLY POSITIVE WHOLE NUMBERS WITHIN "+ row+"x"+column);
            throw e;
        }
                
        try
        {
            System.out.println("Enter a y position within "+row+"x"+column+": ");  
            posColumn=keyboard.nextInt();
            
            if(posColumn!=0)
            {
                posColumn=posColumn-1;
            }
            
            if(posColumn>=column)
            {
                throw new ArrayIndexOutOfBoundsException();
            }
        }catch(IllegalArgumentException e)
        {
            System.out.println("ERROR: ONLY POSITIVE WHOLE NUMBERS WITHIN "+ row+"x"+column);
            throw e;
        }
        
        Position position=new Position(posRow,posColumn);
        Knight knight=new Knight(row,column,position);
        
        new KnightUser().searchTour(knight);
        System.out.println();
        System.out.println(knight.toString());
        
    }//run() method. Allows user input via keyboard for parameters.
    
    
    public boolean searchTour(Knight knight)
    {
        Position start=knight.getStart();
        BackTrack backTrack = new BackTrack(knight);
        if(knight.isGoal(start)||backTrack.tryToReachGoal(start))
        {
            return true;
        }
        knight.markAsDeadEnd(start);
        return false;
    }//SearchTour() method. Plays knight's tour.
}
