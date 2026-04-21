
import java.util.ArrayList;

public class Payroll_System {
  private ArrayList<employee>  employeeList;

  public Payroll_System() {
    employeeList = new ArrayList<>();
  }
   public void AddMember(employee employee){
     employeeList.add(employee);
   }
   public void RemoveEmployee(int id){
    employee employeeToRemove = null;
    for(employee employee : employeeList){
       if(employee.getId()==id){
        employeeToRemove = employee;
        break;
       } 
    }
      if(employeeToRemove!=null){
        employeeList.remove(employeeToRemove);
      }
      
   }
   public void DisplayEmployee(){
    for(employee employee:employeeList){
      System.out.println(employee);
    }
   }
}
