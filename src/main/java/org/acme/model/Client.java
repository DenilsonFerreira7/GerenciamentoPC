package org.acme.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Client {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String email;
    private String telephone;
    private String road;
    private String HouseNumber;
    private String Neighborhood;
    private String city;
    private String State;
}
