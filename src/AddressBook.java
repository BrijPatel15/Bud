import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

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
//	public String toString() {
//		String str = "";
//		for(BuddyInfo bud : budColl) {
//			str += bud.toString() + " \n";
//		}
//		return str;
//	}
	public void setName(String str) {
		this.addName = str;
	}
	public void export() {
		BufferedWriter bw = null;
		try {
			String str = "";
			File file = new File("M:\\Bud\\exportText.txt");
			if(!file.exists()) {
				file.createNewFile();
			}
			FileWriter fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			for(BuddyInfo b: this.budColl) {
				bw.write(b.toString());
				bw.newLine();
			}
			bw.close();
		} catch (Exception e) {
			System.out.println("Error");
		}
	}
	
	public static AddressBook importFile() {
		File file = new File("exportText.txt");
		AddressBook a1 = new AddressBook("a");
		try {
			Scanner sc = new Scanner(file);
			while(sc.hasNextLine()) {
				String t = sc.nextLine();
				String []str = t.split(",");
				BuddyInfo temp = new BuddyInfo(str[0],str[1],Integer.parseInt(str[2]));
				a1.addBuddy(temp);
			}
		} catch(Exception e) {
			System.out.println("Error");
		}
		return a1;
	}
	public static void main(String []args) {
		BuddyInfo bud1 = new BuddyInfo("jon","carleton", 123);
		BuddyInfo bud2 = new BuddyInfo("jk","carleton", 1234);
		AddressBook add1 = new AddressBook("1");
		add1.addBuddy(bud1);
		add1.addBuddy(bud2);
		System.out.println(add1.toString());
		//add1.removeBuddy(bud1); 
		//System.out.println(add1.toString());
		add1.export();
		AddressBook a2 = importFile();
	}
}
	