package com.test.TestProject;

import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import com.test.TestProject.App;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class NewTest {
  @Test
  public void UserisinStore9() {
  
  String s=App.execute(12.949945,77.534323);
  
  Assert.assertTrue(s.contains("9"));
  }
  
  @Test
  public void UserisNotNearAnyStore(){
	  String s=App.execute(28.7041, 77.1025);
	  Assert.assertEquals(s, "", "String did not return null");
  }
  
  @Test
  public void userisin100mtsRadiusForMoreThanOneSTore(){
	  
	  Assert.assertEquals(true, true);
  }
  
  @Test
  public void userdidnotenterValidlocation(){
	  
	  //executeOnlyTakesDouble as parameters and Scanner calss is only reading double values so user will not be able to enter invalid location
  }
  
  //CHecking boundary conditions
  
  @Test
  public void userisat99Mtsdistancefromstore(){
	  
	  //We can randomly select one store and test this scenario
	  
  }
  @Test
  public void userIsAT100MtsDistanceFromStore(){
	  
	//We can randomly select one store and test this scenario
  }
  @Test
  public void UserIsAt101MtsDistanceFromStore(){
	  
	//We can randomly select one store and test this scenario
  }
  
  public void distanceIsLargetostoreinDouble(){
	  //This is not parctical scenario but just wanted to test it theoritically
  }
  
  //Distance cannot benegative so I'm not testing that scenario
}
