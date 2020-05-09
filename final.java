import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.TableColumn;
import javax.swing.ComboBoxEditor;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.IOException;
import java.util.*;

class Frame1 extends JFrame implements ActionListener{
 
 JButton btnNewButton;
 int count = 0;
 JTextField textField;
 TextField passwordField;
  String[] user = new String[20];
  String[] pass = new String[20];
 static String[][] data = new String[20][6];
  static String[] coloumn = new String[5];
  static String[][] room = new String[6][7];
  static String[] coloumn1 = new String[7];
   int ecount=14;
 static String[] adsroom = new String[6];
 
Frame1(){
       // adsroom = new String[]{"101 - Deluxe", "102 - Deluxe", "201 - Executive", "202 - Executive", "301 - Suite", "302 - Suite"};
       
    adsroom[0] = "101 - Deluxe" ;
    adsroom[1] = "102 - Deluxe";
    adsroom[2] = "201 - Executive";
    adsroom[3] = "202 - Executive";
    adsroom[4] = "301 - Suite";
    adsroom[5] = "302 - Suite" ;
    coloumn1[0] = "ROOM NO";
    coloumn1[1] = "TYPE";
    coloumn1[2] = "COST";
    coloumn1[3] = "NO of TV's";
    coloumn1[4] = "ROOM SIZE(sqft)";
    coloumn1[5] = "WIFI Password";
    coloumn1[6] = "Ph-Service";
    
    room[0][0] = "101";
    room[0][1] = "DELUXE";
    room[0][2] = "7000";
    room[0][3] = "2";
    room[0][4] = "303";
    room[0][5] = "penguin101";
    room[0][6] = "101";
    room[1][0] = "102";
    room[1][1] = "DELUXE";
    room[1][2] = "7000";
    room[1][3] = "2";
    room[1][4] = "306";
    room[1][5] = "elegantboat";
    room[1][6] = "102";
    room[2][0] = "201";
    room[2][1] = "EXCECUTIVE";
    room[2][2] = "5000";
    room[2][3] = "1";
    room[2][4] = "250";
    room[2][5] = "hotelwifi";
    room[2][6] = "201";
    room[3][0] = "202";
    room[3][1] = "EXCECUTIVE";
    room[3][2] = "5000";
    room[3][3] = "1";
    room[3][4] = "255";
    room[3][5] = "gocorona";
    room[3][6] = "202";
    room[4][0] = "301";
    room[4][1] = "SUITE";
    room[4][2] = "9000";
    room[4][3] = "3";
    room[4][4] = "400";
    room[4][5] = "royalty";
    room[4][6] = "301";
    room[5][0] = "302";
    room[5][1] = "SUITE";
    room[5][2] = "9000";
    room[5][3] = "3";
    room[5][4] = "420";
    room[5][5] = "monarch";
    room[5][6] = "302";
    
    
   
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
			Frame2 f2 = new Frame2(data,coloumn,room,coloumn1);
			
      f2.setBounds(90,110,878,591);
			f2.setTitle("Hotel Management System");
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
 
  JButton ab1,ab2,ab3,ab4,ab5,ab6; 
  JComboBox acb,acb1,acb2;
  JTextField atf1,atf2,atf3,atf4,atf5,atf6,atf7,atf8,atf9,atf0,art0,art1;
  JLabel al1,al2,al3,al4,al5,al6,al7,al0,al8,al9,al10;
 JLabel[] alb = new JLabel[20];
  String msg;
  int c=0;
  int count = 3;
  int addIsPressed = 0;
  int ei,ar;
 int addEmployee = 0,changeCost=0;
      JLabel erlabel;
  
 
  AdminPage(){
      
   
      this.setLayout(null);
      
      atf1 = new JTextField();
      atf2 = new JTextField();
      atf3 = new JTextField();
      atf4 = new JTextField();
      atf8 = new JTextField();
      atf9 = new JTextField();
      atf0 = new JTextField();
      art0 = new JTextField();
      art0.setEditable(false);
      art1 = new JTextField();
      
      al1= new JLabel("Username");
      al9= new JLabel("Current Cost");
      al10= new JLabel("New Cost");

      al8= new JLabel("Room Cost");
      al0= new JLabel("Current users");
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
      ab6 = new JButton("Change");
      
      ab1.setBounds(230,50,100,30);
      ab2.setBounds(230,200,130,30);
      ab3.setBounds(380,500,100,30);
      ab4.setBounds(500,50,150,30);
      ab5.setBounds(500,200,130,30);
      
      al8.setBounds(70,170,100,30);
      ab6.setBounds(50,200,100,30);
      al1.setBounds(230,230,100,30);
      al3.setBounds(500,230,100,30);
      atf1.setBounds(230,260,100,30); //here combo box
      atf3.setBounds(500,260,100,30);
      al2.setBounds(230,290,100,30);
      al4.setBounds(500,290,100,30);
      atf2.setBounds(230,320,100,30);
      atf4.setBounds(500,320,100,30);
      atf8.setBounds(550,380,100,30);
      atf9.setBounds(550,440,100,30);
      atf0.setBounds(550,490,100,30);
      al5.setBounds(550,350,100,30);
      al6.setBounds(550,410,100,30);
      al7.setBounds(550,460,100,30);
      
      
      al9.setBounds(50,380,100,30);
      al10.setBounds(50,440,100,30);
       art0.setBounds(50,410,100,30);
      art1.setBounds(50,470,100,30);
     
      
    //  this.add(al1);
    //  this.add(al2);
      this.add(ab1);
      this.add(ab2);
      this.add(ab3);
      this.add(ab4);
      this.add(ab5);
       this.add(al0);
       this.add(al8);
       this.add(ab6);

      
    //  this.add(atf1);
     // this.add(atf2);
      ab1.addActionListener(this);
      ab2.addActionListener(this);
      ab3.addActionListener(this);
      ab4.addActionListener(this);
      ab5.addActionListener(this);
      ab6.addActionListener(this);
      al0.setBounds(60,25,130,30);
      
    /*  this.remove(al1);
      this.remove(al2);
      this.remove(atf1);
      this.remove(atf2);*/
      
      acb = new JComboBox();
      acb1 = new JComboBox();

      erlabel = new JLabel("Empty cost field"); 
      erlabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
      erlabel.setForeground(Color.RED);
      erlabel.setBounds(379 ,475,140,20);
      //ab3.setBounds(380,500,100,30);

     
      for(int i=1;i<(user.length);i++){ //for printing values 
         if(user[i] != null){
        alb[i] = new JLabel(user[i]);
        this.add(alb[i]);
        c++;
        alb[i].setBounds(60,(c+2)*20,130,20);
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
      
       acb2 = new JComboBox();//----------------- room cost change------------------------------
      for(int m=0;m<6;m++){
          acb2.addItem(adsroom[m]);
      }
     acb2.setBounds(50,230,100,30);
      this.add(acb2);
  }
      
   public void actionPerformed(ActionEvent ae){
      if(ae.getSource()==ab3){

        if(art1.getText().equals(""))
        {
          this.add(erlabel);
          repaint(); 
        }
        else
        {
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
            if(changeCost == 1){
               if(art1.getText() == null){
                 
                  room[ar][2] = room[ar][2];
               }
               else{
                  room[ar][2] = art1.getText();
               }
            }
        dispose();
      }


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
      
      if(ae.getSource()== ab6){
          changeCost = 1;
          ar =acb2.getSelectedIndex();          
          this.add(al9);
          this.add(al10);
          this.add(art0);
          this.add(art1);
          art0.setText(room[ar][2]);
          art1.setText(room[ar][2]);
          
          repaint();
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
JTextField idField;

//JTextField tx1;
JButton btnNewButton,btnNewButton_1,btnNewButton_2,btnNewButton_3,btnNewButton_4,btnNewButton_5,btnNewButton_6,btnNewButton_7,btnNewButton_8;
JLabel lblNewLabel,lblNewLabel_1,lblNewLabel_3,lblNewLabel_4,lblNewLabel_7,custitle;
JLabel NewLabel,NewLabel_1,NewLabel_2,NewLabel_3,NewLabel_4,NewLabel_5,NewLabel_6,NewLabel_7;
JTextField textArea;
JTable table_1,table_2,jt,jt2;
JLabel req_1;
JComboBox comboBox,comboBox_1,comboBox_2;
JScrollPane sp,sp_1,sp3,sp4;
JLabel aLabel_5,aLabel_4,aLabel_3,aLabel_2,aLabel_1,aLabel;
JLabel check,check_1,check_2,check_3,check_4,check_5,check_6,check_7,check_8,check_9;
JTextField textField_7;
JComboBox comboBox_3,comboBox_4;
JButton bill,rbt,rbt1;
JLabel  em1,em2,em3,em4,em,rm,rm1,rm2,rm3,rm4,rm5,rm6;	
			

		int i = 0;

JLabel req_2,req_3,req_4,req_5,ttitle1,ttitle2,ttitle3,ttitle4,ttitle6,ttitle51;
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
String date;
String date2;
String[] num = {"1", "2", "3", "4"};
String[] sroom = {"--select--","101 - Deluxe", "102 - Deluxe", "201 - Executive", "202 - Executive", "301 - Suite", "302 - Suite"};

//String[] cust[] = new String[6][6];
String[] cust[] = {
					{"101 - Deluxe", "102 - Deluxe", "201 - Executive", "202 - Executive", "301 - Suite", "302 - Suite"},
					{null,null,null,null,null,null},	  //no.of occupants
					{null,null,null,null,null,null},		//no.of days
					{null,null,null,null,null,null},		//adhaar
					{null,null,null,null,null,null},		//phone no.
					{null,null,null,null,null,null},	  //room
					{null,null,null,null,null,null},    //name
          			{null,null,null,null,null,null},	//time
           			{" - "," - "," - "," - "," - "," - "},	//id	
};
String[] reason = {};

String[] col = {"Room No.", "Name", "No of Occupants", "No of days", "Aadhar No.", "Mobile No.","Checkin time"};
String[][] rows= {
				{"Room No.", "Name", "No of Occupants", "No of days", "Aadhar No.", "Moblie No.","Checkin time"},
				{null, null, null, null, null, null,null},
				{null, null, null, null, null, null,null},
				{null, null, null, null, null, null,null},
				{null, null, null, null, null, null,null},
				{null, null, null, null, null, null,null},
				{null, null, null, null, null, null,null},
				{null, null, null, null, null, null,null},
				{null, null, null, null, null, null,null},
				{null, null, null, null, null, null,null}  };

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

String[] roomr = {"--select--","101","102","201","202","301","302"};
String[] roomr1 = {"--select--","101","102","201","202","301","302"};
String[][] tab = new String[6][8];

String l1 = "l1";   //name 
String l2 = "l2";   //roomno
String l3 = "l3";   //noofoccu
String l4 = "l4";   //type
String l5 = "l5";   //roomcost
String l6 = "l6";   //servicestotal
String l7 = "0";   //discount
String l8 = null;   //total
String l12 = null;   //no of days
String l13 = null;   //time
String l14 = null; //time chckin
double totalser = 0.0;
String cmb3,id;
int q = 0;

/*String s;
String[][] rooms101 = new String[4][20];
String[][] rooms102 = new String[4][20];
String[][] rooms201 = new String[4][20];
String[][] rooms202 = new String[4][20];
String[][] rooms301 = new String[4][20];
String[][] rooms302 = new String[4][20];*/

int costs[] = new int[6];

String discount[] = {"No discount","Personal discount","3rd party booking"};
int prev = 1;
String[][] broom = new String[20][2];

	double detot;
JLabel background;
int counter = 0;
JLabel ttitle5;
Calendar cal,cala,calcurr;
int selectedi;
JLabel chkt;
JComboBox chktype;
JLabel ndayslabel;
JTextField ndays;
String types[] = {"Normal Checkout","Early/Late checkout"};

int noofdays[] = new int[6];

Date dateb101,dateb102,dateb201,dateb202,dateb301,dateb302;
Date datec; 

JLabel aLabel_6;

int[] bookdate101 = new int[3];
int[] bookdate102 = new int[3];
int[] bookdate201 = new int[3];
int[] bookdate202 = new int[3];
int[] bookdate301 = new int[3];
int[] bookdate302 = new int[3];
int[] currdate = new int[3];


public boolean occupants = false;

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
  else{
  btnNewButton.setIcon(new ImageIcon("home_unchecked.jpg"));
    
  }

}

public int daysBetween(Date d1, Date d2){
    return (int)( (d2.getTime() - d1.getTime()) / (1000 * 60 * 60 * 24));
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
	remove(NewLabel_7);
	remove(nameField);
	remove(idField);
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
  remove(aLabel_6);
  occupants = false;
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
  remove(ttitle5);
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
	remove(ttitle51);
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
  remove(chkt);
  remove(chktype);
  remove(ndays);
  remove(ndayslabel);
  remove(ttitle6);
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
remove(rbt);
remove(rbt1);
btnNewButton_3.setIcon(new ImageIcon("staff_unchecked.jpg"));
}

//prev =8
public void removeRoom(){
    remove(jt2);
    remove(sp4);
   remove(rbt1);
   remove(rm);
   remove(rm1);
   remove(rm2);
   remove(rm4);
   remove(rm3);
   remove(rm5);
   remove(rm6);
   
}



Frame2(String data[][],String coloumn[],String room[][],String column1[]){
this.c = getContentPane();

for(int q=0;q<6;q++){ //----------------------------------updating costs from room array in frame 1------------------------------------
    costs[q] = Integer.parseInt(room[q][2]);
}
em = new JLabel("NAME");
em1 = new JLabel("ROLE");
em2 = new JLabel("PHONE NO");
em3 = new JLabel("INTERCOM NO");
em4 = new JLabel("AGE");

rm = new JLabel("ROOM NO");
rm1 = new JLabel("TYPE");
rm2 = new JLabel("COST");
rm3 = new JLabel("NO of TV's");
rm4 = new JLabel("ROOM SIZE");
rm5 = new JLabel("WIFI PASSWORD");
rm6 = new JLabel("Ph-Service");

rm.setBounds(150,110,120,30);
rm1.setBounds(260,110,120,30);
rm2.setBounds(360,110,120,30);
rm3.setBounds(440,110,120,30);
rm4.setBounds(510,110,120,30);
rm5.setBounds(590,110,120,30);
rm6.setBounds(710,110,120,30);
em.setBounds(170,60,120,30);
em1.setBounds(290,60,120,30);
em2.setBounds(390,60,120,30);
em3.setBounds(520,60,120,30);
em4.setBounds(630,60,120,30);

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
	jt.setBounds(150,100,555,320);
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
            
            
       jt2 = new JTable(Frame1.room,Frame1.coloumn1);
	     jt2.setBounds(150,150,580,102);
           	sp4 = new JScrollPane(jt2);
          TableColumn colum2 = jt2.getColumnModel().getColumn(3);
            colum2.setMinWidth(60);
            colum2.setMaxWidth(90);
            colum2.setPreferredWidth(80); 
       
              colum2 = jt2.getColumnModel().getColumn(1);
            colum2.setMinWidth(120);
            colum2.setMaxWidth(190);
            colum2.setPreferredWidth(180);       
            
              colum2 = jt2.getColumnModel().getColumn(0);
            colum2.setMinWidth(50);
            colum2.setMaxWidth(90);
            colum2.setPreferredWidth(80);       
            
              colum2 = jt2.getColumnModel().getColumn(2);
            colum2.setMinWidth(90);
            colum2.setMaxWidth(190);
            colum2.setPreferredWidth(120);       
            
              colum2 = jt2.getColumnModel().getColumn(4);
            colum2.setMinWidth(60);
            colum2.setMaxWidth(90);
            colum2.setPreferredWidth(80); 
            
            colum2 = jt2.getColumnModel().getColumn(5);
            colum2.setMinWidth(120);
            colum2.setMaxWidth(90);
            colum2.setPreferredWidth(80); 
            
            colum2 = jt2.getColumnModel().getColumn(6);
            colum2.setMinWidth(60);
            colum2.setMaxWidth(90);
            colum2.setPreferredWidth(80); 
            
            
            
 	Color c = new Color(89,89,89);

  

		
 		rbt = new JButton("ROOM DETAILS");
    rbt1 = new JButton("BACK");

    rbt.setBounds(380,500,160,30);
    rbt1.setBounds(410,500,120,30);

    rbt.setVisible(true);
    rbt1.setVisible(true);

    rbt.addActionListener(this);
    rbt1.addActionListener(this);
                 
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

		btnNewButton_6 = new JButton(" Check-in");
		this.add(btnNewButton_6);
		btnNewButton_6.setFont(new Font("Tahoma", Font.PLAIN, 17));
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
		NewLabel_1.setBounds(204, 126, 128, 19);
		NewLabel_1.setVisible(true);

		NewLabel_2 = new JLabel("No. of days:");
		NewLabel_2.setBounds(204, 184, 128, 19);
		NewLabel_2.setVisible(true);

		NewLabel_3 = new JLabel("Aadhar No:");
		NewLabel_3.setBounds(204, 241, 90, 19);
		NewLabel_3.setVisible(true);

		NewLabel_4 = new JLabel("Reason of Stay:");
		NewLabel_4.setBounds(204, 298, 128, 19);
		NewLabel_4.setVisible(true);

		NewLabel_5 = new JLabel("Phone number:");
		NewLabel_5.setBounds(204, 423, 90, 19);
		NewLabel_5.setVisible(true);

		NewLabel_7 = new JLabel("Booking ID:");
		NewLabel_7.setBounds(551, 67, 90, 19);
		NewLabel_7.setVisible(true);

		idField = new JTextField();
		idField.setBounds(647, 63, 112, 26);
		idField.setColumns(10);
		idField.setVisible(true);
		

		NewLabel_6 = new JLabel("Room Type:");
		NewLabel_6.setBounds(551, 125, 98, 19);
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
		textArea.setBounds(349, 294, 209, 99);
		textArea.setColumns(20);
		textArea.setVisible(true);

		textField_4 = new JTextField();
		textField_4.setBounds(349, 423, 112, 26);
		textField_4.setColumns(10);
		textField_4.setVisible(true);


		//String[] num = {"1", "2", "3", "4"};
		comboBox = new JComboBox(num);
		comboBox.setBounds(349, 124, 60, 29);
		comboBox.setVisible(true);
		comboBox.addItemListener(this);

		//String[] sroom = {"101 - Deluxe", "102 - Deluxe", "201 - Executive", "202 - Executive", "301 - Suite", "302 - Suite"};
		comboBox_1 = new JComboBox(sroom);
		comboBox_1.setBounds(647, 124, 116, 29);
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
    aLabel.setBounds(171, 90, 76, 14);
    
    aLabel_1 = new JLabel("Name");
    aLabel_1.setBounds(243, 90, 46, 14);
    
    aLabel_2 = new JLabel("Occupants");
    aLabel_2.setBounds(353, 90, 70,14);
    
    aLabel_3 = new JLabel("Days");
    aLabel_3.setBounds(431, 90, 46, 14);
    
    aLabel_4 = new JLabel("Aadhar no.");
    aLabel_4.setBounds(476, 90, 62, 14);
    
    aLabel_5 = new JLabel("Mobile no.");
    aLabel_5.setBounds(582, 90, 62, 14);

    aLabel_6 = new JLabel("Check-in Time");
    aLabel_6.setBounds(669, 90, 100, 14);
	
		

    table_1 = new JTable(rows,col);
    table_1.setBounds(170, 110, 600, 170);
    sp=new JScrollPane(table_1);   
      TableColumn column = table_1.getColumnModel().getColumn(4);
            column.setMinWidth(100);
            column.setMaxWidth(130);
            column.setPreferredWidth(107); 

        column = table_1.getColumnModel().getColumn(0);
            column.setMinWidth(60);
            column.setMaxWidth(70);
            column.setPreferredWidth(60); 

            column = table_1.getColumnModel().getColumn(1);
            column.setMinWidth(110);
            column.setMaxWidth(130);
            column.setPreferredWidth(112);

            column = table_1.getColumnModel().getColumn(5);
            column.setMinWidth(90);
            column.setMaxWidth(120);
            column.setPreferredWidth(90);   

            column = table_1.getColumnModel().getColumn(2);
            column.setMinWidth(80);
            column.setMaxWidth(90);
            column.setPreferredWidth(87); 

            column = table_1.getColumnModel().getColumn(3);
            column.setMinWidth(40);
            column.setMaxWidth(50);
            column.setPreferredWidth(50); 

            column = table_1.getColumnModel().getColumn(6);
            column.setMinWidth(100);
            column.setMaxWidth(130);
            column.setPreferredWidth(120); 

		

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

		

		comboBox_2 = new JComboBox(roomr1);
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




//---------------------------------------CHECKOUT TAB ITEMS FROM HERE--------------------------------------------------------------------------------


		check = new JLabel("Room Number:");
		check.setFont(new Font("Tahoma", Font.PLAIN, 18));
		check.setBounds(164, 62, 150, 18);
		
		comboBox_3 = new JComboBox(roomr);
		comboBox_3.setBounds(330, 61, 75, 22);
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

    chkt = new JLabel("Checkout type:");
    chkt.setFont(new Font("Tahoma", Font.PLAIN, 14));
    chkt.setBounds(530,316,120,22);
    //chkt.setVisible(true);

    chktype = new JComboBox(types);
    chktype.setBounds(670,316,110,22);
    chktype.addItemListener(this);
    //chktype.addActionListener(this);
    //chktype.setVisible(true);

    ndayslabel = new JLabel("Days stayed:");
    ndayslabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
    ndayslabel.setBounds(530,376,120,22);
    //ndayslabel.setVisible(true);

    ndays = new JTextField();
    ndays.setBounds(670,376,30,22);
    ndays.setColumns(5);
    //ndays.setVisible(true);

		
//---------------------------------------------------------CHECKOUT ABOVE-----------------------------------------------------------------------------------------------
		

    ttitle5 = new JLabel("Invalid room number");
    ttitle5.setFont(new Font("Tahoma", Font.PLAIN, 14));
    ttitle5.setForeground(Color.RED);
    ttitle5.setBounds(300,435,200,14);
    //ttitle5.setVisible(true);

    ttitle51 = new JLabel("Insufficient Information");
    ttitle51.setFont(new Font("Tahoma", Font.PLAIN, 14));
    ttitle51.setForeground(Color.RED);
    ttitle51.setBounds(300,410,200,14);
    

    ttitle6 = new JLabel("Invalid room number");
    ttitle6.setFont(new Font("Tahoma", Font.PLAIN, 14));
    ttitle6.setForeground(Color.RED);
    ttitle6.setBounds(350, 400, 195, 40);

    //table.setEditable(false);
    //table_2.setEditable(false);
    table_1.setEnabled(false);
    //jt.setEditable(false);
    //jt2.setEditable(false);
		
		
		
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
    btnNewButton.setIcon(new ImageIcon("home_checked.jpg"));
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
  else if(prev == 8)
	{
		removeRoom();
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

  btnNewButton_3.setIcon(new ImageIcon("staff_unchecked.jpg"));


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
  else if(prev == 8)
  {
    removeRoom();
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
	add(NewLabel_7);
	add(nameField);
	add(idField);
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
 
cal = Calendar.getInstance();
date = cal.get(Calendar.DATE)+"/"+cal.get(Calendar.MONTH)+"/"+cal.get(Calendar.YEAR)+"  "+cal.get(Calendar.HOUR)+":"+cal.get(Calendar.MINUTE);

Calendar calb = Calendar.getInstance();

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
    bookdate101[0] = cal.get(Calendar.DATE);
		bookdate101[1] = cal.get(Calendar.MONTH);
    bookdate101[2] = cal.get(Calendar.YEAR);

  calb.set(Calendar.DAY_OF_MONTH,bookdate101[0]);
  calb.set(Calendar.MONTH,bookdate101[1]);
  calb.set(Calendar.YEAR,bookdate101[2]);
  
  dateb101 = calb.getTime();

    
		}
		if(comboBox_1.getSelectedItem().equals("102 - Deluxe")){
		i =1;
		cust[5][i] = "102";
    bookdate102[0] = cal.get(Calendar.DATE);
    bookdate102[1] = cal.get(Calendar.MONTH);
    bookdate102[2] = cal.get(Calendar.YEAR);
    
  calb.set(Calendar.DAY_OF_MONTH,bookdate102[0]);
  calb.set(Calendar.MONTH,bookdate102[1]);
  calb.set(Calendar.YEAR,bookdate102[2]);
  
  dateb102 = calb.getTime();
  
  		
		}
		if(comboBox_1.getSelectedItem().equals("201 - Executive")){
			i=2;
		cust[5][i] = "201";		
    bookdate201[0] = cal.get(Calendar.DATE);
    bookdate201[1] = cal.get(Calendar.MONTH);
    bookdate201[2] = cal.get(Calendar.YEAR);
     
  calb.set(Calendar.DAY_OF_MONTH,bookdate201[0]);
  calb.set(Calendar.MONTH,bookdate201[1]);
  calb.set(Calendar.YEAR,bookdate201[2]);
  
  dateb201 = calb.getTime();


		}
		if(comboBox_1.getSelectedItem().equals("202 - Executive")){
		i =3;
		cust[5][i] = "202";
		bookdate202[0] = cal.get(Calendar.DATE);
    bookdate202[1] = cal.get(Calendar.MONTH);
    bookdate202[2] = cal.get(Calendar.YEAR);
    
  calb.set(Calendar.DAY_OF_MONTH,bookdate202[0]);
  calb.set(Calendar.MONTH,bookdate202[1]);
  calb.set(Calendar.YEAR,bookdate202[2]);
  
  dateb202 = calb.getTime();

		}
		if(comboBox_1.getSelectedItem().equals("301 - Suite")){
		i =4;
		cust[5][i] = "301";
		bookdate301[0] = cal.get(Calendar.DATE);
    bookdate301[1] = cal.get(Calendar.MONTH);
    bookdate301[2] = cal.get(Calendar.YEAR);
    
  calb.set(Calendar.DAY_OF_MONTH,bookdate301[0]);
  calb.set(Calendar.MONTH,bookdate301[1]);
  calb.set(Calendar.YEAR,bookdate301[2]);
  
  dateb301 = calb.getTime();

		}
		if(comboBox_1.getSelectedItem().equals("302 - Suite")){
			i = 5;

		cust[5][i] = "302";
		bookdate302[0] = cal.get(Calendar.DATE);
    bookdate302[1] = cal.get(Calendar.MONTH);
    bookdate302[2] = cal.get(Calendar.YEAR);
  
  calb.set(Calendar.DAY_OF_MONTH,bookdate302[0]);
  calb.set(Calendar.MONTH,bookdate302[1]);
  calb.set(Calendar.YEAR,bookdate302[2]);
  
  dateb302 = calb.getTime();

		}
		for(int j=0;j<num.length;j++)		//no of occupants
		{               
			if(comboBox.getSelectedIndex() == j){
			cust[1][i] = Integer.toString(j+1);}
		}
	
    selectedi = comboBox_1.getSelectedIndex();

		cust[2][i] =textField_2.getText().toString(); 
		cust[3][i] =textField_3.getText().toString();
		cust[4][i] =textField_4.getText().toString();
		cust[6][i] =nameField.getText().toString();
		cust[7][i] =date;
		if(idField.getText() != null){
		cust[8][i] =idField.getText().toString();
		}
		//break;
		textField_2.setText(""); 
		textField_3.setText("");
		textField_4.setText("");
		textArea.setText("");
		nameField.setText("");
		idField.setText("");
		
	
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
//counter = 1;

	if(cust[5][i] == "101"){
    comboBox_1.removeItemAt(selectedi);
  }
  if(cust[5][i] == "102"){
    comboBox_1.removeItemAt(selectedi);
  }
  if(cust[5][i] == "201"){
    comboBox_1.removeItemAt(selectedi);
  }
  if(cust[5][i] == "202"){
    comboBox_1.removeItemAt(selectedi);
  }
  if(cust[5][i] == "301"){
    comboBox_1.removeItemAt(selectedi);
  }
  if(cust[5][i] == "302"){
    comboBox_1.removeItemAt(selectedi);
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

prev = 1;
add(background);
repaint();
}



if(a.getSource() == btnNewButton_1){

	btnNewButton_1.setIcon(new ImageIcon("occupants_checked.jpg"));
  occupants = true; 

  calcurr = Calendar.getInstance();

  currdate[0] = calcurr.get(Calendar.DATE);
  currdate[1] = calcurr.get(Calendar.MONTH);
  currdate[2] = calcurr.get(Calendar.YEAR);

  calcurr.set(Calendar.DAY_OF_MONTH,currdate[0]);
  calcurr.set(Calendar.MONTH,currdate[1]);
  calcurr.set(Calendar.YEAR,currdate[2]);
  
  datec = calcurr.getTime();

  if(cust[1][0] != null)
  {
  noofdays[0] = Integer.parseInt(cust[2][0]) - daysBetween(dateb101,datec); 
  }
  if(cust[1][1] != null)
  {
  noofdays[1] = Integer.parseInt(cust[2][1]) - daysBetween(dateb102,datec); 
  }
  if(cust[1][2] != null)
  {
  noofdays[2] = Integer.parseInt(cust[2][2]) - daysBetween(dateb201,datec); 
  }
  if(cust[1][3] != null)
  {
  noofdays[3] = Integer.parseInt(cust[2][3]) -daysBetween(dateb202,datec) ; 
  }
  if(cust[1][4] != null)
  {
  noofdays[4] = Integer.parseInt(cust[2][4]) -daysBetween(dateb301,datec); 
  }
  if(cust[1][5] != null)
  {
  noofdays[5] = Integer.parseInt(cust[2][5]) -daysBetween(dateb302,datec); 
  }

  System.out.println("101 - ndays" + noofdays[0]);
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
  else if(prev == 8)
  {
    removeRoom();
  }


	for(int b=0;b<6;b++){
		for(int f=0;f<8;f++){
			tab[b][f] = cust[f][b] ;
		}
	}
	invalidate();
	validate();
	//repaint();

	add(table_1);
	add(aLabel);
	add(aLabel_1);
	add(aLabel_2);
	add(aLabel_3);
	add(aLabel_4);
	add(aLabel_5);
  add(aLabel_6);
	add(custitle);
	add(sp);
	add(background);

  System.out.println("Occupants = " + occupants);
  repaint();
  System.out.println("after repaint Occupants = " + occupants);

	
for(int l=0;l<6;l++){

	rows[l][0] = tab[l][5];
	rows[l][1] = tab[l][6];
	rows[l][2] = tab[l][1];
	rows[l][3] = tab[l][2];
	rows[l][4] = tab[l][3];
	rows[l][5] = tab[l][4];
  rows[l][6] = tab[l][7];

}

  btnNewButton_3.setIcon(new ImageIcon("staff_unchecked.jpg"));
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
  else if(prev == 8)
  {
    removeRoom();
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


  btnNewButton_3.setIcon(new ImageIcon("staff_unchecked.jpg"));
prev = 4;

}



if(a.getSource() == btnNewButton_8)
{

  if(comboBox_2.getSelectedIndex() == 0)
{
  System.out.println("0 SELECTED");
  repaint();
  remove(background);
  this.add(ttitle5);
  add(background);
}

 else
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
  else if(prev == 8)
  {
    removeRoom();
  }


 btnNewButton_2.setIcon(new ImageIcon("requests_checked.jpg"));

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

}

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


	/*if(prev == 1)
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
  else if(prev == 8)
  {
    removeRoom();
  }

	invalidate();
	validate();
	repaint();*/

if(textField_5.getText().equals("") || textField_6.getText().equals(""))
{
	btnNewButton_2.setIcon(new ImageIcon("requests_checked.jpg"));
	remove(background);
	add(ttitle51);
	add(background);
	textField_5.setText("");
	textField_6.setText("");
	repaint();
}
	else
	{
		
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

	comboBox_2.setSelectedItem("101");
				
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

	comboBox_2.setSelectedItem("102");
				
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
        comboBox_2.setSelectedItem("201");

				
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
        comboBox_2.setSelectedItem("202");
				
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
        comboBox_2.setSelectedItem("301");
			
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
        comboBox_2.setSelectedItem("302");
				
			}

	if(comboBox_2.getSelectedIndex() == 1){
	for(int v=0;v<col2.length;v++){
		for(int n=0;n<row2[0].length;n++){
			row2[v][n] =room101[v][n];
		}
	}
	}
	if(comboBox_2.getSelectedIndex() == 2){
	for(int v=0;v<col2.length;v++){
		for(int n=0;n<row2[0].length;n++){
			row2[v][n] = room102[v][n];
		}
	}
	}
	if(comboBox_2.getSelectedIndex() == 4){
	for(int v=0;v<col2.length;v++){
		for(int n=0;n<row2[0].length;n++){
			row2[v][n] = room201[v][n];
		}
	}
	}
	if(comboBox_2.getSelectedIndex() == 4){
	for(int v=0;v<col2.length;v++){
		for(int n=0;n<row2[0].length;n++){
			row2[v][n] = room202[v][n];
		}
	}
	}
	if(comboBox_2.getSelectedIndex() == 5){
	for(int v=0;v<col2.length;v++){
		for(int n=0;n<row2[0].length;n++){
			row2[v][n] = room301[v][n];
		}
	}
	}
	if(comboBox_2.getSelectedIndex() == 6){
	for(int v=0;v<col2.length;v++){
		for(int n=0;n<row2[0].length;n++){
			row2[v][n] = room302[v][n];
		}
	}
}

invalidate();
validate();
repaint();
removeNewRequests();

btnNewButton_2.setIcon(new ImageIcon("requests_checked.jpg"));
add(req_1);
add(comboBox_2);
add(table_2);
add(sp_1);
add(btnNewButton_8);
add(ttitle1);
add(ttitle4);
add(ttitle2);
add(ttitle3);
add(background);

}
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
  else if(prev == 8)
  {
    removeRoom();
  }

add(jt);
add(sp3);
this.add(rbt);
//add(rbt1);
add(em);
add(em1);
add(em2);
add(em3);
add(em4);


add(background);


repaint();


prev = 7;
}

if(a.getSource()==rbt){
    remove(jt);
    remove(sp3);
    remove(rbt);
    remove(em);
    remove(em1);
    remove(em2);
    remove(em3);
    remove(em4);

repaint();
add(rm);
add(rm1);
add(rm2);
add(rm3);
add(rm4);
add(rm5);
add(rm6);

add(jt2);
add(sp4);
add(rbt1);

add(background);
repaint();
prev = 8;
}

if(a.getSource()==rbt1){
    
   // remove();
remove(rm);
remove(rm1);
remove(rm2);
remove(rm3);
remove(rm4);
remove(rm5);
remove(rm6);
    remove(jt2);
    remove(sp4);
    remove(rbt1);
    add(jt);
add(sp3);
add(rbt);
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
  else if (prev == 8)
  {
    removeRoom(); 
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
	add(chkt);
  	add(chktype);
  	add(ndays);
  	add(ndayslabel);

	add(background);

  btnNewButton_3.setIcon(new ImageIcon("staff_unchecked.jpg"));
  	

	prev = 6;


//---------------------------------------------------bill------------->GENERATE BILL---------------------------------------------------------
}


if(a.getSource() == bill)
{

if(comboBox_3.getSelectedIndex() == 0)
{
  remove(background);
  add(ttitle6);
  add(background);
  ttitle6.setVisible(true);
  //add(background);
  repaint();
}
else
{
  remove(ttitle5);
	System.out.println("BILL ENTERED");


cala = Calendar.getInstance();
date2 = cala.get(Calendar.DATE)+"/"+cala.get(Calendar.MONTH)+"/"+cala.get(Calendar.YEAR)+"  "+cala.get(Calendar.HOUR)+":"+cala.get(Calendar.MINUTE);
	
cmb3 = comboBox_3.getSelectedItem().toString();

	if(chktype.getSelectedIndex() == 0){
		ndays.setEnabled(false);
		ndays.setEditable(false);
		ndayslabel.setVisible(false);
		if(cmb3 == "101"){
			l12 = cust[2][0];
		}
		if(cmb3 == "102"){
			l12 = cust[2][1];
		}
		if(cmb3 == "201"){
			l12 = cust[2][2];
		}
		if(cmb3 == "202"){
			l12 = cust[2][3];
		}
		if(cmb3 == "301"){
			l12 = cust[2][4];
		}
		if(cmb3 == "302"){
			l12 = cust[2][5];
		}
	}
	
	if(chktype.getSelectedIndex() == 1){
		ndays.setEnabled(true);
		ndays.setEditable(true);
		ndayslabel.setVisible(true);

		l12 = ndays.getText();
	}



	if(comboBox_3.getSelectedIndex() == 1){
		if(cust[1][0] != null){
			l1=(cust[6][0]);
			l2=("101");
			l4=("Deluxe");
			l3=(cust[1][0]);
			l5=l12+"x"+costs[0];
			id = cust[8][0];
      //l12=cust[7][0];
      l13=date2;
      l14 =cust[7][0];
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
		detot = totalser + (costs[0]*Integer.parseInt(l12));
		}
		else{
			detot = 0;
		}
		l8=""+(detot);
		for(int l = 0; l<8;l++)
		{
			cust[l][0] = null;
		}
    noofdays[0] = 0;
		comboBox_1.addItem("101 - Deluxe");
	}


	if(comboBox_3.getSelectedIndex() == 2){
		if(cust[1][1] != null){
			l1=(cust[6][1]);
			l2=("102");
			l4=("Deluxe");
			l3=(cust[1][1]);
			l5=l12+"x"+costs[1];
			id = cust[8][1];
      //l12=cust[7][1];
      l13=date2; 
      l14 = cust[7][1];
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
		detot = totalser + (costs[1]*Integer.parseInt(l12));
		}
		else{
			detot = 0;
		}
		l8=""+(detot);
		for(int l = 0; l<8;l++)
		{
			cust[l][1] = null;
		}
    noofdays[1] = 0;
		comboBox_1.addItem("102 - Deluxe");
	}



	if(comboBox_3.getSelectedIndex() == 3){
		if(cust[1][2] != null){
			l1=(cust[6][2]);
			l2=("201");
			l4=("Executive");
			l3=(cust[1][2]);
			l5= l12+("x")+costs[2];
			id = cust[8][2];
      //l12=cust[7][2];
      l13=date2; 
      l14 = cust[7][2];
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
		detot = totalser + (costs[2]*Integer.parseInt(l12));
		}
		else{
			detot = 0;
		}
		l8=""+(detot);
		for(int l = 0; l<8;l++)
		{
			cust[l][2] = null;
		}
    noofdays[2] = 0;
	
	comboBox_1.addItem("201 - Executive");
	}





	if(comboBox_3.getSelectedIndex() == 4){
		if(cust[1][3] != null){
			l1=(cust[6][3]);
			l2=("202");
			l4=("Executive");
			l3=(cust[1][3]);
			l5=l12+"x"+costs[3];
			id = cust[8][3];
      //l12=cust[7][3];
      l13=date2;  
      l14 = cust[7][3];
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
		detot = totalser + (costs[3]*Integer.parseInt(l12));
		}
		else{
			detot = 0;
		}
		l8=""+(detot);
		for(int l = 0; l<8;l++)
		{
			cust[l][3] = null;
		}
    noofdays[3] = 0;
	
	comboBox_1.addItem("202 - Executive");
	}



	if(comboBox_3.getSelectedIndex() == 5){
		if(cust[1][4] != null){
			l1=(cust[6][4]);
			l2=("301");
			l4=("Suite");
			l3=(cust[1][4]);
			l5=l12+"x"+costs[4];
			id = cust[8][4]; 
      //l12=cust[7][4];
      l13=date2;
      l14 = cust[7][4];
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
		detot = totalser + (costs[4]*Integer.parseInt(l12));
		}
		else{
			detot = 0;
		}
		l8=""+(detot);
		for(int l = 0; l<8;l++)
		{
			cust[l][4] = null;
		}
    noofdays[4] = 0;
	
	comboBox_1.addItem("301 - Suite");
	}



	if(comboBox_3.getSelectedIndex() == 6){
		if(cust[1][5] != null){
			l1=(cust[6][5]);
			l2=("302");
			l4=("Suite");
			l3=(cust[1][5]); 
			l5=l12+"x"+costs[5];
			id = cust[8][5];
      //l12=cust[7][5];
      l13=date2;
      l14 = cust[7][5]; 
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
		detot = totalser + (costs[5]*Integer.parseInt(l12));
		}
		else{
			detot = 0;
		}
		l8=""+(detot);
		for(int l = 0; l<8;l++)
		{
			cust[l][5] = null;
		}
    noofdays[6] = 0;
	
	comboBox_1.addItem("302 - Executive");

	}
	
	l7=(textField_7.getText());

	

	billframe b = new billframe(l1,l2,l3,l4,l5,l6,l7,l8,broom,l12,l13,l14,id);
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

comboBox_2.setSelectedItem("101");
}
}


if(a.getSource() == btnNewButton_5){

	dispose();
}		

}


public void itemStateChanged(ItemEvent e)
{
	repaint();
	System.out.println("CHANGED");
	if(comboBox_2.getSelectedIndex() == 1)
	{
		remove(ttitle5);
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
	
	if(comboBox_2.getSelectedIndex() == 2)
	{
		remove(ttitle5);
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

	if(comboBox_2.getSelectedIndex() == 3)
	{
		remove(ttitle5);
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

	if(comboBox_2.getSelectedIndex() == 4)
	{
		remove(ttitle5);
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

	if(comboBox_2.getSelectedIndex() == 5)
	{
		remove(ttitle5);
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

	if(comboBox_2.getSelectedIndex() == 6)
	{
		remove(ttitle5);
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

cbxSelectedindex = comboBox_3.getSelectedIndex() - 1;
	 
    if(cbxSelectedindex>-1)
    {
		check_2.setText(cust[6][cbxSelectedindex]);
    }
    else
    {
      check_2.setText("");
      check_4.setText("");
    }
		if(cbxSelectedindex == 0)
		{
			bill.setEnabled(true);
			if(cust[1][0] == null)
			{
				bill.setEnabled(false);	
			}
			check_4.setText("Deluxe");
      ndays.setText(cust[2][0]);	
      remove(ttitle6);
		}
		if(cbxSelectedindex == 1)
		{
			bill.setEnabled(true);
			if(cust[1][1] == null)
			{
				bill.setEnabled(false);	
			}
			check_4.setText("Deluxe");	
      ndays.setText(cust[2][1]);  
      remove(ttitle6);
		}
		else if(cbxSelectedindex== 2)
		{
			bill.setEnabled(true);
			if(cust[1][2] == null)
			{
				bill.setEnabled(false);	
			}
			check_4.setText("Executive");
      ndays.setText(cust[2][2]);  
      remove(ttitle6);
		}
		else if(cbxSelectedindex== 3)
		{
			bill.setEnabled(true);
			if(cust[1][3] == null)
			{
				bill.setEnabled(false);	
			}
			check_4.setText("Executive");
      ndays.setText(cust[2][3]);  
      remove(ttitle6);
		}
		else if(cbxSelectedindex == 4)
		{
			bill.setEnabled(true);
			if(cust[1][4] == null)
			{
				bill.setEnabled(false);	
			}
			check_4.setText("Suite");
      ndays.setText(cust[2][4]);  
      remove(ttitle6);
		}
		else if(cbxSelectedindex == 5)
		{
			bill.setEnabled(true);
			if(cust[1][5] == null)
			{
				bill.setEnabled(false);	
			}
			check_4.setText("Suite");
      ndays.setText(cust[2][5]);  
      remove(ttitle6);
		}
    
    if(cbxSelectedindex>-1)
    {
		check_6.setText(""+costs[cbxSelectedindex]);
    }
    else
    {
      check_6.setText("");
    }



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

if(chktype.getSelectedIndex() == 0)
{
  ndays.setEnabled(false);
  ndayslabel.setVisible(false);
}

if(chktype.getSelectedIndex() == 1)
{
  ndays.setEnabled(true);
  ndayslabel.setVisible(true);
}


}

public void paint(Graphics g) 
{
  super.paint(g);
  System.out.println("Paint entered" + occupants);
  if(occupants)
  {
    System.out.println("Paint if entered");
    drawchart(g);
  }

}

public void drawchart(Graphics g)
{
  Color lgr = new Color(89,89,89);
  g.setFont(new Font("Trebuchet MS", Font.BOLD, 12));

  System.out.println("Drawchart entered");

   g.setColor(lgr);
   g.fillRoundRect(175, 350, 600, 182,10,10);
   g.setColor(Color.WHITE);
   g.drawString("No.of Days from now",181,365);
   //g.drawLine(306,350,306,532);//v
   //g.drawLine(175,370,773,370);//h
   g.drawString("Today", 313,365);
   g.drawString("Day 2", 381,365);
   g.drawString("Day 3", 450,365);
   g.drawString("Day 4", 519,365);
   g.drawString("Day 5", 587,365);
   g.drawString("Day 6", 656,365);
   g.drawString("Day 7", 724,365);

   g.drawString("101 - Deluxe",182,390);
   g.drawString("102 - Deluxe",182,417);
   g.drawString("201 - Executive",182,442);
   g.drawString("202 - Executive",182,468);
   g.drawString("301 - Suite",182,494);
   g.drawString("302 - Suite",182,520);

   lgr = new Color(254, 134, 6);
   g.setColor(lgr);

   for(int r = 0; r<6;r++)
   {
    if(noofdays[r]>7)
    {
      noofdays[r] = 7;
    }
   }

   g.fillRoundRect(296, 377,  68*noofdays[0], 18,5,5);
   g.fillRoundRect(296, 404,  68*noofdays[1], 18,5,5);
   g.fillRoundRect(296, 431,  68*noofdays[2], 18,5,5);
   g.fillRoundRect(296, 458,  68*noofdays[3], 18,5,5);
   g.fillRoundRect(296, 485,  68*noofdays[4], 18,5,5);
   g.fillRoundRect(296, 512,  68*noofdays[5], 18,5,5);
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
JLabel outbill2,outbill3;
JTable table_3;
JLabel outbill_22,outbill_23,outbill_24,outbill_25;
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
String l12 = null; //time
String l13 = null; //no of days
String l14 = null; //checkout time
String id; 

int days = 0;
double totdis =0;
double dis =0;
double total =0;
double disco = 0;
double tax = 0;

billframe(String l1,String l2,String l3,String l4,String l5,String l6,String l7,String l8,String[][] broom,String l12,String l13,String l14,String id)
{
		
		this.l1 = l1;
		this.l2 = l2;
		this.l3 = l3;
		this.l4 = l4;
		this.l5 = l5;
		this.l6 = l6;
		this.l7 = l7;
		this.l8 = l8;
    this.l12 = l12;
    this.l13 = l13;
    this.l14 = l14;
    this.id = id;
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
    outbill_1.setBounds(232, 18, 260, 63);
    outbill_1.setFont(new Font("Edwardian Script ITC", Font.BOLD, 40));
    outbill_1.setForeground(Color.WHITE);
    this.add(outbill_1);
    
    outbill2 = new JLabel("Booking ID:");
    outbill2.setBounds(495, 88, 180, 18);
    outbill2.setFont(new Font("Trebuchet MS", Font.PLAIN, 10));
    this.add(outbill2);

    outbill3 = new JLabel("New label");
    outbill3.setBounds(560, 88, 146, 18);
    outbill3.setText(id);
    outbill3.setFont(new Font("Trebuchet MS", Font.PLAIN, 10));
    this.add(outbill3);
    

    outbill_2 = new JLabel("Name:");
    outbill_2.setBounds(80, 125, 77, 25);
    outbill_2.setFont(new Font("Trebuchet MS", Font.BOLD, 19));
    this.add(outbill_2);
    
    outbill_3 = new JLabel("New label");
    outbill_3.setBounds(143, 125, 150, 25);
    outbill_3.setText(l1);
    outbill_3.setFont(new Font("Trebuchet MS", Font.BOLD, 19));
    this.add(outbill_3);
    
    outbill_4 = new JLabel("Room Number:");
    outbill_4.setBounds(400, 125, 180, 18);
    outbill_4.setFont(new Font("Trebuchet MS", Font.BOLD, 19));
    this.add(outbill_4);
    
    outbill_6 = new JLabel("1011");
    outbill_6.setText(l2);
    outbill_6.setBounds(543, 125, 46, 18);
    outbill_6.setFont(new Font("Trebuchet MS", Font.BOLD, 19));
    this.add(outbill_6);
    
    outbill_5 = new JLabel("No. of Occupants:");
    outbill_5.setFont(new Font("Trebuchet MS", Font.BOLD, 19));
    outbill_5.setBounds(80, 164, 190, 22);
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
    table_3.setBounds(50, 304, 255, 322);
    this.add(table_3);
    //table_3.setEditable(false);
    
    outbill_10 = new JLabel("Services");
    outbill_10.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
    outbill_10.setBounds(51, 271, 110, 25);
    this.add(outbill_10);
    
    outbill_11 = new JLabel("Price");
    outbill_11.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
    outbill_11.setBounds(181, 271, 46, 25);
    this.add(outbill_11);
    
    outbutton = new JButton("DONE");
    outbutton.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
    outbutton.setBounds(273, 661, 160, 35);
    outbutton.addActionListener(this);
    outbutton.setIcon(new ImageIcon("done.png"));
    this.add(outbutton);

    outbill_22 = new JLabel("Check-in time:");
    outbill_22.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
    outbill_22.setBounds(80, 216, 115, 25);
    this.add(outbill_22);
    
    outbill_23 = new JLabel("New label");
    outbill_23.setFont(new Font("Trebuchet MS", Font.PLAIN, 15));
    outbill_23.setBounds(180, 216, 150, 25);
    this.add(outbill_23);
    outbill_23.setText(l14);

    outbill_24 = new JLabel("Check-out time:");
    outbill_24.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
    outbill_24.setBounds(400, 216, 115, 25);
    this.add(outbill_24);
    
    outbill_25 = new JLabel("New label");
    outbill_25.setFont(new Font("Trebuchet MS", Font.PLAIN, 15));
    outbill_25.setBounds(518, 216, 150, 25);
    this.add(outbill_25);
    outbill_25.setText(l13);


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

    JLabel imgLabel_2 = new JLabel("");
    imgLabel_2.setIcon(new ImageIcon("templatec.jpg"));
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