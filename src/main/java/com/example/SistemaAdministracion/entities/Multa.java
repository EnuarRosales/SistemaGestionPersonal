package com.example.SistemaAdministracion.entities;


import javax.persistence.*;

@Entity
public class Multa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMultas;
    private String nombreMulta;
    private Double costoMulta;

    public Multa() {
    }

    public Multa(Long idMultas, String nombreMulta, Double costoMulta) {
        this.idMultas = idMultas;
        this.nombreMulta = nombreMulta;
        this.costoMulta = costoMulta;
    }

    public Long getIdMultas() {
        return idMultas;
    }

    public void setIdMultas(Long idMultas) {
        this.idMultas = idMultas;
    }

    public String getNombreMulta() {
        return nombreMulta;
    }

    public void setNombreMulta(String nombreMulta) {
        this.nombreMulta = nombreMulta;
    }

    public Double getCostoMulta() {
        return costoMulta;
    }

    public void setCostoMulta(Double costoMulta) {
        this.costoMulta = costoMulta;
    }

}
