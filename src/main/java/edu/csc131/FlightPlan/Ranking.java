package edu.csc131.FlightPlan;
import java.util.Arrays;

public class Ranking{

 //Store String Ranked
 public static String rank1, rank2, rank3, rank4;
 //Store Values Ranked
 public static double rank1_value, rank2_value, rank3_value, rank4_value;

 public static void emissions(double walking_e, double biking_e, double public_e, double driving_e){
    double E[]={walking_e, biking_e, public_e, driving_e};
    Arrays.sort(E);
    
    //String Value - Mode for Rank 1
    
    if(E[0]==walking_e){
      Ranking.rank1 = "Walking";
    }
    else if(E[0] == biking_e){
      Ranking.rank1 = "Biking";
    }
    else if(E[0] == public_e){
      Ranking.rank1 = "Public Transportation";
    }
    else{
      Ranking.rank1 = "Driving";
    }
    
    //Mode for Rank 2
    
    if(E[1]==walking_e){
      Ranking.rank2 = "Walking";
    }
    else if(E[1] == biking_e){
      Ranking.rank2 = "Biking";
    }
    else if(E[1] == public_e){
      Ranking.rank2 = "Public Transportation";
    }
    else{
      Ranking.rank2 = "Driving";
    }
    
    
    //Mode for Rank 3
    
    if(E[2]==walking_e){
      Ranking.rank3 = "Walking";
    }
    else if(E[2] == biking_e){
      Ranking.rank3 = "Biking";
    }
    else if(E[2] == public_e){
      Ranking.rank3 = "Public Transportation";
    }
    else{
      Ranking.rank3 = "Driving";
    }
    
   //Mode for Rank 4
   
   if(E[3]==walking_e){
      Ranking.rank4 = "Walking";
    }
    else if(E[3] == biking_e){
      Ranking.rank4 = "Biking";
    }
    else if(E[3] == public_e){
      Ranking.rank4 = "Public Transportation";
    }
    else{
      Ranking.rank4 = "Driving";
    } 
    
    
    //Values stored per mode if needed
    
    Ranking.rank1_value = E[0];
    Ranking.rank2_value = E[1];
    Ranking.rank3_value = E[2];
    Ranking.rank4_value = E[3];
    
 }

 public static void time(double walking_t, double biking_t, double public_t, double driving_t){
    double T[]={walking_t, biking_t, public_t, driving_t};
    Arrays.sort(T);   
    
    //String Value - Mode for Rank 1
    
    if(T[0]==walking_t){
      Ranking.rank1 = "Walking";
    }
    else if(T[0] == biking_t){
      Ranking.rank1 = "Biking";
    }
    else if(T[0] == public_t){
      Ranking.rank1 = "Public Transportation";
    }
    else{
      Ranking.rank1 = "Driving";
    }
    
    //Mode for Rank 2
    
    if(T[1]==walking_t){
      Ranking.rank2 = "Walking";
    }
    else if(T[1] == biking_t){
      Ranking.rank2 = "Biking";
    }
    else if(T[1] == public_t){
      Ranking.rank2 = "Public Transportation";
    }
    else{
      Ranking.rank2 = "Driving";
    }
    
    
    //Mode for Rank 3
    
    if(T[2]==walking_t){
      Ranking.rank3 = "Walking";
    }
    else if(T[2] == biking_t){
      Ranking.rank3 = "Biking";
    }
    else if(T[2] == public_t){
      Ranking.rank3 = "Public Transportation";
    }
    else{
      Ranking.rank3 = "Driving";
    }
    
   //Mode for Rank 4
   
   if(T[3]==walking_t){
      Ranking.rank4 = "Walking";
    }
    else if(T[3] == biking_t){
      Ranking.rank4 = "Biking";
    }
    else if(T[3] == public_t){
      Ranking.rank4 = "Public Transportation";
    }
    else{
      Ranking.rank4 = "Driving";
    } 
    
    //Values stored per mode if needed
    
    Ranking.rank1_value = T[0];
    Ranking.rank2_value = T[1];
    Ranking.rank3_value = T[2];
    Ranking.rank4_value = T[3];  
 }

 public static void financial_cost(double walking_c, double biking_c, double public_c, double driving_c){
    double C[]={walking_c, biking_c, public_c, driving_c};
    Arrays.sort(C);
    
    //String Value - Mode for Rank 1
    
    if(C[0]==walking_c){
      Ranking.rank1 = "Walking";
    }
    else if(C[0] == biking_c){
      Ranking.rank1 = "Biking";
    }
    else if(C[0] == public_c){
      Ranking.rank1 = "Public Transportation";
    }
    else{
      Ranking.rank1 = "Driving";
    }
    
    //Mode for Rank 2
    
    if(C[1]==walking_c){
      Ranking.rank2 = "Walking";
    }
    else if(C[1] == biking_c){
      Ranking.rank2 = "Biking";
    }
    else if(C[1] == public_c){
      Ranking.rank2 = "Public Transportation";
    }
    else{
      Ranking.rank2 = "Driving";
    }
    
    
    //Mode for Rank 3
    
    if(C[2]==walking_c){
      Ranking.rank3 = "Walking";
    }
    else if(C[2] == biking_c){
      Ranking.rank3 = "Biking";
    }
    else if(C[2] == public_c){
      Ranking.rank3 = "Public Transportation";
    }
    else{
      Ranking.rank3 = "Driving";
    }
    
   //Mode for Rank 4
   
   if(C[3]==walking_c){
      Ranking.rank4 = "Walking";
    }
    else if(C[3] == biking_c){
      Ranking.rank4 = "Biking";
    }
    else if(C[3] == public_c){
      Ranking.rank4 = "Public Transportation";
    }
    else{
      Ranking.rank4 = "Driving";
    }  
    
    //Values stored per mode if needed
    Ranking.rank1_value = C[0];
    Ranking.rank2_value = C[1];
    Ranking.rank3_value = C[2];
    Ranking.rank4_value = C[3];
 }

}
