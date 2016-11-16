package ru.tpu.recgen.entity;

import ru.tpu.recgen.dao.DaoException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static ru.tpu.recgen.dao.JdbcDaoFactory.createConnection;
import static ru.tpu.recgen.dao.JdbcDaoFactory.freeConnection;

public class RecGen {
    private int recNum;

    public RecGen(int recNum) {
        this.recNum = recNum;
    }

    public int getRecNum() {
        return recNum;
    }

    public void setRecNum(int recNum) {
        this.recNum = recNum;
    }

    public void generate() {
        ResultSet resultSet;
        int min = 1;
        int max = 9;
        PreparedStatement preparedStatement;
        Connection connection = createConnection();
        try {
            for (int i = 0; i < recNum; i++) {
                preparedStatement = connection.prepareStatement("SELECT FIRST_NAME FROM FIRST_NAME WHERE ID = ?");
                int random = min + (int) (Math.random() * ((max - min) + 1));
                preparedStatement.setLong(1, random);
                resultSet = preparedStatement.executeQuery();
                resultSet.next();
                String firstName = resultSet.getString("FIRST_NAME");

                preparedStatement = connection.prepareStatement("SELECT MIDDLE_NAME FROM MIDDLE_NAME WHERE ID = ?");
                random = min + (int) (Math.random() * ((max - min) + 1));
                preparedStatement.setLong(1, random);
                resultSet = preparedStatement.executeQuery();
                resultSet.next();
                String middleName = resultSet.getString("MIDDLE_NAME");

                preparedStatement = connection.prepareStatement("SELECT LAST_NAME FROM LAST_NAME WHERE ID = ?");
                random = min + (int) (Math.random() * ((max - min) + 1));
                preparedStatement.setLong(1, random);
                resultSet = preparedStatement.executeQuery();
                resultSet.next();
                String lastName = resultSet.getString("LAST_NAME");

                Author author = new Author(firstName, middleName, lastName);
                System.out.println(author);
            }
        } catch (SQLException e) {
            throw new DaoException(e);
        } finally {
            freeConnection(connection);
        }
    }
}
