package com.zujuba.springbasic.people;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
public class testuser {
    @RequestMapping(method = RequestMethod.GET)
    String get() {
        return "Hello from get";
    }
    @RequestMapping(method = RequestMethod.DELETE)
    String delete() {
        return "Hello from delete";
    }
    @RequestMapping(method = RequestMethod.POST)
    String post() {
        return "Hello from post";
    }
    @RequestMapping(method = RequestMethod.PUT)
    String put() {
        return "Hello from put";
    }
    @RequestMapping(method = RequestMethod.PATCH)
    String patch() {
        return "Hello from patch";
    }

    @RequestMapping(value = "/prod", produces = {
            "application/JSON"
    })
    @ResponseBody
    String getProduces() {
        return "Produces attribute";
    }

    @RequestMapping(value = "/cons", consumes = {
            "application/JSON",
            "application/XML"
    })
    String getConsumes() {
        return "Consumes attribute";
    }

    @RequestMapping(value = "/id")
    String getIdByValue(@RequestParam("id") String personId) {
        System.out.println("ID is " + personId);
        return "Get ID from query string of URL with value element";
    }
    @RequestMapping(value = "/personId")
    String getId(@RequestParam String personId) {
        System.out.println("ID is " + personId);
        return "Get ID from query string of URL without value element";
    }
}

