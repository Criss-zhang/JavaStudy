package chapter9.homework01;

public interface BaseDao<T> {
    int save(T t);
    int Update(T t);
    int delete(T t);
    <T>T findAll();
}
