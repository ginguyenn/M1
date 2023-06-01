package de.htwberlin.webtech.m1.web.api;

public class Person {

    private long id;
    private String firstName;
    private String lastName;
    private boolean vaccinated;

    //Constructor create
    public Person(long id, String firstName, String lastName, boolean vaccinated) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;

    }

    //getter&setter create

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
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
    public boolean isVaccinated() {
        return vaccinated;
    }
    public void setVaccinated(boolean vaccinated) {
        this.vaccinated = vaccinated;
    }
}
