package Entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "[employee]")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "[idemployee]")
    private int id;
    @Column(name = "[firstName]")
    private String firstName;
    @Column(name = "[lastName]")
    private String lastName;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "[jobCategoryId]")
    private JobCategories jobCategories;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "[departmentId]")
    private Department department;
    @Column(name = "[isManager]")
    private boolean isManager;
    @Column(name = "[startDate]")
    private LocalDateTime startDate;
    @Column(name = "[endDate]")
    private LocalDateTime endDate;
    @Column(name = "[active]")
    private boolean active;
    @Column(name = "[address]")
    private String address;
    @Column(name = "[CP]")
    private int CP;
    @Column(name = "[telephone]")
    private String telephone;
    @Column(name = "[email]")
    private String email;
    @Column(name = "birthday")
    private LocalDate birthday;
    @Column(name = "[noChildren]")
    private int noChildren;
    @Column(name = "[salary]")
    private double salary;
    @Column(name = "[studies]")
    private String studies;
    @Column(name = "[socialSecurityNumber]")
    private String socialSecurityNumber;
    @Column(name = "[hasDrivingLicense]")
    private boolean hasDrivingLicense;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public JobCategories getJobCategories() {
        return jobCategories;
    }

    public void setJobCategories(JobCategories jobCategories) {
        this.jobCategories = jobCategories;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public boolean isManager() {
        return isManager;
    }

    public void setManager(boolean manager) {
        isManager = manager;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCP() {
        return CP;
    }

    public void setCP(int CP) {
        this.CP = CP;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public int getNoChildren() {
        return noChildren;
    }

    public void setNoChildren(int noChildren) {
        this.noChildren = noChildren;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public boolean isHasDrivingLicense() {
        return hasDrivingLicense;
    }

    public void setHasDrivingLicense(boolean hasDrivingLicense) {
        this.hasDrivingLicense = hasDrivingLicense;
    }

    public String getStudies() {
        return studies;
    }

    public void setStudies(String studies) {
        this.studies = studies;
    }

    @Override
    public String toString() {
        return "Id: " + id + ", \nFirst Name: " + firstName + ", \nLast Name: " + lastName + ", \nJob: " + jobCategories.getName()
                + ", \nDepartment: " + department.getName() + ", \nManager: " + isManager + ", \nStart Date: "
                + startDate + ", \nEnd Date: " + endDate + ", \nActive: " + active + ", \nAddress: " + address + ", \nPostal Code: "
                + CP + ", \nTelephone: " + telephone + ", \nEmail: " + email + ", \nBirthday: " + birthday + ", \nNo. Children: "
                + noChildren + ", \nSalary: " + salary + ", \nStudies: " + studies + ", \nSocial Security Number: "
                + socialSecurityNumber + ", \nDriving License: " + hasDrivingLicense;
    }
}
