package com.example.PersonasMongoDB.repositorios;

import com.example.PersonasMongoDB.colecciones.Empleado;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RepositorioEmpleado extends MongoRepository<Empleado, String> {
}
