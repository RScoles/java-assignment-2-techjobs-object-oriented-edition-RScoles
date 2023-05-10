package org.launchcode.techjobs.oo.test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import static org.junit.Assert.*;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {
    @Test

    public void testSettingJobId() {

        //took out spec
        String spec = "tests to see if job ids is assigning different numbers";
        Job job1 = new Job();
        Job job2 = new Job();
        //System.out.println(job1.getId());
        //System.out.println(job2.getId());
        assertNotEquals(job1.getId(), job2.getId());
    }

    @Test

    public void testJobConstructorSetsAllFields() {
        Job job1 = new Job("Product test",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence"));


        String spec1 = "tests to make sure constructor is working correctly";
        assertTrue(job1 instanceof Job);

        String spec2 = "tests to see if Job constructor Name sets correctly";
        assertEquals("Product test", job1.getName().toString());
        assertTrue(job1.getName().toString() == "Product test");

        String spec3 = "tests to see if Job constructor Employer sets correctly";
        assertEquals("ACME", job1.getEmployer().toString());
        assertTrue(job1.getEmployer().toString() == "ACME");

        String spec4 = "tests to see if Job constructor Location sets correctly";
        assertEquals("Desert", job1.getLocation().toString());
        assertTrue(job1.getLocation().toString() == "Desert");

        String spec5 = "tests to see if Job constructor PostionType sets correctly";
        assertEquals("Quality control", job1.getPositionType().toString());
        assertTrue(job1.getPositionType().toString() == "Quality control");

        String spec6 = "tests to see if Job constructor CoreCompetency sets correctly";
        assertEquals("Persistence", job1.getCoreCompetency().toString());
        assertTrue(job1.getCoreCompetency().toString() == "Persistence");

    }

    @Test
    public void testJobsForEquality() {
        Job job1 = new Job("Product test",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence"));
        Job job2 = new Job("Product test",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence"));
        //System.out.println(job1.getId());
        //System.out.println(job2.getId());
        String spec = "tests to see if different ids are assigned for each job";
        assertFalse(job1.getId() == job2.getId());

    }

    @Test

    public void testToStringStartsAndEndsWithNewLine() {
        Job job1 = new Job("Product test",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence"));
        String jobToString = job1.toString();
        char firstChar = jobToString.charAt(0);
        char lastChar = jobToString.charAt(jobToString.length() - 1);
        assertEquals('\n', firstChar);
        assertEquals('\n', lastChar);
    }

    @Test

    public void testToStringContainsCorrectLabelsAndData() {
        Job job1 = new Job("Product test",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence"));
        String jobToString = job1.toString();

        String stringTypedOut ="\n" + "ID: " + job1.getId() + "\n" +
                "Name: " + job1.getName() + "\n" +
                "Employer: " + job1.getEmployer() + "\n" +
                "Location: " + job1.getLocation() + "\n" +
                "Position Type: " + job1.getPositionType() + "\n" +
                "Core Competency: " + job1.getCoreCompetency() + "\n";

        assertEquals(stringTypedOut, jobToString);



    }

    @Test

    public void testToStringHandlesEmptyField() {
        Job job1 = new Job("", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency("") );
        String jobToString = job1.toString();

        String job2 ="\n" + "ID: " + job1.getId() + "\n" +
                "Name: " + "Data not available"  + "\n" +
                "Employer: " + "Data not available"  + "\n" +
                "Location: " + "Data not available"  + "\n" +
                "Position Type: " + "Data not available"  + "\n" +
                "Core Competency: " + "Data not available"  + "\n";


        assertEquals(jobToString, job2);
    }
}



