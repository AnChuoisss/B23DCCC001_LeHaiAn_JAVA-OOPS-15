package Bai_03;

class Common {
    public static boolean isPositive(int value) {
        return value > 0;
    }
}

class Circle {
    private int radius;

    public Circle(int radius) {
        if (Common.isPositive(radius)) {
            this.radius = radius;
        } else {
            throw new IllegalArgumentException("Bán kính phải là số nguyên dương");
        }
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) 
    {
        if (Common.isPositive(radius)) 
        {
            this.radius = radius;
        } 
        else {
            throw new IllegalArgumentException("Bán kính phải là số nguyên dương");
        }
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle {
    private int width;
    private int height;
    public Rectangle(int width, int height) {
        if (Common.isPositive(width) && Common.isPositive(height)) {
            this.width = width;
            this.height = height;
        } else {
            throw new IllegalArgumentException("Chiều rộng và chiều cao phải là số nguyên dương");
        }
    }
    
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
