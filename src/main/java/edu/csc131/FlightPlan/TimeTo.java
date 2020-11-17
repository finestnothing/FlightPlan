package edu.csc131.FlightPlan;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.maps.DistanceMatrixApi;
import com.google.maps.GeoApiContext;
import com.google.maps.model.DistanceMatrix;
import com.google.maps.model.TravelMode;

public class TimeTo {
    private String APIKEY = "AIzaSyCBpItlEi0pNJV5BJnarqUdQERjmK2t4JM";
    String fromAddress;
    String timeByCar;
    String timeByWalking;
    public TimeTo(String fromAddress){
        this.fromAddress = fromAddress;
        this.timeByCarCalcualte();
        this.timeByWalkingCalcualte();
    }

    private void timeByCarCalcualte(){
      ParseJSON parser = new ParseJSON();
      String json = null;
      String[] orgins = new String[]{fromAddress};
      String[] destinations = new String[]{"6000 J St, Sacramento, CA 95819"};

      GeoApiContext context = new GeoApiContext.Builder()
      .apiKey(APIKEY)
      .build();
      try{
        DistanceMatrix results = DistanceMatrixApi.newRequest(context)
          .origins(orgins)
          .destinations(destinations)
          .mode(TravelMode.DRIVING)
          .await();


        Gson gson = new GsonBuilder().create();
        
        json = gson.toJson(results.rows);
        System.out.println(json);

      }catch(Exception e){
        System.out.println(e);//YOU HAVE NO POWER HERE EXCEPTION!
        json="";
        //return "ERROR";
      }finally{
        
      }

        timeByCar = parser.getTime(json);
    }


    private void timeByWalkingCalcualte(){
        ParseJSON parser = new ParseJSON();
        String json = null;
        String[] orgins = new String[]{fromAddress};
        String[] destinations = new String[]{"6000 J St, Sacramento, CA 95819"};
  
        GeoApiContext context = new GeoApiContext.Builder()
        .apiKey(APIKEY)
        .build();
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
          //return "ERROR";
        }finally{
          
        }
  
          timeByWalking = parser.getTime(json);
      }




    public String getTimeByCar() {
        return timeByCar;
    }

    public void setTimeByCar(String timeByCar) {
        this.timeByCar = timeByCar;
    }

    public String getTimeByWalking() {
        return timeByWalking;
    }

    public void setTimeByWalking(String timeByWalking) {
        this.timeByWalking = timeByWalking;
    }
    
}
