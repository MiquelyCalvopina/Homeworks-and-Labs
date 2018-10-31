/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.zooprj.model;

/**
 *
 * @author Miqui
 */
public class Teacher {
    private String teacherName;

    public Teacher(String teacherName) {
        this.teacherName = teacherName;
    }
    
    /**
     * @param teacherName the teacherName to set
     */
    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }
    
    /**
     * @return the teacherName
     */
    public String getTeacherName() {
        return teacherName;
    }
    
}
