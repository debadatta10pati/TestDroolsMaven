package com.sample.app;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import com.sample.app.model.Person;

public class TestRule {


	  public static final void main(String[] args) {
	        try {

	  // Load the KIE base:
	  KieServices ks = KieServices.Factory.get();
	  KieContainer kContainer = ks.getKieClasspathContainer();
	  KieSession kSession = kContainer.newKieSession();

	  // Set up the fact model:
	  Person p = new Person();
	  p.setNumberOfHours(200); 
	  p.setFirstName("Tom");
	  p.setLastName("Cruise");
	  p.setHourlyRate(1000);

	  // Insert the person into the session:
	  kSession.insert(p);

	  // Fire all rules:
	  kSession.fireAllRules();
	  kSession.dispose();
	
	  } catch (Throwable t) {
          t.printStackTrace();
      }

}
}
