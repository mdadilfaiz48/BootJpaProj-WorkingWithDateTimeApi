package com.adil.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adil.entity.PersonInfo;
import com.adil.repository.IPersonInfoRepository;

@Service
public class PersonInfoMgmtServiceImpl implements IPersonMgmtService {
	
	@Autowired
	private IPersonInfoRepository repo;

	@Override
	public String registerPerson(PersonInfo per) {
		
		int idVal = repo.save(per).getPid();
		
		return "PersonInfo are saved with id value"+idVal;
	}

	@Override
	public Iterable<PersonInfo> showAllPerson() {
		
		return repo.findAll();
	}

	@Override
	public float getAgeByPid(int id) {
		
		
		
		return repo.culculateAgeById(id);
	}

}
