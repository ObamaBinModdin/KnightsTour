/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project3;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author oscar
 */
public class KnightUserTest {
    
    /**
     * Test of searchTour method, of class KnightUser.
     */
    @Test
    public void testSearchTour() {
        KnightUser ku=new KnightUser();
        Position pos=new Position();
        boolean result=ku.searchTour(new Knight(1,1,pos));
        
        assertEquals(true, result);
    }
    
    @Test
    public void testRun()
    {
        //KnightUser ku=new KnightUser();
        //ku.run();
        //fail("Not valid");
    }
    
}
