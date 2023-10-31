package br.edu.senai.SA6_UC9.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.senai.SA6_UC9.repository.StakeholderRepository;
import br.edu.senai.SA6_UC9.model.Stakeholder;

@Service
public class StakeholderServiceImpl implements StakeholderService {
	
	@Autowired
	private StakeholderRepository stakeholderRepository;
	
	@Override
	public List<Stakeholder> getAllStakeholders() {
		return stakeholderRepository.findAll();
	}

	@Override
	public void saveStakeholder(Stakeholder stakeholder) {
		this.stakeholderRepository.save(stakeholder);
	}

	@Override
	public Stakeholder getStakeholderById(short id) {
		Optional<Stakeholder> optional = stakeholderRepository.findById(id);
		Stakeholder stakeholder;
		if (optional.isPresent()) {
			stakeholder =  optional.get();
		} else {
			throw new RuntimeException(" Cadastro não econtrado pelo id :: " + id);
		}
		return stakeholder;
	}

	@Override
	public void deleteStakeholderById(short id) {
		this.stakeholderRepository.deleteById(id);
	}

}
