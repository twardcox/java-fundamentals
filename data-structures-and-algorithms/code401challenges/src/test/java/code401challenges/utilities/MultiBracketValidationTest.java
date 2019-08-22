package code401challenges.utilities;

import org.junit.Test;

import static org.junit.Assert.*;

public class MultiBracketValidationTest {

    @Test
    public void testMultiBracketValidation_Happy() {
        String input = "{)[[{Extra Characters]]";
        boolean result = MultiBracketValidation.multiBracketValidation(input);
        System.out.println(result);
    }
}