import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.TableColumn;

class Frame1 extends JFrame implements ActionListener{
 
 JButton btnNewButton;
 int count =0;
 JTextField textField;
 TextField passwordField;
 String[] user = {"Admin","Srikar","Pranay","Shanmukh"};
 String[] pass = {"admin","srikar","pranay","shanmukh"};
 
Frame1(){
	
		btnNewButton = new JButton("Sign In");
		btnNewButton.setBounds(207, 227, 89, 23);
		this.add(btnNewButton);
		btnNewButton.addActionListener(this);

		textField = new JTextField();
		textField.setBounds(235, 125, 98, 20);
		this.add(textField);
		textField.setColumns(10);

		JLabel lblNewLabel = new JLabel("Username :");
		lblNewLabel.setBounds(146, 128, 79, 14);
		this.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Password :");
		lblNewLabel_1.setBounds(146, 177, 79, 14);
		this.add(lblNewLabel_1);
		
		passwordField = new TextField();
		passwordField.setBounds(235, 174, 98, 20);
		passwordField.setEchoChar('*');
		this.add(passwordField);
		
		JLabel lblNewLabel_2 = new JLabel("Welcome");
		lblNewLabel_2.setIcon(new ImageIcon("door.jpg"));
		lblNewLabel_2.setBounds(0, 0,575,343);
		this.add(lblNewLabel_2);
}
public void actionPerformed(ActionEvent ae){

if(ae.getSource() == btnNewButton){
	for(int i=0;i<(user.length);i++){	
		if(textField.getText().equals(user[i]) && passwordField.getText().equals(pass[i])){
			Frame2 f2 = new Frame2();
			f2.setSize(878,593);
			f2.setTitle("Catalog");
			f2.setVisible(true);
			f2.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
			System.exit(0);
			}
			});
			count = 1;
			break;
		}
	}
	if(count != 1){
	textField.setText("Invalid");
	passwordField.setText("");
	}
}
}
public static void main(String []a){
 Frame1 f = new Frame1();
f.setSize(575,402);
f.setTitle("Hotel");
f.setVisible(true);
f.setLayout(null);

f.addWindowListener(new WindowAdapter(){
public void windowClosing(WindowEvent e){
System.exit(0);
}
});
}
}

class Frame2 extends JFrame implements ActionListener{

Container c;
JTextField nameField;
JTextField textField_2;
JTextField textField_3;
JTextField textField_4;
//JTextField tx1;
JButton btnNewButton,btnNewButton_1,btnNewButton_2,btnNewButton_3,btnNewButton_4,btnNewButton_5,btnNewButton_6,btnNewButton_7;
JLabel lblNewLabel,lblNewLabel_1,lblNewLabel_3,lblNewLabel_4,lblNewLabel_7,custitle;
JLabel NewLabel,NewLabel_1,NewLabel_2,NewLabel_3,NewLabel_4,NewLabel_5,NewLabel_6;
JTextField textArea;
JTable table_1;
JComboBox comboBox,comboBox_1;
JScrollPane sp;

String[] num = {"1", "2", "3", "4"};
String[] room = {"101 - Deluxe", "102 - Deluxe", "201 - Executive", "202 - Executive", "301 - Suite", "302 - Suite"};

//String[] cust[] = new String[6][6];
String[] cust[] = {
					{"101 - Deluxe", "102 - Deluxe", "201 - Executive", "202 - Executive", "301 - Suite", "302 - Suite"},
					{"0","0","0","0","0","0"},	//no.of occupants
					{null,null,null,null,null,null,},		//no.of days
					{null,null,null,null,null,null,},		//adhaar
					{null,null,null,null,null,null,},		//phone no.
					{null,null,null,null,null,null,},	//room
					{null,null,null,null,null,null,}, 		//name	
};
String[] reason = {};

String[] col = {"Room No.", "Name", "No of Occupants", "No of days", "Aadhar No.", "Mobile No."};
String[][] rows= {
				{"Room No.", "Name", "No of Occupants", "No of days", "Aadhar No.", "Moblie No."},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null}  };


int prev = 1;

//prev = 1
public void removeHome()
{
	remove(lblNewLabel);
	remove(lblNewLabel_1);
	remove(lblNewLabel_3);
	remove(lblNewLabel_4);
	remove(btnNewButton_6);
}

//prev = 2
public void removeNewBooking()

{
	remove(NewLabel);
	remove(NewLabel_1);
	remove(NewLabel_2);
	remove(NewLabel_3);
	remove(NewLabel_4);
	remove(NewLabel_5);
	remove(NewLabel_6);
	remove(nameField);
	remove(textField_2);
	remove(textField_3);
	remove(textField_4);
	remove(textArea);
	remove(comboBox);
	remove(comboBox_1);
	remove(btnNewButton_7);
}

//prev = 3
public void removeOccupants()
{
	remove(table_1);
	remove(sp);
}



Frame2(){
this.c = getContentPane();
this.setLayout(null);

		btnNewButton = new JButton("Home");
		btnNewButton.setBackground(SystemColor.windowBorder);
		btnNewButton.setBounds(0, 0, 116, 99);
		this.add(btnNewButton);
		btnNewButton.addActionListener(this);
		
		btnNewButton_1 = new JButton("Customers");
		btnNewButton_1.setBackground(SystemColor.windowBorder);
		btnNewButton_1.setBounds(0, 99, 116, 99);
		this.add(btnNewButton_1);
		btnNewButton_1.addActionListener(this);

		btnNewButton_2 = new JButton("Requests");
		btnNewButton_2.setBackground(SystemColor.windowBorder);
				btnNewButton_2.setBounds(0, 198, 116, 99);
		this.add(btnNewButton_2);
		btnNewButton_2.addActionListener(this);

		btnNewButton_3 = new JButton("Employee");
		btnNewButton_3.setBackground(SystemColor.windowBorder);
		btnNewButton_3.setBounds(0, 297, 116, 99);
		this.add(btnNewButton_3);
		btnNewButton_3.addActionListener(this);

		btnNewButton_4 = new JButton("Check Out");
		btnNewButton_4.setBackground(SystemColor.windowBorder);
		btnNewButton_4.setBounds(0, 396, 116, 99);
		this.add(btnNewButton_4);
		btnNewButton_4.addActionListener(this);

		btnNewButton_5 = new JButton("Logout");
		btnNewButton_5.setBackground(SystemColor.windowBorder);
		btnNewButton_5.setBounds(0, 495, 116, 60);
		this.add(btnNewButton_5);
		btnNewButton_5.addActionListener(this);

		lblNewLabel = new JLabel("Rooms Allotted");
		this.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(222, 90, 230, 33);
		lblNewLabel.setVisible(true);

		lblNewLabel_1 = new JLabel("1");
		this.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 70));
		lblNewLabel_1.setBounds(274, 137, 108, 99);
		lblNewLabel_1.setVisible(true);

		lblNewLabel_3 = new JLabel("Rooms Available");
		this.add(lblNewLabel_3);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_3.setBounds(590, 90, 230, 33);
		lblNewLabel_3.setVisible(true);

		lblNewLabel_4 = new JLabel("2");
		this.add(lblNewLabel_4);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 70));
		lblNewLabel_4.setBounds(648, 137, 103, 99);
		lblNewLabel_4.setVisible(true);
	
			
		NewLabel = new JLabel("Name  :");
		NewLabel.setBounds(204, 67, 60, 19);
		NewLabel.setVisible(true);

		NewLabel_1 = new JLabel("No. of Occupants  :");
		NewLabel_1.setBounds(204, 124, 128, 19);
		NewLabel_1.setVisible(true);

		NewLabel_2 = new JLabel("No. of days  :");
		NewLabel_2.setBounds(204, 184, 128, 19);
		NewLabel_2.setVisible(true);

		NewLabel_3 = new JLabel("Aadhar No  :");
		NewLabel_3.setBounds(204, 250, 90, 19);
		NewLabel_3.setVisible(true);

		NewLabel_4 = new JLabel("Reason of Stay  :");
		NewLabel_4.setBounds(204, 301, 128, 19);
		NewLabel_4.setVisible(true);

		NewLabel_5 = new JLabel("Phone no.  :");
		NewLabel_5.setBounds(204, 423, 90, 19);
		NewLabel_5.setVisible(true);

		NewLabel_6 = new JLabel("Room Type  :");
		NewLabel_6.setBounds(571, 123, 98, 19);
		NewLabel_6.setVisible(true);

		nameField = new JTextField();
		nameField.setBounds(349, 63, 112, 26);
		nameField.setColumns(10);
		nameField.setVisible(true);
		
		textField_2 = new JTextField();
		textField_2.setBounds(349, 180, 112, 26);
		textField_2.setColumns(10);
		textField_2.setVisible(true);

		textField_3 = new JTextField();
		textField_3.setBounds(349, 237, 112, 26);
		textField_3.setColumns(10);
		textField_3.setVisible(true);

		textArea = new JTextField();
		textArea.setBounds(349, 294, 214, 99);
		textArea.setColumns(20);
		textArea.setVisible(true);

		textField_4 = new JTextField();
		textField_4.setBounds(349, 423, 112, 26);
		textField_4.setColumns(10);
		textField_4.setVisible(true);


		//String[] num = {"1", "2", "3", "4"};
		comboBox = new JComboBox(num);
		comboBox.setBounds(349, 118, 60, 29);
		comboBox.setVisible(true);

		//String[] room = {"101 - Deluxe", "102 - Deluxe", "201 - Executive", "202 - Executive", "301 - Suite", "302 - Suite"};
		comboBox_1 = new JComboBox(room);
		comboBox_1.setBounds(667, 117, 116, 29);
		comboBox_1.setVisible(true);

		btnNewButton_7 = new JButton("RESERVE");
		btnNewButton_7.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_7.setBounds(446, 494, 146, 30);
		btnNewButton_7.setVisible(true);
		btnNewButton_7.addActionListener(this);

		btnNewButton_6 = new JButton("New Booking");
		this.add(btnNewButton_6);
		btnNewButton_6.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_6.setBounds(383, 421, 190, 60);
		btnNewButton_6.addActionListener(this);
		btnNewButton_6.setVisible(true);
		this.add(btnNewButton_6);

		lblNewLabel_7 = new JLabel("         Enter Valid Details");
		lblNewLabel_7.setForeground(Color.RED);
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_7.setBounds(310, 465, 183, 14);

		custitle = new JLabel("Current Customers");
		custitle.setFont(new Font("Tahoma", Font.PLAIN, 28));
		custitle.setBounds(345, 25, 250, 33);
		custitle.setVisible(true);

		table_1 = new JTable(rows,col);
		table_1.setBounds(190, 110, 540, 250);
		sp=new JScrollPane(table_1);   
		 	TableColumn column = table_1.getColumnModel().getColumn(4);
            column.setMinWidth(110);
            column.setMaxWidth(130);
            column.setPreferredWidth(120); 

    		column = table_1.getColumnModel().getColumn(0);
            column.setMinWidth(40);
            column.setMaxWidth(50);
            column.setPreferredWidth(40); 

            column = table_1.getColumnModel().getColumn(1);
            column.setMinWidth(130);
            column.setMaxWidth(150);
            column.setPreferredWidth(140);

            column = table_1.getColumnModel().getColumn(5);
            column.setMinWidth(100);
            column.setMaxWidth(120);
            column.setPreferredWidth(100); 	

            column = table_1.getColumnModel().getColumn(2);
            column.setMinWidth(40);
            column.setMaxWidth(50);
            column.setPreferredWidth(40); 

            column = table_1.getColumnModel().getColumn(3);
            column.setMinWidth(40);
            column.setMaxWidth(50);
            column.setPreferredWidth(50); 

		//table_1.setCellSelectionEnabled(true); 
		
		
		
}

public void actionPerformed(ActionEvent a){

if(a.getSource() == btnNewButton){

	
	if(prev == 1)
	{
		removeHome();
	}
	else if(prev == 2)
	{
		removeNewBooking();
	}
	else if (prev == 3)
	{
		removeOccupants();
	}
	invalidate();
	validate();
	repaint();
	add(lblNewLabel);
	add(lblNewLabel_1);
	add(lblNewLabel_3);
	add(lblNewLabel_4);
	add(btnNewButton_6);
	prev = 1;
}
if(a.getSource() == btnNewButton_6){
	

	if(prev == 1)
	{
		removeHome();
	}
	else if(prev == 2)
	{
		removeNewBooking();
	}
	else if (prev == 3)
	{
		removeOccupants();
	}
	invalidate();
	validate();
	repaint();
//	remove(lblNewLabel);
//	remove(lblNewLabel_1);
//	remove(lblNewLabel_3);
//	remove(lblNewLabel_4);
//  remove(btnNewButton_6);
	add(NewLabel);
	add(NewLabel_1);
	add(NewLabel_2);
	add(NewLabel_3);
	add(NewLabel_4);
	add(NewLabel_5);
	add(NewLabel_6);
	add(nameField);
	add(textField_2);
	add(textField_3);
	add(textField_4);
	add(textArea);
	add(comboBox);
	add(comboBox_1);
	add(btnNewButton_7);
	prev = 2;

}

if(a.getSource() == btnNewButton_7){
 
System.out.println("ActionEvent entered");
if(nameField.getText().equals(null) || textField_2.getText().equals(null) || textField_3.getText().equals(null) || textField_4.getText().equals(null) || textArea.getText().equals(null) || (textField_3.getText()).length() != 12 || (textField_4.getText()).length() != 10)
{
		System.out.println("If Entered");
		nameField.setText("");
		textField_2.setText("");
		textField_3.setText("");
		textField_4.setText("");
		textArea.setText("");
		
		add(lblNewLabel_7);
		repaint();
}

else
{


	int i;
	if(comboBox_1.getSelectedIndex() == 0){
		i = 0;
		cust[i][5] = "101";
		}
		if(comboBox_1.getSelectedIndex() == 1){
		i = 1;
		cust[i][5] = "102";
		}
		if(comboBox_1.getSelectedIndex() == 2){
		i = 2;
		cust[i][5] = "201";
		}
		if(comboBox_1.getSelectedIndex() == 3){
		i =3;
		cust[i][5] = "202";
		}
		if(comboBox_1.getSelectedIndex() == 4){
		i =4;
		cust[i][5] = "301";
		}
		if(comboBox_1.getSelectedIndex() == 5){
		i = 5;
		cust[i][5] = "302";
		
		for(int j=0;j<num.length;j++)		//no of occupants
		{               
			if(comboBox.getSelectedIndex() == j){
			cust[i][1] = Integer.toString(j+1);}
		}
	
		cust[i][2] =textField_2.getText().toString();
		cust[i][3] =textField_3.getText().toString();
		cust[i][4] =textField_4.getText().toString();
		cust[i][6] =nameField.getText().toString();

	/* System.out.println("else Entered");
 for(int i=0;i<cust[0].length;i++){  			
	cust[i][0] = nameField.getText().toString();	//name
	for(int j=0;j<num.length;j++){               //no of occupants
		if(comboBox.getSelectedIndex() == j){
		cust[i][1] = Integer.toString(j+1);}
	}
	cust[i][2] = textField_2.getText().toString();  //no of days
	cust[i][3] = textField_3.getText().toString();  //Aadhar
	cust[i][4] = textField_4.getText().toString();  //ph no
	for(int k=0;k<room.length;k++){               //Room 
		if(comboBox_1.getSelectedIndex() == 0){
		cust[i][5] = "101";
		}
		if(comboBox_1.getSelectedIndex() == 1){
		cust[i][5] = "102";
		}
		if(comboBox_1.getSelectedIndex() == 2){
		cust[i][5] = "201";
		}
		if(comboBox_1.getSelectedIndex() == 3){
		cust[i][5] = "202";
		}
		if(comboBox_1.getSelectedIndex() == 4){
		cust[i][5] = "301";
		}
		if(comboBox_1.getSelectedIndex() == 5){
		cust[i][5] = "302";
		}
	}		
	//reason[i] = textArea.getText();  //Reason to stay
	i++;

	//System.out.println("text:"+ reason[i]);
	break;*/
}
chckframe chk1 = new chckframe();
chk1.setSize(250,200);
chk1.setTitle("Successfull");
chk1.setVisible(true);
invalidate();
validate();
repaint();
removeNewBooking();
add(lblNewLabel);
add(lblNewLabel_1);
add(lblNewLabel_3);
add(lblNewLabel_4);
add(btnNewButton_6);
prev = 1;
			
}
}
if(a.getSource() == btnNewButton_1){

	
	if(prev == 1)
	{
		removeHome();
	}
	else if(prev == 2)
	{
		removeNewBooking();
	}
	else if (prev == 3)
	{
		removeOccupants();
	}

	invalidate();
	validate();
	repaint();
	add(table_1);

	add(custitle);
	add(sp);
	
for(int l=0;l<rows[0].length;l++){

	rows[l][0] = cust[l][5];
	rows[l][1] = cust[l][0];
	rows[l][2] = cust[l][1];
	rows[l][3] = cust[l][2];
	rows[l][4] = cust[l][3];
	rows[l][5] = cust[l][4];

}
prev = 3;

}
}

}


class chckframe extends JFrame implements ActionListener
{
	JButton d;
	chckframe()
	{
		this.setLayout(null);
		JLabel done = new JLabel("DONE!");
		done.setBounds(45,40,70,30);
		done.setVisible(true);
		this.add(done);

		d = new JButton("OKAY");
		d.setBounds(45,70,70,30);
		d.setVisible(true);
		d.addActionListener();
		this.add(d);
	}
	public void actionPerformed(ActionEvent ad){

	if(ad.getSource() == d){
		dispose();
	}
}
}	

