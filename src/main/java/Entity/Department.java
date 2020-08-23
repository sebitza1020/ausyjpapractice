package Entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "[departments]")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "[iddepartments]")
    private int id;
    @Column(name = "[name_departments]")
    private String name;
    @OneToMany(mappedBy = "department")
    private List<Employee> employees;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public String toString() {
        return "Id: " + id + ", Department: " + name;
    }
}
