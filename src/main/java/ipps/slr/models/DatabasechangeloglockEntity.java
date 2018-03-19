package ipps.slr.models;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Gramovich_V on 15.03.2018.
 */
@Entity
@Table(name = "databasechangeloglock", schema = "sisslr", catalog = "slr")
public class DatabasechangeloglockEntity {
    private int id;
    private boolean locked;
    private Timestamp lockgranted;
    private String lockedby;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "locked", nullable = false)
    public boolean isLocked() {
        return locked;
    }

    public void setLocked(boolean locked) {
        this.locked = locked;
    }

    @Basic
    @Column(name = "lockgranted", nullable = true)
    public Timestamp getLockgranted() {
        return lockgranted;
    }

    public void setLockgranted(Timestamp lockgranted) {
        this.lockgranted = lockgranted;
    }

    @Basic
    @Column(name = "lockedby", nullable = true, length = 255)
    public String getLockedby() {
        return lockedby;
    }

    public void setLockedby(String lockedby) {
        this.lockedby = lockedby;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DatabasechangeloglockEntity that = (DatabasechangeloglockEntity) o;

        if (id != that.id) return false;
        if (locked != that.locked) return false;
        if (lockgranted != null ? !lockgranted.equals(that.lockgranted) : that.lockgranted != null) return false;
        if (lockedby != null ? !lockedby.equals(that.lockedby) : that.lockedby != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (locked ? 1 : 0);
        result = 31 * result + (lockgranted != null ? lockgranted.hashCode() : 0);
        result = 31 * result + (lockedby != null ? lockedby.hashCode() : 0);
        return result;
    }
}
