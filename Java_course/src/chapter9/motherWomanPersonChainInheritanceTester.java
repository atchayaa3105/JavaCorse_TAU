package chapter9;
//Chain of Inheritance
public class motherWomanPersonChainInheritanceTester {
    public static void main(String args[]){
        Mother mommy= new Mother();
        mommy.setName("Uma Maheswari");
        mommy.setAge(55);
        System.out.println(mommy.getName()+" is a "+mommy.getGender()+" of age "+mommy.getAge());
    }
}
