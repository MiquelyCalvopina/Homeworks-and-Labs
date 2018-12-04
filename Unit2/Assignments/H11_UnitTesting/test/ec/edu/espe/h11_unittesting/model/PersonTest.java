/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.h11_unittesting.model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Miqui
 */
public class PersonTest {
    
    public PersonTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of calcAge method, of class Person.
     */
    @Test
    public void testCalcAge() {
        System.out.println("calcAge");
        Person instance = new Person(25,03,1997,0,0,0);
        int birthDay = 27;
        int birthMonth = 03;
        int birthYear = 1997;
        
        int ageDay = 7;
        int ageMonth = 8;
        int ageYear = 19;
        instance.calcAge(birthYear, birthMonth, birthDay);
        assertEquals(ageDay, instance.getAgeDay());
        assertEquals(ageMonth, instance.getAgeMonth());
        assertEquals(ageYear, instance.getAgeYear());        
        System.out.println("La edad es correcta");
    }

    /**
     * Test of entry method, of class Person.
     */
    @Test
    public void testEntry() {
        System.out.println("entry");
        Person instance = null;
        String expResult = "";
        //String result = instance.entry();
        //assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }

    /**
     * Test of leapYear method, of class Person.
     */
    @Test
    public void testLeapYear() {
        System.out.println("leapYear");
        int year = 0;
        Person instance = null;
        boolean expResult = false;
        boolean result = instance.leapYear(year);
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }

    /**
     * Test of validate method, of class Person.
     */
    @Test
    public void testValidate() {
        System.out.println("validate");
        int year = 1997;
        int month = 03;
        int day = 27;
        Person instance = new Person(0,0,0, 0, 0, 0);
        boolean expResult = false;
        boolean result = instance.validate(year, month, day);
        assertEquals(expResult, result);
        System.out.println("El ingreso es correcto");
        
        System.out.println("validate");
        year = 1996;
        month = 12;
        day = 23;
        expResult = false;
        result = instance.validate(year, month, day);
        assertEquals(expResult, result);
        System.out.println("El ingreso es correcto");
        
        System.out.println("validate");
        year = 2012;
        month = 02;
        day = 29;
        expResult = false;
        result = instance.validate(year, month, day);
        assertEquals(expResult, result);
        System.out.println("El ingreso es correcto");   
        
        System.out.println("validate");
        year = 1998;
        month = 02;
        day = 29;
        expResult = true;
        result = instance.validate(year, month, day);
        assertEquals(expResult, result);
        System.out.println("El ingreso es incorrecto");      
        
        System.out.println("validate");
        year = 0;
        month = -18;
        day = 2;
        expResult = true;
        result = instance.validate(year, month, day);
        assertEquals(expResult, result);
        System.out.println("El ingreso es incorrecto");   
        
        System.out.println("validate");
        year = 1998;
        String month1 = "Mayo";
        day = 1;
        expResult = true;
        //result = instance.validate(year, month, day);
        assertEquals(expResult, result);
        System.out.println("El ingreso es incorrecto");   
        
        System.out.println("validate");
        year = 1998;
        month = 02;
        day = 33;
        expResult = true;
        result = instance.validate(year, month, day);
        assertEquals(expResult, result);
        System.out.println("El ingreso es incorrecto");   
        
        System.out.println("validate");
        year = 1998;
        month = 04;
        day = 32;
        expResult = true;
        result = instance.validate(year, month, day);
        assertEquals(expResult, result);
        System.out.println("El ingreso es incorrecto");   
        
        System.out.println("validate");
        year = 8;
        month = -1;
        day = 36;
        expResult = true;
        result = instance.validate(year, month, day);
        assertEquals(expResult, result);
        System.out.println("El ingreso es incorrecto");   
        
        System.out.println("validate");
        year = 2019;
        month = 02;
        day = 29;
        expResult = true;
        result = instance.validate(year, month, day);
        assertEquals(expResult, result);
        System.out.println("El ingreso es incorrecto");   
        
    }

    /**
     * Test of getName method, of class Person.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Person instance = null;
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Person.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Person instance = null;
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBirthDay method, of class Person.
     */
    @Test
    public void testGetBirthDay() {
        System.out.println("getBirthDay");
        Person instance = null;
        int expResult = 0;
        int result = instance.getBirthDay();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBirthDay method, of class Person.
     */
    @Test
    public void testSetBirthDay() {
        System.out.println("setBirthDay");
        int birthDay = 0;
        Person instance = null;
        instance.setBirthDay(birthDay);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBirthMonth method, of class Person.
     */
    @Test
    public void testGetBirthMonth() {
        System.out.println("getBirthMonth");
        Person instance = null;
        int expResult = 0;
        int result = instance.getBirthMonth();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBirthMonth method, of class Person.
     */
    @Test
    public void testSetBirthMonth() {
        System.out.println("setBirthMonth");
        int birthMonth = 0;
        Person instance = null;
        instance.setBirthMonth(birthMonth);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBirthYear method, of class Person.
     */
    @Test
    public void testGetBirthYear() {
        System.out.println("getBirthYear");
        Person instance = null;
        int expResult = 0;
        int result = instance.getBirthYear();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBirthYear method, of class Person.
     */
    @Test
    public void testSetBirthYear() {
        System.out.println("setBirthYear");
        int birthYear = 0;
        Person instance = null;
        instance.setBirthYear(birthYear);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAgeYear method, of class Person.
     */
    @Test
    public void testGetAgeYear() {
        System.out.println("getAgeYear");
        Person instance = null;
        int expResult = 0;
        int result = instance.getAgeYear();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAgeYear method, of class Person.
     */
    @Test
    public void testSetAgeYear() {
        System.out.println("setAgeYear");
        int ageYear = 0;
        Person instance = null;
        instance.setAgeYear(ageYear);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAgeMonth method, of class Person.
     */
    @Test
    public void testGetAgeMonth() {
        System.out.println("getAgeMonth");
        Person instance = null;
        int expResult = 0;
        int result = instance.getAgeMonth();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAgeMonth method, of class Person.
     */
    @Test
    public void testSetAgeMonth() {
        System.out.println("setAgeMonth");
        int ageMonth = 0;
        Person instance = null;
        instance.setAgeMonth(ageMonth);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAgeDay method, of class Person.
     */
    @Test
    public void testGetAgeDay() {
        System.out.println("getAgeDay");
        Person instance = null;
        int expResult = 0;
        int result = instance.getAgeDay();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAgeDay method, of class Person.
     */
    @Test
    public void testSetAgeDay() {
        System.out.println("setAgeDay");
        int ageDay = 0;
        Person instance = null;
        instance.setAgeDay(ageDay);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
