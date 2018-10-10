package week4.task1;

public class Tao extends HoaQua{
        protected String mauqua,maula;
        public void setMauqua(String mauqua){this.mauqua=mauqua;}
        public void setMaula(String maula){this.maula=maula;}
        public String getMauqua(){return mauqua;}
        public String getMaula(){return maula;}
        public void InMauQua(){
            System.out.println(this.getMauqua());
        }
        public void InMaula(){
             System.out.println(this.getMaula());
         }
}
