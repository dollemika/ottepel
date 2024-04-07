
public class Catsteacher {
    public static void main(String[] args) {
        Object o1 = new Object();
        String s1 = o1.toString();
        System.out.println(s1);
        System.out.println(o1); //неявно будет вызвано преобразование к строке при помощи метода toString()
        Cat o2 = new Cat("Василий", "рыжий", 10);
        Cat o3 = new Cat("Мурзик", "черный", 8.4);
        System.out.println(o2);
        System.out.println(o3);

        Racoon o4 = new Racoon("Фёдор", 10);
        System.out.println(o4);

        System.out.println("у нас поселились " + o2 + ", " + o3 + " и " + o4);
        //o2.name = "Василий Иваныч";  благодаря модификатору private напрямую сделать нельзя
        o2.setName("Василий Иваныч");
        o3.setName("Эй ты");

        System.out.println("у нас живут коты " + o2 + ", " + o3);

        o3.setWeight(9.1);
        System.out.println(o3);
        System.out.println("вес кота " + o3.getWeight());

        Racoon o5 = new Racoon("Неправильный", -9);
        System.out.println(o5);
    }
}

class Cat {
    private String name;
    String color;
    private double weight;

    public void setWeight(double weight) {
        if (weight > 0)
            this.weight = weight;
    }

    public double getWeight() {
        System.out.println("измеряем вес кота");
        return weight;
    }

    public Cat(String name, String color, double weight) {
        this.name = name;
        this.color = color;
        this.weight = weight;
    }

    public String toString() {
        String s = "кот: " + name + " " + color + " весом " + weight + " кг";
        return s;
    }

    public void setName(String name) {
        System.out.println("переименование " + this.name + " в " + name);
        this.name = name;
    }
}

class Racoon {
    private String name;
    private int impudence;

    public Racoon(String name, int impudence) {
        this.name = name;
        setImpudence(impudence);
    }

    @Override
    public String toString() {
        return "Енот {" +
                "имя='" + name + '\'' +
                ", наглость=" + impudence +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImpudence() {
        return impudence;
    }

    public void setImpudence(int impudence) {
        if (impudence < 0)
            impudence = 0;
        if (impudence > 10)
            impudence = 10;
        this.impudence = impudence;
    }


}