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