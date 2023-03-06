public class Dog extends Animal{
    public void eat(){ // переопределяет родительский метод унаследованный у общего метода Animal
        System.out.println("Собака умеет есть");
    }

    public void bark(){
        System.out.println("Собака умее лаить");
    }

    public void showName(){
        System.out.println(name);
    }
}
