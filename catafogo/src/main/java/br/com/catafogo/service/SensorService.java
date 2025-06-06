package br.com.catafogo.service;

import br.com.catafogo.domain.Sensor;
import br.com.catafogo.repository.SensorRepository;
import br.com.catafogo.exception.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SensorService {

    private final SensorRepository repository;

    public SensorService(SensorRepository repository) {
        this.repository = repository;
    }

    public List<Sensor> listarTodos() {
        return repository.findAll();
    }

    public Sensor salvar(Sensor sensor) {
        return repository.save(sensor);
    }

    public Sensor buscarPorId(Long id) {
        Optional<Sensor> sensor = repository.findById(id);

        if (sensor.isPresent()) {
            return sensor.get();
        } else {
            throw new ResourceNotFoundException("Sensor com ID " + id + " não encontrado.");
        }
    }
}