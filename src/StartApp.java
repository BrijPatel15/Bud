
import java.util.Properties;
import java.util.StringTokenizer;
public class StartApp
{
   public static void main(String[] args)
   {
      Properties props = new Properties();
      for (int i= 0; i < args.length; i++)
      {
         if(args[i].startsWith("-D"))
         {
           String s = args[i].substring(2);
           addProperty(props, s);
         }
      }
      //continue...
   }

private static void addProperty(Properties props, String s) {
	StringTokenizer st = new StringTokenizer(s, "=");
	    if(st.countTokens() == 2)
	    {
	      String nextToken = st.nextToken();
		props.setProperty(nextToken, nextToken);
	    }
}
public void callTest()
{
   MethodSigExample eg = new MethodSigExample();
   int r = eg.test("hello", 10);
}
}