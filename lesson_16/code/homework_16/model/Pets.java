package homework_16.model;

public class Pets {

    private int id;
    private String view;
    private int age;
    private String nickname;

    //constructor


    public Pets(int id, String view, int age, String nickname) {
        this.id = id;
        this.view = view;
        this.age = age;
        this.nickname = nickname;
    }
//getter and setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getView() {
        return view;
    }

    public void setView(String view) {
        this.view = view;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    //method toString


    @Override
    public String toString() {
        return "Pets{" +
                "id=" + id +
                ", view='" + view + '\'' +
                ", age=" + age +
                ", nickname='" + nickname + '\'' +
                '}';
    }

    ////additional methods

    public  void sleep(){
        System.out.println(nickname+ " is sleeping!");
    }

    public void eat(){
        System.out.println(nickname+ " eats.");
    }

    public void makesSound(){
        System.out.println(nickname + " makes sound.");
    }

    public void play() {
        System.out.println(nickname+ " plays.");
    }

    public void walk(){
        System.out.println(nickname+ " walks.");
    }
}
