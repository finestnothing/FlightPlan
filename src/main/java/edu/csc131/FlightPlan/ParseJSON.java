package edu.csc131.FlightPlan;

import org.json.JSONArray;
import org.json.JSONObject;

/* An Example of the object we are parseing.
[
  {
    "elements": [
      {
        "status": "OK",
        "duration": {
          "inSeconds": 2839,
          "humanReadable": "47 mins"
        },
        "distance": {
          "inMeters": 65950,
          "humanReadable": "66.0 km"
        }
      }
    ]
  }
]
*/

/**
 * @author  Michael Ingrum
 * @version 1.0
 * @since 1.0.0
 * 
 */
public class ParseJSON {

    /**
     * 
     * @param json string to parse from the matrix api.
     * @return A string of the human readable travel time.
     * @throws NotValidAddressException
     */
    String getTime(String json) throws NotValidAddressException {

        JSONArray arr = new JSONArray(json);
        String travelTime;
        JSONObject obj = arr.getJSONObject(0);
        if(obj.getJSONArray("elements").getJSONObject(0).get("status").toString().equalsIgnoreCase("ok")){
          travelTime = obj.getJSONArray("elements").getJSONObject(0).getJSONObject("duration").get("humanReadable").toString();
        }else{
          travelTime = "ERROR";
          throw new NotValidAddressException("Google API Unable to find address");
        }

        System.out.println(travelTime);
        return travelTime;
    }
;
}
