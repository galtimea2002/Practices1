/// CREATING A CLASS

 class Student {
    int id;
    String name;
    int class_;
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println(s1.id);
        System.out.println(s1.name);
        System.out.println(s1.class_);

        Student s2 = new Student();
        System.out.println(s2.id);
        System.out.println(s2.name);
        System.out.println(s2.class_);
    }
}

class Animal{
    String name;
    int age;
    String colour;

    // CONSTRUCTOR
    public Animal(String name, int age, String colour){
        this.name = name;
        this.age = age;
        this.colour = colour;
    }

    // METHODS
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public String getColour(){
        return this.colour;
    }

    public static void main(String[] args){
        Animal animal = new Animal("Rex", 12, "white");
        System.out.println(animal.name);
        System.out.println(animal.age);
        System.out.println(animal.colour);
    }

}