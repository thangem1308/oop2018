package week4.task1;

/**
 * Khai báo class cam
 * class hoa quả có 2 thuộc tính đó là khối lượng (kg) và giá bán (k vnđ/kg)
 * có 2 phương thức infoHoaQua và soTien
 * các thuộc tính có khai báo getter,setter.
 */
public class Cam extends HoaQua {
     protected int NSX;
     protected String xuatxu;
     public void setNSX(int nsx){NSX=nsx;}
     public int getNSX(){return NSX;}
     public void setXuatxu(String xuatxu){this.xuatxu=xuatxu;}
     public String getXuatxu(){return xuatxu;}
     public void ttnsx(){
         System.out.println("ngay sx la :" +this.getNSX());
     }
     public void ttxx(){
         System.out.println(" xx la :" +this.getXuatxu());
     }

}
