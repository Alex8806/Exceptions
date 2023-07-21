public class Entry {

    private String Surname;
    private String Name;
    private String Fathername;
    private DOB dob;
    private int phone;



    private char sex;
    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getFathername() {
        return Fathername;
    }

    public void setFathername(String fathername) {
        Fathername = fathername;
    }

    public DOB getDob() {
        return dob;
    }

    public void setDob(DOB dob) {
        this.dob = dob;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Entry{" +
                "Surname='" + Surname + '\'' +
                ", Name='" + Name + '\'' +
                ", Fathername='" + Fathername + '\'' +
                ", dob=" + dob +
                ", phone=" + phone +
                ", sex=" + sex +
                '}';
    }
}
