package com.advatix.hackathon.repository;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.advatix.hackathon.model.RoutingInfo;

@Repository

public interface RouteinfoRepository extends JpaRepository<RoutingInfo, Integer> { 

	static Optional<RoutingInfo> findById(Long id) {
		// TODO Auto-generated method stub
		return null;
		}
}


