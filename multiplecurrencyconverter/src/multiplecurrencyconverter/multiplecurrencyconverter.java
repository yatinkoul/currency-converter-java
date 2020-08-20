package multiplecurrencyconverter;
import java.awt.*;
import java.awt.event.*;
class event1 extends Frame implements ActionListener
{
CheckboxGroup cg1,cg2;
Checkbox c1,c2,c3,c4,c5,c6,c7,c8;    
TextField tf1,tf2;
Button bt,bt1;
Label lab1,lab2,lab3;
event1()
{
cg1=new CheckboxGroup();
cg2=new CheckboxGroup();
lab1=new Label("Enter Value Of Currency");
tf1=new TextField("     ");
lab2=new Label("Select the currency being converted:");
c1=new Checkbox("$ US Dollar");
c2=new Checkbox("¥ Yen");
c3=new Checkbox("€ Euro");
c4=new Checkbox("₹ Rupee");
lab3=new Label("Select the currency to be converted in:");
c1=new Checkbox("$ US Dollar");
c2=new Checkbox("¥ Yen");
c3=new Checkbox("€ Euro");
c4=new Checkbox("₹ Rupee");
c5=new Checkbox("$ US Dollar");
c6=new Checkbox("¥ Yen");
c7=new Checkbox("€ Euro");
c8=new Checkbox("₹ Rupee");
bt=new Button("Convert");
c1.setCheckboxGroup(cg1);
c2.setCheckboxGroup(cg1);
c3.setCheckboxGroup(cg1);
c4.setCheckboxGroup(cg1);
c5.setCheckboxGroup(cg2);
c6.setCheckboxGroup(cg2);
c7.setCheckboxGroup(cg2);
c8.setCheckboxGroup(cg2);
tf2=new TextField("     ");
bt1=new Button("Exit Application");
bt.addActionListener(this);
bt1.addActionListener(this);
setLayout(new FlowLayout());
setVisible(true);
setSize(300,300);
add(lab1);
add(tf1);
add(lab2);
add(c1);
add(c2);
add(c3);
add(c4);
add(lab3);
add(c5);
add(c6);
add(c7);
add(c8);
add(bt);
add(tf2);
add(bt1);
}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==bt)
{
float num1=Float.parseFloat(tf1.getText());
float x=0;
if(c4.getState()==true){
float XUSD = (float) 0.015;
float XYEN = (float) 1.62;
float XEURO = (float) 0.012;
float XRUPEE = (float) 1;
if(c5.getState()==true)
x=(num1* XUSD);
if(c6.getState()==true)
x=(num1* XYEN);
if(c7.getState()==true)
x=(num1* XEURO);
if(c8.getState()==true)
x=(num1* XRUPEE);
tf2.setText(String.valueOf(x));
}
if(c3.getState()==true){
float XUSD = (float) 1.17;
float XYEN = (float) 129.61;
float XEURO = (float) 1;
float XRUPEE = (float) 80.1;
if(c5.getState()==true)
x=(num1* XUSD);
if(c6.getState()==true)
x=(num1* XYEN);
if(c7.getState()==true)
x=(num1* XEURO);
if(c8.getState()==true)
x=(num1* XRUPEE);
tf2.setText(String.valueOf(x));
}
if(c2.getState()==true)
{
float XUSD = (float) 0.0090;
float XYEN = (float) 1;
float XEURO = (float) 0.0077;
float XRUPEE = (float) 0.62;
if(c5.getState()==true)
x=(num1* XUSD);
if(c6.getState()==true)
x=(num1* XYEN);
if(c7.getState()==true)
x=(num1* XEURO);
if(c8.getState()==true)
x=(num1* XRUPEE);
tf2.setText(String.valueOf(x));
}
if(c1.getState()==true)
{
float XUSD = (float) 1;
float XYEN = (float) 110.74;
float XEURO = (float) 0.85;
float XRUPEE = (float) 68.45;
if(c5.getState()==true)
x=(num1* XUSD);
if(c6.getState()==true)
x=(num1* XYEN);
if(c7.getState()==true)
x=(num1* XEURO);
if(c8.getState()==true)
x=(num1* XRUPEE);
tf2.setText(String.valueOf(x));
}
}
if(ae.getSource()==bt1)
    System.exit(0);
}
}    
public class multiplecurrencyconverter {

    public static void main(String[] args) {
    event1 ob=new event1();
    }
    
}
