/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zooprj;

import ec.edu.espe.zooprj.model.Teacher;

/**
 *
 * @author Miqui
 */
public class ZooPrj {

    /**
     * @param args the command line arguments
     */
    private static String name="Miquely";
    
    public static void main(String[] args) {
        
        Teacher teacher = new Teacher("Miquely");
        teacher.setTeacherName("Jacqueline");
        System.out.println(teacher.getTeacherName());
    }
    
    
}
