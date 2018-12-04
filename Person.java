
/**
 * Write a description of class Person here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Person
{
 
    private String firstName;
    private String lastName;
    private int birthYear;
    private String sex;
    private double pounds;
    private String highestEducationLevel;
    
    /**
     * @param firstName Person's first name
     * @param lastName Person's last name
     * @param birthYear Person's birth year
     * @param sex Person's sex
     * @param pounds Person's weight, in pounds
     * @param highestEducationLevel Person's education level
     */
    public Person(String firstName, String lastName, int birthYear, String sex, double pounds, String highestEducationLevel) 
    {
        this.birthYear = birthYear;
        this.sex = sex;
        this.pounds = pounds;
        this.highestEducationLevel = highestEducationLevel;
        setFirstName(firstName);
        setLastName(lastName);
    }
    public void setFirstName(String firstName) {
     if(firstName.equalsIgnoreCase("Mike")) {
         this.firstName = null;
        }else{
            this.firstName = firstName;
        }
    
}
    public void setLastName(String lastName) {
        if(lastName.equalsIgnoreCase("Mulder")) {
        this.lastName = null;
    }else{
        this.lastName = lastName;
}
}
public String getFirstName() {
    
    return this.firstName;
}
public String getLastName() {
    
    return this.lastName;
}
}