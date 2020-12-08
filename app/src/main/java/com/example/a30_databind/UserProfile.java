package com.example.a30_databind;

public class UserProfile {
    private static final int GENDER_MALE = 0;
    private static final int GENDER_FEMALE = 1;

    private String name;
    private String phone;
    private String address;
    private int gender;
    private int drawable;


    public int getDrawable() {
        return drawable;
    }

    public void setDrawable(int drawable) {
        this.drawable = drawable;
    }


    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public String getGenderText(){
        return (gender == GENDER_MALE) ? "남자" : "여자";
    }

    public UserProfile(String name, String phone, String address, int drawable) {
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.drawable = drawable;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "UserProfile{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
