package com.jsfcourse.jsf.beans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;

@ManagedBean
public class Student {
	
	private String firstName;
	private String lastName;
	private String country;
	private String favoriteProgrammingLanguage;
	private String email;
	private Long freePasses;
	private Long postalCode;
	private String phoneNumber;
	private String courseCode;
	//private String otherProgrammingLanguages;
	
	List<String> countryOptions;
	List<String> programmingLanguageOptions;
	List<String> otherProgrammingLanguages;
	
	public Student() {
		countryOptions = new ArrayList<>();
		programmingLanguageOptions = new ArrayList<>();
		
		countryOptions.add("Brazil");
		countryOptions.add("France");
		countryOptions.add("Germany");
		countryOptions.add("India");
		countryOptions.add("Turkey");
		countryOptions.add("United Kingdom");
		countryOptions.add("United States");
		
		programmingLanguageOptions.add("Java");
		programmingLanguageOptions.add("PHP");
		programmingLanguageOptions.add("C#");
		programmingLanguageOptions.add("Ruby");
	}

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
	
	public String getCountry() {
		return this.country;
	}
	
	public void setCountry(String country) {
		this.country = country;
	}
	
	public String getFavoriteProgrammingLanguage() {
		return this.favoriteProgrammingLanguage;
	}
	
	public void setFavoriteProgrammingLanguage(String favoriteProgrammingLanguage) {
		this.favoriteProgrammingLanguage = favoriteProgrammingLanguage;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Long getFreePasses() {
		return freePasses;
	}

	public void setFreePasses(Long freePasses) {
		this.freePasses = freePasses;
	}

	public Long getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(Long postalCode) {
		this.postalCode = postalCode;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}	

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

	public List<String> getOtherProgrammingLanguages() {
		return this.otherProgrammingLanguages;
	}

	public void setOtherProgrammingLanguages(List<String> otherProgrammingLanguages) {
		this.otherProgrammingLanguages = otherProgrammingLanguages;
	}
	

	public List<String> getCountryOptions(){
		return this.countryOptions;
	}
	
	public List<String> getProgrammingLanguageOptions(){
		return this.programmingLanguageOptions;
	}
	
	public void validateTheCourseCode(FacesContext faces, UIComponent component, Object value) throws ValidatorException{
		
		if(value == null) {
			return;
		}
		
		String data = value.toString();
		
		if(!data.startsWith("JSF")) {
			FacesMessage message = new FacesMessage("Course Code must start with JSF.");
			
			throw new ValidatorException(message);
		}
		
	}	
}
