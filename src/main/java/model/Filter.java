package model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "filter")
@XmlAccessorType(XmlAccessType.PROPERTY)
public class Filter {

    private String item;
    private String brand;
    private Integer sum;

    public Filter(String item, String brand, Integer sum) {
        super();
        this.item = item;
        this.brand = brand;
        this.sum = sum;
    }

    public Filter() {
        super();
    }

    public String getItem() {
        return item;
    }

    public String getBrand() {
        return brand;
    }

    public Integer getSum() {
        return sum;
    }
}
