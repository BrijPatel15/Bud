final class BagImpl implements Bag
{
   private final Bag example;
   /**
    * @paramBagExample
    */
  BagImpl(Bag example)
   {
      this.example = example;
      // TODO Auto-generated constructor stub
   }
   Object o;
   public Object get()
   {
      return o;
   }
   public void set(Object o)
   {
      this.o = o;
   }
}