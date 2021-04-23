package com.switchfully.pettinder.pet;

import org.springframework.stereotype.Service;


import javax.transaction.Transactional;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
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

    public void sendWhatsApp(String name) throws IOException {
        String nameValue = name.substring(9, name.length() - 2);
        URL url = new URL("https://messages-sandbox.nexmo.com/v0.1/messages");
        HttpURLConnection http = (HttpURLConnection) url.openConnection();
        http.setRequestMethod("POST");
        http.setDoOutput(true);
        http.setRequestProperty("Content-Type", "application/json");
        http.setRequestProperty("Accept", "application/json");
        http.setRequestProperty("Authorization", "Basic MjllMWVkZGI6T2N2aVJEUnVldnBtNUpIWA==");
        String data = "{\"from\": { \"type\": \"whatsapp\", \"number\": \"14157386170\" },\"to\": { \"type\": \"whatsapp\", \"number\": \"32472258387 \" },\"message\": { \"content\": {\"type\": \"text\",\"text\": \"Woohoow, you just fixed a date with " + nameValue + "!\"} } }";
        byte[] out = data.getBytes(StandardCharsets.UTF_8);
        OutputStream stream = http.getOutputStream();
        stream.write(out);
        System.out.println(http.getResponseCode() + " " + http.getResponseMessage());
        http.disconnect();
    }
}
