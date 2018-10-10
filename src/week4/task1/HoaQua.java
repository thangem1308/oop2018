package week4.task1;

/**
 * Khai báo class hoa quả
 * class hoa quả có 2 thuộc tính đó là khối lượng (kg) và giá bán (k vnđ/kg)
 * có 2 phương thức infoHoaQua và soTien
 * các thuộc tính có khai báo getter,setter.
 */
public class HoaQua {
        protected double khoiLuong;
        protected double giaBan;
        public void setKhoiLuong(double khoiLuong) { this.khoiLuong=khoiLuong; }
        public void setGiaBan(double giaBan) { this.giaBan=giaBan; }
        public double getKhoiLuong() { return khoiLuong; }
        public double getGiaBan() { return giaBan; }

         /**
          * Phương thức infoHoaQua() in ra màn hình các thuộc tính của hoa quả
          */
         public void infoHoaQua() {
                System.out.println("Khối lượng : " + khoiLuong + " và giá bán : " + giaBan );
         }

         /**
          * Phương thức soTien , trả về số tiền thu được khi bán số hoa quả đó.
          */
         public double soTien() { return khoiLuong*giaBan; }
}
