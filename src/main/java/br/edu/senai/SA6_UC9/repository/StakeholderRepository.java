package br.edu.senai.SA6_UC9.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.senai.SA6_UC9.model.Stakeholder;

@Repository
public interface StakeholderRepository extends JpaRepository<Stakeholder, Short> {
	

}
