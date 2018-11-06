package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class ParenCheckerTest {

    @Test
    public void parensTest(){
        //when
        String testString = "(lets try this)";
        boolean test = ParenChecker.isParenMatch(testString);
        System.out.println(test);

        Assert.assertTrue(test);

    }

    @Test
    public void bracketTest(){
        String testString = "[tax]";
        boolean test = ParenChecker.isParenMatch(testString);

        Assert.assertTrue(test);
    }

    @Test
    public void bracesTest(){
        String testString = "{smile}";
        boolean test = ParenChecker.isParenMatch(testString);

        Assert.assertTrue(test);
    }

    @Test
    public void arrowTest(){
        String testString = "<iamgreaterthanandlessthan>";
        boolean test = ParenChecker.isParenMatch(testString);

        Assert.assertTrue(test);
    }

    @Test
    public void quoteTest(){
        String testString = "\"don't quote me boy cause I ain't said ****\"";
        boolean test = ParenChecker.isParenMatch(testString);

        Assert.assertTrue(test);
    }

    @Test
    public void apostropheTest(){
        String testString = "'shortened words'";
        boolean test = ParenChecker.isParenMatch(testString);

        Assert.assertTrue(test);
    }

    @Test
    public void shouldntPass(){
        String testString = "(])";
        boolean test = ParenChecker.isParenMatch(testString);

        Assert.assertTrue(!test);
    }

    @Test
    public void emptyTest(){
        String testString = "";
        boolean test = ParenChecker.isParenMatch(testString);

        Assert.assertTrue(test);
    }

    @Test
    public void singleParenTest(){
        String testString = ")";
        boolean test = ParenChecker.isParenMatch(testString);

        Assert.assertTrue(!test);
    }


}