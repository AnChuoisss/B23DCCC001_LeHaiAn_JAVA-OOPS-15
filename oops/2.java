interface EmailSender {
    void sendEmail(String email);
}

interface Programmer {
    void writeCode(String language);
}

interface Salesperson {
    void sellProduct(String product);
}

class OfficeEmployee implements EmailSender {
    private String name;

    public OfficeEmployee(String name) {
        this.name = name;
    }

    @Override
    public void sendEmail(String email) {
        System.out.println(name + " đang gửi email tới: " + email);
    }
}

class TechnicalEmployee implements Programmer {
    private String name;

    public TechnicalEmployee(String name) {
        this.name = name;
    }

    @Override
    public void writeCode(String language) {
        System.out.println(name + " đang lập trình bằng ngôn ngữ: " + language);
    }
}

class SalesEmployee implements Salesperson {
    private String name;

    public SalesEmployee(String name) {
        this.name = name;
    }

    @Override
    public void sellProduct(String product) {
        System.out.println(name + " đang bán sản phẩm: " + product);
    }
}

class EmployeeManagementSystem {
    public static void main(String[] args) {
        OfficeEmployee officeEmployee = new OfficeEmployee("Nguyễn Văn A");
        officeEmployee.sendEmail("khachhang@example.com");

        TechnicalEmployee technicalEmployee = new TechnicalEmployee("Trần Thị B");
        technicalEmployee.writeCode("Java");
        SalesEmployee salesEmployee = new SalesEmployee("Lê Văn C");
        salesEmployee.sellProduct("Laptop");
    }
}
