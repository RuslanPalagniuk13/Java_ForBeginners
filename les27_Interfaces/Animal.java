
public class Animal implements Info{ // для реализации интерфейса необходимо его указывать через implements плюс его название
    public int id;                  // интерфесов может быть сколько угодно и они указываются через запятую например implements Info, Pull

    public Animal(int id){
        this.id = id;
    }

    public void sleep(){
        System.out.println("Я умею спать");
    }

    public void showInfo(){ // реализация интерфейса для Animal
        System.out.println("My id "+this.id);
    }
}
