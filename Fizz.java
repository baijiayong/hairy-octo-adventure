public class Fizz
{
    static int success;
    static int failed;
    public static String fizz(int i)
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
            test("Fizz", 3);
            test("Buzz", 5);
            test("FizzBuzz", 15);
            test("13", 13);
            test("20", 20);
        }
        catch(Exception e)
        {
            System.out.println("test failed");
        }
        
        System.out.println("success:" + success + "  failed:" + failed);
    }   
    public static void test(String result, int num) throws Exception
    {    
        if(result.equals(fizz(num)))
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

