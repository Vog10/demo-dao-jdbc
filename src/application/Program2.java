package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartamentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);
		
		DepartamentDao dpDao = DaoFactory.createDepartamentDao();
		
		
		
		System.out.println("=== TEST 1: findById =======");
		Department dep = dpDao.findById(1);
		System.out.println(dep);
		
		System.out.println("=== TEST 2: department Insert ====");
		
		Department newDp = new Department(null, "Music");
		dpDao.insert(newDp);
		System.out.println("Inserted! New Departmet = " + newDp.getId());
		
		
		
		System.out.println("=== TEST 3: department Update ====");
		
		Department newdp2 = dpDao.findById(1);
		newdp2.setName("Food");
		dpDao.update(newdp2);
		System.out.println("Update completed!");
		
		
		System.out.println("\n=== TEST 4: department findAll =======");
		List<Department> list = dpDao.findAll();
		for (Department d : list) {
			System.out.println(d);
		}
		
		System.out.println("\n=== TEST 5: delete =======");
		System.out.print("Enter id for delete test: ");
		int id = sc.nextInt();
		dpDao.deleteById(id);
		System.out.println("Delete completed");

		sc.close();
		
	}

}
