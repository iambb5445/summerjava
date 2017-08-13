package Tests;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

import org.junit.Assert;

import entities.BloodStatus;
import entities.House;
import entities.Professor;
import entities.School;
import entities.Student;

public class HouseTest
{
	House house;
	
	@Test
	public void nameTest ()
	{
		house = new House("Griffindor", null, null, null, null, null);
		//test getName
		Assert.assertEquals(house.getName(), "Griffindor");
		//test getName and setName
		house.setName ("Slytherin");
		Assert.assertEquals(house.getName(), "Slytherin");
	}
	
	@Test
	public void SchoolTest ()
	{
		house = new House("Griffindor", null, null, null, null, null);
		School hogwarts = new School ("Hogwarts", null, null, null, null, null, "England");
		// test setSchool and getSchool
		house.setSchool(hogwarts);
		Assert.assertEquals(house.getSchool(), hogwarts);
	}
	
	@Test
	public void StudentsTest ()
	{
		house = new House("Griffindor", null, null, null, null, null);
		Vector <Student> students = new Vector<Student>();
		students.add(new Student("Harry Potter", null, BloodStatus.Half_blood, null, null, null, null));
		students.add(new Student("Ronald Weasley", null, BloodStatus.Pure_blood, null, null, null, null));
		students.add(new Student("Hermione Granger", null, BloodStatus.Muggle_born, null, null, null, null));
		//test setStudent and getStudents
		house.setStudents(students);
		Assert.assertArrayEquals(students.toArray(), house.getStudents().toArray());
		//test addStudent and getStudents
		Student malfoy = new Student("Draco Malfoy", null, BloodStatus.Pure_blood, null, null, null, null);
		house.addStudent(malfoy);
		students.add(malfoy);
		Assert.assertArrayEquals(students.toArray(), house.getStudents().toArray());
		//test removeStudet and getStudents
		students.remove(malfoy);
		house.removeStudent(malfoy);
		Assert.assertArrayEquals(students.toArray(), house.getStudents().toArray());
	}
	
	@Test
	public void headTeacherTest ()
	{
		house = new House("Griffindor", null, null, null, null, null);
		Professor snape = new Professor ("Severus Snape", null, BloodStatus.Half_blood, null, null, null, null);
		// test setHeadTeacher and getHeadTeacher
		house.setHeadTeacher(snape);
		Assert.assertEquals(snape, house.getHeadTeacher());
	}
	
	@Test
	public void qualitiesTest ()
	{
		house = new House("Griffindor", null, null, null, null, null);
		Vector <String> qualities = new Vector<String>();
		qualities.add("bravery");
		qualities.add("courage");
		//test setQualities and getQualities
		house.setQualities(qualities);
		Assert.assertArrayEquals(qualities.toArray(), house.getQualities().toArray());
		//test addQualitiy and getQualities
		house.addQuality("friendship");
		qualities.add("friendship");
		Assert.assertArrayEquals(qualities.toArray(), house.getQualities().toArray());
		//test removeQuality and getQualities
		qualities.remove("friendship");
		house.removeQuality("friendship");
		Assert.assertArrayEquals(qualities.toArray(), house.getQualities().toArray());
	}
	
	@Test
	public void perfectsTest ()
	{
		house = new House("Griffindor", null, null, null, null, null);
		Map<Integer, Student> perfects = new HashMap<Integer, Student>();
		perfects.put(1995, new Student("Ronald Weasley", null, BloodStatus.Pure_blood, null, null, null, null));
		//test setPerfects and getPerfects
		house.setPerfects(perfects);
		Assert.assertEquals(perfects, house.getPerfects());
		//test addPerfect and getPerfects
		Student Hermione = new Student("Hermione Granger", null, BloodStatus.Muggle_born, null, null, null, null);
		house.addPerfect(1995, Hermione);
		perfects.put(1995, Hermione);
		Assert.assertEquals(perfects, house.getPerfects());
	}
}
