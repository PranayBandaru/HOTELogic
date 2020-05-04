import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.TableColumn;
import javax.swing.ComboBoxEditor;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.IOException;

class Frame1 extends JFrame implements ActionListener{
 
 JButton btnNewButton;
 int count = 0;
 JTextField textField;
 TextField passwordField;
  String[] user = new String[20];
  String[] pass = new String[20];
 static String[][] data = new String[20][6];
  static String[] coloumn = new String[5];
   int ecount=14;

 
Frame1(){
     user[0] ="Admin";
    user[1] ="Srikar";
    user[2] ="Shanmukh";
    user[3] ="Pranay";
    
    pass[0]="admin";
    pass[1]="srikar";
    pass[2]="shanmukh";
    pass[3]="pranay";
    
    coloumn[0] = "EMPLOYEE NAME";
    coloumn[1] ="ROLE";
    coloumn[2] = "Phone no";
    coloumn[3] = "age";
    coloumn[4]="intercom no";
    
     data[0][0] = "Srikar";
      data[0][1] = "Excecutive Chef";
      data[0][3] = "023";
      data[1][3] = "012";
      data[2][3] = "013";
      data[3][3] = "023";
      data[4][3] = "023";
      data[5][3] = "021";
      data[6][3] = "123";
      data[7][3] = "152";
      data[8][3] = "521";
      data[9][3] = "112";
      data[10][3] = "111";
      data[11][3] = "105";
      data[12][3] = "501";
      data[13][3] = "006";
      data[14][3] = "006";
      data[0][4] = "26";
      data[1][4] = "25";
      data[2][4] = "29";
      data[3][4] = "24";
      data[4][4] = "25";
      data[5][4] = "21";
      data[6][4] = "21";
      data[7][4] = "35";
      data[8][4] = "36";
      data[9][4] = "39";
      data[10][4] = "40";
      data[11][4] = "42";
      data[12][4] = "35";
      data[13][4] = "31";
      data[14][4] = "31";
      data[0][2] = "9845623210";
      data[2][2] = "9845632145";
      data[3][2] = "9876523145";
      data[1][2] = "9875124363";
      data[4][2] = "9546321725";
      data[5][2] = "7412563215";
      data[6][2] = "854632123";
      data[7][2] = "8456321478";
      data[8][2] = "7563214561";
      data[9][2] = "6547892135";
      data[10][2] = "8745632145";
      data[11][2] = "8456321478";
      data[12][2] = "6548213987";
      data[14][2] = "912354789";
      data[13][2] = "9321567454";
      data[1][0] = "Shanmukh";
      data[1][1] = "Manager";
      data[2][0] = "Pranay";
      data[2][1] = "Manager";
      data[3][0] = "Mark";
      data[3][1] = "Chef";
      data[4][0] = "Anitha";
      data[4][1] = "Sous Chef";
      data[5][0] = "Nikhil";
      data[5][1] = "Intern";
      data[6][0] = "Sonarika";
      data[6][1] = "intern";
      data[7][0] = "Sri";
      data[7][1] = "Accountant";
      data[8][0] = "Shiva";
      data[8][1] = "Security";
      data[9][0] = "Shankar";
      data[9][1] = "Security";
      data[10][0] = "David";
      data[10][1] = "Security";
      data[11][0] = "Ravi";
      data[11][1] = "Cleaner";
      data[12][0] = "Mangama";
      data[12][1] = "Cleaner";
      data[13][0] = "Padma";
      data[13][1] = "Cleaner";
      data[14][0] = "Shenaz";
      data[14][1] = "Cleaner";
	
	
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
	for(int i=1;i<(user.length);i++){	
		if(textField.getText().equals(user[i]) && passwordField.getText().equals(pass[i])){
			Frame2 f2 = new Frame2(data,coloumn);
			
      f2.setBounds(90,110,878,593);
			f2.setTitle("Catalog");
			f2.setVisible(true);
			//f2.add(new JLabel(new ImageIcon("background.jpg")));
			f2.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
			System.exit(0);
			}
			});
			count = 1;
			textField.setText("");
			passwordField.setText("");
			break;
		}
	}
        
         if(textField.getText().equals(user[0]) && passwordField.getText().equals(pass[0])){
            AdminPage ap = new AdminPage();
			ap.setSize(878,593);
			ap.setTitle("ADMIN PAGE");
			ap.setVisible(true);
			ap.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
			System.exit(0);
			}
			});
        }
	if(count != 1){
	textField.setText("Invalid");
	passwordField.setText("");
	}
}
}

class AdminPage extends JFrame implements ActionListener{
 
  JButton ab1,ab2,ab3,ab4,ab5; 
  JComboBox acb,acb1;
  JTextField atf1,atf2,atf3,atf4,atf5,atf6,atf7,atf8,atf9,atf0;
  JLabel al1,al2,al3,al4,al5,al6,al7;
 JLabel[] alb = new JLabel[20];
  String msg;
  int c=0;
  int count = 3;
  int addIsPressed = 0;
  int ei;
 int addEmployee = 0;
  
 
  AdminPage(){
      
   
      this.setLayout(null);
      
      atf1 = new JTextField();
      atf2 = new JTextField();
      atf3 = new JTextField();
      atf4 = new JTextField();
      atf8 = new JTextField();
      atf9 = new JTextField();
      atf0 = new JTextField();
      
      al1= new JLabel("Username");
      al2 = new JLabel("Password");
      al3 = new JLabel("NAME");
      al4 = new JLabel("ROLE");
      al5 = new JLabel("PHONE NO");
      al6 = new JLabel("INTERCOM NO");
      al7 = new JLabel("AGE");
      ab1 = new JButton("Remove");
      ab2 = new JButton("New Account");
      ab3 = new JButton("Done");
      ab4 = new JButton("Remove Employee");
      ab5 = new JButton("Add Employee");
      
      ab1.setBounds(230,50,100,30);
      ab2.setBounds(200,200,130,30);
      ab3.setBounds(380,500,100,30);
      ab4.setBounds(500,50,150,30);
      ab5.setBounds(500,200,130,30);
      
      al1.setBounds(200,230,100,30);
      al3.setBounds(500,230,100,30);
      atf1.setBounds(200,260,100,30);
      atf3.setBounds(500,260,100,30);
      al2.setBounds(200,290,100,30);
      al4.setBounds(500,290,100,30);
      atf2.setBounds(200,320,100,30);
      atf4.setBounds(500,320,100,30);
      atf8.setBounds(550,380,100,30);
      atf9.setBounds(550,440,100,30);
      atf0.setBounds(550,490,100,30);
      al5.setBounds(550,350,100,30);
      al6.setBounds(550,410,100,30);
      al7.setBounds(550,460,100,30);
      
    //  this.add(al1);
    //  this.add(al2);
      this.add(ab1);
      this.add(ab2);
      this.add(ab3);
      this.add(ab4);
      this.add(ab5);
      
      
    //  this.add(atf1);
     // this.add(atf2);
      ab1.addActionListener(this);
      ab2.addActionListener(this);
      ab3.addActionListener(this);
      ab4.addActionListener(this);
      ab5.addActionListener(this);
      
      
    /*  this.remove(al1);
      this.remove(al2);
      this.remove(atf1);
      this.remove(atf2);*/
      
      acb = new JComboBox();
      acb1 = new JComboBox();
      for(int i=1;i<(user.length);i++){ //for printing values 
         if(user[i] != null){
        alb[i] = new JLabel(user[i]);
        this.add(alb[i]);
        c++;
        alb[i].setBounds(80,c*30,130,30);
       // if(user[i] != null){
        acb.addItem(user[i]);
        }
      }
     // acb.setEditable(true);
      acb.setBounds(330,50,100,30);
      this.add(acb);
      
     for(int k=0;k<20;k++){ //for printing values 
         if(data[k][0] != null){
           acb1.addItem(data[k][0]);
        }
      }
      acb1.setBounds(650,50,100,30);
      this.add(acb1);
      
  }
      
   public void actionPerformed(ActionEvent ae){
      if(ae.getSource()==ab3){
          if(addIsPressed == 1){
             count++;   
             user[count]=atf1.getText(); //problem is here
               pass[count]=atf2.getText();
          }
            if(addEmployee == 1){
              data[ecount+1][0]=atf3.getText();
              data[ecount+1][1]=atf4.getText();
              data[ecount+1][2]=atf8.getText();
              data[ecount+1][3]=atf9.getText();
              data[ecount+1][4]=atf0.getText();
           }
        dispose();
      }
       if(ae.getSource()== ab1){
           String x = acb.getSelectedItem().toString();
           for(int i=1;i<(user.length);i++){
             if(user[i] == x){
                 user[i]=null;
             }
           }
       }
       if(ae.getSource()==ab2){
      //  count++;   
      this.add(al1);
      this.add(al2); 
      this.add(atf1);
      this.add(atf2);  
      addIsPressed = 1;
      repaint();
     
      
     }
       
      if(ae.getSource() == ab4){
          ei =acb1.getSelectedIndex();
         // data[ei][0]=null;
          for(int j = ei;j<=ecount;j++){
              data[j][0] = data[j+1][0];
              data[j][1] = data[j+1][1];
              
           }
          ecount--;
          
      } 
     
     if(ae.getSource()==ab5){   
      this.add(al3);
      this.add(al4); 
      this.add(atf3);
      this.add(atf4);  
      this.add(atf0);
      this.add(atf9);
      this.add(atf8);
      this.add(al5);
      this.add(al6);
      this.add(al7);
      addEmployee = 1;
      repaint();
     }  
  }  
  
}


public static void main(String []a){
 Frame1 f = new Frame1();
f.setBounds(200,100,575,402);
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

class Frame2 extends JFrame implements ActionListener,ItemListener{

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
JTable table_1,table_2,jt;
JLabel req_1;
JComboBox comboBox,comboBox_1,comboBox_2;
JScrollPane sp,sp_1,sp3;
JLabel aLabel_5,aLabel_4,aLabel_3,aLabel_2,aLabel_1,aLabel;
JLabel check,check_1,check_2,check_3,check_4,check_5,check_6,check_7,check_8,check_9;
JTextField textField_7;
JComboBox comboBox_3,comboBox_4;
JButton bill;
JLabel  em1,em2,em3,em4,em;	
			

		int i = 0;

JLabel req_2,req_3,req_4,req_5,ttitle1,ttitle2,ttitle3,ttitle4;
JRadioButton rdbtnNewRadioButton,rdbtnNewRadioButton_1,rdbtnNewRadioButton_2,rdbtnNewRadioButton_3,rdbtnNewRadioButton_4;
//JComboBox comboBox_2;
JTextField textField_5,textField_6;
ButtonGroup buttonGroup,buttonGroup_1;
JButton submitButton;

public String[][] room101 = new String[20][4]; 
public String[][] room102 = new String[20][4]; 
public String[][] room201 = new String[20][4]; 
public String[][] room202 = new String[20][4]; 
public String[][] room301 = new String[20][4]; 
public String[][] room302 = new String[20][4]; 

public int count101 = 0;
public int count102 = 0;
public int count201 = 0;
public int count202 = 0;
public int count301 = 0;
public int count302 = 0;
String s1;
int cbxSelectedindex;

String[] num = {"1", "2", "3", "4"};
String[] room = {"--select--","101 - Deluxe", "102 - Deluxe", "201 - Executive", "202 - Executive", "301 - Suite", "302 - Suite"};

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
public String[][] row2 = {
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

String l1 = "l1";   //name 
String l2 = "l2";   //roomno
String l3 = "l3";   //noofoccu
String l4 = "l4";   //type
String l5 = "l5";   //roomcost
String l6 = "l6";   //servicestotal
String l7 = "0";   //discount
String l8 = null;   //total
double totalser = 0.0;

int q = 0;

/*String s;
String[][] rooms101 = new String[4][20];
String[][] rooms102 = new String[4][20];
String[][] rooms201 = new String[4][20];
String[][] rooms202 = new String[4][20];
String[][] rooms301 = new String[4][20];
String[][] rooms302 = new String[4][20];*/

int costs[] = {5000,5000,7000,7000,9000,9000}; 

String discount[] = {"No discount","Personal discount","3rd party booking"};
int prev = 1;
String[][] broom = new String[20][2];

	double detot;
JLabel background;
int counter = 0;

//prev = 1
public void removeHome()
{
	remove(lblNewLabel);
	remove(lblNewLabel_1);
	remove(lblNewLabel_3);
	remove(lblNewLabel_4);
	remove(btnNewButton_6);
	btnNewButton.setIcon(new ImageIcon("home_unchecked.jpg"));
  if (counter == 1)
  {
    btnNewButton.setIcon(new ImageIcon("home_checked.jpg"));
    counter = 0;
  }

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
	remove(lblNewLabel_7);
  btnNewButton.setIcon(new ImageIcon("home_unchecked.jpg"));

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
	btnNewButton_1.setIcon(new ImageIcon("occupants_unchecked.jpg"));
	
}

//prev =4
public void removeRequests()
{
	remove(req_1);
	remove(comboBox_2);
	remove(table_2);
	remove(btnNewButton_8);

    remove(ttitle4);
	remove(ttitle3);
	remove(ttitle2);
	remove(ttitle1);
	btnNewButton_2.setIcon(new ImageIcon("requests_unchecked.jpg"));
	
}

//prev = 5
public void removeNewRequests()
{
	remove(req_2);
	remove(req_3);
	remove(req_4);
	remove(req_5);
	remove(textField_5);
	remove(textField_6);
	remove(rdbtnNewRadioButton);
	remove(rdbtnNewRadioButton_1);
	remove(rdbtnNewRadioButton_2);
	remove(rdbtnNewRadioButton_3);
	remove(rdbtnNewRadioButton_4);
	remove(submitButton);
	btnNewButton_2.setIcon(new ImageIcon("requests_unchecked.jpg"));
	

}

//prev = 6
public void removeCheckout()
{

	remove(check);
	remove(check_1);
	remove(check_2);
	remove(check_3);
	remove(check_4);
	remove(check_5);
	remove(check_6);
	remove(check_7);
	remove(check_8);
	remove(check_9);
	remove(bill);
	remove(comboBox_4);
	remove(comboBox_3);
	remove(textField_7);
	btnNewButton_4.setIcon(new ImageIcon("checkout_unchecked.jpg"));
	

}
//prev = 7
public void removeEmployee()
{

remove(jt);
remove(sp3);
remove(em);
remove(em1);
remove(em2);
remove(em3);
remove(em4);
btnNewButton_3.setIcon(new ImageIcon("staff_unchecked.jpg"));
}



Frame2(String data[][],String coloumn[]){
this.c = getContentPane();

em = new JLabel("NAME");
em1 = new JLabel("ROLE");
em2 = new JLabel("PHONE NO");
em3 = new JLabel("INTERCOM NO");
em4 = new JLabel("AGE");
em.setBounds(170,60,120,30);
em1.setBounds(290,60,120,30);
em2.setBounds(410,60,120,30);
em3.setBounds(520,60,120,30);
em4.setBounds(650,60,120,30);

this.setLayout(null);


	/*Image img = Toolkit.getDefaultToolkit().getImage("background.jpg");
    Frame2() throws IOException {
      this.setContentPane(new JPanel() {
         @Override
         public void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawImage(img, 0, 0, null);
         }
      });
      pack();
      setVisible(true);*/

	jt = new JTable(Frame1.data,Frame1.coloumn);
	jt.setBounds(190,50,400,400);
 	sp3 = new JScrollPane(jt);
        TableColumn colum1 = jt.getColumnModel().getColumn(3);
            colum1.setMinWidth(120);
            colum1.setMaxWidth(90);
            colum1.setPreferredWidth(80); 
       
              colum1 = jt.getColumnModel().getColumn(1);
            colum1.setMinWidth(120);
            colum1.setMaxWidth(190);
            colum1.setPreferredWidth(180);       
            
              colum1 = jt.getColumnModel().getColumn(0);
            colum1.setMinWidth(120);
            colum1.setMaxWidth(90);
            colum1.setPreferredWidth(80);       
            
              colum1 = jt.getColumnModel().getColumn(2);
            colum1.setMinWidth(120);
            colum1.setMaxWidth(190);
            colum1.setPreferredWidth(120);       
            
              colum1 = jt.getColumnModel().getColumn(4);
            colum1.setMinWidth(60);
            colum1.setMaxWidth(90);
            colum1.setPreferredWidth(80);       
            
 	Color c = new Color(89,89,89);
		
 		
		btnNewButton = new JButton("Home");
		btnNewButton.setBackground(c);
		btnNewButton.setBounds(0, 0, 130, 99);
		this.add(btnNewButton);
		btnNewButton.addActionListener(this);
		btnNewButton.setIcon(new ImageIcon("home_checked.jpg"));
		
		btnNewButton_1 = new JButton("Customers");
		btnNewButton_1.setBackground(c);
		btnNewButton_1.setBounds(0, 99, 130, 99);
		this.add(btnNewButton_1);
		btnNewButton_1.addActionListener(this);
		btnNewButton_1.setIcon(new ImageIcon("occupants_unchecked.jpg"));
		

		btnNewButton_2 = new JButton("Requests");
		btnNewButton_2.setBackground(c);
		btnNewButton_2.setBounds(0, 198, 130, 99);
		this.add(btnNewButton_2);
		btnNewButton_2.addActionListener(this);
    btnNewButton_2.addItemListener(this);
		btnNewButton_2.setIcon(new ImageIcon("requests_unchecked.jpg"));
		
		btnNewButton_3 = new JButton("Employee");
		btnNewButton_3.setBackground(c);
		btnNewButton_3.setBounds(0, 297, 130, 99);
		this.add(btnNewButton_3);
		btnNewButton_3.addActionListener(this);
		btnNewButton_3.setIcon(new ImageIcon("staff_unchecked.jpg"));
		
		btnNewButton_4 = new JButton("Check Out");
		btnNewButton_4.setBackground(c);
		btnNewButton_4.setBounds(0, 396, 130, 99);
		this.add(btnNewButton_4);
		btnNewButton_4.addActionListener(this);
    btnNewButton_4.addItemListener(this);
		btnNewButton_4.setIcon(new ImageIcon("checkout_unchecked.jpg"));
		
		btnNewButton_5 = new JButton("Logout");
		btnNewButton_5.setBackground(c);
		btnNewButton_5.setBounds(0, 495, 130, 60);
		this.add(btnNewButton_5);
		btnNewButton_5.addActionListener(this);
		btnNewButton_5.setIcon(new ImageIcon("logout.jpg"));
		

		lblNewLabel = new JLabel("Rooms Allotted");
		this.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(222, 90, 230, 33);
		lblNewLabel.setVisible(true);

		lblNewLabel_1 = new JLabel("0");
		this.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 70));
		lblNewLabel_1.setBounds(274, 137, 108, 99);
		lblNewLabel_1.setVisible(true);

		lblNewLabel_3 = new JLabel("Rooms Available");
		this.add(lblNewLabel_3);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_3.setBounds(588, 90, 230, 33);
		lblNewLabel_3.setVisible(true);

		lblNewLabel_4 = new JLabel("6");
		this.add(lblNewLabel_4);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 70));
		lblNewLabel_4.setBounds(648, 137, 103, 99);
		lblNewLabel_4.setVisible(true);

		btnNewButton_6 = new JButton("New Booking");
		this.add(btnNewButton_6);
		btnNewButton_6.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_6.setBounds(383, 421, 190, 45);
		btnNewButton_6.addActionListener(this);
		btnNewButton_6.setVisible(true);
		this.add(btnNewButton_6);
		btnNewButton_6.setIcon(new ImageIcon("newbook.png"));

		background = new JLabel("back");
 		background.setBounds(0,0,878,593);
 		background.setIcon(new ImageIcon("background.jpg"));
 		this.add(background);


		NewLabel = new JLabel("Name:");
		NewLabel.setBounds(204, 67, 60, 19);
		NewLabel.setVisible(true);

		NewLabel_1 = new JLabel("No. of Occupants:");
		NewLabel_1.setBounds(204, 124, 128, 19);
		NewLabel_1.setVisible(true);

		NewLabel_2 = new JLabel("No. of days:");
		NewLabel_2.setBounds(204, 184, 128, 19);
		NewLabel_2.setVisible(true);

		NewLabel_3 = new JLabel("Aadhar No:");
		NewLabel_3.setBounds(204, 241, 90, 19);
		NewLabel_3.setVisible(true);

		NewLabel_4 = new JLabel("Reason of Stay:");
		NewLabel_4.setBounds(204, 301, 128, 19);
		NewLabel_4.setVisible(true);

		NewLabel_5 = new JLabel("Phone number:");
		NewLabel_5.setBounds(204, 423, 90, 19);
		NewLabel_5.setVisible(true);

		NewLabel_6 = new JLabel("Room Type:");
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
		comboBox.addItemListener(this);

		//String[] room = {"101 - Deluxe", "102 - Deluxe", "201 - Executive", "202 - Executive", "301 - Suite", "302 - Suite"};
		comboBox_1 = new JComboBox(room);
		comboBox_1.setBounds(667, 117, 116, 29);
		comboBox_1.setVisible(true);

		btnNewButton_7 = new JButton("RESERVE");
		btnNewButton_7.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_7.setBounds(428, 484, 161, 55);
		btnNewButton_7.setVisible(true);
		btnNewButton_7.addActionListener(this);
		btnNewButton_7.setIcon(new ImageIcon("reserve.png"));
		

		lblNewLabel_7 = new JLabel("         Enter Valid Details");
		lblNewLabel_7.setForeground(Color.RED);
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_7.setBounds(310, 465, 183, 14);

		custitle = new JLabel("Current Customers");
		custitle.setFont(new Font("Tahoma", Font.PLAIN, 28));
		custitle.setBounds(345, 25, 250, 33);
		custitle.setVisible(true);

		aLabel = new JLabel("Room No.");
		aLabel.setBounds(191, 90, 76, 14);
		
		aLabel_1 = new JLabel("Name");
		aLabel_1.setBounds(265, 90, 46, 14);
		
		aLabel_2 = new JLabel("Occupants");
		aLabel_2.setBounds(391, 90, 70,14);
		
		aLabel_3 = new JLabel("Days");
		aLabel_3.setBounds(471, 90, 46, 14);
		
		aLabel_4 = new JLabel("Aadhar no.");
		aLabel_4.setBounds(523, 90, 62, 14);
		
		aLabel_5 = new JLabel("Mobile no.");
		aLabel_5.setBounds(631, 90, 62, 14);
	
		

		table_1 = new JTable(rows,col);
		table_1.setBounds(190, 110, 540, 170);
		sp=new JScrollPane(table_1);   
		 	TableColumn column = table_1.getColumnModel().getColumn(4);
            column.setMinWidth(110);
            column.setMaxWidth(130);
            column.setPreferredWidth(120); 

    		column = table_1.getColumnModel().getColumn(0);
            column.setMinWidth(60);
            column.setMaxWidth(70);
            column.setPreferredWidth(60); 

            column = table_1.getColumnModel().getColumn(1);
            column.setMinWidth(130);
            column.setMaxWidth(150);
            column.setPreferredWidth(133);

            column = table_1.getColumnModel().getColumn(5);
            column.setMinWidth(100);
            column.setMaxWidth(120);
            column.setPreferredWidth(100); 	

            column = table_1.getColumnModel().getColumn(2);
            column.setMinWidth(80);
            column.setMaxWidth(90);
            column.setPreferredWidth(87); 

            column = table_1.getColumnModel().getColumn(3);
            column.setMinWidth(40);
            column.setMaxWidth(50);
            column.setPreferredWidth(50); 

		

//------------------------------------------------REQUESTS ITEMS FROM HERE------------------------------------------------------------------------------------------------



		//table_1.setCellSelectionEnabled(true);
        req_1 = new JLabel("Room Number   :");
		req_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		req_1.setBounds(187, 45, 162, 34);
		

		ttitle1 = new JLabel("Title");
		ttitle1.setBounds(189,107,50,14);

		ttitle2 = new JLabel("Type");
		ttitle2.setBounds(330,107,50,14);

		ttitle3 = new JLabel("Cost");
		ttitle3.setBounds(405,107,50,14);

		ttitle4 = new JLabel("Status");
		ttitle4.setBounds(480,107,50,14);

        table_2 = new JTable(row2,col2);
		table_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		table_2.setBounds(187, 127, 370, 260);
		sp_1=new JScrollPane(table_2);   
		TableColumn colum = table_2.getColumnModel().getColumn(3);
            colum.setMinWidth(60);
            colum.setMaxWidth(90);
            colum.setPreferredWidth(80); 

    		colum = table_2.getColumnModel().getColumn(0);
            colum.setMinWidth(140);
            colum.setMaxWidth(160);
            colum.setPreferredWidth(140); 

            colum = table_2.getColumnModel().getColumn(1);
            colum.setMinWidth(60);
            colum.setMaxWidth(80);
            colum.setPreferredWidth(74);

            colum = table_2.getColumnModel().getColumn(2);
            colum.setMinWidth(60);
            colum.setMaxWidth(80);
            colum.setPreferredWidth(70); 	

		

		comboBox_2 = new JComboBox(roomr);
		comboBox_2.setBounds(409, 55, 55, 22);
		comboBox_2.setVisible(true);
		comboBox_2.addItemListener(this);
		//comboBox_2.addItemListener(new ItemListener() 
			//{
			//public void itemStateChanged(ItemEvent e){}
		//}
		//);

		btnNewButton_8 = new JButton("New Request");
		btnNewButton_8.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_8.setBounds(361, 460, 195, 60);
		btnNewButton_8.addActionListener(this);
		btnNewButton_8.setIcon(new ImageIcon("newreq.png"));
		




//--------------------------------------------------NEW REQUEST ITEMS FROM HERE----------------------------------------------------------------------




		submitButton = new JButton("SUBMIT");
		submitButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		//btnNewButton.setBackground(Color.WHITE);
		submitButton.setBounds(461, 305, 169, 52);
		submitButton.addActionListener(this);
		submitButton.setIcon(new ImageIcon("submit.png"));


		this.setLayout(null);
		req_2 = new JLabel("Enter request description ");
		req_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		req_2.setBounds(160, 10, 244, 25);



		textField_5 = new JTextField();
		textField_5.setBounds(160, 49, 244, 32);
		textField_5.setColumns(10);


		req_3 = new JLabel("Enter Price:");
		req_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		req_3.setBounds(160, 273, 244, 25);
		

		textField_6 = new JTextField();
		textField_6.setBounds(160, 312, 244, 32);
		textField_6.setColumns(10);
		

		req_4 = new JLabel("Select Category");
		req_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		req_4.setBounds(160, 106, 244, 25);
		

		buttonGroup = new ButtonGroup();

		rdbtnNewRadioButton = new JRadioButton("Food");
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnNewRadioButton.setBackground(Color.WHITE);
		rdbtnNewRadioButton.setBounds(160, 137, 127, 32);;
		

		rdbtnNewRadioButton_1 = new JRadioButton("Amenities");
		buttonGroup.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setBackground(Color.WHITE);
		rdbtnNewRadioButton_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnNewRadioButton_1.setBounds(160, 182, 127, 32);
		

		rdbtnNewRadioButton_2 = new JRadioButton("Taxi Service");
		buttonGroup.add(rdbtnNewRadioButton_2);
		rdbtnNewRadioButton_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnNewRadioButton_2.setBackground(Color.WHITE);
		rdbtnNewRadioButton_2.setBounds(160, 228, 127, 32);
		
		

		req_5 = new JLabel("Status");
		req_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		req_5.setBounds(461, 106, 244, 25);
		
		

		buttonGroup_1 = new ButtonGroup();

		rdbtnNewRadioButton_3 = new JRadioButton("Pending");
		buttonGroup_1.add(rdbtnNewRadioButton_3);
		rdbtnNewRadioButton_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnNewRadioButton_3.setBackground(Color.WHITE);
		rdbtnNewRadioButton_3.setBounds(461, 137, 127, 32);

		
		rdbtnNewRadioButton_4 = new JRadioButton("Completed");
		buttonGroup_1.add(rdbtnNewRadioButton_4);
		rdbtnNewRadioButton_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnNewRadioButton_4.setBackground(Color.WHITE);
		rdbtnNewRadioButton_4.setBounds(461, 182, 127, 32);




//---------------------------------------CHECKOUT BUTTONS TAB ITEMS FROM HERE--------------------------------------------------------------------------------


		check = new JLabel("Room Number:");
		check.setFont(new Font("Tahoma", Font.PLAIN, 18));
		check.setBounds(164, 62, 150, 18);
		
		comboBox_3 = new JComboBox(roomr);
		comboBox_3.setBounds(330, 61, 57, 22);
		comboBox_3.setVisible(true);
		comboBox_3.addItemListener(this);
		
		check_1 = new JLabel("Name:");
		check_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		check_1.setBounds(199, 136, 63, 22);
		
		check_2 = new JLabel("New label");
		check_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		check_2.setBounds(350, 136, 120, 22);
		
		check_3 = new JLabel("Room Type:");
		check_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		check_3.setBounds(199, 200, 95, 22);
		
		check_4 = new JLabel("New label");
		check_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		check_4.setBounds(350, 200, 95, 22);
		
		check_5 = new JLabel("Fare/Day:");
		check_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		check_5.setBounds(199, 258, 89, 22);
		
		check_6 = new JLabel("New label");
		check_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		check_6.setBounds(350, 258, 97, 22);
		
		check_7 = new JLabel("Discount type:");
		check_7.setFont(new Font("Tahoma", Font.PLAIN, 14));
		check_7.setBounds(199, 312, 139, 22);
		
		comboBox_4 = new JComboBox(discount);
		comboBox_4.setBounds(350, 316, 115, 22);
		comboBox_4.setVisible(true);
		comboBox_4.addItemListener(this);
		
		textField_7 = new JTextField();
		textField_7.setBounds(350, 373, 57, 20);
		textField_7.setColumns(10);
		
		check_8 = new JLabel("Enter Discount  :");
		check_8.setFont(new Font("Tahoma", Font.PLAIN, 14));
		check_8.setBounds(199, 370, 120, 22);
		
		check_9 = new JLabel("%");
		check_9.setFont(new Font("Tahoma", Font.PLAIN, 14));
		check_9.setBounds(417, 376, 28, 14);
		
		bill = new JButton("Generate Bill");
		bill.setFont(new Font("Tahoma", Font.PLAIN, 18));
		bill.setBounds(404, 445, 195, 51);
		bill.addActionListener(this);
		bill.setIcon(new ImageIcon("bill.png"));
		
//---------------------------------------------------------CHECKOUT ABOVE-----------------------------------------------------------------------------------------------
		
		
		
		
}

public void actionPerformed(ActionEvent a){

if(a.getSource() == btnNewButton){

	btnNewButton.setIcon(new ImageIcon("home_checked.jpg"));

	//if(prev == 1)
	//{
	//	removeHome();
	//}
	if(prev == 2)
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
	else if(prev ==5)
	{
		removeNewRequests();
	}
	else if(prev == 6)
	{
		removeCheckout();
	}
	else if(prev == 7)
	{
		removeEmployee();
	}
	

	invalidate();
	validate();
	repaint();
	
	add(lblNewLabel);
	add(lblNewLabel_1);
	add(lblNewLabel_3);
	add(lblNewLabel_4);
	add(btnNewButton_6);
	add(background);


	prev = 1;
}
if(a.getSource() == btnNewButton_6){
	

	if(prev == 1)
	{
		removeHome();
	}
	//else if(prev == 2)
	//{
		//removeNewBooking();
	//}
	else if (prev == 3)
	{
		removeOccupants();
	}
	else if(prev ==4)
	{
		removeRequests();
	}
	else if(prev ==5)
	{
		removeNewRequests();
	}
	else if(prev == 6)
	{
		removeCheckout();
	}
	else if(prev == 7)
	{
		removeEmployee();
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
	btnNewButton.setIcon(new ImageIcon("home_checked.jpg"));
	add(background);
	prev = 2;

}

if(a.getSource() == btnNewButton_7){
 

 System.out.println("ActionEvent entered");
if(nameField.getText().equals(null) || textField_2.getText().equals(null) || textField_3.getText().equals(null) || textField_4.getText().equals(null) || textArea.getText().equals(null) || (textField_3.getText()).length() != 12 || (textField_4.getText()).length() != 10 || comboBox_1.getSelectedIndex()== 0)
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
	if(comboBox_1.getSelectedItem().equals("101 - Deluxe")){
		i=0;
		cust[5][i] = "101";
		
		}
		if(comboBox_1.getSelectedItem().equals("102 - Deluxe")){
		i =1;
		cust[5][i] = "102";
		
		}
		if(comboBox_1.getSelectedItem().equals("201 - Executive")){
			i=2;
		cust[5][i] = "201";
				
		}
		if(comboBox_1.getSelectedItem().equals("202 - Executive")){
		i =3;
		cust[5][i] = "202";
		
		}
		if(comboBox_1.getSelectedItem().equals("301 - Suite")){
		i =4;
		cust[5][i] = "301";
		
		}
		if(comboBox_1.getSelectedItem().equals("302 - Suite")){
			i = 5;

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
		
		
		//break;
		textField_2.setText(""); 
		textField_3.setText("");
		textField_4.setText("");
		textArea.setText("");
		nameField.setText("");
		
	
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
chk1.setBounds(300,330,250,200);
chk1.setTitle("Successfull");
chk1.setVisible(true);
invalidate();
validate();
repaint();
removeNewBooking();

btnNewButton.setIcon(new ImageIcon("home_checked.jpg"));
add(lblNewLabel);
add(lblNewLabel_1);
add(lblNewLabel_3);
add(lblNewLabel_4);
add(btnNewButton_6);
prev = 1;
counter = 1;

	if(cust[5][i] == "101"){
		comboBox_1.removeItemAt(1);
	}
	if(cust[5][i] == "102"){
		comboBox_1.removeItemAt(2);
	}
	if(cust[5][i] == "201"){
		comboBox_1.removeItemAt(3);
	}
	if(cust[5][i] == "202"){
		comboBox_1.removeItemAt(4);
	}
	if(cust[5][i] == "301"){
		comboBox_1.removeItemAt(5);
	}
	if(cust[5][i] == "302"){
		comboBox_1.removeItemAt(6);
	}

q++;
if(q == 0){
lblNewLabel_1.setText("0");
lblNewLabel_4.setText("6");
}
if(q == 1){
lblNewLabel_1.setText("1");
lblNewLabel_4.setText("5");
}
if(q == 2){
lblNewLabel_1.setText("2");
lblNewLabel_4.setText("4");
}
if(q == 3){
lblNewLabel_1.setText("3");
lblNewLabel_4.setText("3");
}
if(q == 4){
lblNewLabel_1.setText("4");
lblNewLabel_4.setText("2");
}
if(q == 5){
lblNewLabel_1.setText("5");
lblNewLabel_4.setText("1");
}
if(q == 6){
lblNewLabel_1.setText("6");
lblNewLabel_4.setText("0");
}

}
add(background);
repaint();
}
if(a.getSource() == btnNewButton_1){

	btnNewButton_1.setIcon(new ImageIcon("occupants_checked.jpg"));

	if(prev == 1)
	{
		removeHome();
	}
	else if(prev == 2)
	{
		removeNewBooking();
	}
	//else if (prev == 3)
	//{
		//removeOccupants();
	//}
	else if(prev ==4)
	{
		removeRequests();
	}
	else if(prev ==5)
	{
		removeNewRequests();
	}
	else if(prev == 6)
	{
		removeCheckout();
	}
	else if(prev == 7)
	{
		removeEmployee();
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
	add(background);
	
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

btnNewButton_2.setIcon(new ImageIcon("requests_checked.jpg"));

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
	//else if(prev ==4)
	//{
		//removeRequests();
	//}
	else if(prev ==5)
	{
		removeNewRequests();
	}
	else if(prev == 6)
	{
	}
	else if(prev == 7)
	{
		removeEmployee();
	}

invalidate();
		removeCheckout();
validate();
repaint();
add(ttitle4);
add(ttitle3);
add(ttitle2);
add(ttitle1);
add(req_1);
add(comboBox_2);
add(table_2);
add(sp_1);
btnNewButton_8.setEnabled(true);
add(btnNewButton_8);
add(background);

prev = 4;

}



if(a.getSource() == btnNewButton_8)
{

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
	//else if(prev ==5)
	//{
		//removeNewRequests();
	//}
	else if(prev == 6)
	{
		removeCheckout();
	}
	else if(prev == 7)
	{
		removeEmployee();
	}

	invalidate();
	validate();
	repaint();

	
	add(submitButton);
	add(rdbtnNewRadioButton_4);
	add(rdbtnNewRadioButton_3);
	add(req_5);
	add(req_2);
	add(textField_5);
	add(req_3);
	add(textField_6);
	add(req_4);
	add(rdbtnNewRadioButton);
	add(rdbtnNewRadioButton_1);
	add(rdbtnNewRadioButton_2);
	add(req_5);
	add(background);


	prev  = 5;
	s1 = comboBox_2.getSelectedItem().toString();
	//newreq m = new newreq(comboBox_2.getSelectedItem().toString());
	//m.setSize(669,427);
	//m.setTitle("Add new Request");
	//m.setVisible(true);
	//m.setBackground(Color.WHITE);




/*	for(int v=0;v<col2.length;v++){
		for(int n=0;n<row2[0].length;n++){
			System.out.print("	btn8"+m.room101[v][n]);
			rooms101[v][n] = m.room101[v][n];
		}
	}
	for(int v=0;v<col2.length;v++){
		for(int n=0;n<row2[0].length;n++){
			rooms102[v][n] = m.room102[v][n];
		}
	}for(int v=0;v<col2.length;v++){
		for(int n=0;n<row2[0].length;n++){
			rooms201[v][n] = m.room201[v][n];
		}
	}for(int v=0;v<col2.length;v++){
		for(int n=0;n<row2[0].length;n++){
			rooms202[v][n] = m.room202[v][n];
		}
	}for(int v=0;v<col2.length;v++){
		for(int n=0;n<row2[0].length;n++){
			rooms301[v][n] = m.room301[v][n];
		}
	}for(int v=0;v<col2.length;v++){
		for(int n=0;n<row2[0].length;n++){
			rooms302[v][n] = m.room302[v][n];
		}
	}
	*/
}

if(a.getSource() == submitButton){


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
	else if(prev ==5)
	{
		removeNewRequests();
	}
	else if(prev == 6)
	{
		removeCheckout();
	}
	else if(prev == 7)
	{
		removeEmployee();
	}

	invalidate();
	validate();
	repaint();


			//for(int i=0;i< room101[0].length; i++){	
			if(s1.equals("101")){
					int i = count101;
				room101[i][0] = textField_5.getText();
				if(rdbtnNewRadioButton.isSelected())
				{
					room101[i][1] = "Food";
				}
				if(rdbtnNewRadioButton_1.isSelected())
				{
					room101[i][1] = "Amenities";
				}
				if(rdbtnNewRadioButton_2.isSelected())
				{
					room101[i][1] = "Taxi Service";
				}
				if(rdbtnNewRadioButton_3.isSelected())
				{
					room101[i][3] = "Pending";	
				}
				if(rdbtnNewRadioButton_4.isSelected())
				{
					room101[i][3] = "Completed";
				}
				//room1[1][i] = rdbtnNewRadioButton.isSelected().toString();;
				room101[i][2] = textField_6.getText();
				count101++;
				//room1[3][i] = buttonGroup_1.getSelectedItem().toString();;

System.out.println("SUBMIT CLICKED"+room101[1][i]);
				
			}
			//}



			if(s1.equals("102")){
					int i = count102;
				room102[i][0] = textField_5.getText();
				if(rdbtnNewRadioButton.isSelected())
				{
					room102[i][1] = "Food";
				}
				if(rdbtnNewRadioButton_1.isSelected())
				{
					room102[i][1] = "Amenities";
				}
				if(rdbtnNewRadioButton_2.isSelected())
				{
					room102[i][1] = "Taxi Service";
				}
				if(rdbtnNewRadioButton_3.isSelected())
				{
					room102[i][3] = "Pending";	
				}
				if(rdbtnNewRadioButton_4.isSelected())
				{
					room102[i][3] = "Completed";
				}
				//room1[1][i] = rdbtnNewRadioButton.isSelected().toString();;
				room102[i][2] = textField_6.getText();
				count102++;
				//room1[3][i] = buttonGroup_1.getSelectedItem().toString();;
				
			}
			//}



			if(s1.equals("201")){
					int i = count201;
				room201[i][0] = textField_5.getText();
				if(rdbtnNewRadioButton.isSelected())
				{
					room201[i][1] = "Food";
				}
				if(rdbtnNewRadioButton_1.isSelected())
				{
					room201[i][1] = "Amenities";
				}
				if(rdbtnNewRadioButton_2.isSelected())
				{
					room201[i][1] = "Taxi Service";
				}
				if(rdbtnNewRadioButton_3.isSelected())
				{
					room201[i][3] = "Pending";	
				}
				if(rdbtnNewRadioButton_4.isSelected())
				{
					room201[i][3] = "Completed";
				}
				//room1[1][i] = rdbtnNewRadioButton.isSelected().toString();;
				room201[i][2] = textField_6.getText();
				count201++;
				//room1[3][i] = buttonGroup_1.getSelectedItem().toString();;
				
			}
			//}
			if(s1.equals("202")){
					int i = count202;
				room202[i][0] = textField_5.getText();
				if(rdbtnNewRadioButton.isSelected())
				{
					room202[i][1] = "Food";
				}
				if(rdbtnNewRadioButton_1.isSelected())
				{
					room202[i][1] = "Amenities";
				}
				if(rdbtnNewRadioButton_2.isSelected())
				{
					room202[i][1] = "Taxi Service";
				}
				if(rdbtnNewRadioButton_3.isSelected())
				{
					room202[i][3] = "Pending";	
				}
				if(rdbtnNewRadioButton_4.isSelected())
				{
					room202[i][3] = "Completed";
				}
				//room1[1][i] = rdbtnNewRadioButton.isSelected().toString();;
				room202[i][2] = textField_6.getText();
				count202++;
				//room1[3][i] = buttonGroup_1.getSelectedItem().toString();;
				
			}
			//}



			if(s1.equals("301")){
					int i = count301;
				room301[i][0] = textField_5.getText();
				if(rdbtnNewRadioButton.isSelected())
				{
					room301[i][1] = "Food";
				}
				if(rdbtnNewRadioButton_1.isSelected())
				{
					room301[i][1] = "Amenities";
				}
				if(rdbtnNewRadioButton_2.isSelected())
				{
					room301[i][1] = "Taxi Service";
				}
				if(rdbtnNewRadioButton_3.isSelected())
				{
					room301[i][3] = "Pending";	
				}
				if(rdbtnNewRadioButton_4.isSelected())
				{
					room301[i][3] = "Completed";
				}
				//room1[1][i] = rdbtnNewRadioButton.isSelected().toString();;
				room301[i][2] = textField_6.getText();
				count301++;
				//room1[3][i] = buttonGroup_1.getSelectedItem().toString();;
			
			}
			//}
			if(s1.equals("302")){
					int i = count302;
				room302[i][0] = textField_5.getText();
				if(rdbtnNewRadioButton.isSelected())
				{
					room302[i][1] = "Food";
				}
				if(rdbtnNewRadioButton_1.isSelected())
				{
					room302[i][1] = "Amenities";
				}
				if(rdbtnNewRadioButton_2.isSelected())
				{
					room302[i][1] = "Taxi Service";
				}
				if(rdbtnNewRadioButton_3.isSelected())
				{
					room302[i][3] = "Pending";	
				}
				if(rdbtnNewRadioButton_4.isSelected())
				{
					room302[i][3] = "Completed";
				}
				//room1[1][i] = rdbtnNewRadioButton.isSelected().toString();;
				room302[i][2] = textField_6.getText();
				count302++;
				//room1[3][i] = buttonGroup_1.getSelectedItem().toString();;
				
			}

if(comboBox_2.getSelectedIndex() == 0){
	for(int v=0;v<col2.length;v++){
		for(int n=0;n<row2[0].length;n++){
			row2[v][n] =room101[v][n];
		}
	}
}
if(comboBox_2.getSelectedIndex() == 1){
	for(int v=0;v<col2.length;v++){
		for(int n=0;n<row2[0].length;n++){
			row2[v][n] = room102[v][n];
		}
	}
}
if(comboBox_2.getSelectedIndex() == 2){
	for(int v=0;v<col2.length;v++){
		for(int n=0;n<row2[0].length;n++){
			row2[v][n] = room201[v][n];
		}
	}
}
if(comboBox_2.getSelectedIndex() == 3){
	for(int v=0;v<col2.length;v++){
		for(int n=0;n<row2[0].length;n++){
			row2[v][n] = room202[v][n];
		}
	}
}
if(comboBox_2.getSelectedIndex() == 4){
	for(int v=0;v<col2.length;v++){
		for(int n=0;n<row2[0].length;n++){
			row2[v][n] = room301[v][n];
		}
	}
}
if(comboBox_2.getSelectedIndex() == 5){
	for(int v=0;v<col2.length;v++){
		for(int n=0;n<row2[0].length;n++){
			row2[v][n] = room302[v][n];
		}
	}
}

invalidate();
validate();
repaint();
add(req_1);
add(comboBox_2);
add(table_2);
add(sp_1);
add(btnNewButton_8);
add(background);
textField_5.setText("");
textField_6.setText("");

prev = 4;

}
//----------------------------------btnNewBUtton_3 -------> EMPLOYEE-------------------------------------------------------------------------------------------------

if(a.getSource() == btnNewButton_3){

btnNewButton_3.setIcon(new ImageIcon("staff_checked.jpg"));

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
	else if(prev ==5)
	{
		removeNewRequests();
	}
	else if(prev == 6)
	{
		removeCheckout();
	}
	//else if(prev == 7)
	//{
		//removeEmployee();
	//}

add(jt);
add(sp3);
add(em);
add(em1);
add(em2);
add(em3);
add(em4);

add(background);

repaint();


prev = 7;
}

//----------------------------------btnNewBUtton_4 -------> CHECK OUT-------------------------------------------------------------------------------------------------

if(a.getSource() == btnNewButton_4)
{
	btnNewButton_4.setIcon(new ImageIcon("checkout_checked.jpg"));

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
	else if(prev ==5)
	{
		removeNewRequests();
	}
	//else if(prev == 6)
	//{
		//removeCheckout();
	//}
	else if(prev == 7)
	{
		removeEmployee();
	}

	invalidate();
	validate();
	repaint();

	add(check);
	add(check_1);
	add(check_2);
	add(check_3);
	add(check_4);
	add(check_5);
	add(check_6);
	add(check_7);
	add(check_8);
	add(check_9);
	add(bill);
	add(comboBox_4);
	add(comboBox_3);
	add(textField_7);
	add(background);


	prev = 6;


//---------------------------------------------------bill------------->GENERATE BILL---------------------------------------------------------
}
if(a.getSource() == bill)
{
	System.out.println("BILL ENTERED");



	if(comboBox_3.getSelectedIndex() == 0){
		if(cust[1][0] != null){
			l1=(cust[6][0]);
			l2=("101");
			l4=("Deluxe");
			l3=(cust[1][0]);
			l5="7000.0 x "+cust[2][0];
		}
		for(int n=0;n<20;n++){
			broom[n][0] = room101[n][0];
			broom[n][1] = room101[n][2];
		}
		for(int k=0;k<20;k++){	
			if(room101[k][2] != null){
				if(room101[k][3].equals("Completed")){
					totalser = totalser + Double.parseDouble(room101[k][2]);
					room101[k][2] = null;
					room101[k][3] = null;
					room101[k][1] = null;
					room101[k][0] = null;
			}
		}
		}
		l6=""+totalser;
		if(cust[2][0] !=null){
		detot = totalser + (7000*Integer.parseInt(cust[2][0]));
		}
		else{
			detot = 0;
		}
		l8=""+(detot);
		for(int l = 0; l<7;l++)
		{
			cust[l][0] = null;
		}
		comboBox_1.insertItemAt("101 - Deluxe",1);
	}


	if(comboBox_3.getSelectedIndex() == 1){
		if(cust[1][1] != null){
			l1=(cust[6][1]);
			l2=("102");
			l4=("Deluxe");
			l3=(cust[1][1]);
			l5="7000.0 x "+cust[2][1]; 
		}
		for(int n=0;n<20;n++){
			broom[n][0] = room102[n][0];
			broom[n][1] = room102[n][2];
		}
		for(int k=0;k<20;k++){
			if(room102[k][2] != null){	
				if(room102[k][3].equals("Completed")){
					totalser = totalser + Double.parseDouble(room102[k][2]);
					room102[k][2] = null;
					room102[k][3] = null;
					room102[k][1] = null;
					room102[k][0] = null;
			}
		}
	}
		l6=""+(totalser);
		if(cust[2][1] !=null){
		detot = totalser + (7000*Integer.parseInt(cust[2][1]));
		}
		else{
			detot = 0;
		}
		l8=""+(detot);
		for(int l = 0; l<7;l++)
		{
			cust[l][1] = null;
		}
		comboBox_1.insertItemAt("102 - Deluxe",2);
	}



	if(comboBox_3.getSelectedIndex() == 2){
		if(cust[1][2] != null){
			l1=(cust[6][2]);
			l2=("201");
			l4=("Executive");
			l3=(cust[1][2]);
			l5="5000.0 x "+cust[2][2]; 
		}
		for(int n=0;n<20;n++){
			broom[n][0] = room201[n][0];
			broom[n][1] = room201[n][2];
		}
		for(int k=0;k<2;k++){
			if(room201[k][2] != null){
				if(room201[k][3].equals("Completed")){
					totalser = totalser + Double.parseDouble(room201[k][2]);
					room201[k][2] = null;
					room201[k][3] = null;
					room201[k][1] = null;
					room201[k][0] = null;
			}
		}
	}
		l6=""+(totalser);
		if(cust[2][2] !=null){
		detot = totalser + (5000*Integer.parseInt(cust[2][2]));
		}
		else{
			detot = 0;
		}
		l8=""+(detot);
		for(int l = 0; l<7;l++)
		{
			cust[l][2] = null;
		}
	
	comboBox_1.insertItemAt("201 - Executive",3);
	}





	if(comboBox_3.getSelectedIndex() == 3){
		if(cust[1][3] != null){
			l1=(cust[6][3]);
			l2=("202");
			l4=("Executive");
			l3=(cust[1][3]);
			l5="5000.0 x "+cust[2][3];  
		}
		for(int n=0;n<20;n++){
			broom[n][0] = room202[n][0];
			broom[n][1] = room202[n][2];
		}
		for(int k=0;k<20;k++){
			if(room202[k][2] != null){	
				if(room202[k][3].equals("Completed")){
					totalser = totalser + Double.parseDouble(room202[k][2]);
					room202[k][2] = null;
					room202[k][3] = null;
					room202[k][1] = null;
					room202[k][0] = null;
			}
		}
	}
		l6=""+(totalser);
		if(cust[2][3] !=null){
		detot = totalser + (5000*Integer.parseInt(cust[2][3]));
		}
		else{
			detot = 0;
		}
		l8=""+(detot);
		for(int l = 0; l<7;l++)
		{
			cust[l][3] = null;
		}
	
	comboBox_1.insertItemAt("202 - Executive",4);
	}



	if(comboBox_3.getSelectedIndex() == 4){
		if(cust[1][4] != null){
			l1=(cust[6][4]);
			l2=("301");
			l4=("Suite");
			l3=(cust[1][4]);
			l5="9000.0 x "+cust[2][4]; 
		}
		for(int n=0;n<20;n++){
			broom[n][0] = room301[n][0];
			broom[n][1] = room301[n][2];
		}
		for(int k=0;k<20;k++){
			if(room301[k][2] != null){	
				if(room301[k][3].equals("Completed")){
					totalser = totalser + Double.parseDouble(room301[k][2]);
					room301[k][2] = null;
					room301[k][3] = null;
					room301[k][1] = null;
					room301[k][0] = null;
			}
		}
	}
		l6=""+(totalser);
		if(cust[2][4] !=null){
		detot = totalser + (9000*Integer.parseInt(cust[2][4]));
		}
		else{
			detot = 0;
		}
		l8=""+(detot);
		for(int l = 0; l<7;l++)
		{
			cust[l][4] = null;
		}
	
	comboBox_1.insertItemAt("301 - Suite",5);
	}



	if(comboBox_3.getSelectedIndex() == 5){
		if(cust[1][5] != null){
			l1=(cust[6][5]);
			l2=("302");
			l4=("Suite");
			l3=(cust[1][5]); 
			l5="9000.0 x "+cust[2][5]; 
		}
		for(int n=0;n<20;n++){
			broom[n][0] = room302[n][0];
			broom[n][1] = room302[n][2];
		}
		for(int k=0;k<20;k++){
			if(room302[k][2] != null){
				if(room302[k][3].equals("Completed")){
					totalser = totalser + Double.parseDouble(room302[k][2]);
					room302[k][2] = null;
					room302[k][3] = null;
					room302[k][1] = null;
					room302[k][0] = null;
			}
		}
	}
		l6=""+(totalser);
		if(cust[2][5] !=null){
		detot = totalser + (9000*Integer.parseInt(cust[2][5]));
		}
		else{
			detot = 0;
		}
		l8=""+(detot);
		for(int l = 0; l<7;l++)
		{
			cust[l][5] = null;
		}
	
	comboBox_1.insertItemAt("302 - Executive",6);

	}
	
	l7=(textField_7.getText());



	billframe b = new billframe(l1,l2,l3,l4,l5,l6,l7,l8,broom);
	b.setBounds(80,0,680,768);
	b.setVisible(true);
	b.setTitle("Bill");
	q--;
if(q == 0){
lblNewLabel_1.setText("0");
lblNewLabel_4.setText("6");
}
if(q == 1){
lblNewLabel_1.setText("1");
lblNewLabel_4.setText("5");
}
if(q == 2){
lblNewLabel_1.setText("2");
lblNewLabel_4.setText("4");
}
if(q == 3){
lblNewLabel_1.setText("3");
lblNewLabel_4.setText("3");
}
if(q == 4){
lblNewLabel_1.setText("4");
lblNewLabel_4.setText("2");
}
if(q == 5){
lblNewLabel_1.setText("5");
lblNewLabel_4.setText("1");
}
if(q == 6){
lblNewLabel_1.setText("6");
lblNewLabel_4.setText("0");
}
add(background);
repaint();

}
if(a.getSource() == btnNewButton_5){

	dispose();
}		

}


public void itemStateChanged(ItemEvent e)
{
	repaint();
	System.out.println("CHANGED");
	if(comboBox_2.getSelectedIndex() == 0)
	{
		btnNewButton_8.setEnabled(true);
		if(cust[1][0] == null)
		{
			btnNewButton_8.setEnabled(false);	
		}
		System.out.println("0");
		for(int l1 = 0;l1<col2.length;l1++)
		{	
			for(int l2 = 0;l2< row2[0].length;l2++)
			{
				row2[l1][l2] = room101[l1][l2];
			}
		}
	}
	
	if(comboBox_2.getSelectedIndex() == 1)
	{
		btnNewButton_8.setEnabled(true);
		if(cust[1][1] == null)
		{
			btnNewButton_8.setEnabled(false);	
		}
		System.out.println("1");
		for(int l1 = 0;l1< col2.length;l1++)
		{	
			for(int l2 = 0;l2< row2[0].length;l2++)
			{
				row2[l1][l2] = room102[l1][l2];
			}
		}
	}

	if(comboBox_2.getSelectedIndex() == 2)
	{
		btnNewButton_8.setEnabled(true);
		if(cust[1][2] == null)
		{
			btnNewButton_8.setEnabled(false);	
		}
		System.out.println("2");
		for(int l1 = 0; l1< col2.length;l1++)
		{	
			for(int l2 = 0; l2< row2[0].length;l2++)
			{
				row2[l1][l2] = room201[l1][l2];
			}
		}
	}

	if(comboBox_2.getSelectedIndex() == 3)
	{
		btnNewButton_8.setEnabled(true);
		if(cust[1][3] == null)
		{
			btnNewButton_8.setEnabled(false);	
		}
		for(int l1 = 0; l1<col2.length;l1++)
		{	
			for(int l2 = 0; l2<row2[0].length;l2++)
			{
				row2[l1][l2] = room202[l1][l2];
			}
		}
	}

	if(comboBox_2.getSelectedIndex() == 4)
	{
		btnNewButton_8.setEnabled(true);
		if(cust[1][4] == null)
		{
			btnNewButton_8.setEnabled(false);	
		}
		for(int l1 = 0; l1<col2.length;l1++)
		{	
			for(int l2 = 0; l2<row2[0].length;l2++)
			{
				row2[l1][l2] = room301[l1][l2];
			}
		}
	}

	if(comboBox_2.getSelectedIndex() == 5)
	{
		btnNewButton_8.setEnabled(true);
		if(cust[1][5] == null)
		{
			btnNewButton_8.setEnabled(false);	
		}
		for(int l1 = 0; l1<col2.length;l1++)
		{	
			for(int l2 = 0;l2< row2[0].length;l2++)
			{
				row2[l1][l2] = room302[l1][l2];
			}
		}
	}


//------------------------------------------------------Item Listener for comboBox in checkout-----------------------------------------------------------------------

cbxSelectedindex = comboBox_3.getSelectedIndex();
	
		check_2.setText(cust[6][cbxSelectedindex]);
		if(cbxSelectedindex == 0)
		{
			bill.setEnabled(true);
			if(cust[1][0] == null)
			{
				bill.setEnabled(false);	
			}
			check_4.setText("Deluxe");	
		}
		if(cbxSelectedindex == 1)
		{
			bill.setEnabled(true);
			if(cust[1][1] == null)
			{
				bill.setEnabled(false);	
			}
			check_4.setText("Deluxe");	
		}
		else if(cbxSelectedindex== 2)
		{
			bill.setEnabled(true);
			if(cust[1][2] == null)
			{
				bill.setEnabled(false);	
			}
			check_4.setText("Executive");
		}
		else if(cbxSelectedindex== 3)
		{
			bill.setEnabled(true);
			if(cust[1][3] == null)
			{
				bill.setEnabled(false);	
			}
			check_4.setText("Executive");
		}
		else if(cbxSelectedindex == 4)
		{
			bill.setEnabled(true);
			if(cust[1][4] == null)
			{
				bill.setEnabled(false);	
			}
			check_4.setText("Suite");
		}
		else if(cbxSelectedindex == 5)
		{
			bill.setEnabled(true);
			if(cust[1][5] == null)
			{
				bill.setEnabled(false);	
			}
			check_4.setText("Suite");
		}

		check_6.setText(""+costs[cbxSelectedindex]);



textField_7.setEnabled(true);
check_8.setVisible(true);
check_9.setVisible(true);

if(comboBox_4.getSelectedIndex() == 0)
{
	l7 = "0";
	textField_7.setEnabled(false);
	textField_7.setText("0");
	check_8.setVisible(false);
	check_9.setVisible(false);
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
		done.setBounds(97,40,70,30);
		done.setVisible(true);
		this.add(done);

		d = new JButton("OKAY");
		d.setBounds(65,90,100,30);
		d.setVisible(true);
		d.addActionListener(this);
		d.setIcon(new ImageIcon("done.png"));
		this.add(d);
	}
	public void actionPerformed(ActionEvent ad){

	if(ad.getSource() == d){
		dispose();
	}
}
}



class billframe extends JFrame implements ActionListener
{

	String[][] serout = {
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
			};
String[] serprice = {"Service","Price"};

JLabel outbill,outbill_1,outbill_2,outbill_3,outbill_4,outbill_5,outbill_6,outbill_7,outbill_8,outbill_9,outbill_10,outbill_11,outbill_12,outbill_13,outbill_14,outbill_15,outbill_16,outbill_17,outbill_18,outbill_19,outbill_20,outbill_21;
JButton outbutton;
JTable table_3;

String[] cust[] = {
					{null,null,null,null,null,null},
					{null,null,null,null,null,null},	//no.of occupants
					{null,null,null,null,null,null},		//no.of days
					{null,null,null,null,null,null},		//adhaar
					{null,null,null,null,null,null},		//phone no.
					{null,null,null,null,null,null},	//room
					{null,null,null,null,null,null}, 		//name	
};

String[][] room101 = new String[4][20];
String[][] room102 = new String[4][20];
String[][] room201 = new String[4][20];
String[][] room202 = new String[4][20];
String[][] room301 = new String[4][20];
String[][] room302 = new String[4][20];

String l1 = "l1";   //name 
String l2 = "l2";   //roomno
String l3 = "l3";   //noofoccu
String l4 = "l4";   //type
String l5 = "l5";   //roomcost
String l6 = "l6";   //servicestotal
String l7 = "0";   //discount
String l8 = "l8";   //total+dis
String l9 = "l9";   //total
String l10 = "0.0"; //tax
double totdis =0;
double dis =0;
double total =0;
double disco = 0;
double tax = 0;


billframe(String l1,String l2,String l3,String l4,String l5,String l6,String l7,String l8,String[][] broom)
{
		
		this.l1 = l1;
		this.l2 = l2;
		this.l3 = l3;
		this.l4 = l4;
		this.l5 = l5;
		this.l6 = l6;
		this.l7 = l7;
		this.l8 = l8;
		System.out.println("l7 = " +l7); 	
		totdis = Double.parseDouble(l8);
		dis = Double.parseDouble(l7);
		disco = (totdis*dis)/100;	
		tax = (totdis*28)/100;
		total = totdis - disco + tax;
		l9 =(Double.toString(total));
		l10 =(Double.toString(tax));
		
    this.setLayout(null);



    outbill = new JLabel("HOTEL INVOICE");
    outbill.setBounds(332, 85, 250, 41);
    outbill.setForeground(new Color(0, 0, 0));
    outbill.setFont(new Font("Trebuchet MS", Font.BOLD, 22));
    //this.add(outbill);
    
    outbill_1 = new JLabel("Hotel Radisson");
    outbill_1.setBounds(244, 18, 260, 63);
    outbill_1.setFont(new Font("Edwardian Script ITC", Font.BOLD, 40));
    outbill_1.setForeground(Color.WHITE);
    this.add(outbill_1);
    
    outbill_2 = new JLabel("Name:");
    outbill_2.setBounds(80, 110, 77, 25);
    outbill_2.setFont(new Font("Trebuchet MS", Font.BOLD, 19));
    this.add(outbill_2);
    
    outbill_3 = new JLabel("New label");
    outbill_3.setBounds(143, 110, 150, 25);
    outbill_3.setText(l1);
    outbill_3.setFont(new Font("Trebuchet MS", Font.BOLD, 19));
    this.add(outbill_3);
    
    outbill_4 = new JLabel("Room Number:");
    outbill_4.setBounds(400, 110, 180, 18);
    outbill_4.setFont(new Font("Trebuchet MS", Font.BOLD, 19));
    this.add(outbill_4);
    
    outbill_6 = new JLabel("1011");
    outbill_6.setText(l2);
    outbill_6.setBounds(543, 110, 46, 18);
    outbill_6.setFont(new Font("Trebuchet MS", Font.BOLD, 19));
    this.add(outbill_6);
    
    outbill_5 = new JLabel("No. of Occupants:");
    outbill_5.setFont(new Font("Trebuchet MS", Font.BOLD, 19));
    outbill_5.setBounds(80, 163, 190, 22);
    this.add(outbill_5);
    
    outbill_7 = new JLabel("23");
    outbill_7.setText(l3);
    outbill_7.setFont(new Font("Trebuchet MS", Font.BOLD, 19));
    outbill_7.setBounds(250, 163, 55, 22);
    this.add(outbill_7);
    
    outbill_8 = new JLabel("Room Type:");
    outbill_8.setFont(new Font("Trebuchet MS", Font.BOLD, 19));
    outbill_8.setBounds(400, 163, 130, 22);
    this.add(outbill_8);
    
    outbill_9 = new JLabel("Deluxe");
    outbill_9.setFont(new Font("Trebuchet MS", Font.BOLD, 19));
    outbill_9.setBounds(519, 163, 125, 22);
    this.add(outbill_9);
    outbill_9.setText(l4);
    
    
    table_3 = new JTable(broom,serprice);
    table_3.setBounds(50, 271, 255, 352);
    this.add(table_3);
    
    outbill_10 = new JLabel("Services");
    outbill_10.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
    outbill_10.setBounds(51, 245, 110, 25);
    this.add(outbill_10);
    
    outbill_11 = new JLabel("Price");
    outbill_11.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
    outbill_11.setBounds(181, 245, 46, 25);
    this.add(outbill_11);
    
    outbutton = new JButton("DONE");
    outbutton.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
    outbutton.setBounds(280, 661, 160, 35);
    outbutton.addActionListener(this);
    outbutton.setIcon(new ImageIcon("done.png"));
    this.add(outbutton);
    
    outbill_12 = new JLabel("Room Cost:   ");
    outbill_12.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
    outbill_12.setBounds(368, 304, 115, 25);
    this.add(outbill_12);
    
    outbill_13 = new JLabel("New label");
    outbill_13.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
    outbill_13.setBounds(512, 304, 150, 25);
    this.add(outbill_13);
    outbill_13.setText(l5);
    
    
    outbill_14 = new JLabel("Services:");
    outbill_14.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
    outbill_14.setBounds(368, 369, 98, 25);
    this.add(outbill_14);
    
    outbill_15 = new JLabel("New label");
    outbill_15.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
    outbill_15.setBounds(512, 369, 77, 25);
    this.add(outbill_15);
    outbill_15.setText(l6);
    
    
    outbill_16 = new JLabel("Discount:");
    outbill_16.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
    outbill_16.setBounds(368, 434, 97, 25);
    this.add(outbill_16);
    
    outbill_17 = new JLabel("New label");
    outbill_17.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
    outbill_17.setBounds(512, 434, 77, 25);
    this.add(outbill_17);
    outbill_17.setText(l7);
		
		outbill_20 = new JLabel("Taxes:");
		outbill_20.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		outbill_20.setBounds(368, 499, 77, 25);
		this.add(outbill_20);
		
		outbill_21 = new JLabel("New label");
		outbill_21.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		outbill_21.setBounds(512, 499, 77, 25);
		this.add(outbill_21);
		outbill_21.setText(l10);
		

    outbill_18 = new JLabel("TOTAL:");
    outbill_18.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
    outbill_18.setBounds(368, 564, 98, 25);
    this.add(outbill_18);
    
    outbill_19 = new JLabel("0000");
    outbill_19.setFont(new Font("Trebuchet MS", Font.BOLD, 21));
    outbill_19.setBounds(512, 564, 100, 25);
    this.add(outbill_19);
    outbill_19.setText(l9);

    JLabel imgLabel_2 = new JLabel("Welcome");
    imgLabel_2.setIcon(new ImageIcon("template.jpg"));
    imgLabel_2.setBounds(0, 0,680,768);
    this.add(imgLabel_2);


}
public void actionPerformed(ActionEvent bf)
{
	if(bf.getSource() == outbutton)
	{
		System.out.println(cust[1][0]);
		System.out.println(room101[0][0]);
		dispose();
	}
}

}

/*class newreq extends JFrame implements ActionListener
{
JLabel req_2,req_3,req_4,req_5;
JRadioButton rdbtnNewRadioButton,rdbtnNewRadioButton_1,rdbtnNewRadioButton_2,rdbtnNewRadioButton_3,rdbtnNewRadioButton_4;
//JComboBox comboBox_2;
JTextField textField_5,textField_6;
ButtonGroup buttonGroup,buttonGroup_1;
JButton submitButton;

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
//----------------------------------------------------------------------
	newreq(String s1)
	{
		this.s1 = s1;
		this.setLayout(null);
		req_2 = new JLabel("Enter request description ");
		req_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		req_2.setBounds(10, 10, 244, 25);



		textField_5 = new JTextField();
		textField_5.setBounds(10, 49, 244, 32);
		textField_5.setColumns(10);


		req_3 = new JLabel("Enter Price:");
		req_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		req_3.setBounds(10, 273, 244, 25);
		

		textField_6 = new JTextField();
		textField_6.setBounds(10, 312, 244, 32);
		textField_6.setColumns(10);
		

		req_4 = new JLabel("Select Category");
		req_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		req_4.setBounds(10, 106, 244, 25);
		

		buttonGroup = new ButtonGroup();

		rdbtnNewRadioButton = new JRadioButton("Food");
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		//rdbtnNewRadioButton.setBackground(Color.WHITE);
		rdbtnNewRadioButton.setBounds(10, 137, 127, 32);;
		

		rdbtnNewRadioButton_1 = new JRadioButton("Amenities");
		buttonGroup.add(rdbtnNewRadioButton_1);
		//rdbtnNewRadioButton_1.setBackground(Color.WHITE);
		rdbtnNewRadioButton_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnNewRadioButton_1.setBounds(10, 182, 127, 32);
		

		rdbtnNewRadioButton_2 = new JRadioButton("Taxi Service");
		buttonGroup.add(rdbtnNewRadioButton_2);
		rdbtnNewRadioButton_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		//rdbtnNewRadioButton_2.setBackground(Color.WHITE);
		rdbtnNewRadioButton_2.setBounds(10, 228, 127, 32);
		
		

		req_5 = new JLabel("Status");
		req_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		req_5.setBounds(311, 106, 244, 25);
		
		

		buttonGroup_1 = new ButtonGroup();

		rdbtnNewRadioButton_3 = new JRadioButton("Pending");
		buttonGroup_1.add(rdbtnNewRadioButton_3);
		rdbtnNewRadioButton_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		//rdbtnNewRadioButton_3.setBackground(Color.WHITE);
		rdbtnNewRadioButton_3.setBounds(311, 137, 127, 32);

		
		rdbtnNewRadioButton_4 = new JRadioButton("Completed");
		buttonGroup_1.add(rdbtnNewRadioButton_4);
		rdbtnNewRadioButton_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		//rdbtnNewRadioButton_4.setBackground(Color.WHITE);
		rdbtnNewRadioButton_4.setBounds(311, 182, 127, 32);

//------------------------------------------------------------------------------------------------------------------------------------------	
				
		}
	public void actionPerformed(ActionEvent c){
		if(c.getSource() == submitButton){


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

System.out.println("SUBMIT CLICKED"+room101[1][i]);
				
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
				dispose();
			}
		}
	}	
*/