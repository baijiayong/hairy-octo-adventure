class BearUnitTest
{
    public static int success;
    public static int failed;
    
    public static void main(String[] args)
    {
        try
        {
            test();
        }
        catch(Exception e)
        {
            e.printStackTrace();
            System.out.println("test failed");
        }
        
        System.out.println(testReport());
    } 
    
    public static void test() {
        FizzBuzzTest fizzBuzz = (FizzBuzzTest) Class.forName("FizzBuzzTest").newInstance();
        fizzBuzz.test();
            
        CalcTest calcTest = (CalcTest) Class.forName("CalcTest").newInstance();
        calcTest.test();
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