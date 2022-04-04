package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDAO;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		SellerDAO sellerDao = DaoFactory.createSellerDao();

		System.out.println("=== TEST 1 - Seller FindById ===");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);

		System.out.println("\n=== TEST 2 - Seller FindByDepartment ===");
		Department department = new Department(2, null);
		List<Seller> lista = sellerDao.findByDepartment(department);
		for (Seller seller2 : lista) {
			System.out.println(seller2);
			System.out.println(department);
		}

		System.out.println("\n=== TEST 3 - Seller FindAll ===");
		List<Seller> lista2 = sellerDao.findAll();
		for (Seller seller2 : lista2) {
			System.out.println(seller2);
			System.out.println(department);
		}
		
		System.out.println("\n=== TEST 4 - Seller Insert ===");
		Seller newSeller = new Seller(null, "Greg", "greg@hotmail.com", new Date(), 4000.00, department);
		sellerDao.insert(newSeller);
		System.out.println("newSeller id = " + newSeller.getId());
		
		System.out.println("\n=== TEST 5 - Seller Update ===");
		seller = sellerDao.findById(8);
		seller.setName("Andres Iniesta");
		sellerDao.update(seller);
		System.out.println("Update completed!");
		
		System.out.println("\n=== TEST 6 - Seller Delete ===");
		sellerDao.deleteById(11);
		System.out.println("Delete completed!");

	}

}
