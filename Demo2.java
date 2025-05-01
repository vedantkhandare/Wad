interface SujataMastani{
    void taste();
    void Price();
}
class SinhgadRoad implements SujataMastani{
    public void taste(){
            System.out.println("Great");
    }
    public void Price(){
        System.out.println("100 Rs");
    }
}
class Client{
    public static void main(String[]args){
        SujataMastani obj = new SinhgadRoad();
        obj.taste();
        obj.Price();
    }
}