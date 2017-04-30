package bean;

import javax.persistence.*;

/**
 * Created by Administrator on 2017/4/30.
 */
@Entity
public class Camer {
    private int camId;
    private String camIdentity;
    private String camJob;
    private String camWeapon;
    private String camType;
    private String camStyle;
    private String camPresent;
    private String camHome;
    private String camPic;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cam_id", nullable = false)
    public int getCamId() {
        return camId;
    }

    public void setCamId(int camId) {
        this.camId = camId;
    }

    @Basic
    @Column(name = "cam_identity", nullable = true, length = 20)
    public String getCamIdentity() {
        return camIdentity;
    }

    public void setCamIdentity(String camIdentity) {
        this.camIdentity = camIdentity;
    }

    @Basic
    @Column(name = "cam_job", nullable = true, length = 20)
    public String getCamJob() {
        return camJob;
    }

    public void setCamJob(String camJob) {
        this.camJob = camJob;
    }

    @Basic
    @Column(name = "cam_weapon", nullable = true, length = 100)
    public String getCamWeapon() {
        return camWeapon;
    }

    public void setCamWeapon(String camWeapon) {
        this.camWeapon = camWeapon;
    }

    @Basic
    @Column(name = "cam_type", nullable = true, length = 50)
    public String getCamType() {
        return camType;
    }

    public void setCamType(String camType) {
        this.camType = camType;
    }

    @Basic
    @Column(name = "cam_style", nullable = true, length = 100)
    public String getCamStyle() {
        return camStyle;
    }

    public void setCamStyle(String camStyle) {
        this.camStyle = camStyle;
    }

    @Basic
    @Column(name = "cam_present", nullable = true, length = 500)
    public String getCamPresent() {
        return camPresent;
    }

    public void setCamPresent(String camPresent) {
        this.camPresent = camPresent;
    }

    @Basic
    @Column(name = "cam_home", nullable = true, length = 100)
    public String getCamHome() {
        return camHome;
    }

    public void setCamHome(String camHome) {
        this.camHome = camHome;
    }

    @Basic
    @Column(name = "cam_pic", nullable = true, length = 100)
    public String getCamPic() {
        return camPic;
    }

    public void setCamPic(String camPic) {
        this.camPic = camPic;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Camer camer = (Camer) o;

        if (camId != camer.camId) return false;
        if (camIdentity != null ? !camIdentity.equals(camer.camIdentity) : camer.camIdentity != null) return false;
        if (camJob != null ? !camJob.equals(camer.camJob) : camer.camJob != null) return false;
        if (camWeapon != null ? !camWeapon.equals(camer.camWeapon) : camer.camWeapon != null) return false;
        if (camType != null ? !camType.equals(camer.camType) : camer.camType != null) return false;
        if (camStyle != null ? !camStyle.equals(camer.camStyle) : camer.camStyle != null) return false;
        if (camPresent != null ? !camPresent.equals(camer.camPresent) : camer.camPresent != null) return false;
        if (camHome != null ? !camHome.equals(camer.camHome) : camer.camHome != null) return false;
        if (camPic != null ? !camPic.equals(camer.camPic) : camer.camPic != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = camId;
        result = 31 * result + (camIdentity != null ? camIdentity.hashCode() : 0);
        result = 31 * result + (camJob != null ? camJob.hashCode() : 0);
        result = 31 * result + (camWeapon != null ? camWeapon.hashCode() : 0);
        result = 31 * result + (camType != null ? camType.hashCode() : 0);
        result = 31 * result + (camStyle != null ? camStyle.hashCode() : 0);
        result = 31 * result + (camPresent != null ? camPresent.hashCode() : 0);
        result = 31 * result + (camHome != null ? camHome.hashCode() : 0);
        result = 31 * result + (camPic != null ? camPic.hashCode() : 0);
        return result;
    }
}
