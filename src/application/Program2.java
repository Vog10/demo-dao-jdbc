package application;

import model.dao.DaoFactory;
import model.dao.DepartamentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		
		DepartamentDao dpDao = DaoFactory.createDepartamentDao();
		
		System.out.println("=== TEST 1: department Insert ====");
		
		Department newDp = new Department(null, "Music");
		dpDao.insert(newDp);
		System.out.println("Inserted! New Departmet = " + newDp.getId());
		
	}

}
