package MAIN;

import Entity.Department;
import Entity.Employee;
import Entity.JobCategories;
import com.oracle.deploy.update.Updater;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("my-pu");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        Department department = new Department();
        JobCategories jobCategories = new JobCategories();
        Employee employee = new Employee();
        List<Employee> employees = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Scanner sc3 = new Scanner(System.in);
        Scanner sc4 = new Scanner(System.in);
        Scanner sc5 = new Scanner(System.in);

        while (true) {
            System.out.println("Choose an action: 1.Insert, 2.Update, 3.Delete, 4.Show all, 5.Select, 6.Exit");
            int option = sc.nextInt();

            switch (option) {
                case 1:
                    System.out.println("What do you want to insert? 1.Employee, 2.Department, 3.Job Category");
                    int option1 = sc.nextInt();
                    switch (option1) {
                        case 1:
                            System.out.println("First name: ");
                            String firstName = sc2.nextLine();
                            employee.setFirstName(firstName);
                            System.out.println("Last name: ");
                            String lastName = sc2.nextLine();
                            employee.setLastName(lastName);
                            System.out.println("Job ID: ");
                            int jobId = sc2.nextInt();
                            jobCategories.setId(jobId);
                            employee.setJobCategories(jobCategories);
                            System.out.println("Department ID: ");
                            int departmentId = sc2.nextInt();
                            department.setId(departmentId);
                            employee.setDepartment(department);
                            System.out.println("Is he/she manager?");
                            boolean isManager = sc2.nextBoolean();
                            employee.setManager(isManager);
                            LocalDateTime startDate = LocalDateTime.now();
                            employee.setStartDate(startDate);
                            System.out.println("Is he/she active?");
                            boolean isActive = sc2.nextBoolean();
                            employee.setActive(isActive);
                            System.out.println("Address: ");
                            String address = sc3.nextLine();
                            employee.setAddress(address);
                            System.out.println("Postal code: ");
                            int cp = sc3.nextInt();
                            employee.setCP(cp);
                            System.out.println("Telephone number: ");
                            String telephone = sc4.nextLine();
                            employee.setTelephone(telephone);
                            System.out.println("Email: ");
                            String email = sc4.nextLine();
                            employee.setEmail(email);
                            System.out.println("Birthday: (year-month-day)");
                            int year = sc4.nextInt();
                            int month = sc4.nextInt();
                            int day = sc4.nextInt();
                            LocalDate birthday = LocalDate.of(year, month, day);
                            employee.setBirthday(birthday);
                            System.out.println("No. of children: ");
                            int noChildren = sc4.nextInt();
                            employee.setNoChildren(noChildren);
                            System.out.println("Salary: ");
                            double salary = sc4.nextDouble();
                            employee.setSalary(salary);
                            System.out.println("Studies: ");
                            String studies = sc5.nextLine();
                            employee.setStudies(studies);
                            System.out.println("Social security number: ");
                            String ssn = sc5.nextLine();
                            employee.setSocialSecurityNumber(ssn);
                            System.out.println("Has he/she got a driving license?");
                            boolean hdl = sc5.nextBoolean();
                            employee.setHasDrivingLicense(hdl);
                            employees.add(employee);
                            entityTransaction.begin();
                            entityManager.persist(employee);
                            entityTransaction.commit();
                            break;
                        case 2:
                            System.out.println("Name of department: ");
                            String dept = sc2.nextLine();
                            department.setName(dept);
                            entityTransaction.begin();
                            entityManager.persist(department);
                            entityTransaction.commit();
                            break;
                        case 3:
                            System.out.println("Name of job: ");
                            String job = sc2.nextLine();
                            jobCategories.setName(job);
                            entityTransaction.begin();
                            entityManager.persist(jobCategories);
                            entityTransaction.commit();
                            break;
                    }
                    break;
                case 2:
                    System.out.println("What do you want to update? 1.Employee, 2.Department, 3.Job Category");
                    int option2 = sc.nextInt();
                    switch (option2) {
                        case 1:
                            System.out.println("Choose your employee's ID: ");
                            int idEmployeeChooser = sc2.nextInt();
                            Employee employeeUpdater = entityManager.find(Employee.class, idEmployeeChooser);
                            System.out.println("What do you want to update? 1.ID, 2.First Name, 3.Last Name,\n" +
                                    "4.Job, 5.Department, 6.Manager, 7.Start Date, 8.End Date,\n" +
                                    "9.Active, 10.Address, 11.CP, 12.Telephone, 13.Email,\n" +
                                    "14.Birthday, 15.No. Children, 16.Salary, 17.Studies,\n" +
                                    "18.Social Security Number, 19. Driving License");
                            int option21 = sc.nextInt();
                            switch (option21) {
                                case 1:
                                    System.out.println("Change Id: ");
                                    int idUpdater = sc2.nextInt();
                                    entityTransaction.begin();
                                    employeeUpdater.setId(idUpdater);
                                    entityTransaction.commit();
                                    break;
                                case 2:
                                    System.out.println("Change first name: ");
                                    String firstNameUpdater = sc3.nextLine();
                                    entityTransaction.begin();
                                    employeeUpdater.setFirstName(firstNameUpdater);
                                    entityTransaction.commit();
                                    break;
                                case 3:
                                    System.out.println("Change last name: ");
                                    String lastNameUpdater = sc3.nextLine();
                                    entityTransaction.begin();
                                    employeeUpdater.setLastName(lastNameUpdater);
                                    entityTransaction.commit();
                                    break;
                                case 4:
                                    System.out.println("Change job:(Id) ");
                                    int jobUpdater = sc2.nextInt();
                                    entityTransaction.begin();
                                    jobCategories.setId(jobUpdater);
                                    employeeUpdater.setJobCategories(jobCategories);
                                    entityTransaction.commit();
                                    break;
                                case 5:
                                    System.out.println("Change department:(Id) ");
                                    int deptUpdater = sc2.nextInt();
                                    entityTransaction.begin();
                                    department.setId(deptUpdater);
                                    employeeUpdater.setDepartment(department);
                                    entityTransaction.commit();
                                    break;
                                case 6:
                                    System.out.println("Change manager status: ");
                                    boolean managerUpdater = sc2.nextBoolean();
                                    entityTransaction.begin();
                                    employeeUpdater.setManager(managerUpdater);
                                    entityTransaction.commit();
                                    break;
                                case 7:
                                    System.out.println("Change start date: ");
                                    int year = sc3.nextInt(); int month = sc3.nextInt(); int day = sc3.nextInt();
                                    int hour = sc3.nextInt(); int minute = sc3.nextInt();
                                    LocalDateTime startDateUpdater = LocalDateTime.of(year, month, day, hour, minute);
                                    entityTransaction.begin();
                                    employeeUpdater.setStartDate(startDateUpdater);
                                    entityTransaction.commit();
                                    break;
                                case 8:
                                    System.out.println("End date: ");
                                    int yearE = sc3.nextInt(); int monthE = sc3.nextInt(); int dayE = sc3.nextInt();
                                    int hourE = sc3.nextInt(); int minuteE = sc3.nextInt();
                                    LocalDateTime endDateUpdater = LocalDateTime.of(yearE, monthE, dayE, hourE, minuteE);
                                    entityTransaction.begin();
                                    employeeUpdater.setEndDate(endDateUpdater);
                                    entityTransaction.commit();
                                    break;
                                case 9:
                                    System.out.println("Change activity status: ");
                                    boolean activeUpdater = sc2.nextBoolean();
                                    entityTransaction.begin();
                                    employeeUpdater.setActive(activeUpdater);
                                    entityTransaction.commit();
                                    break;
                                case 10:
                                    System.out.println("Change address: ");
                                    String addressUpdater = sc3.nextLine();
                                    entityTransaction.begin();
                                    employeeUpdater.setAddress(addressUpdater);
                                    entityTransaction.commit();
                                    break;
                                case 11:
                                    System.out.println("Change postal code: ");
                                    int cpUpdater = sc2.nextInt();
                                    entityTransaction.begin();
                                    employeeUpdater.setCP(cpUpdater);
                                    entityTransaction.commit();
                                    break;
                                case 12:
                                    System.out.println("Change telephone: ");
                                    String phoneUpdater = sc3.nextLine();
                                    entityTransaction.begin();
                                    employeeUpdater.setTelephone(phoneUpdater);
                                    entityTransaction.commit();
                                    break;
                                case 13:
                                    System.out.println("Change email: ");
                                    String emailUpdater = sc3.nextLine();
                                    entityTransaction.begin();
                                    employeeUpdater.setEmail(emailUpdater);
                                    entityTransaction.commit();
                                    break;
                                case 14:
                                    System.out.println("Change birthday: ");
                                    int yearB = sc3.nextInt(); int monthB = sc3.nextInt(); int dayB = sc3.nextInt();
                                    LocalDate birthdayUpdater = LocalDate.of(yearB, monthB, dayB);
                                    entityTransaction.begin();
                                    employeeUpdater.setBirthday(birthdayUpdater);
                                    entityTransaction.commit();
                                    break;
                                case 15:
                                    System.out.println("Change no. of children: ");
                                    int noChildrenUpdater = sc2.nextInt();
                                    entityTransaction.begin();
                                    employeeUpdater.setNoChildren(noChildrenUpdater);
                                    entityTransaction.commit();
                                    break;
                                case 16:
                                    System.out.println("Change salary: ");
                                    double salaryUpdater = sc4.nextDouble();
                                    entityTransaction.begin();
                                    employeeUpdater.setSalary(salaryUpdater);
                                    entityTransaction.commit();
                                    break;
                                case 17:
                                    System.out.println("Change study: ");
                                    String studiesUpdater = sc3.nextLine();
                                    entityTransaction.begin();
                                    employeeUpdater.setStudies(studiesUpdater);
                                    entityTransaction.commit();
                                    break;
                                case 18:
                                    System.out.println("Change social security number: ");
                                    String ssnUpdater = sc3.nextLine();
                                    entityTransaction.begin();
                                    employeeUpdater.setSocialSecurityNumber(ssnUpdater);
                                    entityTransaction.commit();
                                    break;
                                case 19:
                                    System.out.println("Change driving license status: ");
                                    boolean hdlUpdater = sc2.nextBoolean();
                                    entityTransaction.begin();
                                    employeeUpdater.setHasDrivingLicense(hdlUpdater);
                                    entityTransaction.commit();
                                    break;
                            }
                            break;
                        case 2:
                            System.out.println("Choose the department's ID: ");
                            int idDepartmentChooser = sc2.nextInt();
                            Department departmentUpdater = entityManager.find(Department.class, idDepartmentChooser);
                            System.out.println("What do you want to update? 1.ID, 2.Department's Name");
                            int option22 = sc2.nextInt();
                            switch (option22) {
                                case 1:
                                    System.out.println("Change Id: ");
                                    int idUpdater = sc2.nextInt();
                                    entityTransaction.begin();
                                    departmentUpdater.setId(idUpdater);
                                    entityTransaction.commit();
                                    break;
                                case 2:
                                    System.out.println("Change department's name: ");
                                    String nameUpdater = sc3.nextLine();
                                    entityTransaction.begin();
                                    departmentUpdater.setName(nameUpdater);
                                    entityTransaction.commit();
                                    break;
                            }
                            break;
                        case 3:
                            System.out.println("Choose the job's ID: ");
                            int idJobCategoryChooser = sc2.nextInt();
                            JobCategories jobCategoriesUpdater = entityManager.find(JobCategories.class, idJobCategoryChooser);
                            System.out.println("What do you want to update? 1.ID, 2.Job's Name");
                            int option23 = sc2.nextInt();
                            switch (option23) {
                                case 1:
                                    System.out.println("Change Id: ");
                                    int idUpdater = sc2.nextInt();
                                    entityTransaction.begin();
                                    jobCategoriesUpdater.setId(idUpdater);
                                    entityTransaction.commit();
                                    break;
                                case 2:
                                    System.out.println("Change job's name: ");
                                    String nameUpdater = sc3.nextLine();
                                    entityTransaction.begin();
                                    jobCategoriesUpdater.setName(nameUpdater);
                                    entityTransaction.commit();
                                    break;
                            }
                            break;
                    }
                    break;
                case 3:
                    System.out.println("What do you want to delete? 1.Employee, 2.Department, 3.Job Category");
                    int option3 = sc.nextInt();
                    switch (option3) {
                        case 1:
                            System.out.println("Choose your employee's ID: ");
                            int idEmployeeChooser = sc2.nextInt();
                            Employee employeeRemover = entityManager.find(Employee.class, idEmployeeChooser);
                            entityTransaction.begin();
                            entityManager.remove(employeeRemover);
                            entityTransaction.commit();
                            System.out.println("The employee is gone now.");
                            break;
                        case 2:
                            System.out.println("Choose the department's ID: ");
                            int idDepartmentChooser = sc2.nextInt();
                            Department departmentRemover = entityManager.find(Department.class, idDepartmentChooser);
                            entityTransaction.begin();
                            entityManager.remove(departmentRemover);
                            entityTransaction.commit();
                            System.out.println("The department is now disbanded.");
                            break;
                        case 3:
                            System.out.println("Choose the job's ID: ");
                            int idJobChooser = sc2.nextInt();
                            JobCategories jobCategoriesRemover = entityManager.find(JobCategories.class, idJobChooser);
                            entityTransaction.begin();
                            entityManager.remove(jobCategoriesRemover);
                            entityTransaction.commit();
                            System.out.println("The job is now disbanded.");
                            break;
                    }
                    break;
                case 4:
                    System.out.println("What do you want to show all? 1.Employees, 2.Departments, 3.Job Categories");
                    int option4 = sc.nextInt();
                    switch (option4) {
                        case 1:
                            List<Employee> result1 = entityManager.createQuery("from Employee", Employee.class).getResultList();
                            for (Employee employeeResult : result1) {
                                System.out.println(employeeResult.toString());

                            }
                            break;
                        case 2:
                            List<Department> result2 = entityManager.createQuery("from Department", Department.class).getResultList();
                            for (Department departmentResult : result2) {
                                System.out.println(departmentResult.toString());
                            }
                            break;
                        case 3:
                            List<JobCategories> result3 = entityManager.createQuery("from JobCategories", JobCategories.class).getResultList();
                            for (JobCategories jobResult : result3) {
                                System.out.println(jobResult.toString());
                            }
                            break;
                    }
                    break;
                case 5:
                    System.out.println("What do you want to select? 1.Employee, 2.Department, 3.Job Category");
                    int option5 = sc.nextInt();
                    switch (option5) {
                        case 1:
                            System.out.println("Choose your employee's ID: ");
                            int idEmployeeChooser = sc2.nextInt();
                            Employee result1 = entityManager.find(Employee.class, idEmployeeChooser);
                            System.out.println(result1.toString());
                            break;
                        case 2:
                            System.out.println("Choose the department's ID: ");
                            int idDepartmentChooser = sc2.nextInt();
                            Department result2 = entityManager.find(Department.class, idDepartmentChooser);
                            System.out.println(result2.toString());
                            break;
                        case 3:
                            System.out.println("Choose the job's ID: ");
                            int idJobChooser = sc2.nextInt();
                            JobCategories result3 = entityManager.find(JobCategories.class, idJobChooser);
                            System.out.println(result3.toString());
                            break;
                    }
                    break;
                case 6:
                    entityManager.close();
                    System.exit(0);
                    break;
            }
        }
    }
}
