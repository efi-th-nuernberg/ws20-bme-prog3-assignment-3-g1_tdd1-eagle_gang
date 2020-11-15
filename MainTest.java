import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {
  @Test
  public void testNothing(){}

  @Test
  public void testSomeStuff(){
    // Test 1
    assertTrue("Wrong Statement", 2 + 3 == 5);

    // Test 2
    String test = "test";
    assertNotNull("Wrong Statement", test);
    
    // Test 3
    assertTrue("Wrong Statement", 37 < 45);
  }
}
