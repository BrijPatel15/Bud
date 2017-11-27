import java.util.Properties;

public class Extract
{
   private static final String DEFINE = "-D";
   public static void main(String[] args)
   {
      Properties props = new Properties();
      for (int i = 0; i < args.length; i++)
      {
         if (args[i].startsWith(DEFINE))
         {
            addProp(props, args[i].substring(2));
         }
      }
   }
private static void addProp(Properties props, String s) {
	// TODO Auto-generated method stub
	
}
}
