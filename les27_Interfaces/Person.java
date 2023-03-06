
public class Person implements Info{ // для реализации интерфейса необходимо его указывать через implements плюс его название
    public String name;          // интерфесов может быть сколько угодно и они указываются через запятую например implements Info, Pull

    public Person(String name){
        this.name = name;
    }

    public void sayHello(){
        System.out.println("Привет");
    }

    public void showInfo(){ // реализация интерфейса для Person
        System.out.println("Name is "+this.name);
    }
}