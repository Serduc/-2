public class StringBuilder Deno {
    public static void main (string[]args)
    {StringBuilder stringBuilder1 = createSomeString(3, 56);
    System.out.println(stringBuilder1);
    System.out.println(stringBuilder2);
    }
private static StringBuilder modifySomeString(StringBuilder stringBuilder)
{
    int pas;
    while(pas=stringBuilder.indexOf("=") !=-1)
    {
        StringBuilder.deleteChartt(pas);
        StringBuilder.insert(pas,"равно");
        {
            return stringBuilder;
        }
    }
}
private static StringBuilder createSomeString(int a, int b) 
{
   stringBuilder result = new StringBuilder();
   result.append(a).append("+").append(b).append("=").append(a+b).append("\n") 
   result.append(a).append("-").append(b).append("=").append(a+b).append("\n")
   result.append(a).append("*").append(b).append("=").append(a+b).append("\n")
   return result;
 }   
}