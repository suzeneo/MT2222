package com.example.mt2;

public class Item {
    public static int imageId;
    public static int name;
    public static int medicineMessage;

    public class Items {

        String name, medicineMessage,ways, imformation;
        int imageId;

        public Items(String name, String medicineMessage,String imformation,String ways,int imageId) {
            this.name = name;
            this.medicineMessage = medicineMessage;
            this.imformation = imformation;
            this.ways = ways;

            this.imageId = imageId;
        }
    }
}
