package edu.csc131.FlightPlan;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.maps.DistanceMatrixApi;
import com.google.maps.GeoApiContext;
import com.google.maps.model.DistanceMatrix;
import com.google.maps.model.TravelMode;

/**
 * Uses Google API to find travel times to SAC State. 
 * currently finds travel times for walking and driving. 
 * @author ingrumm
 */
public class TimeTo {
    private String APIKEY = "AIzaSyCBpItlEi0pNJV5BJnarqUdQERjmK2t4JM"; //I own this key. It will be deactivated before the project is released to client.
    private GeoApiContext context;
    private String fromAddress;
    private String[] orgins;
    private String[] destinations;
    private String timeByCar;
    private String timeByWalking;
    
    /**
     * Default Constructer Please feed this constructer the starting address. Once
     * the class is instantiated you will be able to use the get methods to get the
     * travel times. Please only create one object per request.
     * 
     * @param fromAddress
     * @throws NotValidAddressException
     */
    public TimeTo(String fromAddress) throws NotValidAddressException {
        this.fromAddress = fromAddress;
        context = new GeoApiContext.Builder()
        .apiKey(APIKEY)
        .build();

        orgins = new String[]{fromAddress};
        destinations = new String[]{"6000 J St, Sacramento, CA 95819"};

        this.timeByCarCalcualte();
        this.timeByWalkingCalcualte();
    }

    /**
     * Internal method to calculate car time
     * 
     * @throws NotValidAddressException
     */
    private void timeByCarCalcualte() throws NotValidAddressException {
      ParseJSON parser = new ParseJSON();//object that reads json from the googles
      String json = null;

      try{
        DistanceMatrix results = DistanceMatrixApi.newRequest(context)
          .origins(orgins)//to
          .destinations(destinations)//from
          .mode(TravelMode.DRIVING)//mode
          .await();//wait for reply


        Gson gson = new GsonBuilder().create();
        
        json = gson.toJson(results.rows);
        System.out.println(json);

      }catch(Exception e){
        System.out.println(e);//YOU HAVE NO POWER HERE EXCEPTION!
        json="";
        
      }finally{
        
      }
      if(!json.equals("")){
        timeByCar = parser.getTime(json);
      }else{
        timeByCar = "ERROR";
      }
        
    }

        /**
         * Internal method to calculate walk time
         * 
         * @throws NotValidAddressException
         */
        private void timeByWalkingCalcualte() throws NotValidAddressException {
      ParseJSON parser = new ParseJSON();
      String json = null;

      try{
        DistanceMatrix results = DistanceMatrixApi.newRequest(context)
          .origins(orgins)
          .destinations(destinations)
          .mode(TravelMode.WALKING)
          .await();


        Gson gson = new GsonBuilder().create();
        
        json = gson.toJson(results.rows);
        System.out.println(json);

      }catch(Exception e){
        System.out.println(e);//YOU HAVE NO POWER HERE EXCEPTION!
        json="";
        
      }finally{
        
      }
      if(!json.equals("")){

        timeByWalking = parser.getTime(json);
      }else{
        timeByWalking = "ERROR";
      }
      }



    /**
     * 
     * @return String: time to destination by car
     */
    public String getTimeByCar() {
        return timeByCar;
    }


    /**
     * 
     * @return String: time to destination by walking
     */
    public String getTimeByWalking() {
        return timeByWalking;
    }

    
}
