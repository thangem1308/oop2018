package week4.task1;

public class CamSanh extends Cam{
        protected String xuatKhau,nhapKhau;
        public void setXuatKhau(String xuatKhau){this.xuatKhau=xuatKhau;}
        public void setNhapKhau(String nhapKhau){this.nhapKhau=nhapKhau;}
        public String getXuatKhau(){return xuatKhau;}
        public String getNhapKhau(){return nhapKhau;}
        public void DCxuatKhau(){
            System.out.println(this.getXuatKhau());
        }
        public void DCnhapKhau(){
            System.out.print(this.getNhapKhau());
        }
        public void xuatNhap(){
            System.out.print("xuat khau: "+this.getXuatKhau()+" nhap khau : "+ this.getNhapKhau());
        }
}
