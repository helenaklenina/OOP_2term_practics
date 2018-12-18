package ru.mirea.lab.klenina.lab2;

import java.lang.System;

public class Head {

    private String form;
    private String hairs;

    public Head(String form, String hairs) {
        this.form = form;
        this.hairs = hairs;
    }

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }

    public String getHairs() {
        return hairs;
    }

    public void setHairs(String hairs) {
        this.hairs = hairs;
    }

   // @Override
    public String toString() {
        return "Head{" +
                "form='" + form + '\'' +
                ", hairs='" + hairs + '\'' +
                '}';
    }
}
