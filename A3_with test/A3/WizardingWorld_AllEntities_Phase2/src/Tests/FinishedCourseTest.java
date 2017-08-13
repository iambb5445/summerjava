package Tests;

import org.junit.Test;
import org.junit.Assert;

import entities.Course;
import entities.FinishedCourse;
import entities.Grades;

public class FinishedCourseTest extends CourseTest
{
	protected FinishedCourse finished_charms;
	
	@Test
	public void gradeTest ()
	{
		charms = new Course("charms", null, Grades.O, 1984, null);
		finished_charms = new FinishedCourse (charms, Grades.E);
		// test getGrade
		Assert.assertEquals(finished_charms.getGrade(), Grades.E);
		// test setGrade and getGrade
		finished_charms.setGrade(Grades.T);
		Assert.assertEquals(finished_charms.getGrade(), Grades.T);
	}
	
	@Test
	public void passedTest ()
	{
		// minimum grade in charms is E
		charms = new Course("charms", null, Grades.E, 1984, null);
		finished_charms = new FinishedCourse (charms, Grades.O); // passed
		// test getPassed
		Assert.assertEquals(finished_charms.getPassed(), true);
		FinishedCourse second_finished_charms;
		// test getPassed
		second_finished_charms = new FinishedCourse (charms, Grades.T); // not passed
		Assert.assertEquals(second_finished_charms.getPassed(), false);
	}
}
