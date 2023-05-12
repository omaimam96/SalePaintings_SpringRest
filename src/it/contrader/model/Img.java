package it.contrader.model;

import java.util.Objects;

public class Img {
    private int id;

    private String img;

    public Img() {
    }

    public Img(String img) {
        this.img = img;
    }

    public Img(int id, String img) {
        this.id = id;
        this.img = img;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    @Override
    public String toString() {
        return "Img{" +
                "id=" + id +
                ", img='" + img + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Img img1 = (Img) o;
        return id == img1.id && Objects.equals(img, img1.img);
    }


}
