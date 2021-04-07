package com.switchfully.pettinder.pet;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class PetService {

    private final PetRepository petRepository;
    private final PetMapper petMapper;

    public PetService(PetRepository petRepository, PetMapper petMapper) {
        this.petRepository = petRepository;
        this.petMapper = petMapper;
    }

    public List<PetDTO> getAllPets() {
        return petMapper.toDTO(petRepository.findAll());
    }

    public PetDTO getPet(String name) {
        return petMapper.toDTO(petRepository.findByName(name));
    }

    public void increasePopularity(String name) {
        petRepository.findByName(name).increasePopularity();
    }

    public void save(PetDTO petDTO) {
        petRepository.save(petMapper.toEntity(petDTO));
    }
}
