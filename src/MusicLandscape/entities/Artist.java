package MusicLandscape.entities;

public class Artist {

    private String name = "unknown";

    public Artist(){
    }
    public Artist(Artist a){
        this.setName(a.getName());
    }
    public Artist (String name){
        this.setName(name);
    }

    public String getName() {
        if(name!=null){
            return name;
        }else{
            return null;
        }
    }

    public void setName(String n) {
        if(n==null || !n.matches(".*\\w.*")){

        }
        else{
            this.name = n;
        }
    }
}