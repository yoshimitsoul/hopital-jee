package fr.hopital.daoInt;

import java.util.List;

public interface IDao<T> {

	public List<T> findAll();

	public T findById(String numSS);

	public T add(T entity);

	public T save(T entity);

	public boolean deleteById(String numSS);

}
