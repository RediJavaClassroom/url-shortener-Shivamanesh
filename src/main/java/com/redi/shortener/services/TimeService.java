package com.redi.shortener.services;

import com.redi.shortener.model.CreateTimeRequest;
import java.sql.Time;
import org.springframework.stereotype.Service;

@Service
public class TimeService {
    public Time create(final CreateTimeRequest request) {
        return new Time(request.time());
    }
}
