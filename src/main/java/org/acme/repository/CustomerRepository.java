package org.acme.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import org.acme.model.Adm;

@ApplicationScoped
public class CustomerRepository implements PanacheRepository <Adm> {

}
