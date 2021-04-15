package jUnitPackage;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class testAddNumbers {
    @Test
    public void test(){
        jUnitFunction jUnitFun = new jUnitFunction();
        int resultNum = jUnitFun.addNumbers(100, 200);
        assertEquals(300, resultNum);
    }
}