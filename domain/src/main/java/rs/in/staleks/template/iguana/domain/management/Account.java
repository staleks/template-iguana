package rs.in.staleks.template.iguana.domain.management;

import java.time.Instant;
import java.util.HashSet;
import java.util.Set;

public class Account {
    private Long id;

    // Audit fields    
    private String createdBy;
    private Instant createdDate;
    private String lastModifiedBy;
    private Instant lastModifiedDate;

    // Business fields
    private String name;
    private boolean active;
    private Set<User> users;

    public Account() {
        // empty constructor
    }

    private Account(final String name, final boolean active) {
        this.name = name;
        this.active = active;
    }

    private Account(final Long id, final String name, final boolean active, final Set<User> users) {
        this.id = id;
        this.name = name;
        this.active = active;
        this.users = users;
    }

    public static Account of(final Long id, final String name, final boolean active, final Set<User> users) {
        return new Account(id, name, active, users);
    }

    public static Account create(final String name) {
        return new Account(name, Boolean.TRUE);
    }

    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(final String createdBy) {
        this.createdBy = createdBy;
    }

    public Instant getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(final Instant createdDate) {
        this.createdDate = createdDate;
    }

    public String getLastModifiedBy() {
        return lastModifiedBy;
    }

    public void setLastModifiedBy(final String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    public Instant getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(final Instant lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
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

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(final Set<User> users) {
        this.users = users;
    }
    
    public void addUser(final User user) {
        if (this.users == null) {
            this.users = new HashSet<>();
        } 
        if (user != null) {
            this.users.add(user);            
        }
    }
    
}
