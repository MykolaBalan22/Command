package service;

import model.User;

import java.util.Set;

public class UserService {

    private List<User> Employees;

    public void addEmployee(User employee){
        try {
            this.Employees.add(employee);
        } catch (Exception e) {
            System.out.println("git hub error");
        }
    }

    @Override
    public String toString() {
        return "UserService{" +
                "Employees=" + Employees +
                '}';
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
