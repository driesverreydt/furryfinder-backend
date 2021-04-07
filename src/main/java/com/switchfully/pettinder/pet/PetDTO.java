package com.switchfully.pettinder.pet;

import com.fasterxml.jackson.annotation.JsonCreator;

public class PetDTO {
    private String name;
    private String kind;
    private String image;
    private String profileText;
    private Integer popularity;

    public PetDTO() {
    }

    public PetDTO(String name, String kind, String image, String profileText) {
        this.name = name;
        this.kind = kind;
        this.image = image;
        this.profileText = profileText;
    }

    public String getName() {
        return name;
    }

    public String getKind() {
        return kind;
    }

    public String getImage() {
        return image;
    }

    public String getProfileText() {
        return profileText;
    }

    public Integer getPopularity() {
        return popularity;
    }
}
