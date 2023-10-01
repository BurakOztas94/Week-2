import java.util.Scanner;

public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;


    Employee ()
        {

            Scanner scan = new Scanner (System.in);
            System.out.print ("Please enter employee name : ");
            this.name = scan.nextLine ();
            System.out.print ("Please enter salary : ");
            this.salary = scan.nextDouble ();
            System.out.print ("Please work hours : ");
            this.workHours = scan.nextInt ();
            System.out.print ("Please enter hire year : ");
            this.hireYear = scan.nextInt ();

        }

    public double taxCalculator ()
        {
            if ( this.salary <= 1000 )
                {
                    return 0;
                }
            return salary * 0.03;
        }

    public double raiseSalary ()
        {
            if ( ( 2021 - this.hireYear ) > 20 )
                {
                    return this.salary * 0.15;
                }
            else if (( 2021 - this.hireYear ) >9  &&( 2021 - this.hireYear ) < 20 )
                {
                    return this.salary * 0.10;
                }
            else if ( ( 2021 - this.hireYear ) >= 1 && ( 2021 - this.hireYear ) < 10 )
                {
                    return this.salary * 0.05;

                }
            return this.salary*0;
        }

    public double bonus ()
        {
            if ( workHours > 40 )
                {
                    return ( workHours - 40 ) * 30;
                }
            return 0;
        }

    public double totalSalary ()
        {
            return taxCalculator () + this.salary + bonus ();
        }

    public double finalSalary ()
        {
            return totalSalary () + raiseSalary ();
        }


    public void print ()
        {
            System.out.println ("Employee name : " + this.name);
            System.out.println ("Employee salary : " + this.salary);
            System.out.println ("Employee working hours : " + this.workHours);
            System.out.println ("Employee starting year : " + this.hireYear);
            System.out.println ("Tax : " + taxCalculator ());
            System.out.println ("Bonus : " + bonus ());
            System.out.println ("Salary raise : " + raiseSalary ());
            System.out.println ("Total salary (Tax and Bonuses included) : " + totalSalary ());
            System.out.println ("Final Total Salary  : " + finalSalary ());

        }
}
