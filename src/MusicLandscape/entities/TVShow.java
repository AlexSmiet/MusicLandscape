package MusicLandscape.entities;

import MusicLandscape.Date;
import MusicLandscape.Venue;
public class TVShow extends Event{
    private String name;
    private int viewers;

    public TVShow(){
        setName(null);
        setViewers(0);
    }
    public TVShow(Event e){
        Date newDate = new Date();

        this.setDate(e.getDate());
        Artist newArtist = new Artist();
        newArtist.setName(e.getArtist().getName());
        this.setArtist(newArtist);
        Venue newVenue = new Venue();
        if(e.getVenue()==null){
            this.setVenue(new Venue());
        }
        else{
            newVenue.setName(e.getVenue().getName());
            newVenue.setCapacity(e.getVenue().getCapacity());
            this.setVenue(newVenue);
        }
        this.setDescription(e.getDescription());
        this.setAttendees(e.getAttendees());
    }
    public TVShow(TVShow tvs){
        this.name = tvs.name;
        this.viewers = tvs.viewers;

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name==null || !name.matches(".*\\w.*")){

        }
        else{
            this.name = name;
        }
    }

    //if Viewers = 0 --> unknown
    public int getViewers() {
        return viewers;
    }

    public void setViewers(int viewers) {
        if(viewers >= 0){
            this.viewers = viewers;
        }
    }
    public int getAudience(){
        return getAttendees()+getViewers();
    }
    public int impact(){
        return (getAttendees()+getViewers())*2;
    }
    public String toString(){
        String venue;
        if(getVenue()==null){
            venue="unknown";
        }
        else{
            //venue= this.venue.getName();
        }
        return getArtist() + " @ " + getName() + " on " +getDate() +"\n" + getDescription() + "\n" + "(" + getAudience() + " attending " + "(" + impact() + "))";
    }
}
