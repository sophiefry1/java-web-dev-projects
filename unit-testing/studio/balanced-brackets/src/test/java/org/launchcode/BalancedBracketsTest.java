package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }
    @Test
   public void onlyBracketReturnsFalse() {
       assertFalse(BalancedBrackets.hasBalancedBrackets("["));
   }
     @Test
     public void onlyBracketReturnsFalse1() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]]"));
     }
    @Test
    public void onlyBracketReturnsFalse2(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[["));
    }
    @Test
    public void onlyBracketReturnsTrue1(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"), "[]");
    }
    @Test
    public void onlyBracketReturnsFalse3(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[]", "[]", "[]"));
    }
    @Test
    public void onlyBracketReturnsTrue4(){
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }
    @Test
    public void onlyBracketReturnsFalse4(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[["));
    }
    @Test
    public void onlyBracketReturnsFalse5(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]]"));
    }
    @Test
    public void onlyBracketReturnsFalse6(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]]"), "[[");
    }
    @Test
    public void onlyBracketReturnsTrue5(){
        assertTrue(BalancedBrackets.hasBalancedBrackets(""), "");
    }
   @Test

       public void emptyTest() {assertEquals(true, true);
       }

    private void assertEquals(boolean b, boolean b1) {
    }
}

   