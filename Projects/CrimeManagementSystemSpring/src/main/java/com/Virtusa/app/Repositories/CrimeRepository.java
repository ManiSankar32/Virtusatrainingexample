package com.Virtusa.app.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


@Repository
public interface CrimeRepository extends JpaRepository<Crimes,Integer> {
	

	public Crimes findByCrimeid(int crimeid);
}
