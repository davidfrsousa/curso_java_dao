package application;

import java.util.Date;

import model.dao.DaoFactory;
import model.dao.DepartmentDAO;
import model.dao.SellerDAO;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		Seller seller = new Seller(1, "David", "david@gmail.com ", new Date(), 3000.0, new Department(1, "Books"));
		System.out.println(seller);

		SellerDAO sellerDao = DaoFactory.createSellerDao();
		DepartmentDAO departmentDao = DaoFactory.createDepartmentDao();
		System.out.println(sellerDao);
		System.out.println(departmentDao);
	}

}
