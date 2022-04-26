/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lightech.voyage.services;

import com.lightech.voyage.entities.Passager;
import com.lightech.voyage.implement.PassagerMetierImpl;
import com.lightech.voyage.model.PassagerModel;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/lightech")
public class PassagerRestService {

    @Autowired
    private PassagerMetierImpl passagerMetierImpl;

    @RequestMapping(value = "/passagers", method = RequestMethod.POST)
    public Passager savePassager(@RequestBody PassagerModel passagerModel) {
        return passagerMetierImpl.savePassager(passagerModel);
    }

    @RequestMapping(value = "/passagers/{code}", method = RequestMethod.GET)
    public Passager getPassager(@PathVariable Long code) {
        return passagerMetierImpl.getPassager(code);
    }

    @RequestMapping(value = "/passagers", method = RequestMethod.GET)
    public List<Passager> listPassager() {
        return passagerMetierImpl.listPassager();
    }

}
