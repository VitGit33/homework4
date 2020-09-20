package ai.skillo.test4;

public enum CarBrand {

    BUGATTI("Chiron", 2020),
    FORD("Explorer", 2016),
    TESLA("Model X", 2019);

    String brandName;
    int yearOfOrigin;



    CarBrand(String brandName, int yearOfOrigin) {
        this.brandName = brandName;
        this.yearOfOrigin = yearOfOrigin;


    }
}
