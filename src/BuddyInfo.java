public class BuddyInfo {
	private String address, name;
	private int phonenumber;
	
	public BuddyInfo() {
		// TODO Auto-generated constructor stub	
	}
	
	public BuddyInfo(String name, String address, int phonenum)
	{
		this.name = name;
		this.address = address;
		this.phonenumber = phonenum;
	}

	public String getAddress(){
	return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getPhonenumber() {
		return phonenumber;
	}
	
	public void Phonenumber(int phonenumber){
		this.phonenumber = phonenumber;
	}
	
	public String toString() {
		return this.getName() + " " + this.getAddress() + " " + this.getPhonenumber();
	}
}
