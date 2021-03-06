package kg.geektech.hwretrofit.model;

import com.google.gson.annotations.SerializedName;

public class Model {

        @SerializedName("activity")
        private String activities;

        @SerializedName("type")
        private String type;

        @SerializedName("price")
        private double price;


        public String getActivities() {
            return activities;
        }

        public String getType() {
            return type;
        }

        public double getPrice() {
            return price;
        }
}
