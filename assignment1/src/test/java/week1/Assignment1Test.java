import org.junit.Test;
import static org.junit.Assert.assertEquals;

import week1.Assignment1;

public class Assignment1Test {

  static final double DELTA = 0.00001;

  @Test
  public void testAdd() {
    assertEquals(5.0, Assignment1.add(2.0, 3.0), DELTA);
  }

  @Test
  public void testDivide() {
    assertEquals(1.008547, Assignment1.divide(236, 234), DELTA);
    assertEquals(-1, Assignment1.divide(1, 0));
  }
  @Test
  public void testSwap() {
    assertEquals(3,Assignment1.swap(2,5),DELTA);
    assertEquals(5,Assignment1.swap(-3,2),DELTA);

  }
  @Test
  public void testModullo(){
    assertEquals(2,Assignment1.modullo(2,5),DELTA);
    assertEquals(1,Assignment1.modullo(7,6),DELTA);
    assertEquals(-1,Assignment1.swap(13,0),DELTA);
  }
  @Test
  public void testHCF(){
    assertEquals(4,Assignment1.HCF(12,4),DELTA);
    assertEquals(1,Assignment1.HCF(2,5),DELTA);
  }
  @Test
  public void testLCM(){
    assertEquals(40,Assignment1.LCM(8,5),DELTA);
    assertEquals(60,Assignment1.LCM(12,10),DELTA);

  }

  @Test
  public void testFibonacci() {
    assertEquals("12586269025", Assignment1.fibonacci(50).toPlainString());
  }

  @Test
  public void testLargeFibonacci() {
    assertEquals("280571172992510140037611932413038677189525", Assignment1.fibonacci(200).toPlainString());
  }

  @Test
  public void testFactorial() {
    assertEquals(5040L, Assignment1.factorial(7));
    assertEquals(2432902008176640000L, Assignment1.factorial(20));
  }

  @Test
  public void testFactorialOverFlow() {
    assertEquals(-1, Assignment1.factorial(30));
  }
}
