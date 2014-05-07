public class FizzBuzzTest extends BearUnitTest
{  
    public void test() throws Exception
    {
        FizzBuzz fizzBuzz = new FizzBuzz();

        assertEquals("Fizz", fizzBuzz.say(3));
        assertEquals("Buzz", fizzBuzz.say(5));
        assertEquals("FizzBuzz", fizzBuzz.say(15));
        assertEquals("13", fizzBuzz.say(13));
        assertEquals("20", fizzBuzz.say(20));
    }      
}

