package day7;

public class InstanceOf {
    public static void main(String[] args) {
        Parent parent1 = new Parent();
        call(parent1);
        Parent parent2 = new Child();
        call(parent2);
    }
    
    private static void call(Parent parent){
        parent.parentMethod();

        if(parent instanceof Child){
            System.out.println("child 인스턴스");
            ((Child) parent).childMethod();;
        }else{
            System.out.println("child 인스턴스 아님");
        }
    }
}
