public class Fizz
{  
    public static void main(String[] args)
    {
        Test fizzTest = new Test();
        FizzBuzz fizzBuzz = new FizzBuzz();
        try
        {
            
            fizzTest.assertEquals("Fizz", fizzBuzz.say(3));
            fizzTest.assertEquals("Buzz", fizzBuzz.say(5));
            fizzTest.assertEquals("FizzBuzz", fizzBuzz.say(15));
            fizzTest.assertEquals("13", fizzBuzz.say(13));
            fizzTest.assertEquals("20", fizzBuzz.say(20));
        }
        catch(Exception e)
        {
            e.printStackTrace();
            System.out.println("test failed");
        }
        
        System.out.println("success:" + Test.success + "  failed:" + Test.failed);
    }      
}

