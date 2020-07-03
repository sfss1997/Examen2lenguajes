package com.lenguajes.repository;

import com.lenguajes.examen2.Major;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MajorRepository extends JpaRepository<Major, Integer>{

    @Query(value = "SelectMajor", nativeQuery = true)
    List<Major> ListMajor();

    @Query(value = "{call GetMajorById(:MajorId)}", nativeQuery = true)
    Major GetMajorById(@Param("MajorId") Integer Id);

    @Modifying
    @Query(value = "{call DeleteMajor(:MajorId)}", nativeQuery = true)
    void DeleteMajor(@Param("MajorId") Integer Id);

    @Modifying
    @Query(value = "{ call UpdateMajor(:MajorId, :Name, :CyclesQuantity)}", nativeQuery = true)
    void UpdateMajor(@Param("MajorId") Integer MajorId,
                         @Param("Name") String Name,
                         @Param("CyclesQuantity") Integer CyclesQuantity);

    @Modifying
    @Query(value = "{ call InsertMajor(:Name, :CyclesQuantity)}", nativeQuery = true)
    void InsertMajor(@Param("Name") String Name,
                     @Param("CyclesQuantity") Integer CyclesQuantity);

}
