package rs.in.staleks.template.iguana.adapters.persistence.management.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;
import rs.in.staleks.template.iguana.adapters.persistence.AbstractAuditingEntity;

@Entity
@Table(name = "tbl_user")
public class JpaUser extends AbstractAuditingEntity<Long> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Size(max = 80)
    @Column(name = "username", length = 80)
    private String username;

    @Size(max = 256)
    @Column(name = "email", length = 256)
    private String email;

    @Override
    public Long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
