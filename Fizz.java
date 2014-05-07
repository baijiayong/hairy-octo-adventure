public class Fizz
{
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
        test("Fizz", 3);
    }   
    public static void test(String result, int num)
    {    
        if(result.equals(fizz(num)))
        {
            System.out.println("test success");
        }
        else 
        {
            System.out.println("test failed");
        }       
    }
    
    
}

