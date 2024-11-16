class Student extends Person{
    private String program;
    private int year;

    public Student(String name, String address, String program, int year){
        this.name = name;
        this.address = address;
        this.program = program;
        this.year = year;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getProgram() {
        return program;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString(){
        return "Hello, I am " + name + " I live in " + address + ". I am " + year + " year of " + program + ".";
    }
}