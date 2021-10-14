package com.example.PersonasMongoDB.mappers;

import com.example.PersonasMongoDB.DTOs.EmpleadoDTO;
import com.example.PersonasMongoDB.colecciones.Empleado;
import com.mongodb.lang.NonNull;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EmpleadoMapper {

    public Empleado fromDTO(EmpleadoDTO dto) { //Aqui se pasan los datos desde el empleadoDTO al empleado.
        Empleado empleado = new Empleado();
        empleado.setId(dto.getId());
        empleado.setNombre(dto.getNombre());
        empleado.setRol(dto.getRol());
        return empleado;
    }

    public EmpleadoDTO fromCollection(Empleado collection) { //Aqui se pasan los datos desde el empleado al empleadoDTO.
        EmpleadoDTO empleadoDTO = new EmpleadoDTO();
        empleadoDTO.setId(collection.getId());
        empleadoDTO.setNombre(collection.getNombre());
        empleadoDTO.setRol(collection.getRol());
        return empleadoDTO;
    }

    public List<EmpleadoDTO> fromCollectionList(List<Empleado> collection) { //Convierte de un listado de modelos a un listado de DTO
        if (collection == null) {
            return null;

        }
        List<EmpleadoDTO> list = new ArrayList(collection.size());
        Iterator listTracks = collection.iterator();

        while(listTracks.hasNext()) {
            Empleado empleado = (Empleado)listTracks.next();
            list.add(fromCollection(empleado));
        }

        return list;
    }


}
