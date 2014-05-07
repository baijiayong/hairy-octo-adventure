public class Fizz
{  
    public static void main(String[] args)
    {
        Test fizzTest = new Test();
        Judgment judge = new Judgment();
        try
        {
            
            fizzTest.test("Fizz", judge.judgment(3));
            fizzTest.test("Buzz", judge.judgment(5));
            fizzTest.test("FizzBuzz", judge.judgment(15));
            fizzTest.test("13", judge.judgment(13));
            fizzTest.test("20", judge.judgment(20));
        }
        catch(Exception e)
        {
            e.printStackTrace();
            System.out.println("test failed");
        }
        
        System.out.println("success:" + Test.success + "  failed:" + Test.failed);
    }      
}

