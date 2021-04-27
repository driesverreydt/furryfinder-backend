package com.switchfully.pettinder.pet;

import javax.persistence.*;

@Entity
@Table(name = "PET")
public class Pet {

    @Id
    @SequenceGenerator(name = "pet_seq", sequenceName = "pet_seq", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pet_seq")
    private Long id;
    private String name;
    @Enumerated(EnumType.STRING)
    private Kind kind;
    private String image;
    private String profileText;
    private Integer popularity;

    private Pet(){

    }

    public Pet(Long id, String name, Kind kind, String image, String profileText) {
        this.id = id;
        this.name = name;
        this.kind = kind;
        this.image = image;
        this.profileText = profileText;
        this.popularity = 0;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Kind getKind() {
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

    public void increasePopularity() {
        popularity++;
    }
}
