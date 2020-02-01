import com.sun.org.apache.xerces.internal.impl.xs.SchemaNamespaceSupport;
import org.junit.Test;

import java.util.Scanner;

public class ProgramExample {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("r:");
        int r = sc.nextInt();
        System.out.println(r);
    }

    @Test
    public void testFn() {
        int i = 8 >> 3;
        System.out.println(i);
    }

    @Test
    public void testFn1() {
        Dog hsq = new Dog();
        hsq.name = "哈士奇";
        hsq.color = "黑吧";
        hsq.eat();
        Dog td = new Dog();
        td.name = "taidi";
        td.color = "huangs";
        td.eat();
        new Dog().move();
        td = hsq;
        td.name = "heihei";
        System.out.println(hsq.name);
        method(hsq);
        System.out.println(hsq.name);
        Horse horse = new Horse();

        horse.setName("小白马");
        System.out.println(horse.getName());
        System.out.println(horse.toString());
    }

    private void method(Dog dog) {
        dog.name = "baibai";

    }


    @Test
    public void testFn2() {
        Horse horse = new Horse();
        horse.setName("小白马");
        System.out.println(horse);
        Horse horse1 = new Horse("小黑马", "黑色");
        System.out.println(horse1);

    }


    @Test
    public void testFn4() {
        int x = 10;
        method(x);
        System.out.println(x);
    }

    public void method(int x) {
        x = 20;
    }


    @Test
    public void testFn5(){
        Hero hero = new Hero();
        hero.setName("关羽");
        /*Weapon weapon = new Weapon();
        weapon.setName("青龙偃月刀");*/
        hero.setWeapon(new Weapon("青龙偃月刀"));
        System.out.println(hero);
    }

}

class Horse {
    private String name;
    private int age;
    private String color;

    public Horse() {
        this("", "");
        System.out.println("无参构造方法！！");
    }

    public Horse(String name, String color) {
        this.name = name;
        this.color = color;
        this.method();
    }

    public void method() {
        System.out.println("这是一个普通方法");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Horse{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}


class Dog {
    String name;
    int age;
    String color;

    public void eat() {
        System.out.println(color + name + "chi");
    }

    void move() {
        eat();
    }
}

class Hero {
    private String name;
    private  Weapon weapon;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", weapon=" + weapon +
                '}';
    }
};

class Weapon {
    private String name;

    public Weapon(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Weapon{" +
                "name='" + name + '\'' +
                '}';
    }
};
