package com.petShop.persistance.entity;


import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@Entity
@Table(name = "cita")
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cita")
    private Integer idAppointment;

    @Column(name = "dia")
    private Integer day;

    @Column(name = "mes")
    private String month;

    @Column(name = "motivo")
    private String reason;

    @ManyToOne
    @JoinColumn(name = "id_veterinario")
    private Veterinarian veterinarian;

    @ManyToOne
    @JoinColumn(name = "id_mascota")
    private Pet pet;


    public Integer getIdAppointment() {
        return idAppointment;
    }

    public void setIdAppointment(Integer idAppointment) {
        this.idAppointment = idAppointment;
    }
}
