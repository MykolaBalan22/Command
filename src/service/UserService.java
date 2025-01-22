package service;

import model.User;

import java.util.List;

public class UserService {

    private List<User> Employees;

    public void addEmployee(User employee){
        try {
            this.Employees.add(employee);
        } catch (Exception e) {
            System.out.println("bontoy internal error");
        }
    }

    public UserService(List<User> employees) {
        Employees = employees;
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
