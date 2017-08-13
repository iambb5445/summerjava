package Tests;

import org.junit.Test;

import java.util.Vector;

import org.junit.Assert;

import entities.BloodStatus;
import entities.Course;
import entities.FinishedCourse;
import entities.Grades;
import entities.Student;

public class StudentTest extends PersonTest
{
	Student student;
	
	@Test
	public void courseTest ()
	{
		student = new Student("Harry Potter", null, BloodStatus.Half_blood, null, null, null, null);
		Vector<Course> courses = new Vector<Course>();
		Course poitions = new Course("Poitions", null, Grades.O, 1990, null);
		// test getCourses and setCourses
		courses.add(poitions);
		student.setCourses(courses);
		Assert.assertEquals(courses, student.getCourses());
		// test addCourse and getCourses
		Course transfiguration = new Course("Transfiguration", null, Grades.E, 1994, null);
		courses.add(transfiguration);
		student.addCourse(transfiguration);
		Assert.assertEquals(courses, student.getCourses());
		// test removeCourse and getCourses
		student.removeCourse(transfiguration);
		courses.remove(transfiguration);
		Assert.assertEquals(courses, student.getCourses());
	}
	
	@Test
	public void reportCardTest ()
	{
		student = new Student("Harry Potter", null, BloodStatus.Half_blood, null, null, null, null);
		Vector<FinishedCourse> report_card = new Vector<FinishedCourse>();
		FinishedCourse poitions = new FinishedCourse("Poitions", null, Grades.O, 1990, null, Grades.A);
		// test getReportCard and setReportCard
		report_card.add(poitions);
		student.setReportCard(report_card);
		Assert.assertEquals(report_card, student.getReportCard());
		// test addReportCard and getReportCard
		FinishedCourse transfiguration = new FinishedCourse("Transfiguration", null, Grades.E, 1994, null, Grades.E);
		report_card.add(transfiguration);
		student.addReportCard(transfiguration);
		Assert.assertEquals(report_card, student.getReportCard());
		// test removeReportCard and getReportCard
		student.removeReportCard(transfiguration);
		report_card.remove(transfiguration);
		Assert.assertEquals(report_card, student.getReportCard());
	}
}
