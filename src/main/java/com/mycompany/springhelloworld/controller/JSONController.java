package com.mycompany.springhelloworld.controller;

import com.mycompany.springhelloworld.utils.SimpleRequest;
import java.net.MalformedURLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author redlongcity class for testing
 */
@RestController
@RequestMapping(value = "/")
public class JSONController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public ResponseEntity<String> hello() {
        String hello = "Hello from Openshift!";
        return new ResponseEntity<String>(hello, HttpStatus.OK);
    }

    @RequestMapping(value = "/example", method = RequestMethod.GET)
    public ResponseEntity<String> example() {
        String example=null;
        try {
            SimpleRequest request = new SimpleRequest();
            example = request.getRequest("https://api.ittour.com.ua/module/search-list?"
                    + "country=420&"
                    + "from_city=1212&"
                    + "hotel_rating=3:78&"
                    + "adult_amount=2&"
                    + "night_from=6&"
                    + "night_till=8&"
                    + "date_from=20.11.17&"
                    + "date_till=21.11.17&"
                    + "page=1&"
                    + "items_per_page=1000");
        } catch (MalformedURLException ex) {
            Logger.getLogger(JSONController.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(example==null){
            return new ResponseEntity<String>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<String>(example,HttpStatus.OK);

    }

}
