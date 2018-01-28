public class Lecturer extends Varsity {
    public static void main(String[] args) {
        Varsity obj = new Lecturer();
        Lecturer obj1 = new Lecturer();

        obj.salary();
        obj.lecture();

        obj1.salary();
        obj1.lecture();
    }
}
