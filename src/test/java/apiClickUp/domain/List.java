package apiClickUp.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class List {
    @JsonProperty("id")
    private String id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("idFolder")
    private String idFolder;

    public void setName( String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setId( String id){
        this.id = id;
    }

    public String getId(){
        return id;
    }

    public void setIdBoard( String idFolder){
        this.idFolder = idFolder;
    }

    public String getIdFolder(){
        return idFolder;
    }
}
