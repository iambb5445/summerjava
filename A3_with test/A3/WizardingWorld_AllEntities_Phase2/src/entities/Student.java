package entities;

import java.util.Date;
import java.util.Vector;

public class Student extends Person
{
	private Vector<Course> _courses;
	private Vector<FinishedCourse> _report_card;
	
	public Student(String name, House house, BloodStatus blood_status, School school, Date birthday, Vector<Course> courses, Vector<FinishedCourse> report_card)
	{
		super(name, house, blood_status, school, birthday);
		_courses = courses;
		_report_card = report_card;
	}
	
	public Vector<Course> getCourses ()
	{
		return _courses;
	}
	public void setCourses (Vector<Course> courses)
	{
		_courses = courses;
	}
	public void addCourse (Course course)
	{
		if (_courses == null)
			_courses = new Vector<Course>();
		_courses.add(course);
	}
	public boolean removeCourse (Course course)
	{
		if (_courses == null)
			return false;
		return _courses.remove(course);
	}
	
	public Vector<FinishedCourse> getReportCard ()
	{
		return _report_card;
	}
	public void setReportCard (Vector<FinishedCourse> report_card)
	{
		_report_card = report_card;
	}
	public void addReportCard (FinishedCourse finished_course)
	{
		if (_report_card == null)
			_report_card = new Vector<FinishedCourse>();
		_report_card.add(finished_course);
	}
	public boolean removeReportCard (FinishedCourse finished_course)
	{
		if (_report_card == null)
			return false;
		return _report_card.remove(finished_course);
	}
	
	public boolean courseFinished (Course course, Grades grade)
	{
		if (!_courses.contains(course))
			return false;
		this.removeCourse(course);
		this.addReportCard(new FinishedCourse(course, grade));
		return true;
	}
}
