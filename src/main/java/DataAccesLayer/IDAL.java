package DataAccesLayer;

import java.util.ArrayList;

public interface IDAL <T> {
    public T getSingle(String criteria);
    public ArrayList<T> getList(String criteria);
    public void create(ArrayList<String> list);
    public void delete(String criteria);
    public void update(String to, String where);
}
