package entities;

import java.util.Vector;

public class Course
{
	private String _name;
	protected Grades _min_grade;
	private Professor _professor;
	private int _year;
	private Vector<Student> _students;
	
	/*public Course (String name)
	{
		_name = name;
	}*/
	
	public Course (String name, Professor professor, Grades min_grade, int year)
	{
		_name = name;
		_professor = professor;
		_min_grade = min_grade;
		_year = year;
	}
	
	public Vector <Student> getStudents ()
	{
		return _students;
	}
	public void setStudents(Vector <Student> students)
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
	
	public Professor getProfessor ()
	{
		return _professor;
	}
	public void setProfessor (Professor professor)
	{
		_professor = professor;
	}
	
	public String getName ()
	{
		return _name;
	}
	public void setName (String name)
	{
		_name = name;
	}
	
	public Grades getMinGrade ()
	{
		return _min_grade;
	}
	public void setMinGrade (Grades min_grade)
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
