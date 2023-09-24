package example;
public class Main {
    public static void main ( String[] args )
        {
            Employee employe1=new Employee("Burak");
            System.out.println (employe1.getName ());
            Employee employe2=new Employee("Zeynep");
            System.out.println (employe2.getName ());
            Employee employe3=new Employee("Lilly");
            System.out.println (employe3.getName ());
            Employee employe4=new Employee("Pelte");
            System.out.println (employe4.getName ());

            System.out.println ( Employee.showEmployeeNumber ());
        }
}
