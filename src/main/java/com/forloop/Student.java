package com.forloop;

public class Student {
    private String name;
    private double D1;
    private double D2;
    private double D3;

    public Student() {
    }

    public Student(String name, double d1, double d2, double d3) {
        this.name = name;
        D1 = d1;
        D2 = d2;
        D3 = d3;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getD1() {
        return D1;
    }

    public void setD1(double d1) {
        D1 = d1;
    }

    public double getD2() {
        return D2;
    }

    public void setD2(double d2) {
        D2 = d2;
    }

    public double getD3() {
        return D3;
    }

    public void setD3(double d3) {
        D3 = d3;
    }

    public double mgmoa() {
        return this.D1 + this.D2 + this.D3;
    }

    public String natega() {
        if (mgmoa() > 60) {
            return "ناجح";
        } else {
            return "راسب";
        }
    }

    public String tagdeer() {
        double sum = mgmoa();
        if (sum >= 95 && sum <= 100) {
            return "A+";
        } else if (sum >= 90 && sum < 95) {
            return "A";
        } else if (sum >= 85 && sum < 90) {
            return "B+";
        } else if (sum >= 80 && sum < 85) {
            return "B";
        } else if (sum >= 75 && sum < 80) {
            return "C+";
        } else if (sum >= 70 && sum < 75) {
            return "C";
        } else if (sum >= 65 && sum < 70) {
            return "D+";
        } else if (sum >= 60 && sum < 65) {
            return "D";
        } else if (sum < 60) {
            return "F";
        } else {
            return "فضلا تأكد من الحسابات";
        }

    }
}

