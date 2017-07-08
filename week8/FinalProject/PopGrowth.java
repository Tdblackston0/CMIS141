import java.io.*;

public class PopGrowth{

  private double year1 = 0.0;
  private double year2 = 0.0;
  private double sumGrowth = 0.0;

  public PopGrowth(){
    this(0.0,0.0);
  }
  public PopGrowth(double year1, double year2){
    this.year1 = year1;

    this.year2 = year2;
  }

  public double getPopGrowth(){
    sumGrowth = ((year2-year1)/year2)*100;
    return sumGrowth;
  }


}
