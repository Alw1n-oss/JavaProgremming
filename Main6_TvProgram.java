package ru.ez;

import java.util.ArrayList;
import java.util.List;

class Main6_TvProgram {
    private String name;
    private String time;

    public Main6_TvProgram(String name, String time) {
        this.name = name;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return String.format("TvProgram: Name=%s, Time=%s", name, time);
    }
}

class Education extends Main6_TvProgram {
    private String science;

    public Education(String name, String time, String science) {
        super(name, time);
        this.science = science;
    }

    public String getScience() {
        return science;
    }

    public void setScience(String science) {
        this.science = science;
    }

    @Override
    public String toString() {
        return String.format("Education: Name=%s, Time=%s, Science=%s", getName(), getTime(), science);
    }
}

class Children extends Main6_TvProgram {
    private int minAge;
    private int maxAge;

    public Children(String name, String time, int minAge, int maxAge) {
        super(name, time);
        this.minAge = minAge;
        this.maxAge = maxAge;
    }

    public int getMinAge() {
        return minAge;
    }

    public void setMinAge(int minAge) {
        this.minAge = minAge;
    }

    public int getMaxAge() {
        return maxAge;
    }

    public void setMaxAge(int maxAge) {
        this.maxAge = maxAge;
    }

    @Override
    public String toString() {
        return String.format("Children: Name=%s, Time=%s, MinAge=%d, MaxAge=%d", getName(), getTime(), minAge, maxAge);
    }
}

class Show extends Main6_TvProgram {
    private String theme;

    public Show(String name, String time, String theme) {
        super(name, time);
        this.theme = theme;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    @Override
    public String toString() {
        return String.format("Show: Name=%s, Time=%s, Theme=%s", getName(), getTime(), theme);
    }
}

class Movie extends Main6_TvProgram {
    private String directorBox;
    private int year;

    public Movie(String name, String time, String directorBox, int year) {
        super(name, time);
        this.directorBox = directorBox;
        this.year = year;
    }

    public String getDirectorBox() {
        return directorBox;
    }

    public void setDirectorBox(String directorBox) {
        this.directorBox = directorBox;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return String.format("Movie: Name=%s, Time=%s, DirectorBox=%s, Year=%d", getName(), getTime(), directorBox, year);
    }
}

class DayProgram {
    private String date;
    private List<Main6_TvProgram> programs;

    public DayProgram(String date) {
        this.date = date;
        this.programs = new ArrayList<>();
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void add(Main6_TvProgram program) {
        programs.add(program);
    }

    public void show() {
        System.out.println("Day Program for " + date + ":");
        for (Main6_TvProgram program : programs) {
            System.out.println("  " + program);
        }
    }

    public static void main(String[] args) {

        DayProgram day1 = new DayProgram("2024-01-27");


        Education scienceShow = new Education("Cosmos", "8:00 PM", "Astronomy");
        Children cartoon = new Children("SpongeBob", "9:00 AM", 6, 12);
        Movie actionMovie = new Movie("Die Hard", "10:00 PM", "John McTiernan", 1988);

        day1.add(scienceShow);
        day1.add(cartoon);
        day1.add(actionMovie);

        day1.show();
    }
}