package edu.csc131.FlightPlan;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.maps.DistanceMatrixApi;
import com.google.maps.GeoApiContext;
import com.google.maps.model.DistanceMatrix;
import com.google.maps.model.TravelMode;
import com.google.maps.model.Unit;

/**
 * Uses Google API to find travel times to SAC State. 
 * currently finds travel times for walking and driving. 
 * @author ingrumm
 */
public class TimeTo {
    private String APIKEY = "AIzaSyCBpItlEi0pNJV5BJnarqUdQERjmK2t4JM"; //I own this key. It will be deactivated before the project is released to client.
    private GeoApiContext context;
    private String[] orgins;
    private String[] destinations;
    //Travel Times
    private String timeByCar;
    private String timeByWalking;
    private String timeByTransportation;
    private String timeByBike;

    //Distance Metric
    private String distanceByCar;
    private String distanceByWalking;
    private String distanceByTransportation;
    private String distanceByBike;

    /**
     * Default Constructer Please feed this constructer the starting address. Once
     * the class is instantiated you will be able to use the get methods to get the
     * travel times. Please only create one object per request.
     * 
     * @param fromAddress
     * @throws NotValidAddressException
     */
    public TimeTo(String fromAddress) throws NotValidAddressException {
        context = new GeoApiContext.Builder()
        .apiKey(APIKEY)
        .build();

        orgins = new String[]{fromAddress};
        destinations = new String[]{"6000 J St, Sacramento, CA 95819"};

        this.byCarCalcualte();
        this.byWalkingCalcualte();
        this.byTransportationCalcualte();
        this.byBikeCalcualte();
    }

    /**
     * Internal method to calculate car time
     * 
     * @throws NotValidAddressException
     */
    private void byCarCalcualte() throws NotValidAddressException {
      ParseJSON parser = new ParseJSON();//object that reads json from the googles
      String json = null;

      try{
        DistanceMatrix results = DistanceMatrixApi.newRequest(context)
          .origins(orgins)//to
          .destinations(destinations)//from
          .mode(TravelMode.DRIVING)//mode
          .units(Unit.IMPERIAL)
          .await();//wait for reply


        Gson gson = new GsonBuilder().create();
        
        json = gson.toJson(results.rows);
        System.out.println("By Car:");
        System.out.println(json);

      }catch(Exception e){
        System.out.println(e);//YOU HAVE NO POWER HERE EXCEPTION!
        json="";
        
      }finally{
        
      }
      if(!json.equals("")){
        timeByCar = parser.getTime(json);
        distanceByCar = parser.getDistance(json);
      }else{
        timeByCar = "ERROR";
        distanceByCar = "ERROR";
      }
        
    }

        /**
         * Internal method to calculate walk time
         * 
         * @throws NotValidAddressException
         */
        private void byWalkingCalcualte() throws NotValidAddressException {
      ParseJSON parser = new ParseJSON();
      String json = null;

      try{
        DistanceMatrix results = DistanceMatrixApi.newRequest(context)
          .origins(orgins)
          .destinations(destinations)
          .mode(TravelMode.WALKING)
          .units(Unit.IMPERIAL)
          .await();


        Gson gson = new GsonBuilder().create();
        
        json = gson.toJson(results.rows);
        System.out.println("By Walking:");
        System.out.println(json);

      }catch(Exception e){
        System.out.println(e);//YOU HAVE NO POWER HERE EXCEPTION!
        json="";
        
      }finally{
        
      }
      if(!json.equals("")){

        timeByWalking = parser.getTime(json);
        distanceByWalking = parser.getDistance(json);
      }else{
        timeByWalking = "ERROR";
        distanceByWalking = "ERROR";
      }
      }



      private void byTransportationCalcualte() throws NotValidAddressException {
        ParseJSON parser = new ParseJSON();//object that reads json from the googles
        String json = null;
  
        try{
          DistanceMatrix results = DistanceMatrixApi.newRequest(context)
            .origins(orgins)//to
            .destinations(destinations)//from
            .mode(TravelMode.TRANSIT)//mode
            .units(Unit.IMPERIAL)
            .await();//wait for reply
  
  
          Gson gson = new GsonBuilder().create();
          
          json = gson.toJson(results.rows);
          System.out.println("By Transit:");
          System.out.println(json);
  
        }catch(Exception e){
          System.out.println(e);//YOU HAVE NO POWER HERE EXCEPTION!
          json="";
          
        }finally{
          
        }
        if(!json.equals("")){
          timeByTransportation = parser.getTime(json);
          distanceByTransportation = parser.getDistance(json);
        }else{
          timeByTransportation = "ERROR";
          distanceByTransportation = "ERROR";
        }
          
      }


      private void byBikeCalcualte() throws NotValidAddressException {
        ParseJSON parser = new ParseJSON();//object that reads json from the googles
        String json = null;
  
        try{
          DistanceMatrix results = DistanceMatrixApi.newRequest(context)
            .origins(orgins)//to
            .destinations(destinations)//from
            .mode(TravelMode.BICYCLING)//mode
            .units(Unit.IMPERIAL)
            .await();//wait for reply
  
  
          Gson gson = new GsonBuilder().create();
          
          json = gson.toJson(results.rows);
          System.out.println("By bike:");
          System.out.println(json);
  
        }catch(Exception e){
          System.out.println(e);//YOU HAVE NO POWER HERE EXCEPTION!
          json="";
          
        }finally{
          
        }
        if(!json.equals("")){
          timeByBike = parser.getTime(json);
          distanceByBike = parser.getDistance(json);
        }else{
          timeByBike = "ERROR";
          distanceByBike = "ERROR";
        }
          
      }

    public String getTimeByCar() {
        return timeByCar;
    }

    public String getTimeByWalking() {
        return timeByWalking;
    }

    public String getTimeByTransportation() {
      return timeByTransportation;
    }

    public String getTimeByBike() {
      return timeByBike;
    }

    public String getDistanceByCar() {
      return distanceByCar;
    }

    public String getDistanceByWalking() {
      return distanceByWalking;
    }

    public String getDistanceByTransportation() {
      return distanceByTransportation;
    }

    public String getDistanceByBike() {
      return distanceByBike;
    }



    
}
