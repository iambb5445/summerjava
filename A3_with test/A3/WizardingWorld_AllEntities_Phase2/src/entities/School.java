package entities;

import java.util.ArrayList;
import java.util.Vector;

public class School
{
	private String _name;
	private int _num_of_students;
	private boolean _housed;
	private ArrayList<House> _houses;
	private Vector<Student> _students;
	private Vector<Professor> _professors;
	private ArrayList<Course> _courses;
	private ArrayList<Integer> _years;
	private String _location;
	
	/*public School (String name)
	{
		_name = name;
	}*/
	
	public School (String name, ArrayList<House> house_names, ArrayList<Course> courses, ArrayList<Integer> years, Vector<Student> students, Vector<Professor> professors, String location)
	{
		_name = name;
		_houses = house_names;
		_courses = courses;
		_students = students;
		_professors = professors;
		_years = years;
		if (_houses != null)
			_housed = true;
		else
			_housed = false;
		_num_of_students = _students.size();
		_location = location;
	}

	public String getName()
	{
		return _name;
	}
	public void setName(String name)
	{
		_name = name;
	}

	public ArrayList<Course> getCourses()
	{
		return _courses;
	}
	public void setCourses(ArrayList<Course> courses)
	{
		_courses = courses;
	}
	public void addCourse (Course course)
	{
		_courses.add(course);
	}
	public boolean removeCourse (Course course)
	{
		/*if (!_courses.contains(course))
			return false;
		_courses.remove(course);
		return true;*/
		return _courses.remove(course);
	}

	public ArrayList<House> getHouses()
	{
		return _houses;
	}
	public void setHouses(ArrayList<House> houses)
	{
		_houses = houses;
		if (_houses != null)
			_housed = true;
		else
			_housed = false;
	}
	public void addHouse(House house)
	{
		_housed = true;
		_houses.add(house);
	}
	public boolean removeHouse (House house)
	{
		return _houses.remove(house);
	}

	public Vector<Student> getStudents()
	{
		return _students;
	}
	public void setStudents(Vector<Student> students)
	{
		_students = students;
		_num_of_students = _students.size();
	}
	public void addStudent (Student student)
	{
		_students.add(student);
		_num_of_students ++;
	}
	public boolean removeStudent (Student student)
	{
		return _students.remove(student);
	}

	public Vector<Professor> getProfessors()
	{
		return _professors;
	}
	public void setProfessors(Vector<Professor> professors)
	{
		_professors = professors;
	}
	public void addProfessor (Professor professor)
	{
		_professors.add(professor);
	}
	public boolean removeProfessor (Professor professor)
	{
		return _professors.remove(professor);
	}

	public ArrayList<Integer> getYears()
	{
		return _years;
	}
	public void setYears(ArrayList<Integer> years)
	{
		_years = years;
	}
	public void addYear (Integer year)
	{
		_years.add(year);
	}
	public boolean romoveYear (Integer year)
	{
		return _years.remove(year);
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
	
	public String getLocation ()
	{
		return _location;
	}
	public void setLocation (String location)
	{
		_location = location;
	}
}
