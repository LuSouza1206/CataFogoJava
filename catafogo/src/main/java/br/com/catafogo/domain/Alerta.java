package br.com.catafogo.domain;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Alerta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String tipo;
    private String nivelGravidade;
    private LocalDateTime dataHora;
    private String status;

    @ManyToOne
    @JoinColumn(name = "sensor_id")
    private Sensor sensor;

    public Alerta() {
        this.dataHora = LocalDateTime.now();
    }

    public Alerta(String tipo, String nivelGravidade, String status, Sensor sensor) {
        this.tipo = tipo;
        this.nivelGravidade = nivelGravidade;
        this.status = status;
        this.dataHora = LocalDateTime.now();
        this.sensor = sensor;
    }


    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public String getNivelGravidade() { return nivelGravidade; }
    public void setNivelGravidade(String nivelGravidade) { this.nivelGravidade = nivelGravidade; }

    public LocalDateTime getDataHora() { return dataHora; }
    public void setDataHora(LocalDateTime dataHora) { this.dataHora = dataHora; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public Sensor getSensor() { return sensor; }
    public void setSensor(Sensor sensor) { this.sensor = sensor; }
}