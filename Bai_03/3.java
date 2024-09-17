package Bai_03;

class Common {
    // Phương thức tĩnh kiểm tra số nguyên dương
    public static boolean isPositive(int value) {
        return value > 0;
    }
}

// Lớp Circle để tính chu vi và diện tích hình tròn
class Circle {
    // Thuộc tính bán kính
    private int radius;

    // Constructor để khởi tạo đối tượng Circle với bán kính
    public Circle(int radius) {
        // Kiểm tra bán kính có phải số nguyên dương hay không
        if (Common.isPositive(radius)) {
            this.radius = radius;
        } else {
            throw new IllegalArgumentException("Bán kính phải là số nguyên dương");
        }
    }

    // Phương thức getter để lấy bán kính
    public int getRadius() {
        return radius;
    }

    // Phương thức setter để đặt lại bán kính, có kiểm tra số nguyên dương
    public void setRadius(int radius) {
        if (Common.isPositive(radius)) {
            this.radius = radius;
        } else {
            throw new IllegalArgumentException("Bán kính phải là số nguyên dương");
        }
    }

    // Phương thức tính chu vi hình tròn
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    // Phương thức tính diện tích hình tròn
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

// Lớp Rectangle để tính chu vi và diện tích hình chữ nhật
class Rectangle {
    // Thuộc tính chiều rộng và chiều cao
    private int width;
    private int height;

    // Constructor để khởi tạo đối tượng Rectangle
    public Rectangle(int width, int height) {
        // Kiểm tra chiều rộng và chiều cao phải là số nguyên dương
        if (Common.isPositive(width) && Common.isPositive(height)) {
            this.width = width;
            this.height = height;
        } else {
            throw new IllegalArgumentException("Chiều rộng và chiều cao phải là số nguyên dương");
        }
    }

    // Phương thức getter và setter cho chiều rộng
    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        if (Common.isPositive(width)) {
            this.width = width;
        } else {
            throw new IllegalArgumentException("Chiều rộng phải là số nguyên dương");
        }
    }

    // Phương thức getter và setter cho chiều cao
    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        if (Common.isPositive(height)) {
            this.height = height;
        } else {
            throw new IllegalArgumentException("Chiều cao phải là số nguyên dương");
        }
    }

    // Phương thức tính chu vi hình chữ nhật
    public int getPerimeter() {
        return 2 * (width + height);
    }

    public int getArea() {
        return width * height;
    }
}

class Main1 {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println("Chu vi hình tròn: " + circle.getPerimeter());
        System.out.println("Diện tích hình tròn: " + circle.getArea());

        Rectangle rectangle = new Rectangle(4, 8);
        System.out.println("Chu vi hình chữ nhật: " + rectangle.getPerimeter());
        System.out.println("Diện tích hình chữ nhật: " + rectangle.getArea());
    }
}
