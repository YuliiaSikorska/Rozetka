package model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "filters")
@XmlAccessorType(XmlAccessType.PROPERTY)
public class Filters {

    private List<Filter> filters;

    public Filters(List<Filter> filters) {
        super();
        this.filters = filters;
    }

    public Filters() {
        super();
    }

    public List<Filter> getFilters() {
        return filters;
    }

    @XmlElement(name = "filter")
    public void setFilters(List<Filter> filters) {
        this.filters = filters;
    }
}
