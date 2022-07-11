package MusicLandscape.entities;

import java.util.Arrays;

public class Concert extends Event{
    private int nextIdx = 0;
    private Track[] setList = new Track[0];
    private int durationFactor = 1;

    public Concert(){

    }
    public boolean addTrack(Track t){
        if(t == null) return false;
        ensureCapacity(nextIdx);
        setList[nextIdx] = t;
        nextIdx++;
        return true;
    }

    public int duration(){
        int sumOfDuration = 0;

        for (int i = 0; i < setList.length; i++) {
            sumOfDuration += setList[i].getDuration();
        }
        
        return sumOfDuration;
    }

    private void ensureCapacity(int length){
        if(length < setList.length) return;

        Track[] newSetList = new Track[setList.length + 1];

        for (int i = 0; i < setList.length; i++) {
            newSetList[i] = setList[i];
        }

        setList = newSetList;
    }

    public Track[] getSetList(){
        Track[] copyOfSetList = new Track[setList.length];

        for (int i = 0; i < setList.length; i++) {
            copyOfSetList[i] = new Track(setList[i]);
        }

        return copyOfSetList;
    }

    public int impact(){
        return getAttendees()*getDurationFactor(duration());
    }

    public int nrTracks(){
        return nextIdx;
    }

    public void resetSetList(){
        setList = new Track[0];
        nextIdx = 0;
    }

    public void setSetList(Track[] tracks){
        if(tracks == null) return;
        resetSetList();
        for (int i = 0; i < tracks.length; i++) {
            if(tracks[i] == null) continue;
            addTrack(new Track(tracks[i]));
        }
    }
    
    public String toString(){
        return nrTracks() + " tracks played, total duration " + Math.floor(duration()/60) + ":" + duration()%60;
    }

    int getDurationFactor(int d_sec){
        double d_min = d_sec/60;
        durationFactor= (int)Math.ceil(d_min/30);
        return durationFactor;
    }
}
