package com.switchfully.pettinder.pet;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "pets")
public class PetController {

    private final PetService petService;

    public PetController(PetService petService) {
        this.petService = petService;
    }

    @GetMapping(produces = "application/json")
    public List<PetDTO> getAllPets() {
        return petService.getAllPets();
    }

    @GetMapping(path = "{name}", produces = "application/json")
    public PetDTO getPet(@PathVariable String name) {
        return petService.getPet(name);
    }

    @GetMapping(path = "{name}/incrementPopularity", produces = "application/json")
    public void increasePopularity(@PathVariable String name) {
        petService.increasePopularity(name);
    }
}
