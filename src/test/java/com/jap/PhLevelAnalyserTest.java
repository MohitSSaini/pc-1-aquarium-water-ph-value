package com.jap;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;


public class PhLevelAnalyserTest {
    PhLevelAnalyser phLevelAnalyser;
    
    /**
     * > This function sets up the test environment by creating a new instance of the PhLevelAnalyser class
     */
    @Before
    public void setUp ( ) {
        phLevelAnalyser = new PhLevelAnalyser ( );
    }
    
    @After
    public void tearDown ( ) {
        phLevelAnalyser = null;
    }
    
    @Test
    public void getPhValueOfWaterForInputPh7 ( ) {
        //arrange
        String expectedResult = "pH value is fine";
        //act
        String actualResult = phLevelAnalyser.getPhValueOfWater ( 7 );
        //assert
        Assertions.assertEquals ( expectedResult , actualResult );
        
    }
    
    @Test
    public void getPhValueOfWaterForInputPhEight ( ) {
        //arrange
        String expectedResult = "pH value is fine";
        //act
        String actualResult = phLevelAnalyser.getPhValueOfWater ( 8 );
        //assert
        Assertions.assertEquals ( expectedResult , actualResult );
        
    }
    
    @Test
    public void getPhValueOfWaterForInputPhTen ( ) {
        //Arrange
        String expextedResult = "pH value is high, partial water change required";
        //act
        String actualResult = phLevelAnalyser.getPhValueOfWater ( 10 );
        //assert
        Assertions.assertEquals ( expextedResult , actualResult );
    }
}