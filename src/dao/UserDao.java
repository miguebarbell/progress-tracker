package dao;

import java.util.List;

public interface UserDao {
	
    //public boolean addUser(User user);
	
	public User loginUser(User user);
    
    public User getUsername(String username);
	
	public User getUserId(int u_id);
	
	/*public List<Employees> getAllEmployees();
	
	public Employees getEmployeeById(int id);
	
	public boolean addEmployee(Employees emp);
	
	public boolean deleteEmployee(int empId);
	
	public boolean updateEmployee(Employees emp); */

}
