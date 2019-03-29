import javax.swing.*;
class bank
{
static int number;
static String name ;

static int salary;
static int hours;
static void getdata()
{
JOptionPane k= new JOptionPane ();
String week;
int   op;
week=k.showInputDialog("select option: 1: monthly 2: weekly 3: hourly");
op=Integer.parseInt(week);
if(op==1)
{
String w1,w2,w3;
w1=k.showInputDialog("enter number");
number=	Integer.parseInt(w1);
name=k.showInputDialog("enter name");

w2=k.showInputDialog("enter salary");
salary=Integer.parseInt(w2);
int result;
result=(salary-((salary*30/100)+(salary*3/100)+(salary*5/100)));
k.showMessageDialog(null,"your salary ="+result);
}
else if(op==2)
{
String w1,w2,w3;
w1=k.showInputDialog("enter number");
number=	Integer.parseInt(w1);
name=k.showInputDialog("enter name");


w2=k.showInputDialog("enter salary");
salary=Integer.parseInt(w2);
int result;
result=salary-(salary*3/100);

k.showMessageDialog(null,"your salary ="+result);	
}
else if(op==3){
String w1,w2,w3;
w1=k.showInputDialog("enter number");
number=	Integer.parseInt(w1);
name=k.showInputDialog("enter your name");

w2=k.showInputDialog("enter hourly salary");
salary=Integer.parseInt(w2);
w2=k.showInputDialog("enter hours per day");
hours=Integer.parseInt(w2);
int result;
result=salary*hours;
k.showMessageDialog(null,"your salary ="+result);

}
	

else
{
k.showMessageDialog(null,"you enering imvalid option");
}
}

		
public static void main(String args[])
{
getdata();
}
}