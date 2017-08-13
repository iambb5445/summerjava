package entities;

import java.util.Vector;

public class FinishedCourse extends Course
{
	Grades _grade;
	boolean _passed;
	
	public FinishedCourse(Course course, Grades grade)
	{
		super(course.getName(), course.getProfessor(), course.getMinGrade(), course.getYear(), course.getStudents());
		_grade = grade;
		if (_grade.compareTo(course.getMinGrade()) <= 0)
			_passed = true;
		else
			_passed = false;
	}
	public FinishedCourse(String name, Professor professor, Grades min_grade, int year, Vector<Student> students, Grades grade)
	{
		super(name, professor, min_grade, year, students);
		_grade = grade;
		if (_grade.compareTo(_min_grade) <= 0)
			_passed = true;
		else
			_passed = false;
	}
	
	public Grades getGrade ()
	{
		return _grade;
	}
	public void setGrade (Grades grade)
	{
		_grade = grade;
		if (_grade.compareTo(_min_grade) != -1)
			_passed = true;
		else
			_passed = false;
	}
	
	public boolean getPassed ()
	{
		return _passed;
	}
}
