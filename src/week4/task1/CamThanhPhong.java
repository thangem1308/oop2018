package week4.task1;

public class CamThanhPhong extends CamSanh {
        protected String diaChi;
        protected double soHecta;
        public void setDiaChi(String diaChi){this.diaChi=diaChi;}
        public void setSoHecta(double soHecta){this.soHecta=soHecta;}
        public String getDiaChi(){return diaChi;}
        public double getSoHecta(){return soHecta;}

        public void InDiachi(){
            System.out.print(this.getDiaChi());
        }
        public void InSoHecta(){
            System.out.print(this.getSoHecta());
        }
}
