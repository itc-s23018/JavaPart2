package chapter6;

import java.util.Objects;

public class Tax {
    private int number;
    private String name;
    private int shotoku;
    private int koujo;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getShotoku() {
        return shotoku;
    }

    public void setShotoku(int shotoku) {
        this.shotoku = shotoku;
        if (koujo > this.shotoku){
            //設定済みの控除額より所得税が下回ったら調整する。
            koujo = this.shotoku;
        }
    }

    public int getKoujo() {
        return koujo;
    }

    public void setKoujo(int koujo) {
        if(shotoku < koujo){
            // koujoがshotokuを上回ってしまったら
            //this.koujoはshotokuと同じ値で設定する
            this.koujo = shotoku;
        }else {
            this.koujo = koujo;
        }
    }

    public Tax(int number, String name, int shotoku, int koujo) {
        this.number = number;
        this.name = name;
        this.shotoku = shotoku;
        this.koujo = koujo;
    }

    @Override
    public String toString() {
        return "Tax{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", shotoku=" + shotoku +
                ", koujo=" + koujo +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tax tax = (Tax) o;
        return number == tax.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }

    public int zeigaku(){
        return (int) ((shotoku - koujo)*0.1);
    }
}
