/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lightech.voyage.metier;

import com.lightech.voyage.entities.Numtrans;
import java.util.List;

public interface NumtransMetier {

    public Numtrans saveNumtrans(Numtrans n);

    public void updateNumtrans(Long id, Numtrans seq);

    public void updateNum(Long s, Long id);

    public List<Numtrans> sommeNumtrans(Long anne, Long mois);

    public Long identifiantNumtrans(Long anne, Long mois);

    public List<Numtrans> listeNumtrans();
}
