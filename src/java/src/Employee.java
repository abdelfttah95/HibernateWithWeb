package src;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.TableGenerator;

/**
 *
 * @author abdel
 */
@Entity
public class Employee {
    private int imployeeId;
    private String firstName, lastName, position, salary;

@Id
@TableGenerator(allocationSize = 1, initialValue = 1, name = "de")
@GeneratedValue(strategy = GenerationType.TABLE, generator = "de")
    public int getImployeeId() {
        return imployeeId;
    }

    public void setImployeeId(int imployeeId) {
        this.imployeeId = imployeeId;
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

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }
    
    
}
