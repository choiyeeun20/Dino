package com.yeeun.web.lost;

import lombok.Data;
import org.springframework.stereotype.Component;



@Component @Data
public class Lost {
    private String  id, name, date, category, location;

    @Override
    public String toString() {
        return String.format("%s,%s,%s,%s,/$s",  id, name, date, category, location);

    }
}