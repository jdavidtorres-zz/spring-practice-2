package co.com.jdti.practice.conference.repositories;

import co.com.jdti.practice.conference.models.Speaker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpeakerJpaRepository extends JpaRepository<Speaker, Long> {
}
