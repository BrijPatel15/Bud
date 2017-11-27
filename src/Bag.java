public class Bag
{
	public class BagExample
	{
	   void processMessage(String msg)
	   {
	      Bag bag = new Bag();
	      bag.set(msg);
	      MessagePipe pipe = new MessagePipe();
	      pipe.send(bag);
	   }
	}

private void set(String msg) {
	// TODO Auto-generated method stub
	
}
}