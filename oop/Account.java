package oop;

public class Account {

    private int acountNo;
    private String name;
    private float amount;

    public int getAcountNo() {
        return this.acountNo;
    }

    public void setAcountNo(int acountNo) {
        this.acountNo = acountNo;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getAmount() {
        return this.amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public void addInsert(int acountNo, String name, float amount) {

        this.acountNo = acountNo;
        this.name = name;
        this.amount = amount;

    }

    public void disposit(float dis) {

        this.amount += dis;

    }

    public float getDisposit() {
        return this.amount;
    }

    public void withdraw(float with) {

        if (with >= amount) {
            System.out.println("recharger votr compte stp");
        } else {
            this.amount -= with;
        }

    }


    public void checkAccount(){
        int chek = 0;
        if (amount > chek) {
            System.out.println(amount);
        }else{
            System.out.println("votre acount et vid");
        }
    }

    @Override
    public String toString() {
        return "{" +
                " acountNo='" + getAcountNo() + "'" +
                ", name='" + getName() + "'" +
                ", amount='" + getAmount() + "'" +
                "}";
    }

}
