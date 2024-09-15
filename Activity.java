class Activity{
    public static void main(String[] args){
        Dog dog = new Dog();
        dog.name = "Oreo";

        dog.puppies[0] = "Berry";
        dog.puppies[1] = "Nova";
        dog.puppies[2] = "Ichi";

        System.out.println(dog.showName());

        System.out.println(dog.bark());
       
        System.out.println("Number of puppies: " + dog.getnumofPuppies());

        System.out.println("Puppies: ");
        for (int i = 0; i < dog.getnumofPuppies(); i++) {
            System.out.println(dog.shownameofPuppies()[i]);
        }
    }
}