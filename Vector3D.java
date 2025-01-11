public class Vector3D {

    public static void main(String[] args) {
        Vector3D vector3D = new Vector3D(1.5839, 4.8392, 3.294);
        System.out.println("vector: " + vector3D);
        System.out.println("x: " + vector3D.getX());
        System.out.println("y: " + vector3D.getY());
        System.out.println("z: " + vector3D.getZ());

    }

    double x;
    double y;
    double z;

    public Vector3D(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    public double getZ() {
        return z;
    }

    public String toString(){
        return String.format("(%.2f, %.2f, %.2f)", x, y, z);
    }

}