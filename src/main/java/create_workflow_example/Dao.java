package create_workflow_example;

import java.util.List;

    public interface Dao<T> {
        List<T> getAll();

        void save(T t);

        T get(long id);

        void delete(T t);
        //
    }
