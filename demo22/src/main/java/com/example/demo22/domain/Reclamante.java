package com.example.demo22.domain;

import jakarta.persistence.*;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


@Entity
@Table(name = "tb_reclamante")
public class Reclamante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String contacto;

    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant instantReclamado;

    @OneToMany(mappedBy = "reclamante")
    private List<ItemPerdido> itensPerdidos = new ArrayList<>();

    public Reclamante() {}

    public Reclamante(Long id, Instant instantReclamado, String contacto, String name) {
        this.id = id;
        this.instantReclamado = instantReclamado;
        this.contacto = contacto;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public Instant getInstantReclamado() {
        return instantReclamado;
    }

    public void setInstantReclamado(Instant instantReclamado) {
        this.instantReclamado = instantReclamado;
    }

    public List<ItemPerdido> getItensPerdidos() {
        return itensPerdidos;
    }

    public void setItensPerdidos(List<ItemPerdido> itensPerdidos) {
        this.itensPerdidos = itensPerdidos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Reclamante that = (Reclamante) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
