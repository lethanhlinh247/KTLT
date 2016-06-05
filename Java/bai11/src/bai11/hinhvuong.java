package bai11;
public class hinhvuong extends hinhchunhat {
    public float tinhChuVi() {
        float chuvi = 4*getDai();
        return chuvi;
    }
    public float tinhDienTich() {
        float dientich = getDai()* getDai();
        return dientich;
    }
    public void Ve (){
        for (int i =0; i<(int)(Math.round(getDai()));i++) {
            for (int j=0; j<(int)(Math.round(getDai()));j++) {
                System.out.print("*");
                if (j+1==(int)(Math.round(getDai())))
                    System.out.print("\n");
            }
        }
    }
}
