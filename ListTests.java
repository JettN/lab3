import static org.junit.Assert.*;

import java.beans.Transient;

import org.junit.*;

import java.util.ArrayList;
import java.util.List;

public class ListTests {
    @Test
    public void testFilter(){
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("hello");
        list.add("goodbye");
        list.add("Hello");
        list.add("Hello");
        
        List<String> output = ListExamples.filter(list, new StringChecker(){
            public boolean checkString(String s){
                if(s.equals("Hello")||s.equals("hello")){
                    return true;
                }
                else{
                    return false;
                }
            }
        });

        List<String> expected = new ArrayList<>();
        expected.add("Hello");
        expected.add("hello");
        expected.add("Hello");
        expected.add("Hello");
        

        assertEquals(expected, output);
    }

    @Test
    public void testMerge(){
        List<String> list1 = new ArrayList<>();
        list1.add("apple");
        list1.add("banana");

        List<String> list2 = new ArrayList<>();
        list2.add("apple");
        list2.add("baby");
        list2.add("child");

        List<String> output = ListExamples.merge(list1, list2);

        List<String> expected = new ArrayList<>();
        expected.add("apple");
        expected.add("baby");
        expected.add("banana");
        expected.add("child");

        assertEquals(expected, output);
    }
    }
