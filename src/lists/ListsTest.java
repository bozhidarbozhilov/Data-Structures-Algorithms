package lists;

public class ListsTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee(1, "John", "Doe");
        Employee employee2 = new Employee(2, "Jane", "Doe");
        Employee employee3 = new Employee(3, "Leo", "Messi");
        Employee employee4 = new Employee(4, "Christiano", "Ronaldo");

        CustomDoublyList<Employee> employees = new CustomDoublyList<>();

        employees.addToEnd(employee1);
        employees.addToEnd(employee2);
        employees.addToEnd(employee3);

        employees.printFromStart();

        System.out.println(employees.getSize());

        employees.removeFromEnd();

        employees.printFromStart();
//        System.out.println(employees.getHead().getNext());
//        System.out.println(employees.getHead().getPrev());

        System.out.println(employees.getSize());

    }
}
