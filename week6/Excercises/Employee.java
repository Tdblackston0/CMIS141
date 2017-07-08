public class Employee{
  private double payRate = 0.0;
  private double hoursWorked = 0.0;

  public Employee(){
    payRate = 20.54;
    hoursWorked = 40.0;
  }

  public void setPayRate(double rate){
    payRate = rate;
  }

  public void setHoursWorked (double hours){
    hoursWorked = hours;
  }

  public double getPayRate (){
    return payRate;
  }

  public double getHoursWorked(){
    return hoursWorked;
  }

  public double weekPay(){
    double pay = payRate * hoursWorked;
    return pay;
  }

  public double monthPay(){
    double pay = (payRate * hoursWorked) * 2;
    return pay;
  }
  public double yearPay(){
    double pay = (payRate * hoursWorked) * 26;
    return pay;
  }
}
