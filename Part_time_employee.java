public class Part_time_employee extends employee {
  private  int hour_work;
  private double hourly_rate;

  public Part_time_employee(String name, int id, int hour_work, double hourly_rate) {
    super(name, id);
    this.hour_work = hour_work;
    this.hourly_rate = hourly_rate;
  }
  @Override
  public double  calculateSalary(){
    return hour_work*hour_work;
  }
}
