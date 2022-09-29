package kr.co.hongjong.todo.dto;

public class Todo {

    private Integer id;
    private String name;
    private Integer price;
    private String imgPath;

    public Todo() {

    }

    public Todo(Integer id, String name, Integer price, String imgPath) {
        super();
        this.id = id;
        this.name = name;
        this.price = price;
        this.imgPath = imgPath;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return (id + "/" + name + "/" + price + "/" + imgPath);
    }

}
