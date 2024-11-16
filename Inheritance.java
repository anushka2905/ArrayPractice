class Tester{
    int emp_id;
    String emp_name;
    String emp_add;
    long emp_salary;
}
class Employee extends Tester{
    int emp_id = 9034;
    String emp_name = "dsasd";
    String emp_add = "GWL";
    long emp_salary = 982691274L;

}
public class Inheritance{
    public static void main(String[] args) {
        Employee obj = new Employee();
        
    }
}