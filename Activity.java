public class Activity {
    
    public static void main(String [] args) {

        Student student1 = new Student();
        student1.setId(1234);
        student1.setname("Cielo Tadas");

        System.out.println("Student Id: " + student1.getId());
        System.out.println("Student Name: " + student1.getname());

        System.out.println("\n");

        Book book1 = new Book();
        book1.set_booknumber(1);
        book1.set_title("Emily The Strange");
        book1.set_author("Rob Reger");
        book1.set_price(757.83);

        System.out.println("Book Number: " + book1.getBooknum());
        System.out.println("Title : " + book1.getTitle());
        System.out.println("Price: " + book1.getPrice() + " php");


    }
}