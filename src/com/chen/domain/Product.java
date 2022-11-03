package com.chen.domain;

public class Product {
    private Long id;
    private String name;// 与数据库类型属性名称不一致
    private Long dir_id;
    private Double salePrice;
    private String supplier;
    private String brand;
    private Double cutoff;
    private Double costPrice;

    public Product() {
    }

    public Product(Long id, String name, Long dir_id, Double salePrice, String supplier, String brand, Double cutoff, Double costPrice) {
        this.id = id;
        this.name = name;
        this.dir_id = dir_id;
        this.salePrice = salePrice;
        this.supplier = supplier;
        this.brand = brand;
        this.cutoff = cutoff;
        this.costPrice = costPrice;
    }

    public Product(String name, Long dir_id, Double salePrice, String supplier, String brand, Double cutoff, Double costPrice) {
        this.name = name;
        this.dir_id = dir_id;
        this.salePrice = salePrice;
        this.supplier = supplier;
        this.brand = brand;
        this.cutoff = cutoff;
        this.costPrice = costPrice;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getDir_id() {
        return dir_id;
    }

    public void setDir_id(Long dir_id) {
        this.dir_id = dir_id;
    }

    public Double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(Double salePrice) {
        this.salePrice = salePrice;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Double getCutoff() {
        return cutoff;
    }

    public void setCutoff(Double cutoff) {
        this.cutoff = cutoff;
    }

    public Double getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(Double costPrice) {
        this.costPrice = costPrice;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dir_id=" + dir_id +
                ", salePrice=" + salePrice +
                ", supplier='" + supplier + '\'' +
                ", brand='" + brand + '\'' +
                ", cutoff=" + cutoff +
                ", costPrice=" + costPrice +
                '}';
    }
}
