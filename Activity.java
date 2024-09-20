class Activity{
    public static void main(String[] args){
        Dog dog = new Dog();
        dog.setName("Oreo");

        dog.puppies[0] = "Berry";
        dog.puppies[1] = "Nova";
        dog.puppies[2] = "Ichi";

        System.out.println(dog.showName());

        System.out.println(dog.bark());

        System.out.println(dog.setnumofPuppies());

        System.out.println(dog.showNumofPuppies());

        System.out.println("Puppies: " + dog.showPuppies());
       
    }
}