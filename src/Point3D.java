public class Point3D extends Point2D {
    public float z = 0;

    public Point3D() {

    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return this.z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public float[] getXYZ() {
        float[] temp = new float[3];
        temp[0] = this.x;
        temp[1] = this.y;
        temp[2] = this.z;
        return temp;
    }

    @Override
    public String toString() {
        return "Point 3D: x = " + this.x + ", y = " + this.y + ", z = " + this.z + ", which is subclass of " + super.toString();
    }
}
