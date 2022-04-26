/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lightech.voyage.services;

import com.lightech.voyage.entities.Compagnie;
import com.lightech.voyage.implement.CompagnieMetierImpl;
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
public class CompagnieRestService {

    @Autowired
    private CompagnieMetierImpl compagnieMetierImpl;

    @RequestMapping(value = "/compagnies", method = RequestMethod.POST)
    public Compagnie saveCompagnie(@RequestBody Compagnie cp) {
        return compagnieMetierImpl.saveCompagnie(cp);
    }

    @RequestMapping(value = "/compagnies/{code}", method = RequestMethod.GET)
    public Compagnie getCompagnie(@PathVariable Long code) {
        return compagnieMetierImpl.getCompagnie(code);
    }

    @RequestMapping(value = "/compagnies", method = RequestMethod.GET)
    public List<Compagnie> listCompagnie() {
        return compagnieMetierImpl.listCompagnie();
    }
}
