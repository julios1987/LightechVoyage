package com.lightech.voyage.metier;

import com.lightech.voyage.entities.Compagnie;
import java.util.List;

public interface CompagnieMetier {

    public Compagnie saveCompagnie(Compagnie cp);

    public Compagnie getCompagnie(Long code);

    public List<Compagnie> listCompagnie();

    public Compagnie updateCompagnie(Long id, Compagnie c);

    public void deleteCompagnie(Long id);
}
