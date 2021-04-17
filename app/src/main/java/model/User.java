package model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class User {


        @SerializedName("id")
        @Expose
        private String id;
        @SerializedName("firstName")
        @Expose
        private Object firstName;
        @SerializedName("lastName")
        @Expose
        private Object lastName;
        @SerializedName("email")
        @Expose
        private Object email;
        @SerializedName("mobile")
        @Expose
        private Object mobile;
        @SerializedName("otpCode")
        @Expose
        private Object otpCode;
        @SerializedName("status")
        @Expose
        private Boolean status;
        @SerializedName("emailStatus")
        @Expose
        private Boolean emailStatus;
        @SerializedName("otpAttempt")
        @Expose
        private Integer otpAttempt;
        @SerializedName("createdAt")
        @Expose
        private Object createdAt;
        @SerializedName("updatedAt")
        @Expose
        private Object updatedAt;

        /**
         * No args constructor for use in serialization
         *
         */
        public User() {
        }

        /**
         *
         * @param firstName
         * @param lastName
         * @param createdAt
         * @param emailStatus
         * @param otpAttempt
         * @param mobile
         * @param otpCode
         * @param id
         * @param email
         * @param status
         * @param updatedAt
         */
        public User(String id, Object firstName, Object lastName, Object email, Object mobile, Object otpCode, Boolean status, Boolean emailStatus, Integer otpAttempt, Object createdAt, Object updatedAt) {
            super();
            this.id = id;
            this.firstName = firstName;
            this.lastName = lastName;
            this.email = email;
            this.mobile = mobile;
            this.otpCode = otpCode;
            this.status = status;
            this.emailStatus = emailStatus;
            this.otpAttempt = otpAttempt;
            this.createdAt = createdAt;
            this.updatedAt = updatedAt;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public Object getFirstName() {
            return firstName;
        }

        public void setFirstName(Object firstName) {
            this.firstName = firstName;
        }

        public Object getLastName() {
            return lastName;
        }

        public void setLastName(Object lastName) {
            this.lastName = lastName;
        }

        public Object getEmail() {
            return email;
        }

        public void setEmail(Object email) {
            this.email = email;
        }

        public Object getMobile() {
            return mobile;
        }

        public void setMobile(Object mobile) {
            this.mobile = mobile;
        }

        public Object getOtpCode() {
            return otpCode;
        }

        public void setOtpCode(Object otpCode) {
            this.otpCode = otpCode;
        }

        public Boolean getStatus() {
            return status;
        }

        public void setStatus(Boolean status) {
            this.status = status;
        }

        public Boolean getEmailStatus() {
            return emailStatus;
        }

        public void setEmailStatus(Boolean emailStatus) {
            this.emailStatus = emailStatus;
        }

        public Integer getOtpAttempt() {
            return otpAttempt;
        }

        public void setOtpAttempt(Integer otpAttempt) {
            this.otpAttempt = otpAttempt;
        }

        public Object getCreatedAt() {
            return createdAt;
        }

        public void setCreatedAt(Object createdAt) {
            this.createdAt = createdAt;
        }

        public Object getUpdatedAt() {
            return updatedAt;
        }

        public void setUpdatedAt(Object updatedAt) {
            this.updatedAt = updatedAt;
        }

    }

