package com.nighthawk.spring_portfolio.mvc.calendar;
import java.util.*;
import java.time.*;

// Prototype Implementation

public class APCalendar {
     
    /** Returns true if year is a leap year and false otherwise.
     * isLeapYear(2019) returns False
     * isLeapYear(2016) returns True
     */          

    public static boolean isLeapYear(int year) {
        if (year % 4 == 0){
            return true;
        }

        return false;
        }
    
    
        
    /** Returns the value representing the day of the week 
     * 0 denotes Sunday, 
     * 1 denotes Monday, ..., 
     * 6 denotes Saturday. 
     * firstDayOfYear(2019) returns 2 for Tuesday.
    */


    private static int firstDayOfYear(int year) {
        int currentYearFirstDay = 0;
        // given that first day of year 2023 is Sunday, here it is being preset what day of the year it is
        // 0 is Sunday

        if (year == 2023) {
            currentYearFirstDay = 6; // therefore no change to first day

        } else if (year < 2023) {
            int yearsAway = 2023 - year;
            int leapYearsAway = numberOfLeapYears(year, 2023); // finding the number of leap years between 2000 and given year
            int nonLeapYearsAway = yearsAway - leapYearsAway; // finding the number of non-leap years between 2000 and given year
            int daysAway = (leapYearsAway * 366) + (nonLeapYearsAway * 365); // total number of days between 2000 and given year
            for (int i = 0; i < daysAway; i++) {
                currentYearFirstDay--;
                if (currentYearFirstDay == -1) {
                    currentYearFirstDay = 6; // resetting the day to saturday everytime it goes to -1
                }
            }
        } else if (year > 2023) {
            int yearsAway = year - 2023;
            int leapYearsAway = numberOfLeapYears(2023, year-1);
            int nonLeapYearsAway = yearsAway - leapYearsAway;
            int daysAway = (leapYearsAway * 366) + (nonLeapYearsAway * 365);
            for (int i = 0; i < daysAway; i++) {
                currentYearFirstDay++;
                if (currentYearFirstDay == 7) {
                    currentYearFirstDay = 0; // resetting to Sunday (0) everytime it goes to 7
                }
            }
        }
        
        return currentYearFirstDay;
    }


    /** Returns n, where month, day, and year specify the nth day of the year.
     * This method accounts for whether year is a leap year. 
     * dayOfYear(1, 1, 2019) return 1
     * dayOfYear(3, 1, 2017) returns 60, since 2017 is not a leap year
     * dayOfYear(3, 1, 2016) returns 61, since 2016 is a leap year. 
    */ 
    private static int dayOfYear(int month, int day, int year) {
        // implementation not shown

        return 1;
        }

    /** Returns the number of leap years between year1 and year2, inclusive.
     * Precondition: 0 <= year1 <= year2
    */ 
    public static int numberOfLeapYears(int year1, int year2) {
         // to be implemented in part (a)

        return 0;
        }

    /** Returns the value representing the day of the week for the given date
     * Precondition: The date represented by month, day, year is a valid date.
    */
    public static int dayOfWeek(int month, int day, int year) { 
        // to be implemented in part (b)
        return 0;
        }

    /** Tester method */
    public static void main(String[] args) {
        // Private access modifiers
        System.out.println("firstDayOfYear: " + APCalendar.firstDayOfYear(2022));
        System.out.println("dayOfYear: " + APCalendar.dayOfYear(1, 1, 2022));

        // Public access modifiers
        System.out.println("isLeapYear: " + APCalendar.isLeapYear(2022));
        System.out.println("numberOfLeapYears: " + APCalendar.numberOfLeapYears(2000, 2022));
        System.out.println("dayOfWeek: " + APCalendar.dayOfWeek(1, 1, 2022));
    }

}