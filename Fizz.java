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
        test("Buzz", 5);
        test("FizzBuzz", 15);
        test("13", 13);
        test("20", 20);
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

