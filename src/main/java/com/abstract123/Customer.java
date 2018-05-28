package com.abstract123;

public class Customer extends Person {
    private Integer neqat;
    private int id;

    public Customer() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Customer(Integer neqat) {
        this.neqat = neqat;
    }

    public Customer(int id, String name, String mobile, String num, String gns, Integer neqat) {
        super(name, mobile, num, gns);
        this.neqat = neqat;
        this.id = id;
    }

    public Integer getNeqat() {
        return neqat;
    }

    public void setNeqat(Integer neqat) {
        this.neqat = neqat;
    }



    @Override
    public void create(int i) {
        Main.data.getCustomers()[i] = this;

    }

    @Override
    public void delete() {
        for (int i = 0; i < Main.data.getCustomers().length; i++) {
            if (this.id == Main.data.getCustomers()[i].getId()) {
                Main.data.getCustomers()[i] = null;
                break;

            }
        }
    }

    @Override
    public void read() {

    }

    @Override
    public <T> void update(T ma) {
if (ma instanceof Customer){
    Customer s1 = (Customer) ma;
    //البحث عن العنصر القديم
    for (int i = 0; i < Main.data.getCustomers().length; i++) {
        if (this.id == Main.data.getCustomers()[i].getId()) {
            Customer s2 = Main.data.getCustomers()[i];
            s2.setId(s1.getId());
            s2.setNeqat(s1.getNeqat());
            s2.setGns(s1.getGns());
            s2.setMobile(s1.getMobile());
            s2.setName(s1.getName());
            s2.setNum(s1.getNum());
            break;

        }
    }
}

    }

    @Override
    public void show() {
        System.out.println("اسم العميل: " + super.getName());
        System.out.println("الجوال: " + getMobile());
        System.out.println("رقم البطاقة: " + getNum());
        System.out.println("الجنس: " + getGns());
        System.out.println("مجموع النقاط: " + getNeqat());
        System.out.println("________________________________________");

    }
}
