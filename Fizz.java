public class Fizz
{
    static int success;
    static int failed;
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
        try
        {
            test("Fizz", judgment(3));
            test("Buzz", judgment(5));
            test("FizzBuzz", judgment(15));
            test("13", judgment(13));
            test("20", judgment(20));
        }
        catch(Exception e)
        {
            e.printStackTrace();
            System.out.println("test failed");
        }
        
        System.out.println("success:" + success + "  failed:" + failed);
    }   
    public static void test(String expected, String result) throws Exception
    {    
        if(expected.equals(result))
        {
            success++;
            System.out.println("test success");
        }
        else 
        {
            failed++;
            throw new Exception();
        }       
    }
    
    
}

