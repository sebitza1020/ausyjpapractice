package Entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "[jobcategories]")
public class JobCategories {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "[idjobcategories]")
    private int id;
    @Column(name = "[name_jobs]")
    private String name;
    @OneToMany(mappedBy = "jobCategories")
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
        return "Id: " + id + ", Job: " + name;
    }
}
