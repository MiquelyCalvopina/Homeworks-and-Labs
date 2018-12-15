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
    /*@Test
    public void testCalcAge() {
        
        System.out.println("calcAge");
        int birthDay = 28;
        int birthMonth = 05;
        int birthYear = 1998;
        int ageDay = 16;
        int ageMonth = 6;
        int ageYear = 20;
        Person instance = new Person(25,03,1997,0,0,0);
        instance.calcAge(birthYear, birthMonth, birthDay);
        assertEquals(ageDay, instance.getAgeDay());
        assertEquals(ageMonth, instance.getAgeMonth());
        assertEquals(ageYear, instance.getAgeYear());        
        System.out.println("La edad es correcta");
        
        System.out.println("calcAge");
        birthDay = 27;
        birthMonth = 05;
        birthYear = 1997;
        ageDay = 17;
        ageMonth = 06;
        ageYear = 21;
        instance.calcAge(birthYear, birthMonth, birthDay);
        assertEquals(ageDay, instance.getAgeDay());
        assertEquals(ageMonth, instance.getAgeMonth());
        assertEquals(ageYear, instance.getAgeYear());        
        System.out.println("La edad es correcta");
        
        
    }


    /**
     * Test of validate method, of class Person.
     */
    /*@Test
    public void testValidate() {
        System.out.println("validate");
        int year = 1997;
        int month = 3;
        int day = 27;
        Person instance = new Person(0,0,0, 0, 0, 0);
        int expResult = 0;
        int result = instance.validate(year, month, day);
        assertEquals(expResult, result);
        System.out.println("El ingreso es correcto");
        
        System.out.println("validate");
        year = 1996;
        month = 12;
        day = 32;
        expResult = -1;
        result = instance.validate(year, month, day);
        assertEquals(expResult, result);
        System.out.println("El ingreso es incorrecto");
        
        System.out.println("validate");
        year = 0;
        month = 0;
        day = 0;
        expResult = -1;
        result = instance.validate(year, month, day);
        assertEquals(expResult, result);
        System.out.println("El ingreso es correcto");   
        
        System.out.println("validate");
        year = 1998;
        month = 02;
        day = 29;
        expResult = -1;
        result = instance.validate(year, month, day);
        assertEquals(expResult, result);
        System.out.println("El ingreso es incorrecto");      
        
        System.out.println("validate");
        year = 0;
        month = -18;
        day = 2;
        expResult = -1;
        result = instance.validate(year, month, day);
        assertEquals(expResult, result);
        System.out.println("El ingreso es incorrecto");   
        
        System.out.println("validate");
        year = 1998;
        String month1 = "Mayo";
        day = 1;
        expResult = -1;
        //result = instance.validate(year, month, day);
        assertEquals(expResult, result);
        System.out.println("El ingreso es incorrecto");   
        
        System.out.println("validate");
        year = 1998;
        month = 02;
        day = 33;
        expResult = -1;
        result = instance.validate(year, month, day);
        assertEquals(expResult, result);
        System.out.println("El ingreso es incorrecto");   
        
        System.out.println("validate");
        year = 1998;
        month = 04;
        day = 32;
        expResult = -1;
        result = instance.validate(year, month, day);
        assertEquals(expResult, result);
        System.out.println("El ingreso es incorrecto");   
        
        System.out.println("validate");
        year = 8;
        month = -1;
        day = 36;
        expResult = -1;
        result = instance.validate(year, month, day);
        assertEquals(expResult, result);
        System.out.println("El ingreso es incorrecto");   
        
        System.out.println("validate");
        year = 2019;
        month = 02;
        day = 29;
        expResult = -1;
        result = instance.validate(year, month, day);
        assertEquals(expResult, result);
        System.out.println("El ingreso es incorrecto");   
        
    }
    /**
     * Test of validate method, of class Person.
     */
    @Test
    public void testValidate1() {
        System.out.println("validate");
        int year = 2015;
        int month = 2;
        int day = 29;
        Person instance = new Person(0,0,0, 0, 0, 0);
        int expResult = -1;
        int result = instance.validate(year, month, day);
        assertEquals(expResult, result);
        System.out.println("El ingreso es incorrecto");
        
        System.out.println("validate");
        year = 2016;
        month = 4;
        day = 31;
        expResult = -1;
        result = instance.validate(year, month, day);
        assertEquals(expResult, result);
        System.out.println("El ingreso es incorrecto");   
        
        System.out.println("validate");
        year = 2013;
        month = 11;
        day = 31;
        expResult = -1;
        result = instance.validate(year, month, day);
        assertEquals(expResult, result);
        System.out.println("El ingreso es incorrecto");  
        
        System.out.println("validate");
        year = 1970;
        month = 12;
        day = 17;
        expResult = 0;
        result = instance.validate(year, month, day);
        assertEquals(expResult, result);
        System.out.println("El ingreso es correcto");
        
        System.out.println("validate");
        year = 1970;
        month = 12;
        day = 13;
        expResult = 0;
        result = instance.validate(year, month, day);
        assertEquals(expResult, result);
        System.out.println("El ingreso es correcto");
    }
    /**
     * Test of calcAge method, of class Person.
     */
    @Test
    public void testCalcAge1() {
        
        System.out.println("calcAge");
        int birthDay = 17;
        int birthMonth = 12;
        int birthYear = 1970;
        int ageDay = 27;
        int ageMonth = 11;
        int ageYear = 47;
        Person instance = new Person(25,03,1997,0,0,0);
        instance.calcAge(birthYear, birthMonth, birthDay);
        assertEquals(ageDay, instance.getAgeDay());
        assertEquals(ageMonth, instance.getAgeMonth());
        assertEquals(ageYear, instance.getAgeYear());        
        System.out.println("La edad es correcta");
        
        System.out.println("calcAge");
        birthDay = 17;
        birthMonth = 12;
        birthYear = 1970;
        ageDay = 26;
        ageMonth = 12;
        ageYear = 48;
        instance.calcAge(birthYear, birthMonth, birthDay);
        assertEquals(ageDay, instance.getAgeDay());
        assertEquals(ageMonth, instance.getAgeMonth());
        assertEquals(ageYear, instance.getAgeYear());        
        System.out.println("La edad es correcta");
    }
}