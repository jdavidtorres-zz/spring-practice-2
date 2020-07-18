package co.com.jdti.practice.conference.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.com.jdti.practice.conference.models.Session;

@Repository
public interface SessionRepository extends JpaRepository<Session, Long> {

}
