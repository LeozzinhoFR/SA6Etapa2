package br.edu.senai.SA6_UC9.service;


import java.util.List;

import br.edu.senai.SA6_UC9.model.Stakeholder;

public interface StakeholderService {
	List<Stakeholder> getAllStakeholders();
	void saveStakeholder(Stakeholder stakeholder);
	Stakeholder getStakeholderById(short id);
	void deleteStakeholderById(short id);
}
