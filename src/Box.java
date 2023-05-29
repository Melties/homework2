public class Box {
    private final int x;
    private final int y;
    private final int z;

    public Box(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }
    public String whichTypeOfBox() {
        if(this.z == 0){
            return "The box is an envelope";
        } else if(this.x == this.y && this.y == this.z){
            return "The box is a cube";
        } else {
            return "The box is just a box";
        }
    }
}
