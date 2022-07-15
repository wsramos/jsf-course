package com.jsfcourse.jsf.beans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Student {
	
	private String firstName;
	private String lastName;
	private String country;
	private String favoriteProgrammingLanguage;
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
}
