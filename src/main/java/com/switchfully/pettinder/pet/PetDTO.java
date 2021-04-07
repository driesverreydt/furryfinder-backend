package com.switchfully.pettinder.pet;

public class PetDTO {
    private final String name;
    private final String kind;
    private final String image;
    private final String profileText;
    private final Integer popularity;

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
