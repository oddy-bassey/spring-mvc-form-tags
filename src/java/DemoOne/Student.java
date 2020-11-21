package DemoOne;

import java.util.LinkedHashMap;


public class Student {
    private String firstName;
    private String lastName;
    private String country;
    private String favoriteLanguage;
    private String operatingSystems[];
    
    private LinkedHashMap<String, String> countryOptions;
    private LinkedHashMap<String, String> favoriteLanguageOptions;
    
    public Student(){
        countryOptions = new LinkedHashMap<>();
        
        countryOptions.put("DE", "Germany");
        countryOptions.put("NIG", "Nigeria");
        countryOptions.put("FR", "France");
        countryOptions.put("Rss", "Russia");
        countryOptions.put("ENG", "England");
        countryOptions.put("SA", "South Africa");
        
        favoriteLanguageOptions = new LinkedHashMap<>();
        
        //LinkedList<value, Key>
        favoriteLanguageOptions.put("Java", "Java");
        favoriteLanguageOptions.put("Python", "Python");
        favoriteLanguageOptions.put("JavaScript", "JavaScript");
        favoriteLanguageOptions.put("Ruby", "Rubby");
    }

    public String[] getOperatingSystems() {
        return operatingSystems;
    }

    public void setOperatingSystems(String[] operatingSystems) {
        this.operatingSystems = operatingSystems;
    }
    
    public LinkedHashMap<String, String> getFavoriteLanguageOptions() {
        return favoriteLanguageOptions;
    }

    public String getFavoriteLanguage() {
        return favoriteLanguage;
    }

    public void setFavoriteLanguage(String favouriteLanguage) {
        this.favoriteLanguage = favouriteLanguage;
    }
    
    public LinkedHashMap<String, String> getCountryOptions() {
        return countryOptions;
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
        return country;
    }

    public void setCountry(String countrys) {
        this.country = countrys;
    }
    
}
