/* создание анонимного класса на 1 раз
*/

interface AbleToEat {
    public void eat();

}

public class les36_2 {
    public static void main(String[] args) {
        AbleToEat ableToEat = new AbleToEat(){
            @Override
            public void eat(){ // анонимный класс
            System.out.println("Someone is eating...");
            }
        };
        
        ableToEat.eat();
        
    }       
}

  


