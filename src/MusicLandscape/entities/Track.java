package MusicLandscape.entities;

public class Track {
    private String title;
    private int duration;
    private int year;
    private Artist writer;
    private Artist performer;


    public String getTitle() {
        if(title==null){
            return "unknown title";
        }
        else {
            return title;
        }
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        if(duration>=0) {
            this.duration = duration;
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if(year >= 1900 && year<=2999) {
            this.year = year;
        }
    }
    public Artist getWriter() {
        return writer;
    }

    public void setWriter(Artist writer) {
        if(writer!=null){
            this.writer = writer;
        }
        else{

        }
    }

    public Artist getPerformer() {

        return performer;
    }

    public void setPerformer(Artist performer) {
        if(performer!=null){
            this.performer = performer;
        }
        else{

        }
    }
    public boolean writerIsKnown(){ //A writer is considered as known if the name is not equal to null .
        if(writer == null){
            return false;
        }
        else{
            return true;
        }
    }
    public String getString(){
        return getTitle().substring(0, 10) + " by " + getWriter() + " performed by " + getPerformer() + "(";
    }
}