import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.util.List;


public class ListTests {

    @Test 
	public void testReverseInPlace() {
        int[] input1 = {1,2,3,4,5,6};
        ArrayExamples.reverseInPlace(input1);
        assertArrayEquals(new int[]{6,5,4,3,2,1}, input1);
	}

	@Test 
	public void testMerge() {
        List<String> input1 = new ArrayList<String>();
        input1.add("a");
        input1.add("b");
        input1.add("c");
        List<String> input2 = new ArrayList<String>();
        input2.add("b");
        input2.add("c");
        input2.add("d");
        List<String> result = new ArrayList<String>();
        result = ListExamples.merge(input1, input2);
        /*
        result.add("a");
        result.add("b");
        result.add("b");
        result.add("c");
        result.add("c");
        result.add("d");
        */
        //System.out.println(result.toString());
        assertEquals("[a, b, b, c, c, d]", result.toString());
	}
}
