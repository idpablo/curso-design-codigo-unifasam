package java;

import java.util.List;

public interface CrudDAO {
    public void salvar(Object bean);
    public void atualizar(Object bean);
    public Object getBy(int id);
    public List<Object> getAll();
}
