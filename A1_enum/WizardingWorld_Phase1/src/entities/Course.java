package entities;

import java.util.Vector;

public class Course
{
	private String _name;
	private char _min_grade;
	private String _professor_name;
	private int _year;
	private Vector<String> _student_names;
	
	public Course (String name)
	{
		_name = name;
	}
	public Course (String name, String professor_name, char min_grade, int year)
	{
		_name = name;
		_professor_name = professor_name;
		_min_grade = min_grade;
		_year = year;
	}
	
	public Vector <String> getStudentNames ()
	{
		return _student_names;
	}
	public void setStudentNames(Vector <String> student_names)
	{
		_student_names = student_names;
	}
	
	public String getProfessorName ()
	{
		return _professor_name;
	}
	public void setProfessorName (String professor_name)
	{
		_professor_name = professor_name;
	}
	
	public String getName ()
	{
		return _name;
	}
	public void setName (String name)
	{
		_name = name;
	}
	
	public char getMinGrade ()
	{
		return _min_grade;
	}
	public void setMinGrade (char min_grade)
	{
		_min_grade = min_grade;
	}
	
	public int getYear ()
	{
		return _year;
	}
	public void setYear (int year)
	{
		_year = year;
	}
}
