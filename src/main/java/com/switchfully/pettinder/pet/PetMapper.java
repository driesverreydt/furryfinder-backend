package com.switchfully.pettinder.pet;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class PetMapper {
    public List<PetDTO> toDTO(List<Pet> petList) {
        return petList.stream().map(this::toDTO).collect(Collectors.toList());
    }

    public PetDTO toDTO(Pet pet){
        return new PetDTO(pet.getName(), pet.getKind().getLabel(), pet.getImage(), pet.getProfileText(), pet.getPopularity());
    }
}
