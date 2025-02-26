package ru.ez;

public class Main5_Teleprogram {

    private String author;
    private String name;
    private String description;
    private int periodType;

    public Main5_Teleprogram(String author, String name, String description, int periodType) {
        this.author = author;
        this.name = name;
        this.description = description;
        this.periodType = periodType;
    }


    public String getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getPeriodType() {
        return periodType;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPeriodType(int periodType) {
        this.periodType = periodType;
    }

    @Override
    public String toString() {
        String periodText;
        switch (periodType) {
            case 1:
                periodText = "ежедневно";
                break;
            case 2:
                periodText = "еженедельно";
                break;
            case 3:
                periodText = "ежемесячно";
                break;
            default:
                periodText = "неизвестно";
                break;
        }

        return String.format(
                "Телепрограмма:\n" +
                        "  Ведущий: %s\n" +
                        "  Название: %s\n" +
                        "  Описание: %s\n" +
                        "  Периодичность: %s",
                author, name, description, periodText
        );
    }

    public static void main(String[] args) {
        ru.ez.Main5_Teleprogram myShow = new ru.ez.Main5_Teleprogram(
                "Иван Иванов",
                "Новости",
                "Обзор главных событий дня",
                1
        );

        System.out.println(myShow);
    }
}