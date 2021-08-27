package chapter5.ch06;

public class ThreeDPrinter {

    private Plastic material;

    public Plastic getMaterial() {
        return material;
    }

    public void setMaterial(Plastic material) {
        this.material = material;
    }

    public String toString() {
        return "재료는 Plastic 입니다.";
    }
}
