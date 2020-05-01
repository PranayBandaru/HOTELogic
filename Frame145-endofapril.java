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
JButton btnNewButton,btnNewButton_1,btnNewButton_2,btnNewButton_3,btnNewButton_4,btnNewButton_5,btnNewButton_6,btnNewButton_7,btnNewButton_8;
JLabel lblNewLabel,lblNewLabel_1,lblNewLabel_3,lblNewLabel_4,lblNewLabel_7,custitle;
JLabel NewLabel,NewLabel_1,NewLabel_2,NewLabel_3,NewLabel_4,NewLabel_5,NewLabel_6;
JTextField textArea;
JTable table_1,table_2;
JLabel req_1;
JComboBox comboBox,comboBox_1,comboBox_2;
JScrollPane sp,sp_1;
JLabel aLabel_5,aLabel_4,aLabel_3,aLabel_2,aLabel_1,aLabel;
	
			

		int i = 0;



String[] num = {"1", "2", "3", "4"};
String[] room = {"101 - Deluxe", "102 - Deluxe", "201 - Executive", "202 - Executive", "301 - Suite", "302 - Suite"};

//String[] cust[] = new String[6][6];
String[] cust[] = {
					{"101 - Deluxe", "102 - Deluxe", "201 - Executive", "202 - Executive", "301 - Suite", "302 - Suite"},
					{null,null,null,null,null,null},	//no.of occupants
					{null,null,null,null,null,null},		//no.of days
					{null,null,null,null,null,null},		//adhaar
					{null,null,null,null,null,null},		//phone no.
					{null,null,null,null,null,null},	//room
					{null,null,null,null,null,null}, 		//name	
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

String[] col2 = {"Category", "Request", "Price", "Status"};
String[][] row2 = {
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null}
			};

String[] roomr = {"101","102","201","202","301","302"};
String[][] tab = new String[6][7];

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
	remove(aLabel);
	remove(aLabel_1);
	remove(aLabel_2);
	remove(aLabel_3);
	remove(aLabel_4);
	remove(aLabel_5);
	remove(custitle);
	remove(sp);
}

//prev =4
public void removeRequests()
{
	remove(req_1);
	remove(comboBox_2);
	remove(table_2);
	remove(btnNewButton_8);
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

		aLabel = new JLabel("Room No.");
		aLabel.setBounds(190, 87, 76, 14);
		
		aLabel_1 = new JLabel("Name");
		aLabel_1.setBounds(276, 87, 46, 14);
		
		aLabel_2 = new JLabel("Occupants");
		aLabel_2.setBounds(373, 85, 46, 14);
		
		aLabel_3 = new JLabel("days");
		aLabel_3.setBounds(426, 85, 46, 14);
		
		aLabel_4 = new JLabel("Aadhar no.");
		aLabel_4.setBounds(500, 85, 62, 14);
		
		aLabel_5 = new JLabel("Mobile no.");
		aLabel_5.setBounds(623, 87, 62, 14);
	
		

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
        req_1 = new JLabel("Room Number   :");
		req_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		req_1.setBounds(187, 45, 162, 34);
		

        table_2 = new JTable(row2,col2);
		table_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		table_2.setBounds(187, 127, 397, 305);
		sp_1=new JScrollPane(table_2);   
		

		comboBox_2 = new JComboBox(roomr);
		comboBox_2.setBounds(409, 55, 55, 22);
		comboBox_1.setVisible(true);

		btnNewButton_8 = new JButton("New Request");
		btnNewButton_8.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_8.setBounds(391, 484, 162, 40);
		btnNewButton_8.addActionListener(this);

		
		
		
		
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
	else if(prev ==4)
	{
		removeRequests();
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
	else if(prev ==4)
	{
		removeRequests();
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

	//for(int i=0;i<6;i++){
	if(comboBox_1.getSelectedIndex() == 0){
		cust[5][i] = "101";
		}
		if(comboBox_1.getSelectedIndex() == 1){
		cust[5][i] = "102";
		}
		if(comboBox_1.getSelectedIndex() == 2){

		cust[5][i] = "201";
		}
		if(comboBox_1.getSelectedIndex() == 3){

		cust[5][i] = "202";
		}
		if(comboBox_1.getSelectedIndex() == 4){

		cust[5][i] = "301";
		}
		if(comboBox_1.getSelectedIndex() == 5){

		cust[5][i] = "302";
		}
		for(int j=0;j<num.length;j++)		//no of occupants
		{               
			if(comboBox.getSelectedIndex() == j){
			cust[1][i] = Integer.toString(j+1);}
		}
	
		cust[2][i] =textField_2.getText().toString(); 
		cust[3][i] =textField_3.getText().toString();
		cust[4][i] =textField_4.getText().toString();
		cust[6][i] =nameField.getText().toString();
		
		i++;
		//break;
	
	//}											
	 /*System.out.println("else Entered");
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
	break;
}*/
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
	else if(prev ==4)
	{
		removeRequests();
	}

	for(int b=0;b<6;b++){
		for(int f=0;f<7;f++){
			tab[b][f] = cust[f][b] ;
		}
	}
	invalidate();
	validate();
	repaint();

	add(table_1);
	add(aLabel);
	add(aLabel_1);
	add(aLabel_2);
	add(aLabel_3);
	add(aLabel_4);
	add(aLabel_5);
	add(custitle);
	add(sp);
	
for(int l=0;l<rows[0].length;l++){

	rows[l][0] = tab[l][5];
	rows[l][1] = tab[l][6];
	rows[l][2] = tab[l][1];
	rows[l][3] = tab[l][2];
	rows[l][4] = tab[l][3];
	rows[l][5] = tab[l][4];


}

prev = 3;

}


if(a.getSource() == btnNewButton_2){

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
	else if(prev ==4)
	{
		removeRequests();
	}

invalidate();
validate();
repaint();
add(req_1);
add(comboBox_2);
add(table_2);
add(sp_1);
add(btnNewButton_8);

prev = 4;

}

if(a.getSource() == btnNewButton_8)
{
	newreq n = new newreq(comboBox_2.getSelectedItem().toString());
	n.setSize(669,427);
	n.setTitle("Add new Request");
	n.setVisible(true);
	n.setBackground(Color.WHITE);
		
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
		d.addActionListener(this);
		this.add(d);
	}
	public void actionPerformed(ActionEvent ad){

	if(ad.getSource() == d){
		dispose();
	}
}
}


class newreq extends JFrame implements ActionListener
{
JLabel req_2,req_3,req_4,req_5;
JRadioButton rdbtnNewRadioButton,rdbtnNewRadioButton_1,rdbtnNewRadioButton_2,rdbtnNewRadioButton_3,rdbtnNewRadioButton_4;
JComboBox comboBox_2;
JTextField textField_5,textField_6;
ButtonGroup buttonGroup,buttonGroup_1;
JButton btnNewButton;

public String[][] room101 = new String[4][20]; 
public String[][] room102 = new String[4][20]; 
public String[][] room201 = new String[4][20]; 
public String[][] room202 = new String[4][20]; 
public String[][] room301 = new String[4][20]; 
public String[][] room302 = new String[4][20]; 

public int count101 = 0;
public int count102 = 0;
public int count201 = 0;
public int count202 = 0;
public int count301 = 0;
public int count302 = 0;
String s1;
	newreq(String s1)
	{
		this.s1 = s1;
		this.setLayout(null);
		req_2 = new JLabel("Enter request description ");
		req_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		req_2.setBounds(10, 10, 244, 25);
		this.add(req_2);


		textField_5 = new JTextField();
		textField_5.setBounds(10, 49, 244, 32);
		textField_5.setColumns(10);
		this.add(textField_5);

		req_3 = new JLabel("Enter Price:");
		req_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		req_3.setBounds(10, 273, 244, 25);
		this.add(req_3);

		textField_6 = new JTextField();
		textField_6.setBounds(10, 312, 244, 32);
		textField_6.setColumns(10);
		this.add(textField_6);

		req_4 = new JLabel("Select Category");
		req_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		req_4.setBounds(10, 106, 244, 25);
		this.add(req_4);

		buttonGroup = new ButtonGroup();

		rdbtnNewRadioButton = new JRadioButton("Food");
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		//rdbtnNewRadioButton.setBackground(Color.WHITE);
		rdbtnNewRadioButton.setBounds(10, 137, 127, 32);;
		this.add(rdbtnNewRadioButton);

		rdbtnNewRadioButton_1 = new JRadioButton("Amenities");
		buttonGroup.add(rdbtnNewRadioButton_1);
		//rdbtnNewRadioButton_1.setBackground(Color.WHITE);
		rdbtnNewRadioButton_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnNewRadioButton_1.setBounds(10, 182, 127, 32);
		this.add(rdbtnNewRadioButton_1);

		rdbtnNewRadioButton_2 = new JRadioButton("Taxi Service");
		buttonGroup.add(rdbtnNewRadioButton_2);
		rdbtnNewRadioButton_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		//rdbtnNewRadioButton_2.setBackground(Color.WHITE);
		rdbtnNewRadioButton_2.setBounds(10, 228, 127, 32);
		this.add(rdbtnNewRadioButton_2);
		

		req_5 = new JLabel("Status");
		req_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		req_5.setBounds(311, 106, 244, 25);
		this.add(req_5);
		

		buttonGroup_1 = new ButtonGroup();

		rdbtnNewRadioButton_3 = new JRadioButton("Pending");
		buttonGroup_1.add(rdbtnNewRadioButton_3);
		rdbtnNewRadioButton_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		//rdbtnNewRadioButton_3.setBackground(Color.WHITE);
		rdbtnNewRadioButton_3.setBounds(311, 137, 127, 32);
		this.add(rdbtnNewRadioButton_3);
		
		rdbtnNewRadioButton_4 = new JRadioButton("Completed");
		buttonGroup_1.add(rdbtnNewRadioButton_4);
		rdbtnNewRadioButton_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		//rdbtnNewRadioButton_4.setBackground(Color.WHITE);
		rdbtnNewRadioButton_4.setBounds(311, 182, 127, 32);
		this.add(rdbtnNewRadioButton_4);
		
		btnNewButton = new JButton("SUBMIT");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		//btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setBounds(311, 309, 169, 32);
		this.add(btnNewButton);
		
		}
	public void actionPerformed(ActionEvent c){
		if(c.getSource() == btnNewButton){
			//for(int i=0;i< room101[0].length; i++){	
				if(s1.equals("101")){
					int i = count101;
				room101[0][i] = textField_5.getText();
				if(rdbtnNewRadioButton.isSelected())
				{
					room101[1][i] = "Food";
				}
				if(rdbtnNewRadioButton_1.isSelected())
				{
					room101[1][i] = "Amenities";
				}
				if(rdbtnNewRadioButton_2.isSelected())
				{
					room101[1][i] = "Taxi Service";
				}
				if(rdbtnNewRadioButton_3.isSelected())
				{
					room101[3][i] = "Pending";	
				}
				if(rdbtnNewRadioButton_4.isSelected())
				{
					room101[3][i] = "Completed";
				}
				//room1[1][i] = rdbtnNewRadioButton.isSelected().toString();;
				room101[2][i] = textField_6.getText();
				count101++;
				//room1[3][i] = buttonGroup_1.getSelectedItem().toString();;
				
			}
			//}



			if(s1.equals("102")){
					int i = count102;
				room102[0][i] = textField_5.getText();
				if(rdbtnNewRadioButton.isSelected())
				{
					room102[1][i] = "Food";
				}
				if(rdbtnNewRadioButton_1.isSelected())
				{
					room102[1][i] = "Amenities";
				}
				if(rdbtnNewRadioButton_2.isSelected())
				{
					room102[1][i] = "Taxi Service";
				}
				if(rdbtnNewRadioButton_3.isSelected())
				{
					room102[3][i] = "Pending";	
				}
				if(rdbtnNewRadioButton_4.isSelected())
				{
					room102[3][i] = "Completed";
				}
				//room1[1][i] = rdbtnNewRadioButton.isSelected().toString();;
				room102[2][i] = textField_6.getText();
				count102++;
				//room1[3][i] = buttonGroup_1.getSelectedItem().toString();;
				
			}
			//}



			if(s1.equals("201")){
					int i = count201;
				room201[0][i] = textField_5.getText();
				if(rdbtnNewRadioButton.isSelected())
				{
					room201[1][i] = "Food";
				}
				if(rdbtnNewRadioButton_1.isSelected())
				{
					room201[1][i] = "Amenities";
				}
				if(rdbtnNewRadioButton_2.isSelected())
				{
					room201[1][i] = "Taxi Service";
				}
				if(rdbtnNewRadioButton_3.isSelected())
				{
					room201[3][i] = "Pending";	
				}
				if(rdbtnNewRadioButton_4.isSelected())
				{
					room201[3][i] = "Completed";
				}
				//room1[1][i] = rdbtnNewRadioButton.isSelected().toString();;
				room201[2][i] = textField_6.getText();
				count201++;
				//room1[3][i] = buttonGroup_1.getSelectedItem().toString();;
				
			}
			//}
			if(s1.equals("202")){
					int i = count202;
				room202[0][i] = textField_5.getText();
				if(rdbtnNewRadioButton.isSelected())
				{
					room202[1][i] = "Food";
				}
				if(rdbtnNewRadioButton_1.isSelected())
				{
					room202[1][i] = "Amenities";
				}
				if(rdbtnNewRadioButton_2.isSelected())
				{
					room202[1][i] = "Taxi Service";
				}
				if(rdbtnNewRadioButton_3.isSelected())
				{
					room202[3][i] = "Pending";	
				}
				if(rdbtnNewRadioButton_4.isSelected())
				{
					room202[3][i] = "Completed";
				}
				//room1[1][i] = rdbtnNewRadioButton.isSelected().toString();;
				room202[2][i] = textField_6.getText();
				count202++;
				//room1[3][i] = buttonGroup_1.getSelectedItem().toString();;
				
			}
			//}



			if(s1.equals("301")){
					int i = count301;
				room301[0][i] = textField_5.getText();
				if(rdbtnNewRadioButton.isSelected())
				{
					room301[1][i] = "Food";
				}
				if(rdbtnNewRadioButton_1.isSelected())
				{
					room301[1][i] = "Amenities";
				}
				if(rdbtnNewRadioButton_2.isSelected())
				{
					room301[1][i] = "Taxi Service";
				}
				if(rdbtnNewRadioButton_3.isSelected())
				{
					room301[3][i] = "Pending";	
				}
				if(rdbtnNewRadioButton_4.isSelected())
				{
					room301[3][i] = "Completed";
				}
				//room1[1][i] = rdbtnNewRadioButton.isSelected().toString();;
				room301[2][i] = textField_6.getText();
				count301++;
				//room1[3][i] = buttonGroup_1.getSelectedItem().toString();;
				
			}
			//}
			if(s1.equals("302")){
					int i = count302;
				room302[0][i] = textField_5.getText();
				if(rdbtnNewRadioButton.isSelected())
				{
					room302[1][i] = "Food";
				}
				if(rdbtnNewRadioButton_1.isSelected())
				{
					room302[1][i] = "Amenities";
				}
				if(rdbtnNewRadioButton_2.isSelected())
				{
					room302[1][i] = "Taxi Service";
				}
				if(rdbtnNewRadioButton_3.isSelected())
				{
					room302[3][i] = "Pending";	
				}
				if(rdbtnNewRadioButton_4.isSelected())
				{
					room302[3][i] = "Completed";
				}
				//room1[1][i] = rdbtnNewRadioButton.isSelected().toString();;
				room302[2][i] = textField_6.getText();
				count302++;
				//room1[3][i] = buttonGroup_1.getSelectedItem().toString();;
				
			}
			//}



			



			if(s1.equals("102")){
					int i = count102;
				room102[0][i] = textField_5.getText();
				if(rdbtnNewRadioButton.isSelected())
				{
					room102[1][i] = "Food";
				}
				if(rdbtnNewRadioButton_1.isSelected())
				{
					room102[1][i] = "Amenities";
				}
				if(rdbtnNewRadioButton_2.isSelected())
				{
					room102[1][i] = "Taxi Service";
				}
				if(rdbtnNewRadioButton_3.isSelected())
				{
					room102[3][i] = "Pending";	
				}
				if(rdbtnNewRadioButton_4.isSelected())
				{
					room102[3][i] = "Completed";
				}
				//room1[1][i] = rdbtnNewRadioButton.isSelected().toString();;
				room102[2][i] = textField_6.getText();
				count102++;
				//room1[3][i] = buttonGroup_1.getSelectedItem().toString();;
				
			}
			//}



			



			
		}
	}	
}


