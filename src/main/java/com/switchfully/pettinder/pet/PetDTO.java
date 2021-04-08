package com.switchfully.pettinder.pet;

public class PetDTO {
    private String name;
    private String kind;
    private String image;
    private String profileText;
    private Integer popularity;

    public PetDTO() {
    }

    public PetDTO(String name, String kind, String image, String profileText, Integer popularity) {
        this.name = name;
        this.kind = kind;
        this.image = image;
        this.profileText = profileText;
        this.popularity = popularity;
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
