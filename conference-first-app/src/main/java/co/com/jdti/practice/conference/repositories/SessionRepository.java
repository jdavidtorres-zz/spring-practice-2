package co.com.jdti.practice.conference.repositories;

import co.com.jdti.practice.conference.models.Session;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SessionRepository extends JpaRepository<Session, Long> {

}
