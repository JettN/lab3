import static org.junit.Assert.*;

import java.beans.Transient;

import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testMyReverseInPlace(){
    int[] input = {1, 2, 3, 4};
    ArrayExamples.reverseInPlace(input);
    assertArrayEquals(new int[]{4 , 3, 2, 1}, input);
  }

  @Test
  public void testMyReversed(){
    int[] input = {1, 2, 3, 4};
    assertArrayEquals(new int[]{4, 3, 2, 1}, ArrayExamples.reversed(input));
  }

  @Test
  public void testAverageWithoutLowest(){
    double[] input = {1, 1, 1, 1};
    double output = ArrayExamples.averageWithoutLowest(input);
    assertEquals(1.0, output, 0);
  }
}
