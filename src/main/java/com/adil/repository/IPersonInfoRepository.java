package com.adil.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.adil.entity.PersonInfo;

public interface IPersonInfoRepository extends JpaRepository<PersonInfo, Integer> {
	
	@Query(value = "SELECT (DATEDIFF(CURDATE(), dob) / 365.25) AS age FROM jpa_joda_date_time WHERE pid =:id", nativeQuery=true)
	public float culculateAgeById(int id);

}
