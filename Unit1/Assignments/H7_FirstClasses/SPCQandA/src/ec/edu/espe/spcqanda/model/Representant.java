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
public class Representant {
    
    private String representantName;
    private String representantId;
    private String representantEmail;
    private String relationship;

    public Representant(String representantName, String representantId, String representantEmail, String relationship) {
        this.representantName = representantName;
        this.representantId = representantId;
        this.representantEmail = representantEmail;
        this.relationship = relationship;
    }

    public String getRepresentantName() {
        return representantName;
    }

    public void setRepresentantName(String representantName) {
        this.representantName = representantName;
    }

    public String getRepresentantId() {
        return representantId;
    }

    public void setRepresentantId(String representantId) {
        this.representantId = representantId;
    }

    public String getRepresentantEmail() {
        return representantEmail;
    }

    public void setRepresentantEmail(String representantEmail) {
        this.representantEmail = representantEmail;
    }

    public String getRelationship() {
        return relationship;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }
    
}
