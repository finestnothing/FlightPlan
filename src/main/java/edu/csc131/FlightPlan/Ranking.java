package edu.csc131.FlightPlan;
/**
 * Creates and ranks a list of transportation modes
 * Pass me walking distance, walking time, biking distance, biking time, transit distance, transit time, driving distance, driving time, vehicle type
 */
class Ranking{
   private Calculator c = new Calculator();
   private TransportMode[] modes = new TransportMode[4];
   
   /**
    * Constructor for doubles
    * @param walking distance
    * @param walking time
    * @param biking distance
    * @param biking time
    * @param transit distance
    * @param transit time
    * @param driving distance
    * @param driving time
    * @param driving vehicle type
    */
   Ranking(double walking_d, double walking_t, double biking_d, double biking_t, double public_d, double public_t, double driving_d, double driving_t, String carType) {
      modes[0] = new TransportMode(c.getCarC02(driving_d*c.getKMToMiles(), carType), c.getCarCost(driving_d*c.getKMToMiles(), carType), driving_d*c.getKMToMiles(), driving_t/60, "Car");
      modes[1] = new TransportMode(c.getTransitC02(public_d), c.getTransitCost(public_d*c.getKMToMiles()), public_d*c.getKMToMiles(), public_t/60, "Transit");
      modes[2] = new TransportMode(c.getBikeC02(biking_d*c.getKMToMiles()), c.getBikeCost(biking_d*c.getKMToMiles()), biking_d*c.getKMToMiles(), biking_t/60, "Bike");
      modes[3] = new TransportMode(c.getWalkC02(walking_d*c.getKMToMiles()), c.getWalkCost(walking_d*c.getKMToMiles()), walking_d*c.getKMToMiles(), walking_t/60, "Walk");
   }
   /**
    * Constructor for strings
    * @param walking distance
    * @param walking time
    * @param biking distance
    * @param biking time
    * @param transit distance
    * @param transit time
    * @param driving distance
    * @param driving time
    * @param driving vehicle type
    */
   Ranking(String walking_d, String walking_t, String biking_d, String biking_t, String public_d, String public_t, String driving_d, String driving_t, String carType) {
      modes[0] = new TransportMode(c.getCarC02(Double.parseDouble(driving_d)*c.getKMToMiles(), carType), c.getCarCost(Double.parseDouble(driving_d)*c.getKMToMiles(), carType), Double.parseDouble(driving_d)*c.getKMToMiles(), Double.parseDouble(driving_t)/60, "Car");
      modes[1] = new TransportMode(c.getTransitC02(Double.parseDouble(public_d)*c.getKMToMiles()), c.getTransitCost(Double.parseDouble(public_d)*c.getKMToMiles()), Double.parseDouble(public_d)*c.getKMToMiles(), Double.parseDouble(public_t)/60, "Transit");
      modes[2] = new TransportMode(c.getBikeC02(Double.parseDouble(biking_d)*c.getKMToMiles()), c.getBikeCost(Double.parseDouble(biking_d)*c.getKMToMiles()), Double.parseDouble(biking_d)*c.getKMToMiles(), Double.parseDouble(biking_t)/60, "Bike");
      modes[3] = new TransportMode(c.getWalkC02(Double.parseDouble(walking_d)*c.getKMToMiles()), c.getWalkCost(Double.parseDouble(walking_d)*c.getKMToMiles()), Double.parseDouble(walking_d)*c.getKMToMiles(), Double.parseDouble(walking_t)/60, "Walk");
      
   }
   
   /**
    * @return double[] of carbon score in order (car, transit, bike, walk)
    */
   double[] rank_carbon() {
      double[] rank = new double[modes.length];
      for (int i = 0; i < modes.length; i++)
         rank[i] = modes[i].getC02();
      return rank;
   }
   /**
    * @return double[] of cost in order (car, transit, bike, walk)
    */
   double[] rank_cost() {
      double[] rank = new double[modes.length];
      for (int i = 0; i < modes.length; i++)
         rank[i] = modes[i].getCost();
      return rank;
   }
   /**
    * @return double[] of time in order (car, transit, bike, walk)
    */
   double[] rank_time() {
      double[] rank = new double[modes.length];
      for (int i = 0; i < modes.length; i++)
         rank[i] = modes[i].getTime();
      return rank;
   }
   /**
    * @return double[] of total score in order (car, transit, bike, walk)
    */
   double[] rank_all() {
      double[] rank = new double[modes.length];
      for (int i = 0; i < modes.length; i++)
         rank[i] = modes[i].getScore();
      return rank;
   }
}