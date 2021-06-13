public class app4 {
    public static void main(String[] args) {
        sportsRecommender(25);
        sportsRecommender(15);
        sportsRecommender(35);
        sportsRecommender(5);
        sportsRecommender(45);
    }

    public static void sportsRecommender(int celsiusTemperature) {
        if (20 <= celsiusTemperature && celsiusTemperature <= 30) {
            System.out.println("It’s lovely weather for sports today!");
        } else if (10 <= celsiusTemperature && celsiusTemperature <= 40) {
            System.out.println("It’s reasonable weather for sports today.");
        } else {
            System.out.println("Please exercise with care today, watch out for the weather!");
        }
    }
}

/* 
4-	Write a method sportsRecommender that inputs a Celsius temperature and returns 
“It’s lovely weather for sports today!” if it’s 20–30 °C, 
“It’s reasonable weather for sports today.” if it’s 10–40 °C, 
and “Please exercise with care today, watch out for the weather!” otherwise. 
Create an application to test the method.
*/