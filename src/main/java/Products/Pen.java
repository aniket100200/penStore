package Products;

public class Pen
{
    private String pId;
    private String type;
    private String color;
    private Integer cost;

    public Pen(String pId, String type, String color, Integer cost)
    {
        this.pId = pId;
        this.type = type;
        this.color = color;
        this.cost = cost;
    }

    public Pen() {
    }

    public String getpId() {
        return pId;
    }

    public void setpId(String pId) {
        this.pId = pId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }
}
