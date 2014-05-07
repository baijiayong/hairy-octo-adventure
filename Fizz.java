public class Fizz
{
    
    public static String judgment(int i)
    {
            if(i % 3 == 0 && i % 5 == 0)
            {
                return "FizzBuzz";
            }
            else if(i % 3 == 0 && i % 5 != 0)
            {
                return "Fizz";
            }
            else if(i % 5 == 0 && i % 3 != 0)
            {
                return "Buzz";
            }
            else
            {
                return String.valueOf(i);
            }

    }
    
    
    
    
    
    public static void main(String[] args)
    {
        Test fizzTest = new Test();
        try
        {
            
            fizzTest.test("Fizz", judgment(3));
            fizzTest.test("Buzz", judgment(5));
            fizzTest.test("FizzBuzz", judgment(15));
            fizzTest.test("13", judgment(13));
            fizzTest.test("20", judgment(20));
        }
        catch(Exception e)
        {
            e.printStackTrace();
            System.out.println("test failed");
        }
        
        System.out.println("success:" + Test.success + "  failed:" + Test.failed);
    }      
}

