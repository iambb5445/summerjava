package entities;

import java.util.ArrayList;
import java.util.Vector;

public class School
{
	private String _name;
	private int _num_of_students;
	private boolean _housed;
	private ArrayList<String> _house_names;
	private Vector<String> _student_names;
	private Vector<String> _professor_names;
	private ArrayList<String> _course_names;
	private ArrayList<Integer> _years;
	
	public School (String name)
	{
		_name = name;
	}
	public School (String name, ArrayList<String> house_names, ArrayList<String> course_names, ArrayList<Integer> years, Vector<String> student_names, Vector<String> professor_names)
	{
		_name = name;
		_house_names = house_names;
		_course_names = course_names;
		_student_names = student_names;
		_professor_names = professor_names;
		_years = years;
		if (_house_names != null)
			_housed = true;
		else
			_housed = false;
		_num_of_students = _student_names.size();
	}

	public String getName()
	{
		return _name;
	}
	public void setName(String name)
	{
		_name = name;
	}

	public ArrayList<String> getCourseNames()
	{
		return _course_names;
	}
	public void setCourseNames(ArrayList<String> course_names)
	{
		_course_names = course_names;
	}

	public ArrayList<String> getHouseNames()
	{
		return _house_names;
	}
	public void setHouseNames(ArrayList<String> house_names)
	{
		_house_names = house_names;
		if (_house_names != null)
			_housed = true;
		else
			_housed = false;
	}

	public Vector<String> getStudentNames()
	{
		return _student_names;
	}
	public void setStudentNames(Vector<String> student_names)
	{
		_student_names = student_names;
		_num_of_students = _student_names.size();
	}

	public Vector<String> getProfessorNames()
	{
		return _professor_names;
	}
	public void setProfessorNames(Vector<String> professor_names)
	{
		_professor_names = professor_names;
	}

	public ArrayList<Integer> getYears()
	{
		return _years;
	}
	public void setYears(ArrayList<Integer> years)
	{
		_years = years;
	}
	
	public int getNumOfStudents ()
	{
		return _num_of_students;
	}
	/*public void setNumOfStudents (int num_of_students)
	{
		_num_of_students = num_of_students;
	}*/
	
	public boolean getHoused ()
	{
		return _housed;
	}
	/*public void setHoused (boolean housed)
	{
		_housed = housed;
	}*/
}
