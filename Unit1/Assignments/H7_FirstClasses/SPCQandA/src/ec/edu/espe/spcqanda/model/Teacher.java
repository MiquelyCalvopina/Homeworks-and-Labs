/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.spcqanda.model;

import java.util.Date;

/**
 *
 * @author Miqui
 */
public class Teacher {
    
    private String teacherName;
    private String teacherID;
    private String teacherEmail;
    private Date birthdate;

    public Teacher(String teacherName, String teacherID, String teacherEmail, Date birthdate) {
        this.teacherName = teacherName;
        this.teacherID = teacherID;
        this.teacherEmail = teacherEmail;
        this.birthdate = birthdate;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(String teacherID) {
        this.teacherID = teacherID;
    }

    public String getTeacherEmail() {
        return teacherEmail;
    }

    public void setTeacherEmail(String teacherEmail) {
        this.teacherEmail = teacherEmail;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }
    
            
}
