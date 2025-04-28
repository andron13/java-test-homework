package HW18;

public class Loop3 {
    public static void main(String[] args) {
        /*loop3_1(10);
        Loop1.split();
        loop3_2(10);
        Loop1.split();*/
        loop3_3(10);
    }

    //"Нарисуйте" (выведите на консоль) треугольник из звёздочек, используя только одну звёздочку и то, что только что
    //изучили:
    private static void loop3_1(int str) {
        String input = "*";
        String output = "";
        for (int i = 0; i < str; i++) {
            output = output + input;
            System.out.println(output);
        }
    }

    private static void loop3_2(int str) {
        int i = 0;
        String input = "*";
        String output = "";
        while (i < str) {
            i++;
            output = output + input;
            System.out.println(output);
        }
    }

    private static void loop3_3(int str) {
        int i = 0;
        String input = "*";
        String output = "";
        do {
            i++;
            output = output + input;
            System.out.println(output);
        }
        while (i < str);
    }


}
