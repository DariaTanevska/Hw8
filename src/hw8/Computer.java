package hw8;
/*Создать класс Computer c конструктором принимающим параметры
Марка тип String, цена тип int, оперативная память тип int,
и видеокарта тип int.
Переопределить метод toString для вывода объекта класса в след. виде:

        "Создан PC.
Имя = марка.
        Цена = цена.
        Видеокарта = объем видеокарты.
ОЗУ = Объем оперативной памяти."

Все поля класса Computer должны быть приватными.
Также создайте публичные методы для получения информации о полях класса Computer.

А также методы для изменения его полей.
Переопределите метод equals и метод hashCode для вашего класса.
        Сделайте так, чтобы компьютеры считались одинаковыми в случае если у них
равны значения полей марка, оперативная память и видеокарта.
равны значения полей марка, оперативная память и видеокарта.
В отдельном классе создайте объект класса компьютер, и выведите в консоль
информацию о вашем объекте*/

public class Computer {
    private String brand;
    private int price;
    private int ram;
    private int graphicsCard;

    public Computer(java.lang.String awesomePC, int i, int i1, int i2) {
    }

    public int Computer1(String brand, int price, int ram, int graphicsCard) {
        this.brand = brand;
        this.price = price;
        this.ram = ram;
        this.graphicsCard = graphicsCard;
        return price;
    }


    public String getBrand () {
        return brand;
    }
    public void setBrand (String brand){
        this.brand = brand;
    }

    public int getPrice () {
        return price;
    }

    public void setPrice ( int price){
        this.price = price;
    }

    public int getRam () {
        return ram;
    }

    public void setRam ( int ram){
        this.ram = ram;
    }

    public int getGraphicsCard () {
        return graphicsCard;
    }

    public void setGraphicsCard ( int graphicsCard){
        this.graphicsCard = graphicsCard;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Computer{" +
                "brand=" + brand +
                ", price=" + price +
                ", ram=" + ram +
                ", graphicsCard=" + graphicsCard +
                '}';
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Computer computer)) return false;
        if (!super.equals(object)) return false;
        return getPrice() == computer.getPrice() && getRam() == computer.getRam() && getGraphicsCard() == computer.getGraphicsCard() && java.util.Objects.equals(getBrand(), computer.getBrand());
    }

    public int hashCode() {
        return java.util.Objects.hash(super.hashCode(), getBrand(), getRam(), getGraphicsCard());
    }
    
    
    public static void main(String[] args) {

        Computer myPC = new Computer("AwesomePC", 1000, 16, 4);

        System.out.println(myPC);
    }
}
