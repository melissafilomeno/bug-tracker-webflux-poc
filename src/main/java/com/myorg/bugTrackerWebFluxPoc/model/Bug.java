package com.myorg.bugTrackerWebFluxPoc.model;

public class Bug {

    private String id;

    private String description;

    public Bug(){

    }

    public String getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
