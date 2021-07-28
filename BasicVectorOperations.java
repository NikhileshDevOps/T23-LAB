import java.util.Vector;
public class BasicVectorOperations {
public static void main(String a[])
{
Vector <String> vct = new Vector<String> (5);
//adding elements to the end
vct.addElement("First");
vct.addElement("First");
vct.add("Second");
vct.add("Third");
System.out.println(vct);
//adding element at specified index
vct.add(2,"Random");
System.out.println(vct);
vct.clear();
System.out.println(vct);
vct.add("First");
vct.add("Second");
vct.add("Third");
System.out.println(vct);
//getting elements by index
System.out.println("Element at index 2 is: "+vct.get(2);
//getting first element
System.out.println("The first element of this vector is:"+vct.firstElement());
//getting last element
System.out.println("The last element of this vector is:"+vct.lastElement());
//how to check vector is empty or not
System.out.println("Is this vector empty? "+vct.isEmpty());
vct.removeAllElements();
System.out.println(vct);
System.out.println(vct.capacity());
}
}


//Vector <Integer> a= new Vector<Integer>(5);
//Vector <Student> a=new Vector <Student>(5);
Vector <Integer> a=new Vector <Integer>();//Size 10
Vector <Integer> a=new Vector <Integer>(20);
Vector <Integer> a=new Vector <Integer>(20,10);








