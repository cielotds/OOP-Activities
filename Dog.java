class Dog {
    String name;
    boolean isMale;
    String puppies[] = new String[3];

    public String showName() {
        return "Name of the dog: " + name;
    }

    public String bark() {
        return name + ": woof! woof!";
    }

    public int getnumofPuppies() {
        return puppies.length;
    }

    public String[]shownameofPuppies(){
        return puppies;
    }
}