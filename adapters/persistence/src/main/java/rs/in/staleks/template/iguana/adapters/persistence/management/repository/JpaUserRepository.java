package rs.in.staleks.template.iguana.adapters.persistence.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import rs.in.staleks.template.iguana.adapters.persistence.management.model.JpaUser;

@Repository
public interface JpaUserRepository extends JpaRepository<JpaUser, Long> {
}
