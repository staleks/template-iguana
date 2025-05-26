package rs.in.staleks.template.iguana.adapters.persistence.management.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Version;
import jakarta.validation.constraints.Size;
import rs.in.staleks.template.iguana.adapters.persistence.AbstractAuditingEntity;
import rs.in.staleks.template.iguana.domain.management.Account;

@Entity
@Table(name = "tbl_user")
public class JpaUser extends AbstractAuditingEntity<Long> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Version
    private Integer version;

    @Size(max = 80)
    @Column(name = "username", length = 80)
    private String username;

    @Size(max = 256)
    @Column(name = "email", length = 256)
    private String email;

    @ManyToOne
    @JoinColumn(name = "account_id")
    private Account account;

    @Override
    public Long getId() {
        return id;
    }

    public Integer getVersion() {
        return version;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(final String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(final String email) {
        this.email = email;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(final Account account) {
        this.account = account;
    }
}
