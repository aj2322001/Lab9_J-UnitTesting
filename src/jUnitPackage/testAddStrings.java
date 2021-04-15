package jUnitPackage;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class testAddStrings {

    @Test
    public void test() {
        jUnitFunction jUnitStrFun = new jUnitFunction();
        String resultStr = jUnitStrFun.addStrings("str1", "str2");
        assertEquals("str1str2", resultStr);
    }
}