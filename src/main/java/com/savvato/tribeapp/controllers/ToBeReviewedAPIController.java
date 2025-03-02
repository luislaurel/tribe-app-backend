package com.savvato.tribeapp.controllers;

import com.savvato.tribeapp.entities.ToBeReviewed;
import com.savvato.tribeapp.repositories.ToBeReviewedRepository;
import com.savvato.tribeapp.services.ToBeReviewedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class ToBeReviewedAPIController {

    @Autowired
    ToBeReviewedRepository pr;

    @Autowired
    ToBeReviewedService toBeReviewedService;

    @RequestMapping(value = { "/api/review" }, method= RequestMethod.GET)
    public ResponseEntity getPhrase() {
        Optional<ToBeReviewed> opt = toBeReviewedService.getReviewPhrase();

        if (opt.isPresent()) {
            return ResponseEntity.status(HttpStatus.OK).body(opt.get());
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
        }
    }
}
