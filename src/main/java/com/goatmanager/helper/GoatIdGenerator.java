package com.goatmanager.helper;


import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.UUID;

@Component
public class GoatIdGenerator {
    public static int count = 0;

    public static Long generate() {
        LocalDateTime now = LocalDateTime.now();
        String time =now.format(DateTimeFormatter.ofPattern("yyMMddhhss"));
        Random random = new Random();
        UUID uuid = UUID.randomUUID();
        System.out.println(uuid.toString());
        int randomInt =100* random.nextInt(100);
        return Long.valueOf(time+randomInt+count++);
    }
}
