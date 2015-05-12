package com.eclinic.db.query;



import com.eclinic.db.dao.DBDao;
import com.eclinic.db.model.Task;


public class TaskQuery {

	private DBDao<Task> taskDao;


	public void addTask(Task t) {
		taskDao.add(t, Task.class.getName());
	}

	public void deleteTask(Task task) {
		taskDao.delete(task);
	}

	public Task findTaskByName(String name) {
		Task t = new Task();
		t.setName(name);
		return taskDao.findByExample(t, Task.class).get(0);
	}

	
	
}
