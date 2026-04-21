public class Main{
  public static void main(String[] args) {
    Payroll_System payroll_System = new Payroll_System();
    full_time_employee Emp1 = new full_time_employee("Arjun",1,100000);
    Part_time_employee Emp2 = new Part_time_employee("Bhuvnesh", 2, 5, 2000);

    payroll_System.AddMember( Emp1);
    payroll_System.AddMember(Emp2);

    // initial details ;
    System.out.println("Initial details ");
    payroll_System.DisplayEmployee();
    System.out.println("Removing employee");
    payroll_System.RemoveEmployee(2);
    System.out.println("remaining employees details : ");
    payroll_System.DisplayEmployee();

  }
}