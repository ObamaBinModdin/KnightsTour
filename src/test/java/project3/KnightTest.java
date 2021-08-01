/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project3;



import java.util.Iterator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;

/**
 *
 * @author oscar
 */
public class KnightTest {

    
    public KnightTest() {
    }
    

    /**
     * Test of getStart method, of class Knight.
     */
    @Test
    @DisplayName("getStart() test returns Position object")
    public void testGetStart() {
        Position pos=new Position(0,2);
        Knight knightTest= new Knight(6,6, pos);
        System.out.println("getStart");
        Position result=knightTest.getStart();
        assertSame(pos,result);
    }

    /**
     * Test of getGrid method, of class Knight.
     */
    @Test
    @DisplayName("getGrid() test returns byte[][]")
    public void testGetGrid() {
        Position pos=new Position(0,0);
        Knight knightTest= new Knight(1,1, pos);
        byte[][] expResult = {{0}};
        byte[][] result = knightTest.getGrid();
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of isOkay method, of class Knight.
     */
    @Test
    @DisplayName("isOK(Position) test returns boolean")
    public void testIsOK() {
        Position pos=new Position(1,2);
        Knight knightTest= new Knight(6,6, pos);
        boolean expResult = true;
        Position pos2=new Position(3,3);
        boolean result = knightTest.isOK(pos2);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of isGoal method, of class Knight.
     */
    @Test
    @DisplayName("isGoal(Position) test returns boolean")
    public void testIsGoal(){
        Position pos=new Position(0,0);
        Knight knightTest= new Knight(1,1, pos);
        boolean result=knightTest.isGoal(pos);
        assertEquals(true, result);
    }

    /**
     * Test of markAsPossible method, of class Knight.
     */
    @Test
    @DisplayName("markAsPossible(Position) test")
    public void testMarkAsPossible() {
        Position pos=new Position(0,0);
        Knight knightTest= new Knight(6,6, pos);      
        knightTest.markAsPossible(pos);
        int expResult=1;
        int result= knightTest.grid[0][0];
        assertEquals(expResult, result);
    }

    /**
     * Test of markAsDeadEnd method, of class Knight.
     */
    @Test
    @DisplayName("markAsDeadEnd(Position) test returns boolean")
    public void testMarkAsDeadEnd() {
        Position pos=new Position(0,0);
        Knight knightTest= new Knight(1,1, pos);
        knightTest.previous=new Position(1,1);
        knightTest.markAsDeadEnd(pos);
        assertNotNull(knightTest.current);
    }

    /**
     * Test of toString method, of class Knight.
     */
    @Test
    @DisplayName("toString() test returns String")
    public void testToString() {
        Position pos=new Position(1,2);
        Knight knightTest= new Knight(6,6, pos);
        String result = knightTest.toString();
        assertNotNull(result); 
    }
    
    /**
     * Test of iterator method, of class Knight.
     */
    @Test
    @DisplayName("iterator(Position) test returns Iterator<Position>")
    public void testIterator(){
        Position pos=new Position(1,2);
        Knight knightTest= new Knight(6,6, pos);
        Iterator<Position> result=knightTest.iterator(pos);
        assertNotNull(result);
    }
    
}
