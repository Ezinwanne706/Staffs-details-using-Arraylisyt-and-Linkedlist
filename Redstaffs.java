public class Redstaffs{
    private int staffId;
    private int staffAge;
    private String staffName;
    private String staffEmial;

    public Redstaffs(int id, int age, String name, String email){
        this.staffId = id;
        this.staffAge = age;
        this.staffName = name;
        this.staffEmial = email;
    }

    public int getStaffId() {
        return staffId;
    }

    public void setStaffId(int staffId) {
        this.staffId = staffId;
    }

    public int getStaffAge() {
        return staffAge;
    }

    public void setStaffAge(int staffAge) {
        this.staffAge = staffAge;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public String getStaffEmial() {
        return staffEmial;
    }

    public void setStaffEmial(String staffEmial) {
        this.staffEmial = staffEmial;
    }

    @Override
    public String toString() {
        return "Redstaffs [staffId=" + staffId + ", staffAge=" + staffAge + ", staffName=" + staffName + ", staffEmial="
                + staffEmial + "]";
    }
    

    
}