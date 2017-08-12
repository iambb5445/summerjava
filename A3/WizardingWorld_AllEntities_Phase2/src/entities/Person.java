package entities;

import java.util.Date;

public class Person
{
	private String _name;
	private House _house;
	private BloodStatus _blood_status;
	private School _school;
	private Date _birthday;
	
	
	/*public Person (String name)
	{
		_name = name;
	}*/
	
	public Person (String name, House house, BloodStatus blood_status, School school, Date birthday)
	{
		_name = name;
		_house = house;
		_blood_status = blood_status;
		_school = school;
		_birthday = birthday;
	}
	
	public String getName ()
	{
		return _name;
	}
	public void setName (String name)
	{
		_name = name;
	}
	
	public BloodStatus getBloodStatus ()
	{
		return _blood_status;
	}
	public void setBloodStatus (BloodStatus blood_status)
	{
		_blood_status = blood_status;
	}
	
	public School getSchool ()
	{
		return _school;
	}
	public void setSchool (School school)
	{
		_school = school;
	}
	
	public House getHouse ()
	{
		return _house;
	}
	public void setHouse (House house)
	{
		_house = house;
	}
	
	public Date getBirthday ()
	{
		return _birthday;
	}
	public void setBirthday (Date birthday)
	{
		_birthday = birthday;
	}
}
