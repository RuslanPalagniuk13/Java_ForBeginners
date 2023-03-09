public class Dog extends Animal{ // наследование класса Animal 

    @Override //  @Override - проверяет, переопределён ли метод. 
            // Вызывает ошибку компиляции / интерпретации, 
            //если метод не найден в родительском классе или интерфейсе;
    public void eat(){ 
        System.out.println("Dog is eating...");
    }

    public void bark(){
        System.out.println("Dog is barking..."); 
    }
}
