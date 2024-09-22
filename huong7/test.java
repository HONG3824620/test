package netbean_17_buoihocdautien;

import java.util.List;

interface IRepository<T>{
    void add(T item);
    void Remove(T item);
    T GetById(int id);
    List<T> GetAll();
}

//class Repository<T> implement IRepository<T>{
//    
//}

public class test {
    public static void main(String[] args) {
        
    }
}
