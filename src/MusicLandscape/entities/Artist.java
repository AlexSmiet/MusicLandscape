package MusicLandscape.entities;

public class Artist {

    private String name;

    public Artist(){
        this.name=null;
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