package com.advatix.hackathon.repository;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.advatix.hackathon.model.RoutingInfo;
import com.advatix.hackathon.model.inventoryinfo;

@Repository

public interface inventoryRepository extends JpaRepository<inventoryinfo, Integer> { 

	static Optional<inventoryRepository> findById(Long id) {
		// TODO Auto-generated method stub
		return null;
		}
}


