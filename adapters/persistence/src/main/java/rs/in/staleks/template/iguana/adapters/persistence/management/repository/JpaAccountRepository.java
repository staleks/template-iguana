package rs.in.staleks.template.iguana.adapters.persistence.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import rs.in.staleks.template.iguana.adapters.persistence.management.model.JpaAccount;

@Repository
public interface JpaAccountRepository extends JpaRepository<JpaAccount, Long> { 
    
}
