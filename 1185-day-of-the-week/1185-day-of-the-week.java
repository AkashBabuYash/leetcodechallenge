class Solution {

    public static boolean leap(int year) {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }

    public static int countyear(int year) {
        int odd = 0;

        for (int y = 1971; y < year; y++) {
            if (leap(y)) {
                odd += 2;
            } else {
                odd += 1;
            }
        }

        return odd % 7;
    }

    public static int countmonth(int month, int year) {
        int odd = 0;

        int[] days = {
            31, 28, 31, 30, 31, 30,
            31, 31, 30, 31, 30, 31
        };

        for (int m = 1; m < month; m++) {
            if (m == 2 && leap(year)) {
                odd += 29 % 7;
            } else {
                odd += days[m - 1] % 7;
            }
        }

        return odd % 7;
    }

    public static int count(int day, int month, int year) {
        int y = countyear(year);
        int m = countmonth(month, year);

  
        int d = (day - 1) % 7;

        return (y + m + d) % 7;
    }

    public String dayOfTheWeek(int day, int month, int year) {

        HashMap<Integer, String> map = new HashMap<>();

        map.put(0, "Friday");
        map.put(1, "Saturday");
        map.put(2, "Sunday");
        map.put(3, "Monday");
        map.put(4, "Tuesday");
        map.put(5, "Wednesday");
        map.put(6, "Thursday");

        int oddays = count(day, month, year);

        return map.get(oddays);
    }
}