package edu.csc131.FlightPlan;
/**
 * Calculates the total cost/carbon emission of a trip for given transportation mode
 * Should read and store cost/carbon for mile for each mode
 */
public class Calculator { //this is pretty useless. Being able to multiply is sure a difficult function to create
   //Car
   private int carbon_per_gallon_fuel=8887; //number in grams. must convert to pounds using conversion rate
   private double grams_to_lbs_conversion_rate=0.00220462;
   private double cost_per_gallon_fuel=3.50;

   //Bicycle
   private double bike_cost_per_mile=0.2643;
   private double bike_c02_per_mile=0.1243;
   //Transit
   private double transit_cost_per_mile=0;
   private double transit_c02_per_mile=0.3921;
   //Walk
   private double walk_cost_per_mile=0.3264;
   private double walk_c02_per_mile=0.0926;

   private int weeks_per_semester=16;                 /* check on this info */
   private int cost_parking_pass_per_semester=170;
   private int cost_parking_pass_per_trip=5;

   /**
    * Calculate cost of total trip by vehicle type.
    * @param distance
    * @param mpg
    * @return cost
    */
   double getCarCost(double distance, int mpg) {
      return distance*cost_per_gallon_fuel/mpg + cost_parking_pass_per_trip; //assumed 5 dollars to park
   }

   /**
    * Calculate carbon produced during trip, by vehicle type.
    * @param distance
    * @param mpg
    * @return carbon emitted
    */
   double getCarC02(double distance, int mpg) {
      return (distance*carbon_per_gallon_fuel/mpg)*grams_to_lbs_conversion_rate;
   }
   /**
    * Calculates total cost of driving for a semester, includes cost of parking pass
    * @param tripsPerWeek
    * @param distance
    * @param mpg
    * @return cost per semester
    */
   double getCarCostPerSemester(int tripsPerWeek, double distance, int mpg) {
      double costPerTrip = getCarCost(distance, mpg) - cost_parking_pass_per_trip;
      double costPerSemester = costPerTrip*weeks_per_semester*tripsPerWeek*2 + cost_parking_pass_per_semester;
      return costPerSemester;
   }
   /**
    * Calculates total c02 emissions of driving for a semester
    * @param tripsPerWeek
    * @param distance
    * @param mpg
    * @return c02 per semester
    */
   double getCarC02PerSemester(int tripsPerWeek, double distance, int mpg) {
      return getCarC02(distance, mpg)*tripsPerWeek*weeks_per_semester*2; //multiply by two for each direction
   }

   /**
    * Calculate total cost of the trip by bicycle
    * @param distance
    * @return cost
    */
   double getBikeCost(double distance) {
      return bike_cost_per_mile*distance;
   }
   /**
    * Calculate total carbon produced by bicycle and it's rider during the trip
    * @param distance
    * @return carbon emission
    */
   double getBikeC02(double distance) {
      return bike_c02_per_mile*distance;
   }
   /**
    * Calculates total cost of biking for a semester
    * @param tripsPerWeek
    * @param distance
    * @return cost per semester
    */
   double getBikeCostPerSemester(int tripsPerWeek, double distance) {
      return getBikeCost(distance)*tripsPerWeek*weeks_per_semester*2;
   }
   /**
    * Calculates total c02 of biking for a semester
    * @param tripsPerWeek
    * @param distance
    * @return c02 per semester
    */
   double getBikeC02PerSemester(int tripsPerWeek, double distance) {
      return getBikeC02(distance)*tripsPerWeek*weeks_per_semester*2;
   }

   /**
    * Calculate total cost of the trip by transit (should be 0 for foreseeable future)
    * @param distance
    * @return cost
    */
   double getTransitCost(double distance) {
      return transit_cost_per_mile*distance;
   }
   /**
    * Calculate total carbon produced during the transit trip (adjusted per rider)
    * @param distance
    * @return cost
    */
   double getTransitC02(double distance) {
      return transit_c02_per_mile*distance;
   }
   /**
    * Calculates total cost of transit trip per semester
    * @param tripsPerWeek
    * @param distance
    * @return cost per semester
    */
   double getTransitCostPerSemester(int tripsPerWeek, double distance) {
      return getTransitCost(distance)*tripsPerWeek*weeks_per_semester*2;
   }
   /**
    * Calculates total c02 emissions for transit trip per semester
    * @param tripsPerWeek
    * @param distance
    * @return c02 per semester
    */
   double getTransitC02PerSemester(int tripsPerWeek, double distance) {
      return getTransitC02(distance)*tripsPerWeek*weeks_per_semester*2;
   }

   /**
    * Calculate total cost of the trip by foot (assumed entirely on caloric deficit)
    * @param distance
    * @return cost
    */
   double getWalkCost(double distance) {
      return walk_cost_per_mile*distance;
   }
   /**
    * Calculate total carbon produced by walking trip
    * @param distance
    * @return cost
    */
   double getWalkC02(double distance) {
      return walk_c02_per_mile*distance;
   }
   /**
    * Calculates total walk cost per semester
    * @param tripsPerWeek
    * @param distance
    * @return cost per semester
    */
   double getWalkCostPerSemester(int tripsPerWeek, double distance) {
      return getWalkCost(distance)*tripsPerWeek*weeks_per_semester*2;
   }
   /**
    * Calculates total c02 of walking per semester
    * @param tripsPerWeek
    * @param distance
    * @return c02 per semester
    */
   double getWalkC02PerSemester(int tripsPerWeek, double distance) {
      return getWalkC02(distance)*tripsPerWeek*weeks_per_semester*2;
   }
}
