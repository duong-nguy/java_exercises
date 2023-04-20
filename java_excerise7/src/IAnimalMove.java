public interface IAnimalMove {
    public default void move(){
        System.out.println(this.toString());
    }
}
