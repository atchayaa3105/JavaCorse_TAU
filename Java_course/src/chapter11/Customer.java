package chapter11;
//Interface
public class Customer {
    public static void main(String args[]){
        Product book= new Book();
        book.setName("Java");
        book.setColor("White");
        book.setPrice(9.99);
        ((Book)book).setAuthor("Angie");// casting
        ((Book)book).setPages(100);
        System.out.println("Book named "+book.getName()+" written by "+((Book) book).getAuthor()+" cost you $"+book.getPrice()+". It is of "+((Book) book).getPages()+" pages and looks "+book.getColor()+" in color.");
    }
}
