package MusicLandscape.entities;

public class Artist {

    private String name;

    public String getName() {
        if(name!=null){
            return name;
        }else{
            return null;
        }
    }

    public void setName(String name) {
        if(name==null || name.equals("")){
        }
        else{
            this.name = name;
        }
    }



}
