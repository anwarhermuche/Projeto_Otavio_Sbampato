public class A {
    private int A1;
    private double A2;

    public int getA1() {
        return A1;
    }

    public double getA2() {
        return A2;
    }

    public void MA1() {
        System.out.println("MA1");
    }

    public void MA2() {
        System.out.println("MA2");
    }

    public void MA3(){
        System.out.println("Alteração a classe A partir do clone");
    }

    public int getSoma(int a, int b) {
        soma = a + b;
        return soma;
    }
}
