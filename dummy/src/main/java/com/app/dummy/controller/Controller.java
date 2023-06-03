package com.app.dummy.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/dummy")
@Log4j2
public class Controller {

    @Autowired
    private Environment environment;

    @GetMapping
    public ResponseEntity<List<String>> getDummyObjectList() {

        log.info("Getting dummy list from port: " + environment.getProperty("server.port"));

        String dummy1 = "dummy1";
        String dummy2 = "dummy2";
        String dummy3 = "dummy3";
        String dummy4 = "dummy4";
        String dummy5 = "dummy5";
        String dummy6 = "dummy6";
        String dummy7 = "dummy7";

        List<String> list = Arrays.asList(dummy1, dummy2, dummy3, dummy4, dummy5, dummy6, dummy7);

        return ResponseEntity.ok(list);
    }
}
