public class Activity {
    
    public static void main(String[] args) {
        
        Student student1 = new Student("Cielo Tadas", "Tanggoy, Balayan, Batangas", "BSIT", 2);
        System.out.println("Student Name: " + student1.getName());
        System.out.println("Student Address: " + student1.getAddress());
        System.out.println("Student Program: " + student1.getProgram());
        System.out.println("Student Year: " + student1.getYear());

        System.out.println("\n");

        Staff staff1 = new Staff("Juan", "Balayan, Batangas", "BSU Balayan", 5000);
        System.out.println("Staff Name: " + staff1.getName());
        System.out.println("Staff Address: " + staff1.getAddress());
        System.out.println("School: " + staff1.getSchool());
        System.out.println("Salary: " + staff1.getSalary() + " php");

        System.out.println(staff1.toString());

    }
}