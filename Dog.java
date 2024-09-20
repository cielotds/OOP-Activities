class Dog {
    String name;
    boolean isMale;
    int NumPuppies;
    String puppies[] = new String[3];
    Dog puppy;

    public void setName(String name) {
        this.name = name;
    }

    public String showName() {
        return "Name of the dog: " + name;
    }

    public String bark() {
        return name + ": woof! woof!";
    }

    public int setnumofPuppies() {
        return puppies.length;
    }

    public String showNumofPuppies() {
        return "Number of Puppies" + NumPuppies;
    }

    public void setPuppies(String newPuppies) {
       puppies = newPuppies;
    }

    public String[]showPuppies(){
        return puppies;
    }


}