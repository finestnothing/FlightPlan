package edu.csc131.FlightPlan;
/**
 * Calculates the total cost/carbon emission of a trip for given transportation mode
 * Should read and store cost/carbon for mile for each mode
 */
public class Calculator { //this is pretty useless. Being able to multiply is sure a difficult function to create
   //Car
   private double sedan_cost_per_mile=0.7163;
   private double crossover_cost_per_mile=0.6573;
   private double suv_cost_per_mile=0.8208;
   private double green_cost_per_mile=0.6888;
   private double motorcycle_cost_per_mile=0.4032;

   private double sedan_c02_per_mile=0.59;
   private double crossover_c02_per_mile=1.1;
   private double suv_c02_per_mile=1.57;
   private double green_c02_per_mile=0.65;
   private double motorcycle_c02_per_mile=0.36;

   //Bicycle
   private double bike_cost_per_mile=0.2643;
   private double bike_c02_per_mile=0.1243;
   //Transit
   private double transit_cost_per_mile=0;
   private double transit_c02_per_mile=0.3921;
   //Walk
   private double walk_cost_per_mile=0.3264;
   private double walk_c02_per_mile=0.0926;

   /**
    * Calculate cost of total trip by vehicle type.
    * @param distance
    * @param vehicle_type
    * @return cost
    */
   double getCarCost(double distance, String vehicle_type) {
      switch (vehicle_type)
      {
         case "Sedan":
            return sedan_cost_per_mile*distance;
         case "Crossover":
            return crossover_cost_per_mile*distance;
         case "SUV":
            return suv_cost_per_mile*distance;
         case "Green":
            return green_cost_per_mile*distance;
         case "Motorcycle":
            return motorcycle_cost_per_mile*distance;
      }
      return 0;
   }

   /**
    * Calculate carbon produced during trip, by vehicle type.
    * @param distance
    * @param vehicle_type
    * @return carbon emitted
    */
   double getCarC02(double distance, String vehicle_type) {
      switch (vehicle_type)
      {
         case "Sedan":
            return sedan_c02_per_mile*distance;
         case "Crossover":
            return crossover_c02_per_mile*distance;
         case "SUV":
            return suv_c02_per_mile*distance;
         case "Green":
            return green_c02_per_mile*distance;
         case "Motorcycle":
            return motorcycle_c02_per_mile*distance;
      }
      return 0;
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
}
