/**
 * Stores values of each mode of transportation
 * No setters, so pass all values at declaration (although easily modifiable)
 * 
 * Overall score is weighted to increase the effect of cost, carbon
 *    significantly less variance from carbon, cost than time (the lower the score the better)
 */
public class TransportMode {
   private double carbon;
   private double cost;
   private double distance;
   private double time;
   private String type;
   private double score;
   
   /**
    * Constructor
    * @param total carbon emissions
    * @param total cost
    * @param distance of trip
    * @param time traveled
    * @param type of transportation (Vehicle, Bicycle, etc)
    */
   TransportMode(double carbon_i, double cost_i, double distance_i, double time_i, String type_i) {
      carbon = carbon_i;
      cost = cost_i;
      distance = distance_i;
      time = time_i;
      type = type_i;
      score = carbon_i*3 + cost_i*2 + time_i; //arbitrary score but it's helpful in ranking all three
   }
   /**
    * Getter - carbon
    * @return carbon
    */
   double getC02() {
      return carbon;
   }
   /**
    * Getter - cost
    * @return cost
    */
   double getCost() {
      return cost;
   }
   /**
    * Getter - distance
    * @return distance
    */
   double getDistance() {
      return distance;
   }
   /**
    * Getter - time
    * @return time
    */
   double getTime() {
      return time;
   }
   /**
    * Getter - type
    * @return transportation type
    */
   String getType() {
      return type;
   }
   /**
    * Getter - total score
    * @return score of (3*carbon, 2*cost, time)
    */
   double getScore() {
      return score;   
   }
}