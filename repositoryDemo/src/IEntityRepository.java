public interface IEntityRepository<T extends IEntity > { // extends işlemiyle generic kısıt koyulmuş oldu.
    void add(T entity);
    void delete(T entity);
    void update (T entity);
}
