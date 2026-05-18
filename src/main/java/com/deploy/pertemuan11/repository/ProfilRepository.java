package com.deploy.pertemuan11.repository;

import com.deploy.pertemuan11.model.Profil;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfilRepository extends JpaRepository<Profil, String> {
}
