package com.switchfully.pettinder.pet;

public enum Kind {
    CAT("cat"),
    DOG("dog"),
    CHICKEN("chicken");

    private final String label;

    Kind(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
