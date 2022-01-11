package com.switchfully.pettinder.image;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "https://furryfinder.netlify.app/")
@RequestMapping(path = "images")
public class ImageController {

    @GetMapping(path = "{imageName}", produces = "image/jpeg")
    public Resource getImage(@PathVariable String imageName) {
        return new ClassPathResource("images/" + imageName);
    }
}
