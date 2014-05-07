class BearUnitTest
{
    public static int success;
    public static int failed;
    
    public static void main(String[] args)
    {
        try
        {
            FizzBuzzTest fizzBuzz = new FizzBuzzTest();
            fizzBuzz.test();
        }
        catch(Exception e)
        {
            e.printStackTrace();
            System.out.println("test failed");
        }
        
        System.out.println(testReport());
    } 
    
    public static String testReport() {
        return "success:" + success + "  failed:" + failed;
    }
    
    public static void assertEquals(String expected, String result) throws Exception
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