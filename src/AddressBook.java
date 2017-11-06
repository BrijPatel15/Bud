import java.util.ArrayList;

public class AddressBook {
	
	ArrayList<BuddyInfo> budColl;
	String addName;
	public AddressBook(String addName) {
	// TODO Auto-generated constructor stub
		budColl = new ArrayList<BuddyInfo>();
		this.addName = addName;
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
	public void setName(String str) {
		this.addName = str;
	}
	public static void main(String []args) {
		BuddyInfo bud1 = new BuddyInfo("jon","carleton", 123);
		AddressBook add1 = new AddressBook("1");
		add1.addBuddy(bud1);
		System.out.println(add1.toString());
		add1.removeBuddy(bud1);
		System.out.println(add1.toString());
	}
}
	