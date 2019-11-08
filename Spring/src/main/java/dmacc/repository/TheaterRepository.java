package dmacc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dmacc.beans.Theater;

@Repository
public interface TheaterRepository extends JpaRepository<Theater, Long> {
	
}
