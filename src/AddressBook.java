import java.util.ArrayList;

public class AddressBook {
	
	ArrayList<BuddyInfo> budColl;
	
	public AddressBook() {
	// TODO Auto-generated constructor stub
		budColl = new ArrayList<BuddyInfo>();
	}

	public void addBuddy(BuddyInfo B){
		budColl.add(B);
	}
	
	public void removeBuddy(BuddyInfo B) {
		budColl.remove(B);
	}
	public String toString() {
		String str = "";
		for(BuddyInfo bud : budColl) {
			str += bud.toString() + " ";
		}
		return str;
	}
	public static void main(String []args) {
		BuddyInfo bud1 = new BuddyInfo("jon","carleton", 123);
		AddressBook add1 = new AddressBook();
		add1.addBuddy(bud1);
		System.out.println(add1.toString());
		add1.removeBuddy(bud1);
		System.out.println(add1.toString());
		String test1 = "hello";
	}
}
	