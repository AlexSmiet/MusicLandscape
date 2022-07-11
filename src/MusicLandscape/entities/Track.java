package MusicLandscape.entities;

public class Track {
    private String title;
    private int duration;
    private int year;
    private Artist writer;
    private Artist performer;

    public Track(){
        this.writer=new Artist();
        this.performer=new Artist();

        setTitle(null);
        setDuration(0);
        setYear(1900);
    }
    public Track(String title){
        this.writer=new Artist();
        this.performer=new Artist();

        setTitle(title);
        setDuration(1900);
        setYear(1900);
    }
    public Track(Track t){
        this.title = t.title;
        this.writer = new Artist(t.writer);
        this.performer = new Artist(t.performer);
        this.year = t.year;
        this.duration = t.duration;
    }

    public String getTitle() {
        if(title==null) return "unknown title";
        return title;
    }

    /**
     * Trims a given string to be exactly 10 characters wide. If the given String is smaller than 10 characters the
     * remaining characters will be filled with blankspaces.
     *
     * @param s String to be trimmed
     * @return Trimmed String
     */
    private String trimToTenChars(String s){
        if(s!=null){
            if(s.length() >= 10) return s.substring(0, 10);
            return  " ".repeat(10 - s.length()) + s;
        }
       return  " ".repeat(3) + "unknown";
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
        if(writer==null){
            Artist dummy = new Artist();
            dummy.setName("unknown");
            return dummy;
        }

        return writer;
    }

    public void setWriter(Artist writer) {
        if(writer!=null){
            this.writer = writer;
        }
    }

    public Artist getPerformer() {
        if(performer==null){
            Artist dummy = new Artist();
            dummy.setName("unknown");
            return dummy;
        }
        return performer;
    }

    public void setPerformer(Artist performer) {
        if(performer!=null) {
            this.performer = performer;
        }
    }
    public boolean writerIsKnown(){ //A writer is considered as known if the name is not equal to null .
        if(this.writer == null || this.writer.getName() == null){
            return false;
        }
        else{
            return true;
        }
    }
    public String getString(){
        String title;
        String min_dur;
        String sec_dur;
        if(getTitle().equals("unknown title")){
            title = "unknown";
        }
        else{
            title = getTitle();
        }
        if(getDuration()/60 < 10){
            min_dur = "0" + getDuration()/60;
        }
        else{
            min_dur = String.valueOf(getDuration()/60);
        }
        if(getDuration()%60 < 10){
            sec_dur = "0" + getDuration()%60;
        }
        else{
            sec_dur = String.valueOf(getDuration()%60);
        }
        return trimToTenChars(title) + " by " + trimToTenChars(getWriter().getName()) + " performed by " + trimToTenChars(getPerformer().getName()) + " (" + min_dur + ":" + sec_dur + ")";

    }
}