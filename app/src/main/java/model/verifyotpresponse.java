package model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class verifyotpresponse {

        @SerializedName("message")
        @Expose
        private String message;
        @SerializedName("user")
        @Expose
        private User user;

        /**
         * No args constructor for use in serialization
         *
         */
        public verifyotpresponse() {
        }

        /**
         *
         * @param message
         * @param user
         */
        public verifyotpresponse(String message, User user) {
            super();
            this.message = message;
            this.user = user;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public User getUser() {
            return user;
        }

        public void setUser(User user) {
            this.user = user;
        }

    }

