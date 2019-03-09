package demomydate;

import java.util.Scanner;

public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate() {
        day = 0;
        month = 0;
        year = 0;
    }

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    
    public String printShort() {
        return day+"/"+month+"/"+year;
    }
    
    public String printLong() {
        return "Ngày " +day+ " tháng " +month+ " năm "+year;
    }
    
    private boolean isLeapYear() {
        if(year%400 == 0)
            return true;
        if(year%100 == 0)
            return false;
        if(year%4 == 0)
            return true;
        return false;
    }
    
    private int maxDateOfMonth() {
        int maxDay;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                maxDay = 31;
                break;
            case 2:
                if(isLeapYear())
                    maxDay = 29;
                else
                    maxDay = 28;
                break;
            default:
                maxDay = 30;
                break;
        }
        return maxDay;
    }
    
    public String addDay(int d) {
        int maxDay = maxDateOfMonth();
        if(day+d > maxDay) {
            month ++;
            if(month == 13) {
                month = 1;
                year++;
            }
            d = day+d-maxDay-1;
            day = 1;
            addDay(d);
        }
        else
            day += d;
        return printShort();
    }
    
    public String subDay(int d) {
        if(day <= d) {
            month --;
            if(month == 0) {
                month = 12;
                year--;
            }
            d = d-day;
            day = maxDateOfMonth();
            subDay(d);
        }
        else
            day -= d;
        return printShort();
    }
    
    public String compareDate(int d, int m, int y) {
        String s;
        if(year > y)
            s = ">";
        else if(year < y)
            s = "<";
        else {
            if(month > m)
                s = ">";
            else if(month < m)
                s = "<";
            else {
                if(day > m)
                    s = ">";
                else if(day < m)
                    s = "<";
                else
                    s = "=";
            }
        }
        return printShort() +" "+ s +" "+ d+"/"+m+"/"+y;
    }
}