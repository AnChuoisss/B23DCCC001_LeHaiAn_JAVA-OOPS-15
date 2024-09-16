class Rectangle {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getPerimeter() {
        return 2 * (width + height);
    }

    public int getArea() {
        return width * height;
    }
}

class Main {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(5, 10);

        System.out.println("Chu vi hình chữ nhật: " + rect.getPerimeter());
        System.out.println("Diện tích hình chữ nhật: " + rect.getArea());
    }
}
