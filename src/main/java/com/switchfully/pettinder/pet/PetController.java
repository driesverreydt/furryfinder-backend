package com.switchfully.pettinder.pet;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
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
    
    @PostMapping(consumes = "application/json")
    public void addPet(@RequestBody PetDTO petDTO){
        petService.save(petDTO);
    }
}
