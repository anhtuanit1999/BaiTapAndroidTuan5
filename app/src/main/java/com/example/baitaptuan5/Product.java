package com.example.baitaptuan5;

public class Product {
    private String nameProduct;
    private String nameShop;
    private int imgProduct;

    public Product(String nameProduct, String nameShop, int imgProduct) {
        this.nameProduct = nameProduct;
        this.nameShop = nameShop;
        this.imgProduct = imgProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getNameShop() {
        return nameShop;
    }

    public void setNameShop(String nameShop) {
        this.nameShop = nameShop;
    }

    public int getImgProduct() {
        return imgProduct;
    }

    public void setImgProduct(int imgProduct) {
        this.imgProduct = imgProduct;
    }
}
