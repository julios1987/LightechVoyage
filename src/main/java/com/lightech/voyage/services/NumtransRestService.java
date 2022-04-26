/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lightech.voyage.services;

import com.lightech.voyage.entities.Numtrans;
import com.lightech.voyage.implement.NumtransMetierImpl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/lightech")
public class NumtransRestService {

    @Autowired
    private NumtransMetierImpl numtransMetierImpl;

    @RequestMapping(value = "/numtrans", method = RequestMethod.POST)
    public Numtrans saveNumtrans(@RequestBody Numtrans n) {
        return numtransMetierImpl.saveNumtrans(n);
    }

    //UPDATE
    @RequestMapping(value = "/numtrans/{idnum}", method = RequestMethod.PUT)
    public void updateNumtrans(@PathVariable(name = "idnum") Long idnum, @RequestBody Numtrans seq) {
        numtransMetierImpl.updateNumtrans(idnum, seq);
    }

    //UPDATE
    @RequestMapping(value = "/updatenumtrans/{idnum}", method = RequestMethod.PUT)
    public void updateNum(@PathVariable(name = "idnum") Long idnum, @RequestBody Long seq) {
        numtransMetierImpl.updateNum(seq, idnum);
    }

    @RequestMapping(value = "/numtrans", method = RequestMethod.GET)
    public List<Numtrans> sommeNumtrans(
            @RequestParam Long anne,
            @RequestParam Long mois) {
        return numtransMetierImpl.sommeNumtrans(anne, mois);
    }

    @RequestMapping(value = "/identifiantnumtrans", method = RequestMethod.GET)
    public Long identifiantNumtrans(
            @RequestParam Long anne,
            @RequestParam Long mois) {
        return numtransMetierImpl.identifiantNumtrans(anne, mois);
    }

    @RequestMapping(value = "/numeros", method = RequestMethod.GET)
    public List<Numtrans> listeNumtrans() {
        return numtransMetierImpl.listeNumtrans();
    }
}
