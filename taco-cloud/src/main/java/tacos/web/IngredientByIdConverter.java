package tacos.web;

import java.nio.charset.Charset;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import tacos.Ingredient;
import tacos.data.IngredientRepository;
import org.springframework.boot.sql.init.AbstractScriptDatabaseInitializer;

@Component
public class IngredientByIdConverter implements Converter<String, Ingredient>{
	private IngredientRepository ingredientRepo;
	
	@Autowired
	public IngredientByIdConverter(IngredientRepository ingredientRepo) {
		this.ingredientRepo = ingredientRepo;
	}
	
	@Override
	public Ingredient convert(String id) {
		return ingredientRepo.findById(id);
	}

	private void runScripts(List<Resource> resources, boolean continueOnError, String separator, Charset encoding)  {
		
	}
}