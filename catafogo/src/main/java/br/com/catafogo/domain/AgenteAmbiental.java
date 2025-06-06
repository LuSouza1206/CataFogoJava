package br.com.catafogo.domain;

import jakarta.persistence.*;

@Entity
public class AgenteAmbiental {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String orgao;
    private String telefone;

    public AgenteAmbiental() {
    }

    public AgenteAmbiental(String nome, String orgao, String telefone) {
        this.nome = nome;
        this.orgao = orgao;
        this.telefone = telefone;
    }

    // Getters e Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getOrgao() { return orgao; }
    public void setOrgao(String orgao) { this.orgao = orgao; }

    public String getTelefone() { return telefone; }
    public void setTelefone(String telefone) { this.telefone = telefone; }
}