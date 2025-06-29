package com.myorg.bugTrackerWebFluxPoc.entity;

import lombok.Data;
import jakarta.persistence.*;

@Data
@Table(name = "BUG")
@Entity
public class Bug {

    @Column(name = "BUG_UUID")
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(name = "BUG_DESCRIPTION")
    private String description;

    public Bug(){

    }

    public Bug(String description){
        this.description = description;
    }

}
