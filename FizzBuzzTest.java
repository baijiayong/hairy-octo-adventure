public class FizzBuzzTest extends BearUnitTest
{  
    public static void main(String[] args)
    {
        FizzBuzz fizzBuzz = new FizzBuzz();
        try
        {
            assertEquals("Fizz", fizzBuzz.say(3));
            assertEquals("Buzz", fizzBuzz.say(5));
            assertEquals("FizzBuzz", fizzBuzz.say(15));
            assertEquals("13", fizzBuzz.say(13));
            assertEquals("20", fizzBuzz.say(20));
        }
        catch(Exception e)
        {
            e.printStackTrace();
            System.out.println("test failed");
        }
        
        System.out.println(testReport());
    }      
}

