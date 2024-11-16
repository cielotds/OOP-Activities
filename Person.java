class Person{
    protected String name;
    protected String address;

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName(){
        return name;
    }

    public String getAddress(){
        return address;
    }

    @Override
    public String toString(){
        return "Hello, I am " + name + " and " + "I live in " + address + ".";
    }
}