package com.test.TestProject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
	public static final double R = 6372.8;
	/*private static double latitude;
	private static double longitude;
    */
	
	public static void main( String[] args )
    {
      
    	
    	     //Reading user location
	      
	      Scanner scan= new Scanner(System.in);  
	      System.out.println("Please enter your latitude location (Double)");
	      
	      double latitude=scan.nextDouble();
	      
	      System.out.println("Please enter your longitude location (Double)");
    	
	      double longitude=scan.nextDouble();
	      execute(latitude, longitude);
	      
    	
    }
    
    public static double haversine(double lat1, double lon1, double lat2, double lon2) {
        double dLat = Math.toRadians(lat2 - lat1);
        double dLon = Math.toRadians(lon2 - lon1);
        lat1 = Math.toRadians(lat1);
        lat2 = Math.toRadians(lat2);
 
        double a = Math.pow(Math.sin(dLat / 2),2) + Math.pow(Math.sin(dLon / 2),2) * Math.cos(lat1) * Math.cos(lat2);
        double c = 2 * Math.asin(Math.sqrt(a));
        return R * c;
    }
    
    public static boolean didUserVisitTheStore(double[] loc,double latitude,double longitude){
    	
    	double distance=haversine(loc[0],loc[1],latitude,longitude);
    	
    	distance=distance*1000;
    	
    	if(distance<=100){
    		return true;
    	}
    	
    	return false;
    }
    
    public static String execute(double latitude,double longitude){

    	HashMap<Integer, double[] > hm= new HashMap<Integer, double[] >();
       
    	//Saving Store locations into Hashmap
    	
	      hm.put(1, new double[]{12.911479, 77.658843});
	      hm.put(2, new double[]{12.937961, 77.646655});
	      hm.put(3, new double[]{13.024029, 77.499885});
	      hm.put(4, new double[]{13.016648, 77.478235});
	      hm.put(5, new double[]{13.004135, 77.481239});
	      hm.put(6, new double[]{12.986792, 77.498630});
	      hm.put(7, new double[]{12.972477, 77.517662});
	      hm.put(8, new double[]{12.962440, 77.515387});
	      hm.put(9, new double[]{12.949945, 77.534323});
	      hm.put(10, new double[]{12.942647, 77.533701});
     

	      String storesVisited= "";
	      for (int i: hm.keySet()) {
	    	  
	    	  if(didUserVisitTheStore(hm.get(i),latitude,longitude)){
	    		storesVisited =storesVisited+i+","; 
	    	  }	
		}  
    	
	     
	      if(storesVisited!=""){
	      
	    	  System.out.println("User visited stores"+ storesVisited);
	      }
	      else
	      {
	    	  System.out.println("User did not vist any store");
	      }
	 
	      return storesVisited;
    }
    /*public static int displayingtheResult(String s){
    	
    	String[] stores=s.split(",");
    	s="";
    	for(int i=0;i<stores.length;i++){
    		s=s+"";
    	}
    
    	return 2;
    }*/
}
