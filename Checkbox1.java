/*The Checkbox class is used to create a checkbox.
 It is used to turn an option on (true) or off (false).
 Clicking on a Checkbox changes its state from "on" to "off" or from "off" to "on".
AWT Checkbox Class Declaration
public class Checkbox extends Component implements ItemSelectable, Accessible */
import java.awt.*;  
public class Checkbox1  
{  
     Checkbox1(){  
       Frame f= new Frame("Checkbox Example");  
        Checkbox checkbox1 = new Checkbox("C++");  
        checkbox1.setBounds(100,100, 50,50);  
        Checkbox checkbox2 = new Checkbox("Java", true);  
        checkbox2.setBounds(100,150, 50,50);  
        f.add(checkbox1);  
        f.add(checkbox2);  
        f.setSize(400,400);  
        f.setLayout(null);  
        f.setVisible(true);  
     }  
public static void main(String args[])  
{  
    new Checkbox1();  
}  
}  