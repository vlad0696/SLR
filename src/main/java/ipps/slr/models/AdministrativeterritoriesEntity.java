package ipps.slr.models;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Gramovich_V on 15.03.2018.
 */
@Entity
@Table(name = "administrativeterritories", schema = "sisslr", catalog = "slr")
public class AdministrativeterritoriesEntity {
    private long id;
    private Timestamp datecreate;
    private Timestamp datelastedit;
    private Long lasteditorid;
    private Long ownerid;
    private Timestamp dateend;
    private Timestamp datestart;
    private Long districtcode;
    private String districtname;
    private Long localitycode;
    private String localityname;
    private String psoato;
    private Long regioncode;
    private String regionname;
    private String soato;
    private Long sovetcode;
    private String sovetname;

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
    @Column(name = "dateend", nullable = true)
    public Timestamp getDateend() {
        return dateend;
    }

    public void setDateend(Timestamp dateend) {
        this.dateend = dateend;
    }

    @Basic
    @Column(name = "datestart", nullable = true)
    public Timestamp getDatestart() {
        return datestart;
    }

    public void setDatestart(Timestamp datestart) {
        this.datestart = datestart;
    }

    @Basic
    @Column(name = "districtcode", nullable = true)
    public Long getDistrictcode() {
        return districtcode;
    }

    public void setDistrictcode(Long districtcode) {
        this.districtcode = districtcode;
    }

    @Basic
    @Column(name = "districtname", nullable = true, length = 75)
    public String getDistrictname() {
        return districtname;
    }

    public void setDistrictname(String districtname) {
        this.districtname = districtname;
    }

    @Basic
    @Column(name = "localitycode", nullable = true)
    public Long getLocalitycode() {
        return localitycode;
    }

    public void setLocalitycode(Long localitycode) {
        this.localitycode = localitycode;
    }

    @Basic
    @Column(name = "localityname", nullable = true, length = 100)
    public String getLocalityname() {
        return localityname;
    }

    public void setLocalityname(String localityname) {
        this.localityname = localityname;
    }

    @Basic
    @Column(name = "psoato", nullable = true, length = 10)
    public String getPsoato() {
        return psoato;
    }

    public void setPsoato(String psoato) {
        this.psoato = psoato;
    }

    @Basic
    @Column(name = "regioncode", nullable = true)
    public Long getRegioncode() {
        return regioncode;
    }

    public void setRegioncode(Long regioncode) {
        this.regioncode = regioncode;
    }

    @Basic
    @Column(name = "regionname", nullable = true, length = 75)
    public String getRegionname() {
        return regionname;
    }

    public void setRegionname(String regionname) {
        this.regionname = regionname;
    }

    @Basic
    @Column(name = "soato", nullable = true, length = 10)
    public String getSoato() {
        return soato;
    }

    public void setSoato(String soato) {
        this.soato = soato;
    }

    @Basic
    @Column(name = "sovetcode", nullable = true)
    public Long getSovetcode() {
        return sovetcode;
    }

    public void setSovetcode(Long sovetcode) {
        this.sovetcode = sovetcode;
    }

    @Basic
    @Column(name = "sovetname", nullable = true, length = 75)
    public String getSovetname() {
        return sovetname;
    }

    public void setSovetname(String sovetname) {
        this.sovetname = sovetname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AdministrativeterritoriesEntity that = (AdministrativeterritoriesEntity) o;

        if (id != that.id) return false;
        if (datecreate != null ? !datecreate.equals(that.datecreate) : that.datecreate != null) return false;
        if (datelastedit != null ? !datelastedit.equals(that.datelastedit) : that.datelastedit != null) return false;
        if (lasteditorid != null ? !lasteditorid.equals(that.lasteditorid) : that.lasteditorid != null) return false;
        if (ownerid != null ? !ownerid.equals(that.ownerid) : that.ownerid != null) return false;
        if (dateend != null ? !dateend.equals(that.dateend) : that.dateend != null) return false;
        if (datestart != null ? !datestart.equals(that.datestart) : that.datestart != null) return false;
        if (districtcode != null ? !districtcode.equals(that.districtcode) : that.districtcode != null) return false;
        if (districtname != null ? !districtname.equals(that.districtname) : that.districtname != null) return false;
        if (localitycode != null ? !localitycode.equals(that.localitycode) : that.localitycode != null) return false;
        if (localityname != null ? !localityname.equals(that.localityname) : that.localityname != null) return false;
        if (psoato != null ? !psoato.equals(that.psoato) : that.psoato != null) return false;
        if (regioncode != null ? !regioncode.equals(that.regioncode) : that.regioncode != null) return false;
        if (regionname != null ? !regionname.equals(that.regionname) : that.regionname != null) return false;
        if (soato != null ? !soato.equals(that.soato) : that.soato != null) return false;
        if (sovetcode != null ? !sovetcode.equals(that.sovetcode) : that.sovetcode != null) return false;
        if (sovetname != null ? !sovetname.equals(that.sovetname) : that.sovetname != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (datecreate != null ? datecreate.hashCode() : 0);
        result = 31 * result + (datelastedit != null ? datelastedit.hashCode() : 0);
        result = 31 * result + (lasteditorid != null ? lasteditorid.hashCode() : 0);
        result = 31 * result + (ownerid != null ? ownerid.hashCode() : 0);
        result = 31 * result + (dateend != null ? dateend.hashCode() : 0);
        result = 31 * result + (datestart != null ? datestart.hashCode() : 0);
        result = 31 * result + (districtcode != null ? districtcode.hashCode() : 0);
        result = 31 * result + (districtname != null ? districtname.hashCode() : 0);
        result = 31 * result + (localitycode != null ? localitycode.hashCode() : 0);
        result = 31 * result + (localityname != null ? localityname.hashCode() : 0);
        result = 31 * result + (psoato != null ? psoato.hashCode() : 0);
        result = 31 * result + (regioncode != null ? regioncode.hashCode() : 0);
        result = 31 * result + (regionname != null ? regionname.hashCode() : 0);
        result = 31 * result + (soato != null ? soato.hashCode() : 0);
        result = 31 * result + (sovetcode != null ? sovetcode.hashCode() : 0);
        result = 31 * result + (sovetname != null ? sovetname.hashCode() : 0);
        return result;
    }
}
