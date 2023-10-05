class c1{
    public int s=455;
protected int c=44;
int j=457;
private int u=0;
public void meth9()
{
    System.out.println(s);
    System.out.println(c);
    System.out.println(j);
    System.out.println(u);
}
}
public class Practice_AcessModifiers {
    private int h = 0;
    public static void main(String [] args) {
        Practice_AcessModifiers o=new Practice_AcessModifiers();
        c1 oo=new c1();

        System.out.println(oo.j);
        System.out.println(oo.c);

    }
}