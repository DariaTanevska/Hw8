package hw8;
/*Создать класс Tree с перегруженными конструкторами.
Необходимо создать одномерный массив, состоящий из максимальных значений
В классе есть Tree есть поля:
String type; int height, int coutOfsticks, String colour;

Конструктор1 принимающий в параметры String type; int height
и присваивающий значение полям coutOfsticks значение 13,
colour "Зеленый".

Конструктор2 принимающий в параметры int height, int coutOfsticks,
String colour и присваивающий значение полю type "пихта".

Констуктор по умолчанию 3, который присваивает height = 350, coutOfsticks = 29,
сolour = "Желтый".

Конструктор4 который принимает в параметры String type,
и вызывает внутри себя конструктор 3.

Создать в отдельном классе main 4 объекта класса Tree используя 4 созданных конструктора.*/
public class Tree {
    public String type;
    public int height;
    public int countOfSticks;
    public String colour;

    public Tree(String type, int height) {
        this.type = type;
        this.height = height;
        this.countOfSticks = 13;
        this.colour = "Зеленый";
    }

    public Tree(int height, int countOfSticks, String colour) {
        this.type = "пихта";
        this.height = height;
        this.countOfSticks = countOfSticks;
        this.colour = colour;
    }

    public Tree() {
        this.height = 350;
        this.countOfSticks = 29;
        this.colour = "Желтый";
    }
    public Tree(String type) {
        this(); // Call the default constructor
        this.type = type;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Tree{" +
                "type=" + type +
                ", height=" + height +
                ", countOfSticks=" + countOfSticks +
                ", colour=" + colour +
                '}';
    }

    public static void main(String[] args) {
        Tree tree1 = new Tree("Oak", 400);
        Tree tree2 = new Tree(300, 20, "Brown");
        Tree tree3 = new Tree();
        Tree tree4 = new Tree("Pine");


        System.out.println(tree1);
        System.out.println(tree2);
        System.out.println(tree3);
        System.out.println(tree4);
    }

}
