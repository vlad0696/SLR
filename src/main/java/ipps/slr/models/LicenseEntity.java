package ipps.slr.models;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Gramovich_V on 15.03.2018.
 */
@Entity
@Table(name = "license", schema = "sisslr", catalog = "slr")
public class LicenseEntity {
    private long id;
    private Timestamp datecreate;
    private Timestamp datelastedit;
    private Long lasteditorid;
    private Long ownerid;
    private Timestamp dateend;
    private Timestamp datestart;
    private String advancedrequests;
    private String electronicnumber;
    private String numberdesicion;
    private String numberform;
    private Integer registernumber;
    private Long unpegr;

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
    @Column(name = "advancedrequests", nullable = true, length = -1)
    public String getAdvancedrequests() {
        return advancedrequests;
    }

    public void setAdvancedrequests(String advancedrequests) {
        this.advancedrequests = advancedrequests;
    }

    @Basic
    @Column(name = "electronicnumber", nullable = true, length = 255)
    public String getElectronicnumber() {
        return electronicnumber;
    }

    public void setElectronicnumber(String electronicnumber) {
        this.electronicnumber = electronicnumber;
    }

    @Basic
    @Column(name = "numberdesicion", nullable = true, length = 255)
    public String getNumberdesicion() {
        return numberdesicion;
    }

    public void setNumberdesicion(String numberdesicion) {
        this.numberdesicion = numberdesicion;
    }

    @Basic
    @Column(name = "numberform", nullable = true, length = 255)
    public String getNumberform() {
        return numberform;
    }

    public void setNumberform(String numberform) {
        this.numberform = numberform;
    }

    @Basic
    @Column(name = "registernumber", nullable = true)
    public Integer getRegisternumber() {
        return registernumber;
    }

    public void setRegisternumber(Integer registernumber) {
        this.registernumber = registernumber;
    }

    @Basic
    @Column(name = "unpegr", nullable = true)
    public Long getUnpegr() {
        return unpegr;
    }

    public void setUnpegr(Long unpegr) {
        this.unpegr = unpegr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LicenseEntity that = (LicenseEntity) o;

        if (id != that.id) return false;
        if (datecreate != null ? !datecreate.equals(that.datecreate) : that.datecreate != null) return false;
        if (datelastedit != null ? !datelastedit.equals(that.datelastedit) : that.datelastedit != null) return false;
        if (lasteditorid != null ? !lasteditorid.equals(that.lasteditorid) : that.lasteditorid != null) return false;
        if (ownerid != null ? !ownerid.equals(that.ownerid) : that.ownerid != null) return false;
        if (dateend != null ? !dateend.equals(that.dateend) : that.dateend != null) return false;
        if (datestart != null ? !datestart.equals(that.datestart) : that.datestart != null) return false;
        if (advancedrequests != null ? !advancedrequests.equals(that.advancedrequests) : that.advancedrequests != null)
            return false;
        if (electronicnumber != null ? !electronicnumber.equals(that.electronicnumber) : that.electronicnumber != null)
            return false;
        if (numberdesicion != null ? !numberdesicion.equals(that.numberdesicion) : that.numberdesicion != null)
            return false;
        if (numberform != null ? !numberform.equals(that.numberform) : that.numberform != null) return false;
        if (registernumber != null ? !registernumber.equals(that.registernumber) : that.registernumber != null)
            return false;
        if (unpegr != null ? !unpegr.equals(that.unpegr) : that.unpegr != null) return false;

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
        result = 31 * result + (advancedrequests != null ? advancedrequests.hashCode() : 0);
        result = 31 * result + (electronicnumber != null ? electronicnumber.hashCode() : 0);
        result = 31 * result + (numberdesicion != null ? numberdesicion.hashCode() : 0);
        result = 31 * result + (numberform != null ? numberform.hashCode() : 0);
        result = 31 * result + (registernumber != null ? registernumber.hashCode() : 0);
        result = 31 * result + (unpegr != null ? unpegr.hashCode() : 0);
        return result;
    }
    @Override
    public  String toString(){
        return  getUnpegr().toString();
    }
}
