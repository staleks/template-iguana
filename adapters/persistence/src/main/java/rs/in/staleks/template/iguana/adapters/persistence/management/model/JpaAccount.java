package rs.in.staleks.template.iguana.adapters.persistence.management.model;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Version;
import rs.in.staleks.template.iguana.adapters.persistence.AbstractAuditingEntity;

@Entity
@Table(name = "tbl_account")
public class JpaAccount extends AbstractAuditingEntity<Long> {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Version
    private Integer version;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "active", nullable = false)
    private boolean active;

    @OneToMany(mappedBy = "account")
    private Set<JpaUser> users;

    public Long getId() {
        return id;
    }

    public Integer getVersion() {
        return version;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(final boolean active) {
        this.active = active;
    }

    public Set<JpaUser> getUsers() {
        return users;
    }

    public void setUsers(final Set<JpaUser> users) {
        this.users = users;
    }

}