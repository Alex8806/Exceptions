import javax.tools.JavaCompiler;

public class DOB {

    private int day;
    private int month;
    private int year;

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public DOB(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public DOB(String str) throws Exception {
        try {
            String[] date = str.split("/");
            this.day = Integer.parseInt(date[0]);
            if (day < 1 || day > 31) {
                throw new CustomException( this.day + " Неправилдьный день в Дате рождения");
            }
            this.month = Integer.parseInt(date[1]);
            if (month < 1 || month > 12) {
                throw new CustomException(this.month +" Неправилдьный месяц в Дате рождения");
            }
            this.year = Integer.parseInt(date[2]);
            if (year < 1 || year > 9999) {
                throw new CustomException(this.year + " Неправилдьный год в Дате рождения");
            }
        } catch (IndexOutOfBoundsException e) {
            throw new CustomException(e.getMessage() + " Так-с. Чего-то не хватает в Дате Рождения");
        } catch (NumberFormatException e) {
            throw new CustomException(e.getMessage() + " Так-с. Похоже вы написали неправильно Дату рождения");
        }

    }


    public DOB() {
        this(0, 0, 0);
    }

    ;

    @Override
    public String toString() {
        return String.format("%d.%d.%d", day, month, year);
    }
}

