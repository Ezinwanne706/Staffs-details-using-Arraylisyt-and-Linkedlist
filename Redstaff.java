public class Redstaff{
    private int staffId;
    private int staffAge;
    private String staffName;
    private String staffEmail;

    public Redstaff(int id, int age, String name, String email){
        this.staffId = id;
        this.staffAge = age;
        this.staffName = name;
        this.staffEmail = email;
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

    public String getStaffEmail() {
        return staffEmail;
    }

    public void setStaffEmail(String staffEmail) {
        this.staffEmail = staffEmail;
    }

    @Override
    public String toString() {
        return "Redstaff [staffId=" + staffId + ", staffAge=" + staffAge + ", staffName=" + staffName + ", staffEmail="
                + staffEmail + "]";
    }
    


}