package ipps.slr.models;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Gramovich_V on 15.03.2018.
 */
@Entity
@Table(name = "licensedterritory", schema = "sisslr", catalog = "slr")
public class LicensedterritoryEntity {
    private long id;
    private Timestamp datecreate;
    private Timestamp datelastedit;
    private Long lasteditorid;
    private Long ownerid;
    private String name;
    private Long parentid;

    @Id
    @Column(name = "id", nullable = false)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "datecreate", nullable = true)
    public Timestamp getDatecreate() {
        return datecreate;
    }

    public void setDatecreate(Timestamp datecreate) {
        this.datecreate = datecreate;
    }

    @Basic
    @Column(name = "datelastedit", nullable = true)
    public Timestamp getDatelastedit() {
        return datelastedit;
    }

    public void setDatelastedit(Timestamp datelastedit) {
        this.datelastedit = datelastedit;
    }

    @Basic
    @Column(name = "lasteditorid", nullable = true)
    public Long getLasteditorid() {
        return lasteditorid;
    }

    public void setLasteditorid(Long lasteditorid) {
        this.lasteditorid = lasteditorid;
    }

    @Basic
    @Column(name = "ownerid", nullable = true)
    public Long getOwnerid() {
        return ownerid;
    }

    public void setOwnerid(Long ownerid) {
        this.ownerid = ownerid;
    }

    @Basic
    @Column(name = "name", nullable = true, length = -1)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "parentid", nullable = true)
    public Long getParentid() {
        return parentid;
    }

    public void setParentid(Long parentid) {
        this.parentid = parentid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LicensedterritoryEntity that = (LicensedterritoryEntity) o;

        if (id != that.id) return false;
        if (datecreate != null ? !datecreate.equals(that.datecreate) : that.datecreate != null) return false;
        if (datelastedit != null ? !datelastedit.equals(that.datelastedit) : that.datelastedit != null) return false;
        if (lasteditorid != null ? !lasteditorid.equals(that.lasteditorid) : that.lasteditorid != null) return false;
        if (ownerid != null ? !ownerid.equals(that.ownerid) : that.ownerid != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (parentid != null ? !parentid.equals(that.parentid) : that.parentid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (datecreate != null ? datecreate.hashCode() : 0);
        result = 31 * result + (datelastedit != null ? datelastedit.hashCode() : 0);
        result = 31 * result + (lasteditorid != null ? lasteditorid.hashCode() : 0);
        result = 31 * result + (ownerid != null ? ownerid.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (parentid != null ? parentid.hashCode() : 0);
        return result;
    }
}
