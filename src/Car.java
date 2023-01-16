public class Car {
    String brand;
    String model;
    double engineVolume;
    String color;
    int productionYear;
    String productionCountry;

    Car (String brand, String model, double engineVolume, String color, int productionYear, String productionCountry) {
        if (brand == null || brand.isEmpty()) {
            this.brand = "default";
        } else this.brand = brand;
        if (model == null || model.isEmpty()) {
            this.model = "default";
        } else this.model = model;
        if (engineVolume <= 0 ) {
            this.engineVolume = 1.5;
        } else this.engineVolume = engineVolume;
        if (color == null || color.isEmpty()) {
            this.color = "white";
        } else this.color = color;
        if (productionYear <= 0) {
            productionYear = 2000;
        } else this.productionYear = productionYear;
        if (productionCountry == null || productionCountry.isEmpty()) {
            productionCountry = "default";
        }else this.productionCountry = productionCountry;
    }
    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                ", color='" + color + '\'' +
                ", productionYear=" + productionYear +
                ", productionCountry='" + productionCountry + '\'' +
                '}';
    }
}
