package Tests;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Vector;

import org.junit.Assert;

import entities.BloodStatus;
import entities.Course;
import entities.Grades;
import entities.House;
import entities.Professor;
import entities.School;
import entities.Student;

public class SchoolTest
{
	School hogwarts;
	
	@Test
	public void nameTest()
	{
		hogwarts = new School("Hogwarts", null, null, null, null, null, "England");
		// test getName
		Assert.assertEquals(hogwarts.getName(), "Hogwarts");
		// test setName and getName
		hogwarts.setName("Beauxbatton");
		Assert.assertEquals(hogwarts.getName(),"Beauxbatton");
	}
	
	@Test
	public void numOfStudentsTest()
	{
		hogwarts = new School("Hogwarts", null, null, null, null, null, "England");
		// test getNumOfStudents
		Assert.assertEquals(hogwarts.getNumOfStudents(), 0);
		hogwarts.addStudent(new Student("Harry Potter", null, BloodStatus.Half_blood, null, null, null, null));
		Assert.assertEquals(hogwarts.getNumOfStudents(), 1);
	}
	
	@Test
	public void housedTest()
	{
		hogwarts = new School("Hogwarts", null, null, null, null, null, "England");
		House griffindor = new House("Griffindor", null, null, null, null, null);
		// test getHoused
		Assert.assertEquals(hogwarts.getHoused(), false);
		hogwarts.addHouse(griffindor);
		Assert.assertEquals(hogwarts.getHoused(), true);
		hogwarts.removeHouse(griffindor);
		Assert.assertEquals(hogwarts.getHoused(), false);
	}
	
	@Test
	public void housesTest()
	{
		hogwarts = new School("Hogwarts", null, null, null, null, null, "England");
		House griffindor = new House("Griffindor", null, null, null, null, null);
		House slytherin = new House("Slytherin", null, null, null, null, null);
		// test setHouses and getHouses
		ArrayList<House> houses = new ArrayList<House>();
		houses.add(griffindor);
		hogwarts.setHouses(houses);
		Assert.assertEquals(hogwarts.getHouses(), houses);
		// test addHouses and getHouses
		hogwarts.addHouse(slytherin);
		houses.add(slytherin);
		Assert.assertEquals(hogwarts.getHouses(), houses);
		// test removeHouses and getHouses
		hogwarts.removeHouse(slytherin);
		houses.remove(slytherin);
		Assert.assertEquals(hogwarts.getHouses(), houses);
	}
	
	@Test
	public void studentsTest()
	{
		hogwarts = new School("Hogwarts", null, null, null, null, null, "England");
		Vector <Student> students = new Vector<Student>();
		students.add(new Student("Harry Potter", null, BloodStatus.Half_blood, null, null, null, null));
		students.add(new Student("Ronald Weasley", null, BloodStatus.Pure_blood, null, null, null, null));
		students.add(new Student("Hermione Granger", null, BloodStatus.Muggle_born, null, null, null, null));
		//test setStudent and getStudents
		hogwarts.setStudents(students);
		Assert.assertArrayEquals(students.toArray(), hogwarts.getStudents().toArray());
		//test addStudents and getStudents
		Student malfoy = new Student("Draco Malfoy", null, BloodStatus.Pure_blood, null, null, null, null);
		hogwarts.addStudent(malfoy);
		students.add(malfoy);
		Assert.assertArrayEquals(students.toArray(), hogwarts.getStudents().toArray());
		//test removeStudets and getStudents
		students.remove(malfoy);
		hogwarts.removeStudent(malfoy);
		Assert.assertArrayEquals(students.toArray(), hogwarts.getStudents().toArray());
	}
	
	@Test
	public void professorsTest()
	{
		hogwarts = new School("Hogwarts", null, null, null, null, null, "England");
		Vector <Professor> professors = new Vector<Professor>();
		professors.add(new Professor ("Severus Snape", null, BloodStatus.Half_blood, null, null, null, null));
		// test setProfessors and getProfessors
		hogwarts.setProfessors(professors);
		Assert.assertArrayEquals(professors.toArray(), hogwarts.getProfessors().toArray());
		// test addProfessors and getProfessors
		Professor mcgongall = new Professor ("Minerva Mcgongall", null, BloodStatus.Pure_blood, null, null, null, null);
		hogwarts.addProfessor(mcgongall);
		professors.add(mcgongall);
		Assert.assertArrayEquals(professors.toArray(), hogwarts.getProfessors().toArray());
		// test removeProfessor and getProfessors
		hogwarts.removeProfessor(mcgongall);
		professors.remove(mcgongall);
		Assert.assertArrayEquals(professors.toArray(), hogwarts.getProfessors().toArray());
	}
	
	@Test
	public void coursesTest()
	{
		hogwarts = new School("Hogwarts", null, null, null, null, null, "England");
		ArrayList<Course> courses = new ArrayList<Course>();
		Course poitions = new Course("Poitions", null, Grades.O, 1990, null);
		// test getCourses and setCourses
		courses.add(poitions);
		hogwarts.setCourses(courses);
		Assert.assertEquals(courses, hogwarts.getCourses());
		// test addCourse and getCourses
		Course transfiguration = new Course("Transfiguration", null, Grades.E, 1994, null);
		courses.add(transfiguration);
		hogwarts.addCourse(transfiguration);
		Assert.assertEquals(courses, hogwarts.getCourses());
		// test removeCourse and getCourses
		hogwarts.removeCourse(transfiguration);
		courses.remove(transfiguration);
		Assert.assertEquals(courses, hogwarts.getCourses());
	}
	
	@Test
	public void yearsTest()
	{
		hogwarts = new School("Hogwarts", null, null, null, null, null, "England");
		ArrayList<Integer> years = new ArrayList<Integer>();
		// test setYears and getYears
		for (int i = 1944; i <= 2003; i++)
			years.add(i);
		hogwarts.setYears(years);
		Assert.assertEquals(years, hogwarts.getYears());
		// test addYear and getYears
		hogwarts.addYear(2017);
		years.add(2017);
		Assert.assertEquals(years, hogwarts.getYears());
		// test removeYear and getYears
		hogwarts.removeYear(2017);
		years.remove((Integer)2017);
		Assert.assertEquals(years, hogwarts.getYears());
	}
	
	@Test
	public void locationTest()
	{
		hogwarts = new School("Hogwarts", null, null, null, null, null, "England");
		// test getLocation
		Assert.assertEquals("England", hogwarts.getLocation());
		// test setLocation and getLocation
		hogwarts.setLocation("France");
		Assert.assertEquals("France", hogwarts.getLocation());
	}
}
