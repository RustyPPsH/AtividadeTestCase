package calculadora;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import junit.framework.JUnit4TestAdapter;

import calculadora.TestCalculadora;
/**
 *
 * @author Rafael Sonoki
 */
@RunWith(Suite.class)
@SuiteClasses({TestCalculadora.class})
public class TestSuite {
    
    public static junit.framework.Test suite() {
        return new JUnit4TestAdapter (TestSuite.class);
    }
    
}
