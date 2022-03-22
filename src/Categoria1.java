public class Categoria1 {
    private int id;
    private String name;

    public Categoria1(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void getName(){
        System.out.println(getClass().getSimpleName());
    }

}
