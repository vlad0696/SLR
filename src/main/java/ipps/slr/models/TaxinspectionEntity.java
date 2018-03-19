package ipps.slr.models;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Gramovich_V on 15.03.2018.
 */
@Entity
@Table(name = "taxinspection", schema = "sisslr", catalog = "slr")
public class TaxinspectionEntity {
    private long id;
    private Timestamp datecreate;
    private Timestamp datelastedit;
    private Long lasteditorid;
    private Long ownerid;
    private Timestamp dateend;
    private Timestamp datestart;
    private Long codetaxinspection;
    private String fio;
    private String mail;
    private String name;
    private String numberphone;
    private String unp;

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
    @Column(name = "codetaxinspection", nullable = true)
    public Long getCodetaxinspection() {
        return codetaxinspection;
    }

    public void setCodetaxinspection(Long codetaxinspection) {
        this.codetaxinspection = codetaxinspection;
    }

    @Basic
    @Column(name = "fio", nullable = true, length = 255)
    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    @Basic
    @Column(name = "mail", nullable = true, length = 255)
    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Basic
    @Column(name = "name", nullable = true, length = 512)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "numberphone", nullable = true, length = 15)
    public String getNumberphone() {
        return numberphone;
    }

    public void setNumberphone(String numberphone) {
        this.numberphone = numberphone;
    }

    @Basic
    @Column(name = "unp", nullable = true, length = 9)
    public String getUnp() {
        return unp;
    }

    public void setUnp(String unp) {
        this.unp = unp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TaxinspectionEntity that = (TaxinspectionEntity) o;

        if (id != that.id) return false;
        if (datecreate != null ? !datecreate.equals(that.datecreate) : that.datecreate != null) return false;
        if (datelastedit != null ? !datelastedit.equals(that.datelastedit) : that.datelastedit != null) return false;
        if (lasteditorid != null ? !lasteditorid.equals(that.lasteditorid) : that.lasteditorid != null) return false;
        if (ownerid != null ? !ownerid.equals(that.ownerid) : that.ownerid != null) return false;
        if (dateend != null ? !dateend.equals(that.dateend) : that.dateend != null) return false;
        if (datestart != null ? !datestart.equals(that.datestart) : that.datestart != null) return false;
        if (codetaxinspection != null ? !codetaxinspection.equals(that.codetaxinspection) : that.codetaxinspection != null)
            return false;
        if (fio != null ? !fio.equals(that.fio) : that.fio != null) return false;
        if (mail != null ? !mail.equals(that.mail) : that.mail != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (numberphone != null ? !numberphone.equals(that.numberphone) : that.numberphone != null) return false;
        if (unp != null ? !unp.equals(that.unp) : that.unp != null) return false;

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
        result = 31 * result + (codetaxinspection != null ? codetaxinspection.hashCode() : 0);
        result = 31 * result + (fio != null ? fio.hashCode() : 0);
        result = 31 * result + (mail != null ? mail.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (numberphone != null ? numberphone.hashCode() : 0);
        result = 31 * result + (unp != null ? unp.hashCode() : 0);
        return result;
    }
}
