package HW20;

public class CityWeather1 {

    public static void main(String[] args) {
        cityWeather1("Лондон");  // 23
        cityWeather1("Саратов"); // 21
        cityWeather1("Москва");  // 25
        cityWeather1("Минск");   // 24
    }

    public static void cityWeather1(String city) {
        int temperatureChange = 1;
        int numberOfDays = 6;
        if (city == "Берлин") System.out.println(20 + +temperatureChange * numberOfDays);
        else if (city == "Лондон") System.out.println(17 + +temperatureChange * numberOfDays);
        else if (city == "Лиссабон") System.out.println(25 + +temperatureChange * numberOfDays);
        else if (city == "Париж") System.out.println(23 + +temperatureChange * numberOfDays);
        else if (city == "Москва") System.out.println(19 + +temperatureChange * numberOfDays);
        else if (city == "Минск") System.out.println(18 + +temperatureChange * numberOfDays);
        else if (city == "Саратов") System.out.println(15 + +temperatureChange * numberOfDays);
    }
}


// через switch
    /*public static void cityWeather1(String city) {
        int temperatureChange = 1;
        int numberOfDays = 6;
        switch (city) {
            case "Берлин":
                int temperature1 = 20;
                System.out.println(temperature1 + temperatureChange * numberOfDays);
                break;
            case "Лондон":
                int temperature2 = 17;
                System.out.println(temperature2 + temperatureChange * numberOfDays);
                break;
            case "Лиссабон":
                int temperature3 = 25;
                System.out.println(temperature3 + temperatureChange * numberOfDays);
                break;
            case "Париж":
                int temperature4 = 23;
                System.out.println(temperature4 + temperatureChange * numberOfDays);
                break;
            case "Москва":
                int temperature5 = 19;
                System.out.println(temperature5 + temperatureChange * numberOfDays);
                break;
            case "Минск":
                int temperature6 = 18;
                System.out.println(temperature6 + temperatureChange * numberOfDays);
                break;
            case "Саратов":
                int temperature7 = 15;
                System.out.println(temperature7 + temperatureChange * numberOfDays);
                break;
        }
    }
}
*/
