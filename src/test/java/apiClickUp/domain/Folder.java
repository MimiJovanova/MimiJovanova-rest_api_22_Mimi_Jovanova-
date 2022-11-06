package apiClickUp.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

public class Folder {
    @JsonIgnoreProperties("name")
    private String name;
    @JsonIgnoreProperties("id")
    public String id;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setId (String id){
        this.id = id;
    }
    public String getId(){
        return id;
    }
}
