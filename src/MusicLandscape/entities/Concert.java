package MusicLandscape.entities;

public class Concert extends Event{
    private int nextIdx;
    private Track[] setList;
    private int durationFactor = 1;

    public Concert(){

    }
    public boolean addTrack(Track t){
       setList.add(t);
        return true;
    }
    public int duration(){
        return 0;
    }
    private void ensureCapacity(int length){

    }
    public Track[] getSetList(){
        Track[] returnList = setList;
        return returnList;
    }
    public int impact(){
        return getAttendees()*getDurationFactor(duration());
    }
    public int nrTracks(){
        return setList.length;
    }
    public void resetSetList(){
        setList = null;
    }
    public void setSetList(Track[] tracks){

    }
    public String toString(){
        return "unknown";
    }
    int getDurationFactor(int d_sec){
        double d_min = d_sec/60;
        durationFactor= (int)Math.ceil(d_min/30);
        return durationFactor;
    }
}
