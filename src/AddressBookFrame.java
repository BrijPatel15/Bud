import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;


public class AddressBookFrame extends JFrame implements ActionListener{

	public AddressBookFrame() {
		JList<BuddyInfo> budList;
		DefaultListModel<BuddyInfo> listModel = new DefaultListModel<>();
		budList = new JList<BuddyInfo>(listModel);
		AddressBook aBook = new AddressBook("");
		JMenuBar menu = new JMenuBar();
		JMenu addressBook = new JMenu("AddressBook");
		JMenuItem addAddBook = new JMenuItem("Add AddressBook");
		addressBook.add(addAddBook);
		addAddBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String addName = JOptionPane.showInputDialog("Please enter a name for the addressBook: " );
			    aBook.setName(addName);
			}
		});
		
		JMenu Buddy = new JMenu("Buddy");
		JMenuItem addBuddy = new JMenuItem("Add Buddy");
		Buddy.add(addBuddy);
		addBuddy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = JOptionPane.showInputDialog("Name: ");
				String address = JOptionPane.showInputDialog("Address: ");
				int num = Integer.parseInt(JOptionPane.showInputDialog("Number: "));
				BuddyInfo bud = new BuddyInfo(name, address, num);
				aBook.addBuddy(bud);
				listModel.addElement(bud);
			}
		});
		JMenuItem removeBud = new JMenuItem("Remove Bud");
		Buddy.add(removeBud);
		removeBud.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BuddyInfo b = budList.getSelectedValue();
				aBook.removeBuddy(b);
				listModel.removeElement(b);
			}
		});
		budList.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
				int selected = JOptionPane.showConfirmDialog(null, "Edit if then delete","delete",JOptionPane.YES_NO_OPTION);
				if(selected == 0) {
					BuddyInfo b = budList.getSelectedValue();
					b.setName(JOptionPane.showInputDialog("Name: "));
					b.setAddress(JOptionPane.showInputDialog("Address: "));
					b.Phonenumber(Integer.parseInt(JOptionPane.showInputDialog("Number: ")));
				} else {
					BuddyInfo b = budList.getSelectedValue();
					aBook.removeBuddy(b);
					listModel.removeElement(b);
				}
			}
		});
		menu.add(addressBook);
		menu.add(Buddy);
		this.setJMenuBar(menu);
		this.add(new JScrollPane(budList));
		this.setTitle("AddressBook Stuff");
		this.setSize(300,300);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String [] args) {
		AddressBookFrame adF = new AddressBookFrame();
	}
}
