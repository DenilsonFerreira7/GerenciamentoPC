package org.acme.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
public class Machines {
    @Id
    private Long id;
    private Long ordemServico;
    private String marca;
    private String status;
    private String obs;
    @Temporal(TemporalType.DATE)
    private Date data_de_entrada;

}
