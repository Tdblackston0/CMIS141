

public class CarTheft{

  private double year1 = 0.0;
  private double year2 = 0.0;
  private double difference = 0.0;

  public CarTheft(){
    this(0.0,0.0);
  }
  public CarTheft(double year1, double year2){
    this.year1 = year1;

    this.year2 = year2;
  }

  public double getCarTheft(){
    difference = (year1-year2);
    return difference;
  }


}
