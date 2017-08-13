package entities;

import java.util.Date;
import java.util.Map;

public class Professor extends Person
{
	private Map<Integer, Course> _courses;
	private String _notes;
	
	public Professor(Person person, Map<Integer, Course> courses, String notes)
	{
		super (person.getName(), person.getHouse(), person.getBloodStatus(), person.getSchool(), person.getBirthday());
		_courses = courses;
		_notes = notes;
	}
	
	public Professor(String name, House house, BloodStatus blood_status, School school, Date birthday, Map<Integer, Course> courses, String notes)
	{
		super(name, house, blood_status, school, birthday);
		_courses = courses;
		_notes = notes;
	}
	
	public Map<Integer, Course> getCourses ()
	{
		return _courses;
	}
	public void setCourses (Map<Integer, Course> courses)
	{
		_courses = courses;
	}
	public void addCourse (Integer year, Course course)
	{
		_courses.put(year, course);
	}
	
	public String getNotes ()
	{
		return _notes;
	}
	public void setNotes (String notes)
	{
		_notes = notes;
	}
}
