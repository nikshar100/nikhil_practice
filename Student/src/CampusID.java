public class CampusID {

    private String idName;
    private long schoolID;
    private Address studentAddress;
    private Department department;

    public CampusID(String idName, long schoolID, Address studentAddress, Department department) {
        this.idName = idName;
        this.schoolID = schoolID;
        this.studentAddress = studentAddress;
        this.department = department;
    }

    public String getIdName() {
        return idName;
    }

    public void setIdName(String idName) {
        this.idName = idName;
    }

    public long getSchoolID() {
        return schoolID;
    }

    public void setSchoolID(long schoolID) {
        this.schoolID = schoolID;
    }

    public Address getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(Address studentAddress) {
        this.studentAddress = studentAddress;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public void showID() {
        System.out.printf("" +
                "Name: %s\n" +
                "School ID: %d\n" +
                "Department: %s\n" +
                "Address: %s", idName, schoolID, department, getStudentAddress().toString());
    }
}
