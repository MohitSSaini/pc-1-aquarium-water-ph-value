package com.jap;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;



public class PhLevelAnalyserTest {
    PhLevelAnalyser phLevelAnalyser;

    @Before
    public void setUp()  {
      phLevelAnalyser = new PhLevelAnalyser();
    }

    @After
    public void tearDown()  {
        phLevelAnalyser = null;
    }
    
    @Test
    public void getPhValueOfWaterForInputPh7 ( ) {
        //arrange
        String expectedResult ="pH value is fine";
        //act
        String actualResult = phLevelAnalyser.getPhValueOfWater( 7 );
        //assert
        Assertions.assertEquals(expectedResult,actualResult);
    
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
   
    
}