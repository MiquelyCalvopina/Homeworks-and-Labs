
package ec.edu.espe.model;

/**
 *
 * @author Bryan Zurita
 */
public class Location {
    private String mainStreetName;
    private String secondaryStreetName;
    private String references;
    private String postalCode;

    /**
     * Getter
     * @return mainStreetName
     */
    public String getMainStreetName() {
        return mainStreetName;
    }

    public Location(String mainStreetName, String secondaryStreetName, String references, String postalCode) {
        this.mainStreetName = mainStreetName;
        this.secondaryStreetName = secondaryStreetName;
        this.references = references;
        this.postalCode = postalCode;
    }

    public Location() {
    }

    /**
     * Setter
     * @param mainStreetName the mainStreetName to set
     */
    public void setMainStreetName(String mainStreetName) {
        this.mainStreetName = mainStreetName;
    }

    /**
     * Getter
     * @return secondaryStreetName
     */
    public String getSecondaryStreetName() {
        return secondaryStreetName;
    }

    /**
     * Setter
     * @param secondaryStreetName the secondaryStreetName to set
     */
    public void setSecondaryStreetName(String secondaryStreetName) {
        this.secondaryStreetName = secondaryStreetName;
    }

    /**
     * Getter
     * @return References
     */
    public String getReferences() {
        return references;
    }

    /**
     * Setter
     * @param references the references to set
     */
    public void setReferences(String references) {
        this.references = references;
    }

    /**
     * Getter
     * @return postalCode
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Setter
     * @param postalCode the postalCode to set
     */
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

}
