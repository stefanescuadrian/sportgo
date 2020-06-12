import javafx.beans.property.SimpleStringProperty;
import sun.java2d.pipe.SpanShapeRenderer;

import javax.swing.text.html.ImageView;

public class Eveniment {
    private ImageView photo;
    private String eventPlannerMail;
    private String eventCategory;
    private String eventDifficulty;
    private String eventName;
    private String eventLocation;
    private int eventMaxNumberParticipants;
    private String eventDate;  //.getValue().toString()
    private String eventDescription;

    private SimpleStringProperty eC;
    private SimpleStringProperty eD;
    private SimpleStringProperty eN;


    public Eveniment(){

    }
    public Eveniment(String eventPlannerMail, String eventCategory, String eventDifficulty, String eventName, String eventLocation, int eventMaxNumberParticipants, String eventDate, String eventDescription) {
        this.eventPlannerMail = eventPlannerMail;
        this.eventCategory = eventCategory;
        this.eventDifficulty = eventDifficulty;
        this.eventName = eventName;
        this.eventLocation = eventLocation;
        this.eventMaxNumberParticipants = eventMaxNumberParticipants;
        this.eventDate = eventDate;
        this.eventDescription = eventDescription;
    }

    public Eveniment( String eventCategory, String eventDifficulty, String eventName){

        eC = new SimpleStringProperty(eventCategory);
        eD = new SimpleStringProperty("Nume eveniment +    " + " Basket"  + "\n" + "Scurta descriere");
        eN = new SimpleStringProperty(eventName);
    }



    public String getEventPlannerMail() {
        return eventPlannerMail;
    }

    public void setEventPlannerMail(String eventPlannerMail) {
        this.eventPlannerMail = eventPlannerMail;
    }

    public int getEventMaxNumberParticipants() {
        return eventMaxNumberParticipants;
    }

    public void setEventMaxNumberParticipants(int eventMaxNumberParticipants) {
        this.eventMaxNumberParticipants = eventMaxNumberParticipants;
    }

    public String getEventCategory() {
        return eventCategory;
    }

    public void setEventCategory(String eventCategory) {
        this.eventCategory = eventCategory;
    }

    public String getEventDifficulty() {
        return eventDifficulty;
    }

    public void setEventDifficulty(String eventDifficulty) {
        this.eventDifficulty = eventDifficulty;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventLocation() {
        return eventLocation;
    }

    public void setEventLocation(String eventLocation) {
        this.eventLocation = eventLocation;
    }

    public int getMaxNumberParticipants() {
        return eventMaxNumberParticipants;
    }

    public void setMaxNumberParticipants(int maxNumberParticipants) {
        this.eventMaxNumberParticipants = maxNumberParticipants;
    }

    public String getEventDate() {
        return eventDate;
    }

    public void setEventDate(String eventDate) {
        this.eventDate = eventDate;
    }

    public String getEventDescription() {
        return eventDescription;
    }

    public void setEventDescription(String eventDescription) {
        this.eventDescription = eventDescription;
    }

    public String geteC() {
        return eC.get();
    }

    public SimpleStringProperty eCProperty() {
        return eC;
    }

    public void seteC(String eC) {
        this.eC.set(eC);
    }

    public String geteD() {
        return eD.get();
    }

    public SimpleStringProperty eDProperty() {
        return eD;
    }

    public void seteD(String eD) {
        this.eD.set(eD);
    }

    public String geteN() {
        return eN.get();
    }

    public SimpleStringProperty eNProperty() {
        return eN;
    }

    public void seteN(String eN) {
        this.eN.set(eN);
    }

    public String toString(){
        return this.eventPlannerMail;
    }
}
