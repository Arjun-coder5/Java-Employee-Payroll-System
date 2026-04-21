public class full_time_employee extends employee {
  private double monthlySalary;

  public full_time_employee(String name, int id, double monthlySalary) {
    super(name, id);
    this.monthlySalary = monthlySalary;
  }
  @Override
  public double calculateSalary(){
    return monthlySalary;
  }

  
  
}
