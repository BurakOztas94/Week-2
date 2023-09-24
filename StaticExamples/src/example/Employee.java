package example;
public class Employee {
    private String name;
    private static int totalEemployee=0;

    public Employee(String name){
        this.name=name;
        totalEemployee++;
    }
    public String getName(){
        return name;
    }
    public void  setName(String name){
        this.name=name;
    }

    public static int showEmployeeNumber(){
        return totalEemployee;

    }


}
