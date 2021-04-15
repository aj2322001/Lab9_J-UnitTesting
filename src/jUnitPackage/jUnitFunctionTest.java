package jUnitPackage;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)

@Suite.SuiteClasses({testAddNumbers.class, testAddStrings.class})
public class jUnitFunctionTest {

}