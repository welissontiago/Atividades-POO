package Entites;

public class arrayAtv {

    private Integer id;
    private String name;
    private Double salary;

    public arrayAtv(Integer id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void increaseSalary(double percentual) {
        salary += salary * percentual / 100; 
    }

    @Override
    public String toString() {
        return id + ", " + name + ", " + salary;
    }
}

