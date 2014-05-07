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
        String result = fizz(3);
        if("Fizz".equals(result))
        {
            System.out.println("test success");
        }
        else 
        {
            System.out.println("test failed");
        }
    }
    
    
}

