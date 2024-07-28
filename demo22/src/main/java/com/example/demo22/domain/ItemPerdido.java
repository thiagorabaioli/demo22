package com.example.demo22.domain;

import jakarta.persistence.*;

import java.time.Instant;
import java.util.Objects;

@Entity
@Table(name = "tb_item_perdido")
public class ItemPerdido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String quemEncontrou;
    private String localEncontrado;
    private String descricao;
    private Instant instanteEncontrado;

    @ManyToOne
    @JoinColumn(name="reclamante_id")
    private Reclamante reclamante;

    public ItemPerdido() {}

    public ItemPerdido(Long id, String quemEncontrou, String localEncontrado, String descricao, Instant instanteEncontrado, Reclamante reclamante) {
        this.id = id;
        this.quemEncontrou = quemEncontrou;
        this.localEncontrado = localEncontrado;
        this.descricao = descricao;
        this.instanteEncontrado = instanteEncontrado;
        this.reclamante = reclamante;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getQuemEncontrou() {
        return quemEncontrou;
    }

    public void setQuemEncontrou(String quemEncontrou) {
        this.quemEncontrou = quemEncontrou;
    }

    public String getLocalEncontrado() {
        return localEncontrado;
    }

    public void setLocalEncontrado(String localEncontrado) {
        this.localEncontrado = localEncontrado;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Instant getInstanteEncontrado() {
        return instanteEncontrado;
    }

    public void setInstanteEncontrado(Instant instanteEncontrado) {
        this.instanteEncontrado = instanteEncontrado;
    }

    public Reclamante getReclamante() {
        return reclamante;
    }

    public void setReclamante(Reclamante reclamante) {
        this.reclamante = reclamante;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ItemPerdido that = (ItemPerdido) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
