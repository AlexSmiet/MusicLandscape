package MusicLandscape.entities;

import MusicLandscape.Date;
import MusicLandscape.Venue;

public class Event {
    private Artist artist;
    private int attendees;
    private Date date;
    private String description;
    private Venue venue;
    private Date originalDate;

    public Event(){
        Artist defaultArtist = new Artist();
        setDescription("");
        setDate(null);
        setVenue(null);
        setDate(null);
    }
    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        if(artist!=null){
            this.artist = artist;
        }
    }

    public int getAttendees() {
        return attendees;
    }

    public void setAttendees(int attendees) {
        if(attendees >= 0){
            this.attendees = attendees;
        }
    }

    public Date getDate() {
        Date copyDate = date;
        return copyDate;
    }

    public void setDate(Date date) {
        originalDate = this.date;
        if(date!=null){
            this.date = date;
        }
        else{
            this.date = null;
        }
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        if(description!=null){
            this.description = description;
        }
    }

    public Venue getVenue() {
        return venue;
    }

    public void setVenue(Venue venue) {
        this.venue = venue;
    }
}
