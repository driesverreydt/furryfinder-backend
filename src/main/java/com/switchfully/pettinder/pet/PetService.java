package com.switchfully.pettinder.pet;

import org.springframework.stereotype.Service;


import javax.transaction.Transactional;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import java.util.List;

@Service
@Transactional
public class PetService {
    public static final String ACCOUNT_SID = System.getenv("ACCOUNT_SID");
    public static final String AUTH_TOKEN = System.getenv("AUTH_TOKEN");

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

    public void deletePet(Long id) {
        petRepository.deleteById(id);
    }

    public void increasePopularity(String name) {
        petRepository.findByName(name).increasePopularity();
    }

    public void save(PetDTO petDTO) {
        petRepository.save(petMapper.toEntity(petDTO));
    }

    public void sendWhatsApp(String name) {
        name = name.substring(9, name.length() - 2);
         Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
            Message message = Message.creator(
                    new com.twilio.type.PhoneNumber(System.getenv("PHONE_NUMBER")),
                    new com.twilio.type.PhoneNumber("whatsapp:+14155238886"),
                    name + " just got a date with your pet!")
                    .create();

            System.out.println(message.getSid());
        }
    }
