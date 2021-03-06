package net.sm.shoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import net.sm.shoppingbackend.dao.CategoryDAO;
import net.sm.shoppingbackend.dto.Category;

@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {

	private static List<Category> categories = new ArrayList<>();
	
	static {
		Category category = new Category();
		
		//adding first category
		category.setId(1);
		category.setName("Television");
		category.setDescription("Home sense television sets");
		category.setImageURL("cat_1.png");
		
		categories.add(category);
		
		//adding second category
		category = new Category();
		category.setId(2);
		category.setName("Laptop");
		category.setDescription("Home sense Laptop sets");
		category.setImageURL("cat_2.png");
		
		categories.add(category);
		
		//adding third category
		category = new Category();
		category.setId(3);
		category.setName("Mobile");
		category.setDescription("Smart mobile phones of new generations");
		category.setImageURL("cat_3.png");
		
		categories.add(category);
	}
	
	
	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}


	@Override
	public Category get(int id) {
		// TODO Auto-generated method stub
		for(Category category : categories) {
			if(category.getId() == id)
				return category;
		}
		return null;
	}

}
