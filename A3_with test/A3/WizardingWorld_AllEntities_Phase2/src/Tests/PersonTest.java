package Tests;

import org.junit.Test;

import java.util.Date;

import org.junit.Assert;

import entities.BloodStatus;
import entities.House;
import entities.Person;
import entities.School;

public class PersonTest
{
	protected Person person;
	
	@Test
	public void nameTest ()
	{
		person = new Person("Harry Potter", null, BloodStatus.Half_blood, null, null);
		// test getName
		Assert.assertEquals(person.getName(), "Harry Potter");
		// test setName and getName
		person.setName("Severus Snape");
		Assert.assertEquals(person.getName(), "Severus Snape");
	}
	
	@Test
	public void houseTest ()
	{
		person = new Person("Harry Potter", null, BloodStatus.Half_blood, null, null);
		House house = new House("Griffindor", null, null, null, null, null);
		// test setHouse and getHouse
		person.setHouse(house);
		Assert.assertEquals (house, person.getHouse());
	}
	
	@Test
	public void BloodStatusTest ()
	{
		person = new Person("Harry Potter", null, BloodStatus.Half_blood, null, null);
		// test getBloodStatus
		Assert.assertEquals(BloodStatus.Half_blood, person.getBloodStatus());
		// test setBloodStatus and getBloodStatus
		person.setBloodStatus(BloodStatus.Muggle);
		Assert.assertEquals(person.getBloodStatus(), BloodStatus.Muggle);
	}
	
	@Test
	public void schoolTest ()
	{
		person = new Person("Harry Potter", null, BloodStatus.Half_blood, null, null);
		School hogwarts = new School ("Hogwarts", null, null, null, null, null, "England");
		// test setSchool and getSchool
		person.setSchool(hogwarts);
		Assert.assertEquals(hogwarts, person.getSchool());
	}
	
	@Test
	public void dateTest ()
	{
		person = new Person("Harry Potter", null, BloodStatus.Half_blood, null, null);
		Date birth_day = new Date();
		// test setDate and getDate
		person.setBirthday(birth_day);
		Assert.assertEquals(birth_day, person.getBirthday());
	}
}
