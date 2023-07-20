public class Car implements AutoCloseable{
    public void drive(){
        System.out.println("The car is running");
    }
    @Override
    public void close() throws Exception {
        System.out.println("Car close");
    }
}
