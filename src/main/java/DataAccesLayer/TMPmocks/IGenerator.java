package DataAccesLayer.TMPmocks;

import java.util.ArrayList;

public interface IGenerator <T> {
    public T one() ;
    ArrayList<T> numberOf(int number);
    String randomJson();
}
