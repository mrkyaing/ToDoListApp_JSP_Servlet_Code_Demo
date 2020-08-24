package com.prodev.Dao;

import java.sql.SQLException;
import java.util.List;

import com.prodev.entity.TodoEntity;



public interface ITodoDao {

	void insertTodo(TodoEntity todo) throws SQLException;

	TodoEntity selectTodo(long todoId);

	List<TodoEntity> selectAllTodos();

	boolean deleteTodo(int id) throws SQLException;

	boolean updateTodo(TodoEntity todo) throws SQLException;

}
