package entities;

import java.util.Map;
import java.util.Vector;

public class House
{
	private String _name;
	private School _school;
	private Vector<Student> _students;
	private Professor _head_teacher;
	private Vector<String> _qualities;
	private Map<Integer, Student> _perfects;
	
	public House(String name, School school, Vector<Student> students, Professor head_teacher, Vector<String> qualities, Map<Integer, Student> perfects)
	{
		_name = name;
		_school = school;
		_students = students;
		_head_teacher = head_teacher;
		_qualities = qualities;
		_perfects = perfects;
	}
	
	public String getName ()
	{
		return _name;
	}
	public void setName (String name)
	{
		_name = name;
	}
	
	public School getSchool ()
	{
		return _school;
	}
	public void setSchool (School school)
	{
		_school = school;
	}
	
	public Vector<Student> getStudents ()
	{
		return _students;
	}
	public void setStudents (Vector<Student> students)
	{
		_students = students;
	}
	public void addStudent (Student student)
	{
		_students.add(student);
	}
	public boolean removeStudent (Student student)
	{
		return _students.remove(student);
	}
	
	public Professor getHeadTeacher ()
	{
		return _head_teacher;
	}
	public void setHeadTeacher (Professor head_teacher)
	{
		_head_teacher = head_teacher;
	}
	
	public Vector<String> getQualities ()
	{
		return _qualities;
	}
	public void setQualities (Vector<String> qualities)
	{
		_qualities = qualities;
	}
	public void addQuality (String quality)
	{
		_qualities.add(quality);
	}
	public boolean removeQuality (String quality)
	{
		return _qualities.remove(quality);
	}
	
	public Map<Integer, Student> getPerfects ()
	{
		return _perfects;
	}
	public void setPerfects (Map<Integer, Student> perfects)
	{
		_perfects = perfects;
	}
	public void addPerfect (Integer year, Student student)
	{
		_perfects.put(year, student);
	}
	// we never remove a perfect
}
