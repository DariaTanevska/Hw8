package hw8;
/*Необходимо создать класс конвертер, который будет иметь методы конвертации примитивных типов данных:
метод convertToInt; (конвертирует byte, short, int, long, char, float, double, String).
При вводе boolean выводитсообщение, что введен тип boolean.

convertToDouble;    (конвертирует byte, short, int, long, char, float, double, String).
При вводе boolean выводит сообщение, что введен тип boolean.

converToString;     (конвертирует byte, short, int, long, char, boolean, float, double, String).

У данного класса должен быть только один конструктор, в параметрах которого можно указать его имя.
А также только один метод геттер для получения информации о названии данного конвертра.*/
public class Converter {
    private String converterName;

    public Converter(String name) {
        this.converterName = name;
    }

    public String getConverterName() {
        return converterName;
    }

    public int convertToInt(Object value) {
        if (value instanceof Byte || value instanceof Short ||
                value instanceof Integer || value instanceof Long) {
            return Integer.parseInt(value.toString());
        } else if (value instanceof Character) {
            return (int) ((Character) value);
        } else if (value instanceof Float || value instanceof Double) {
            return (int) Math.round(Double.parseDouble(value.toString()));
        } else if (value instanceof String) {
            try {
                return Integer.parseInt((String) value);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input for conversion to int.");
                return 0;
            }
        } else {
            System.out.println("Unsupported type for conversion to int.");
            return 0;
        }
    }


    public double convertToDouble(Object value) {
        if (value instanceof Byte || value instanceof Short ||
                value instanceof Integer || value instanceof Long) {
            return Double.parseDouble(value.toString());
        } else if (value instanceof Character) {
            return (double) ((Character) value);
        } else if (value instanceof Float || value instanceof Double) {
            return Double.parseDouble(value.toString());
        } else if (value instanceof String) {
            try {
                return Double.parseDouble((String) value);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input for conversion to double.");
                return 0.0;
            }
        } else {
            System.out.println("Unsupported type for conversion to double.");
            return 0.0;
        }
    }

    public String convertToString(Object value) {
        return value.toString();
    }

    public static void main(String[] args) {
         Converter myConverter = new Converter("MyConverter");


         System.out.println("Converter name: " + myConverter.getConverterName());
         System.out.println("Converted int: " + myConverter.convertToInt(42));
         System.out.println("Converted double: " + myConverter.convertToDouble(3.14));
         System.out.println("Converted string: " + myConverter.convertToString(true));
        }
}
