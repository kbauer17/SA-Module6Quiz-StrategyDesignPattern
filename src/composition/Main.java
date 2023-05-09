package composition;

public class Main {

    public static void main(String[] args) {
        Student student1 = new Student("750 Main St.", 55555, "Wisconsin", "414-262-5555", "Sue Shoe", 23);
        Student student2 = new Student("555 1st North St.", 51515, "Illinois", "262-414-5555", "Bob Fredrickson", 32);

        System.out.println(student1.getName() + " is from " + student1.getState());
        System.out.println(student2.getName() + " is from " + student2.getState());
    }
}
