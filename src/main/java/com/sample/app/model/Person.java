package com.sample.app.model;

  public class Person {

    private String firstName;
    private String lastName;
    private Integer hourlyRate;
    private Integer numberOfHours;

    public String getFirstName() {
      return firstName;
    }

    public void setFirstName(String firstName) {
      this.firstName = firstName;
    }

    public String getLastName() {
      return lastName;
    }

    public void setLastName(String lastName) {
      this.lastName = lastName;
    }

    public Integer getHourlyRate() {
      return hourlyRate;
    }

    public void setHourlyRate(Integer hourlyRate) {
      this.hourlyRate = hourlyRate;
    }

	public Integer getNumberOfHours() {
		return numberOfHours;
	}

	public void setNumberOfHours(Integer numberOfHours) {
		this.numberOfHours = numberOfHours;
	}

  }