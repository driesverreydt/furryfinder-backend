package com.switchfully.pettinder.image;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "images")
public class ImageController {

    @GetMapping(path = "{imageName}", produces = "image/jpeg")
    public Resource getImage(@PathVariable String imageName) {
        return new ClassPathResource("images/" + imageName);
    }
}
