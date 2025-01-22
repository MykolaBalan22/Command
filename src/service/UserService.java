package service;

import model.User;

import java.util.Set;

public class UserService {

    private List<User> Employees;

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
