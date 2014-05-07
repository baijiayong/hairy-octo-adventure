class Test
{
    public static int success;
    public static int failed;
    
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