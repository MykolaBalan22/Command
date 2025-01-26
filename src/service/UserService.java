package service;

import model.User;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

public class UserService {

    private List<User> Employees;

    public UserService(List<User> employees) {
        Employees = employees;
    }

    public void addEmployee(User employee) {
        try {
            this.Employees.add(employee);
        } catch (Exception e) {
            System.out.println("bontoy internal error");
        }
    }

    public static void serialiazeToJson(User currentUser) throws IOException {

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("\\C:\\Users\\Nikola\\Desktop\\test.txt"));
        objectOutputStream.writeObject(currentUser);
        objectOutputStream.flush();
        objectOutputStream.close();
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
