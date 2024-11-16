class Staff extends Person {
    private String school;
    private double salary;

    Staff(String name, String address, String school, double salary){
        this.name = name;
        this.address = address;
        this.school = school;
        this.salary = salary;
    }

    public void setSchool(String school){
        this.school = school;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

    public String getSchool(){
        return school;
    }

    public double getSalary(){
        return salary;
    }

    @Override
    public String toString() {
        return "Hello, I am " + name + ". I work at " + school + 
               " and I live in " + address + ". I earn " + salary + " php.";
    }
}