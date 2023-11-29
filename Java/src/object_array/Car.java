package object_array;

public class Car {

    private String modelName;
    private int maxSpeed;

    public Car(String modelName, int maxSpeed) {
        this.modelName = modelName;
        this.maxSpeed = maxSpeed;
    }

    /**
     * <pre>
     * 		자동차의 최고 시속으로 달리는 메소드
     * </pre>
     */
    public void driveMaxSpeed() {

        System.out.println(this.modelName + "이(가) 최고시속"
                + maxSpeed + "km/h로 달려갑니다.");
    }



}
