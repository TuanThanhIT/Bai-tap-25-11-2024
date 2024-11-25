package vn.iotstar.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vn.iotstar.Repository.ProductRepository;
import vn.iotstar.Service.ProductServices;
import vn.iotstar.entity.Product;
@Service
public class ProductServiceImpl implements ProductServices{
	@Autowired
	private ProductRepository repository;
	
	public ProductServiceImpl(ProductRepository repo)
	{
		this.repository = repo;
	}
	
	@Override
	public List<Product> listAll(){
		return repository.findAll();
	}
	
	@Override
	public Product save(Product product)
	{
		return repository.save(product);
	}
	
	@Override
	public Product get(Long id)
	{
		return repository.findById(id).get();
	}
	
	@Override
	public void delete(Long id)
	{
		repository.deleteById(id);
	}
}
