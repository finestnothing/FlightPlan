package edu.csc131.FlightPlan;

import java.text.DecimalFormat;
/**
 * To format time from seconds to hours and minutes
 * To format distance from meters to miles
 */
public class FormatOutput {
    private double meter_to_m_constant=0.00062137119;
    DecimalFormat df;
    
    FormatOutput() {
       df = new DecimalFormat("0.##");
    }
   /**
   * Give me time in seconds and I'll return it in 1 hr 34 mins format
   * @param double seconds
   * @return String time
   */
   public String getTimeFormatted(double seconds) {
      int hours = (int) seconds / 3600;
      int minutes = (int) seconds/60 % 60;
      String time;
      if (hours == 0)
            time = minutes + " min";
         else if (hours == 1)
            time = "1 hr " + minutes + " min";
         else
            time = hours + " hr " + minutes + " min";
      return time;
   }
   /**
   * Give me distance in meters and I'll return miles
   * @param double meters
   * @return double miles
   */
   public double getMetersToMiles(double meters) {
      double miles = Double.valueOf(df.format(meters*meter_to_m_constant));
      return miles;
   } 
   
   public double getC02Formatted(double pounds) {
      return Double.valueOf(df.format(pounds));
   }

   public double getCostFormatted(double dollars) {
      return Double.valueOf(df.format(dollars));
   }
}