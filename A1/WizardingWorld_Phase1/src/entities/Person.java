package entities;

import java.util.Date;

public class Person
{
	private String _name;
	private String _house_name;
	private String _blood_status;
	private String _school;
	private Date _birthday;
	
	public Person (String name)
	{
		_name = name;
	}
	public Person (String name, String house_name, String blood_status, String school, Date birthday)
	{
		_name = name;
		_house_name = house_name;
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
	
	public String getBloodStatus ()
	{
		return _blood_status;
	}
	public void setBloodStatus (String blood_status)
	{
		_blood_status = blood_status;
	}
	
	public String getSchool ()
	{
		return _school;
	}
	public void setSchool (String school)
	{
		_school = school;
	}
	
	public String getHouseName ()
	{
		return _house_name;
	}
	public void setHouseName (String house_name)
	{
		_house_name = house_name;
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
