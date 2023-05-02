package dev.knowledgecafe.gatlingdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;
import java.util.concurrent.TimeUnit;


@RestController
@RequestMapping("/gatling")
public class Controller {
    private static final Logger LOGGER = LoggerFactory.getLogger(Controller.class);



    @GetMapping
    public Integer getRandomNumber() {
        //Adding sleep
       Integer sleepTime = new Random().nextInt(1000);

        try {
            TimeUnit.MILLISECONDS.sleep(sleepTime);
        } catch (InterruptedException e) {
           LOGGER.error( e.getMessage());
        }
        return new Random().nextInt(123456);
    }




}
