package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job extends JobField {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.
    public Job(){
        id = nextId;
        nextId++;
    }
    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency){

        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency =coreCompetency;

    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public boolean equals(Object toBeCompared) {
        //Reference check
        if (this == toBeCompared)
            return true;
        //Null check
        if (toBeCompared == null) {
            return false;
        }
        // Class check
           if (!(toBeCompared instanceof Job)) {
               return false;
           }
        //Cast
        Job job = (Job) toBeCompared;
    //custom compare
        return id == job.id;

        }

    @Override
    public String toString() {
        String nameCheck = this.name;
        if (nameCheck == "") {
            nameCheck = "Data not available";
        }

        String employerCheck = this.employer.getValue();

        if (employerCheck == "") {
            employerCheck = "Data not available";
        }

        String locationCheck = this.location.getValue();
        if (locationCheck == "") {
            locationCheck = "Data not available";
        }

        String positionTypeCheck = this.positionType.getValue();
        if (positionTypeCheck == "") {
            positionTypeCheck = "Data not available";
        }

        String coreCompetencyCheck = this.coreCompetency.getValue();
        if (coreCompetencyCheck == "") {
            coreCompetencyCheck = "Data not available";
        }
        if (nameCheck == ""  &&  employerCheck == "" &&
                locationCheck == ""  && positionTypeCheck == "" &&
                coreCompetencyCheck == "") {
            return "OOPS! This job does not seem to exist.";
        }

        return "\n" + "ID: " + id + "\n" +
                "Name: " + nameCheck + "\n" +
                "Employer: " + employerCheck + "\n" +
                "Location: " + locationCheck + "\n" +
                "Position Type: " + positionTypeCheck + "\n" +
                "Core Competency: " + coreCompetencyCheck + "\n";
    }

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }
}
