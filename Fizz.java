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
        if("13".equals(fizz(13)))
        {
            System.out.println("test success");
        }
        else 
        {
            System.out.println("test failed");
        }
        
        if("Buzz".equals(fizz(5)))
        {
            System.out.println("test success");
        }
        else 
        {
            System.out.println("test failed");
        }
        
        if("FizzBuzz".equals(fizz(15)))
        {
            System.out.println("test success");
        }
        else 
        {
            System.out.println("test failed");
        }
        
        if("Fizz".equals(fizz(3)))
        {
            System.out.println("test success");
        }
        else 
        {
            System.out.println("test failed");
        }
        
        if("Fizz".equals(fizz(4)))
        {
            System.out.println("test success");
        }
        else 
        {
            System.out.println("test failed");
        }
    }
    
    
}

