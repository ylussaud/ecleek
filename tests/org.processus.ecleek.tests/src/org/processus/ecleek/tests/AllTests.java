package org.processus.ecleek.tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses(value = { ParsingTests.class, ValidatingTests.class, })
public class AllTests {

}
