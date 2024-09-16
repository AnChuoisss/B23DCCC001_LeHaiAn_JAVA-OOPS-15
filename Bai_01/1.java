package Bai_01;

class HinhChuNhat {
    public static void main(String[] args) {
        try {
            if (args.length < 2) {
                System.out.println("Vui lòng nhập đủ 2 tham số: chiều rộng và chiều cao.");
                return;
            }

            int width = Integer.parseInt(args[0]);
            int height = Integer.parseInt(args[1]);

            if (width > 0 && height > 0) {

                int chuVi = 2 * (width + height);
                int dienTich = width * height;

                
                System.out.println("Chu vi hình chữ nhật: " + chuVi);
                System.out.println("Diện tích hình chữ nhật: " + dienTich);
            } else {
                System.out.println("Chiều rộng và chiều cao phải là các số nguyên dương!");
            }
        } catch (NumberFormatException e) {
            System.out.println("Vui lòng nhập các tham số là số nguyên dương!");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Vui lòng nhập 2 tham số: chiều rộng và chiều cao.");
        }
    }
}
