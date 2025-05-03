package HW20;

public class CityWeather2 {

    public static void main(String[] args) {
        weather("Минск", "воскресенье");
        weather("Лиссабон", "вторник");
        weather("Париж", "среда");
        weather("Париж", "четверг");
    }

    public static void weather(String city, String dayOfTheWeek) {
        int temperatureChange = 1;
        int result = cityWeather(city) + daysOfTheWeek(dayOfTheWeek) * temperatureChange;
        System.out.println("город - " + city + "     день недели - " + dayOfTheWeek + "     температура - " + result);
    }

    public static int daysOfTheWeek(String days) {
        int numberOfDays = 0;
        switch (days) {
            case "понедельник":
                numberOfDays = 0;
                break;
            case "вторник":
                numberOfDays = 1;
                break;
            case "среда":
                numberOfDays = 2;
                break;
            case "четверг":
                numberOfDays = 3;
                break;
            case "пятница":
                numberOfDays = 4;
                break;
            case "суббота":
                numberOfDays = 5;
                break;
            case "воскресенье":
                numberOfDays = 6;
                break;
        }
        return numberOfDays;
    }

    public static int cityWeather(String city) {
        int temperatura = 0;
        if (city == "Берлин") temperatura = 20;
        else if (city == "Лондон") temperatura = 17;
        else if (city == "Лиссабон") temperatura = 25;
        else if (city == "Париж") temperatura = 23;
        else if (city == "Москва") temperatura = 19;
        else if (city == "Минск") temperatura = 18;
        else if (city == "Саратов") temperatura = 15;
        return temperatura;
    }
}
