package com.kamandemwangi.time.controller;

import com.kamandemwangi.time.model.Time;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
public class TimeController {

    @GetMapping("/time")
    private Time get() {
        Date date = new Date();
        String time = new SimpleDateFormat("h:mm:ss a").format(date);
        String day = new SimpleDateFormat("EEEE, dd MMMM yyyy").format(date);

        return new Time(time, day);

    }
}
