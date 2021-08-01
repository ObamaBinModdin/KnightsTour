package project3;

import java.util.*;

/**
 *
 * @author oscar
 */
public class Knight implements Application 
{
    public Iterator<Position> iterator(Position position)
    {
        return new KnightIterator (position);
    }//Iterator of type Position

    
    public class KnightIterator implements Iterator<Position>
    {       
        protected int row, column, counter;
        
        KnightIterator(Position position)
        {
            row=position.getRow();
            column=position.getColumn();
            counter=0;
        }//KnightIterator constructor. Takes in Position object as parameter.
        
        public boolean hasNext()
        {
            return counter<8 && (grid.length*grid[0].length)!=count;
        }//hasNext() returns boolean. Allows 8 iterations.
        
        public Position next()
        {
            Position nextPosition=new Position();
            
            int xValues[] = {2,1,-1,-2,-2,-1,1,2};
            int yValues[] = {1,2,2,1,-1,-2,-2,-1};
            
            int nextX,nextY;
            switch(counter)
            {
                case 0:
                    nextX=row+xValues[counter];
                    nextY=column+yValues[counter];
                    counter++;
                    if(nextX<grid.length&&nextX>=0&&nextY<grid[0].length&&nextY>=0)
                    {
                        nextPosition=new Position(nextX,nextY);
                        current=new Position(nextX,nextY);
                        previous= new Position(row,column);
                        break;
                    }
                case 1:
                    nextX=row+xValues[counter];
                    nextY=column+yValues[counter];
                    counter++;
                    if(nextX<grid.length&&nextX>=0&&nextY<grid[0].length&&nextY>=0)
                    {
                        nextPosition=new Position(nextX,nextY);
                        current=new Position(nextX,nextY);
                        previous= new Position(row,column);
                        break;
                    }
                case 2:
                    nextX=row+xValues[counter];
                    nextY=column+yValues[counter];
                    counter++;
                    if(nextX<grid.length&&nextX>=0&&nextY<grid[0].length&&nextY>=0)
                    {
                        nextPosition=new Position(nextX,nextY);
                        current=new Position(nextX,nextY);
                        previous= new Position(row,column);
                        break;
                    }
                case 3:
                    nextX=row+xValues[counter];
                    nextY=column+yValues[counter];
                    counter++;
                    if(nextX<grid.length&&nextX>=0&&nextY<grid[0].length&&nextY>=0)
                    {
                        nextPosition=new Position(nextX,nextY);
                        current=new Position(nextX,nextY);
                        previous= new Position(row,column);
                        break;
                    }
                case 4:
                    nextX=row+xValues[counter];
                    nextY=column+yValues[counter];
                    counter++;
                    if(nextX<grid.length&&nextX>=0&&nextY<grid[0].length&&nextY>=0)
                    {
                        nextPosition=new Position(nextX,nextY);
                        current=new Position(nextX,nextY);
                        previous= new Position(row,column);
                        break;
                    }
                case 5:
                    nextX=row+xValues[counter];
                    nextY=column+yValues[counter];
                    counter++;
                    if(nextX<grid.length&&nextX>=0&&nextY<grid[0].length&&nextY>=0)
                    {
                        nextPosition=new Position(nextX,nextY);
                        current=new Position(nextX,nextY);
                        previous= new Position(row,column);
                        break;
                    }
                case 6:
                    nextX=row+xValues[counter];
                    nextY=column+yValues[counter];
                    counter++;
                    if(nextX<grid.length&&nextX>=0&&nextY<grid[0].length&&nextY>=0)
                    {
                        nextPosition=new Position(nextX,nextY);
                        current=new Position(nextX,nextY);
                        previous= new Position(row,column);
                        break;
                    }
                case 7:
                    nextX=row+xValues[counter];
                    nextY=column+yValues[counter];
                    counter++;
                    if(nextX<grid.length&&nextX>=0&&nextY<grid[0].length&&nextY>=0)
                    {
                        nextPosition=new Position(nextX,nextY);
                        current=new Position(nextX,nextY);
                        previous= new Position(row,column);
                        break;
                    }
            }
            return nextPosition;
        }//Next() returns Position. Determines the next position.
    }//KnightIterator class. Nested class.
    
    protected Position start;
    protected byte[ ][ ] grid;
    protected static int count=0;
    protected ArrayList<Position> dead=new ArrayList<Position>();
    protected Position previous;
    protected Position current;//Declaration of class varaibles
    
    public Knight(int xSize, int ySize, Position startingPos)
    {
        grid= new byte[xSize][ySize];
        
        for(int x=0; x<grid.length;x++)
        {
            for(int y=0;y<grid[0].length;y++)
            {
                grid[x][y]=-1;
            }
        }
        
        current=new Position(startingPos.row, startingPos.column);
        previous=new Position();
        start=startingPos;
        grid[start.getRow()][start.getColumn()]=0;
    }//Knight constructor. Takes in two ints and a Position object. Creates a grid (Chessboard).
    
    public Position getStart()
    {
        return start;
    }//getStart() method. Returns first position as Position object.
    
    public byte[][] getGrid()
    {
        byte[][] copy=new byte[grid.length][grid[0].length];
       
        
        for(int x=0;x<grid.length;x++)
        {
            for(int y=0;y<grid[0].length;y++)
            {
                copy[x][y]=grid[x][y];
            }
        }
        
        return copy;
    }//getGrid() method. Returns a two-dimensional array of type byte. Creates a copy of grid[][].
    
    public boolean isOK(Position position)
    {
        int xValues[] = {2,1,-1,-2,-2,-1,1,2};
        int yValues[] = {1,2,2,1,-1,-2,-2,-1};
        
        
        
        if (!dead.contains(position) && position.getRow()>=0 && position.getRow()<grid.length &&
                position.getColumn()>=0 && position.getColumn()<grid[0].length &&
                grid[position.getRow()][position.getColumn()]==-1 && ((position.row+xValues[0]>=0 && position.column+yValues[0]>=0) ||(position.row+xValues[1]>=0 && position.column+yValues[1]>=0)
                || (position.row+xValues[3]>=0 && position.column+yValues[3]>=0) || (position.row+xValues[4]>=0 && position.column+yValues[4]>=0)
                || (position.row+xValues[2]>=0 && position.column+yValues[2]>=0) || position.row+xValues[5]>=0 && position.column+yValues[5]>=0 || 
                (position.row+xValues[6]>=0 && position.column+yValues[6]>=0) || (position.row+xValues[7]>=0 && position.column+yValues[7]>=0))
                && ((position.row+xValues[0]<grid.length && position.column+yValues[0]<grid[0].length) ||(position.row+xValues[1]<grid.length && position.column+yValues[1]<grid[0].length)
                || (position.row+xValues[3]<grid.length && position.column+yValues[3]<grid[0].length) || (position.row+xValues[4]<grid.length && position.column+yValues[4]<grid[0].length)
                || (position.row+xValues[2]<grid.length && position.column+yValues[2]<grid[0].length) || position.row+xValues[5]<grid.length && position.column+yValues[5]<grid[0].length || 
                (position.row+xValues[6]<grid.length && position.column+yValues[6]<grid[0].length) || (position.row+xValues[7]<grid.length && position.column+yValues[7]<grid[0].length)))
        {
            count++;
            return true;
        }
        else
        {
            return false;
        }
    }//isOkay() method takes in Position object. Checks to see if the next possible position is valid. Returns boolean.
    
    public boolean isGoal(Position position)
    {       
        if((grid.length*grid[0].length)==count)
        {
            return true;
        }
        else
        {
            return false;
        }
    }//isGoal() method. Takes in Position object as a parameter and determines if knight's tour is over.
    
    public void markAsPossible(Position position)
    { 
        grid[position.row][position.column]=(byte)count;
    }//markAsPossible() method. Takes in Position object as parameter. Marks a position as a possible next move.
    
    public void markAsDeadEnd(Position position)
    {
        //grid[position.row][position.column]=-3;
        dead.add(new Position(current.row,current.column));
        current=new Position(previous.row, previous.column);
    }//markAsDeadEnd() method. Takes in Position object as parameter. Retracts to previous position.
    
    public String toString()
    {
        String str="";
        
        for(int x=0; x<grid.length;x++)
        {
            for(int y=0;y<grid[0].length;y++)
            {
                str+=grid[x][y]+ "\t";
            }
            str+="\n";
        }
        
        return str;
    }//toString() method. Returns String. Converts grid[][] (chessboard) to a row and column format to be outputted.
}
