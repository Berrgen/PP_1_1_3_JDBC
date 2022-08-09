package jm.task.core.jdbc.service;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;
import java.util.List;

public class UserServiceImpl implements UserService {
    UserDao operationOnUsersTable = new UserDaoJDBCImpl();

    public void createUsersTable() {
        operationOnUsersTable.createUsersTable();
    }

    public void dropUsersTable() {
        operationOnUsersTable.dropUsersTable();
    }

    public void saveUser(String name, String lastName, byte age) {
        operationOnUsersTable.saveUser(name, lastName, age);
    }

    public void removeUserById(long id) {
        operationOnUsersTable.removeUserById(id);
    }

    public List<User> getAllUsers() {
        return operationOnUsersTable.getAllUsers();
    }

    public void cleanUsersTable() {
        operationOnUsersTable.cleanUsersTable();
    }
}
