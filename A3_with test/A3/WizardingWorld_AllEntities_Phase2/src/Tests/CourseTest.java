package Tests;

import java.util.Vector;

import org.junit.Assert;
import org.junit.Test;

import entities.BloodStatus;
import entities.Course;
import entities.Grades;
import entities.Student;

public class CourseTest
{
	Course charms;
	@Test
	public void StudentTest ()
	{
		charms = new Course("charms", null, Grades.O, 1984, null);
		Vector <Student> students = new Vector<Student>();
		students.add(new Student("Harry Potter", null, BloodStatus.Half_blood, null, null, null, null));
		students.add(new Student("Ronald Weasley", null, BloodStatus.Pure_blood, null, null, null, null));
		students.add(new Student("Hermione Granger", null, BloodStatus.Muggle_born, null, null, null, null));
		//test setStudent and getStudents
		charms.setStudents(students);
		Assert.assertArrayEquals(students.toArray(), charms.getStudents().toArray());
		//test addStudents and getStudents
		Student malfoy = new Student("Draco Malfoy", null, BloodStatus.Pure_blood, null, null, null, null);
		charms.addStudent(malfoy);
		students.add(malfoy);
		Assert.assertArrayEquals(students.toArray(), charms.getStudents().toArray());
		//test removeStudets and getStudents
		students.remove(malfoy);
		charms.removeStudent(malfoy);
		Assert.assertArrayEquals(students.toArray(), charms.getStudents().toArray());
	}
}