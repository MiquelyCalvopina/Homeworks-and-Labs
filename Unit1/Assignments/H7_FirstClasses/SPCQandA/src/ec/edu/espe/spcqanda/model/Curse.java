/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.spcqanda.model;

/**
 *
 * @author Miqui
 */
public class Curse {
    
    private Student student[];
    private String curseId;
    private String curseName;

    public Curse(Student[] student, String curseId, String curseName) {
        this.student = student;
        this.curseId = curseId;
        this.curseName = curseName;
    }

    public Student[] getStudent() {
        return student;
    }

    public void setStudent(Student[] student) {
        this.student = student;
    }

    public String getCurseId() {
        return curseId;
    }

    public void setCurseId(String curseId) {
        this.curseId = curseId;
    }

    public String getCurseName() {
        return curseName;
    }

    public void setCurseName(String curseName) {
        this.curseName = curseName;
    }
    
}
