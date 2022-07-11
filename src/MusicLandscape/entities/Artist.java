package MusicLandscape.entities;

public class Artist {

    private String name = "unknown";

    public Artist(){
    }
    public Artist(Artist a){
        this.setName(a.getName());
    }

    public Artist (String name){
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String n) {

        if(n==null || !n.matches(".*\\w.*")){
            this.name = "unknown";
        }
        else{
            this.name = n;
        }
    }
}