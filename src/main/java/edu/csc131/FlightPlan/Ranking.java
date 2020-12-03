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

      modes[0] = new TransportMode(c.getCarC02(driving_d, carType), c.getCarCost(driving_d, carType), driving_d, driving_t, "Car");
      modes[1] = new TransportMode(c.getTransitC02(public_d), c.getTransitCost(public_d), public_d, public_t, "Transit");
      modes[2] = new TransportMode(c.getBikeC02(biking_d), c.getBikeCost(biking_d), biking_d, biking_t, "Bike");
      modes[3] = new TransportMode(c.getWalkC02(walking_d), c.getWalkCost(walking_d), walking_d, walking_t, "Walk");
   }
   
   /**
    * @return double[] of carbon score in order (car, transit, bike, walk)
    */
   public double[] rank_carbon() {
      double[] rank = new double[modes.length];
      for (int i = 0; i < modes.length; i++)
         rank[i] = modes[i].getC02();
      return rank;
   }
   /**
    * @return double[] of cost in order (car, transit, bike, walk)
    */
   public double[] rank_cost() {
      double[] rank = new double[modes.length];
      for (int i = 0; i < modes.length; i++)
         rank[i] = modes[i].getCost();
      return rank;
   }
   /**
    * @return double[] of time in order (car, transit, bike, walk)
    */
   public double[] rank_time() {
      double[] rank = new double[modes.length];
      for (int i = 0; i < modes.length; i++)
         rank[i] = modes[i].getTime();
      return rank;
   }
   /**
    * @return double[] of total score in order (car, transit, bike, walk)
    */
   public double[] rank_all() {
      double[] rank = new double[modes.length];
      for (int i = 0; i < modes.length; i++)
         rank[i] = modes[i].getScore();
      return rank;
   }

   TransportMode[] getTransportModes() {
      return modes;
   }
}
