package com.samm.lru;

public  class Data{
    int no;
    String name;
    double sal;

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public Data(int no, String name, double sal) {
        this.no = no;
        this.name = name;
        this.sal = sal;
    }
}