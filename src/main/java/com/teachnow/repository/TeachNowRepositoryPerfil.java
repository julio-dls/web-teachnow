package com.teachnow.repository;

import com.teachnow.domain.Perfil;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author jdls
 *
 */
public interface TeachNowRepositoryPerfil extends JpaRepository<Perfil, Integer> {

    List<Perfil> findByPersonaNombreOrderByPersonaId(String name);

    @Query("SELECT p FROM Perfil p JOIN p.persona pe WHERE pe.tipo <> 'institucion'")
    List<Perfil> findAllActivePerfil();

    @Query("SELECT p FROM Perfil p JOIN p.persona pe WHERE p.id = :id AND pe.tipo <> 'institucion'")
    Perfil burcarPerfilPorId(@Param("id") Integer Id);

    @Query("SELECT p FROM Perfil p JOIN p.persona pe WHERE pe.tipo <> 'institucion'")
    @Override
    Page<Perfil> findAll(Pageable pageable);

    @Query("SELECT p FROM Perfil p JOIN p.estudios e JOIN p.empleos em JOIN p.tecnologias t JOIN p.persona pe "
            + "ON e.perfil.id = p.id AND em.perfil.id = p.id AND t.perfil.id = p.id "
            + "WHERE e.nivelestudio like %:string% OR e.titulo like %:string% "
            + "OR em.cargo LIKE %:string% OR em.empresa LIKE %:string% OR t.tecnologia LIKE %:string% AND pe.tipo <> 'institucion' GROUP BY p.id ORDER BY p.id")
    Page<Perfil> buscarPerfilPorPalabraClave(@Param("string") String string, Pageable pageable);

    @Query("SELECT p FROM Perfil p JOIN p.estudios e JOIN p.empleos em JOIN p.tecnologias t JOIN p.persona pe "
            + "WHERE pe.salario = :idfiltros AND pe.tipo <> 'institucion' GROUP BY p.id ORDER BY p.id")
    Page<Perfil> buscarPerfilPorIdFiltrosSalario(@Param("idfiltros") Integer id, Pageable pageable);

    @Query("SELECT p FROM Perfil p JOIN p.estudios e JOIN p.empleos em JOIN p.tecnologias t JOIN p.persona pe "
            + "WHERE pe.nivel = :idfiltros AND pe.tipo <> 'institucion' GROUP BY p.id ORDER BY p.id")
    Page<Perfil> buscarPerfilPorIdFiltrosNivel(@Param("idfiltros") Integer id, Pageable pageable);

    @Query("SELECT p FROM Perfil p JOIN p.estudios e JOIN p.empleos em JOIN p.tecnologias t JOIN p.persona pe "
            + "WHERE pe.tipodepuesto = :idfiltros AND pe.tipo <> 'institucion' GROUP BY p.id ORDER BY p.id")
    Page<Perfil> buscarPerfilPorIdFiltrosTipodepuesto(@Param("idfiltros") Integer id, Pageable pageable);

    @Query("SELECT p FROM Perfil p JOIN p.estudios e JOIN p.empleos em JOIN p.tecnologias t JOIN p.persona pe "
            + "WHERE pe.zona = :idfiltros AND pe.tipo <> 'institucion' GROUP BY p.id ORDER BY p.id")
    Page<Perfil> buscarPerfilPorIdFiltrosZona(@Param("idfiltros") Integer id, Pageable pageable);
}
