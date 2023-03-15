import java.io.Serializable;

public class Person implements Serializable{ // через implements Serializable дается разрешение на сериализацию
    
    // использование serialVersionUID
    /*
    *private static final long serialVersionUID = -3722203743604454371L; 
    */
    
    private transient int id; // использование transient-когда не хотим сохранять значение переменной в файл
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName(){
        return name;
    }

    public String toString(){
        return id + " : " + name;
    }
}
