package Week1.Day3;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.TimeZone;

public class Question_7 {
    public static void main(String[] args) {
        String days[] = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};

        for(String s : days) {
            if(s.equals("Thursday"))
                continue;
            System.out.println(s);
        }

        // Skipping only today's day ::::::::::

        System.out.println("************************************************************");
        Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
        int day = calendar.get(Calendar.DAY_OF_WEEK);

        for(int i=0; i<days.length;i++) {
            if(i == (day-2))
                continue;
            System.out.println(days[i]);
        }

        System.out.println("****************************************************************");
        int date = calendar.get(Calendar.DAY_OF_MONTH);

        for(int i =1;i<31;i++) {
            System.out.println(i);

            if(i==date)
                break;
        }

    }
}

/*

Monday
Tuesday
Wednesday
Friday
Saturday
Sunday

************************************************************
Monday
Tuesday
Wednesday
Thursday
Saturday
Sunday

****************************************************************

1
2
3
4
5
6
7
8
9
10
11
12
13
14
15
16
17
18
19


* */

