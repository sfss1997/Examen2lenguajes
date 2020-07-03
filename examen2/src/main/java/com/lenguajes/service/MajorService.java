package com.lenguajes.service;

import com.lenguajes.examen2.Major;
import com.lenguajes.examen2.MajorDTO;
import com.lenguajes.repository.MajorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.sql.SQLException;
import java.util.List;

@Service
@Transactional
public class MajorService {

    @Autowired
    private MajorRepository majorRepository;

    public List<Major> ListMajor() throws SQLException {
        try {
            return majorRepository.ListMajor();
        }catch(Exception e){
            throw new SQLException("Error al obtener los datos");
        }
    }

    public Major GetMajorById(Integer MajorId)throws SQLException {
        try {
            return majorRepository.GetMajorById(MajorId);
        }catch(Exception e){
            throw new SQLException("Error al obtener los datos");
        }
    }

    public void DeleteMajor(Integer MajorId)throws SQLException {
        try {
            majorRepository.DeleteMajor(MajorId);
        }catch(Exception e){
            throw new SQLException("Error al eliminar los datos");
        }
    }

    public  void UpdateMajor(Major major)throws SQLException {
        try {
            majorRepository.UpdateMajor(major.getMajorId(),major.getName(),major.getCyclesQuantity());
        }catch(Exception e){
            throw new SQLException("Error al actualizar los datos");
        }
    }

    public  void AddMajor(MajorDTO majorDTO)throws SQLException {
        try {
            majorRepository.InsertMajor(majorDTO.getName(),majorDTO.getCyclesQuantity());
        }catch(Exception e){
            throw new SQLException("Error al insertar los datos");
        }
    }
}
