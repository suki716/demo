public class Another {
    private int x;

    public Another() {
        x = 0;
    }

    public int getX(){
        return x;
    }

    public void setX(int newX) {
        x = newX;
    }

    public void print() {
        System.out.println(x);
    }

    public void add(int num){
        x += num;
    }
}
