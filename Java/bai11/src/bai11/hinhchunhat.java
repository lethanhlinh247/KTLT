package bai11;

public class hinhchunhat {
    private float dai;
    private float rong;
    public void setDai (float dai) {
        this.dai=dai;
    }
    public void setRong (float rong) {
        this.rong=rong;
    }
    float getDai(){
        return this.dai;
    }
    float getRong(){
        return this.rong;
    }
    public float tinhChuVi() {
        float chuvi = 2*(getDai()+getRong());
        return chuvi;
    }
    public float tinhDienTich() {
        float dientich = getDai()* getRong();
        return dientich;
    }
    public void Ve (){
        for (int i =0; i<(int)(Math.round(getRong()));i++) {
            for (int j=0; j<(int)(Math.round(getDai()));j++) {
                System.out.print("*");
                if (j+1==(int)(Math.round(getDai())))
                    System.out.print("\n");
            }
        }
    }
}
