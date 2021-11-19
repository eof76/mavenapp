package eof76.dal.repositories;

public interface Repository<T> {
	Iterable<T> getAll();
	T getById(int id);
	void addOrUpdate(T entity);
	void delete(int i);
}
