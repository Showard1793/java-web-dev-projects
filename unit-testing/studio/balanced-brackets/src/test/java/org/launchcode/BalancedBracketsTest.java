package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

// Cases to catch
//TRUE
    //   []
    //   word[]
    // char validBracket = "["
    // char inValidBracket = "]"
//FALSE
    //   ] [ ] [ ] [
    //


//

class BalancedBracketsTest {
    //TODO: add tests here

    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }


    @Test
    public void hasBalancedBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void bracketOutOfOrderTest() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void inequalNumOfBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[]["));
    }

    @Test
    public void lettersBeforeArrayTest() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("whatever your heart desires [ ]"));
    }

    @Test
    public void lettersAfterArrayTest() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(" [ ] whatever your heart desires"));
    }

    @Test
    public void lettersInArrayTest() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("whatever your [heart] desires  "));
    }

    @Test
    public void emptyStringTest() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void emptySpaceTest() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(" "));
    }

    @Test
    public void charactersWithNoBracketsTest() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("live laugh love LaunchCode"));
    }

    @Test
    public void smooshedCharactersTest() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("livelaughlove[]LaunchCode"));
    }

    @Test
    public void theTwelfthTest() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("livelaughlove][LaunchCode"));
    }









//    @Test
//    public void inValidFirstBracketTest(String str) {
//        int i = 0;
//                for (char ch : str.toCharArray()){
//           i++;
//           if (i == 1 && ch = "]")
//                }
//        assertEquals(true, true);
//    }

}

