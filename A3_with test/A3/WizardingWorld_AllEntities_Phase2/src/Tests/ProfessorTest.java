package Tests;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;

import entities.BloodStatus;
import entities.Course;
import entities.Grades;
import entities.Person;
import entities.Professor;

public class ProfessorTest extends PersonTest
{
	Person snape;
	Professor professor;
	
	@Test
	public void coursesTest ()
	{
		snape = new Person ("Severus Snape", null, BloodStatus.Half_blood, null, null);
		professor = new Professor (snape, null, null);
		Map<Integer, Course> courses = new HashMap();
		Course poitions = new Course("Poitions", professor, Grades.O, 1990, null);
		courses.put(1990, poitions);
		// test getCourses and setCourses
		professor.setCourses(courses);
		Assert.assertEquals(courses, professor.getCourses());
		// test addCourses and getCourses
		Course transfiguration = new Course("Transfiguration", professor, Grades.E, 1994, null);
		courses.put(1994, transfiguration);
		professor.addCourse(1994, transfiguration);
		Assert.assertEquals(courses, professor.getCourses());
	}
	
	@Test
	public void notesTest ()
	{
		snape = new Person ("Severus Snape", null, BloodStatus.Half_blood, null, null);
		professor = new Professor (snape, null, null);
		// test setNotes and getNotes
		professor.setNotes("He likes to teach defence against the dark arts.");
		Assert.assertEquals(professor.getNotes(), "He likes to teach defence against the dark arts.");
	}
}
