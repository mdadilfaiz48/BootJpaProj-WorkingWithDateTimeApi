package com.adil.service;

import com.adil.entity.PersonInfo;

public interface IPersonMgmtService {
	
	public String registerPerson(PersonInfo per);
	
	public Iterable<PersonInfo> showAllPerson();
	
	public float getAgeByPid(int id);

}
