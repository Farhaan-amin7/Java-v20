import java.util.ArrayList;

class MereGenerics<m2,l1>
{
    int val=4454;
    private m2 M2;
    private  l1 L1;

    public void setL1(l1 l1) {
         L1 = l1;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public l1 getL1() {
        return L1;
    }

    public int getVal() {
        return val;
    }

    public m2 getM2() {
        return M2;
    }

    public void setM2(m2 m2) {
        M2 = m2;
    }

    public MereGenerics(int val,m2 M2,l1 L1) {
        this.val=val;
        this.M2=M2;
        this.L1=L1;
    }

}
public class Mygenerics_java {
    public static void main(String[] args) {
//        ArrayList<String> hey =new ArrayList<>();
        MereGenerics<String,Integer> Sup =new MereGenerics<>(254,"This is an object with a string",544);
        String i=Sup.getM2();
        int j=Sup.getL1();
        System.out.println(j);
        System.out.println(i);

    }
}