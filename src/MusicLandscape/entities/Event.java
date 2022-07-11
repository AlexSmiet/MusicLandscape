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
        artist = new Artist();
        setDescription("");
        /*
        setDate(null);
        setVenue(null);
        setDate(null);
        */
    }
    public Event(Event e){
        this.attendees = e.attendees;
        this.description = e.description;
        this.artist = new Artist(e.artist);
        this.date = new Date(e.date);
        this.venue = new Venue(e.venue);
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        if(artist==null){
            this.artist = new Artist();
        }
        else{
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
        if(date == null) {
            return null;
        }
        return new Date(date);
    }

    public void setDate(Date date) {
        originalDate = this.date;
        if(date == null) {
            this.date = null;
        }
        else{
            this.date = new Date(date);
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
    public String toString(){
        String venue;
       // String date;
        if(getVenue()==null){
            venue="unknown";
        }
        else{
            venue= this.venue.getName();
        }

        /*
        if(getDate()==null){
            date="unknown";
        }
        else{
            date= String.valueOf(getDate());
        }
        */
        //System.out.println(this.getArtist());
        return artist.getName() + " @ " + venue + " on " + getDate() +"\n" + getDescription() + "\n" + "("+ getAttendees() + " attending (" + impact() + "))";
    }

    public int impact(){
        return getAttendees()*2;
    }
}
