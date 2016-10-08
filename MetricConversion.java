
public class MetricConversion {
  public static void main(String[] args) {
    final double MIN_FEET = 1;
    final double MAX_FEET = 10;
    final int FEET_INC = 1;
    final double MIN_METER = 20;
    final double MAX_METER = 65;
    final int METER_INC = 5;

    System.out.printf("%4s%10s%20s%10s\n", "Feet", "Meters", "Meters", "Feet");
    System.out.println("---------------------------------------------");
    double feet = MIN_FEET, meters = MIN_METER;
    while (feet <= MAX_FEET && meters <= MAX_METER) {
      System.out.printf("%4.1f%10.3f%20.1f%10.3f\n", feet, feetToMeters(feet), meters,
          metersToFeet(meters));
      feet += FEET_INC;
      meters += METER_INC;
    }
  }

  /** Write a method here that converts from feet to meters */

  

  /** Write a method here that converts from meters to feet */

}
