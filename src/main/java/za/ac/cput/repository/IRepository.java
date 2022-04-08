package za.ac.cput.repository;
import za.ac.cput.entity.JobTitle;

public interface IRepository<T,ID> {
    T create(T t);
    JobTitle read(ID id);
    T update(T t);
    boolean delete(ID id);
}
